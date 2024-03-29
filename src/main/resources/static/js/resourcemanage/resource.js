var databaseName = "";
var mouldId = "";
var fileServerUrl="";
// 扩展字段
var extend = "";
var oTable = null;

var faIcon = {
	valid : 'fa fa-check-circle fa-lg text-success',
	invalid : 'fa fa-times-circle fa-lg',
	validating : 'fa fa-refresh'
}


$(window).on('load', function() {
	databaseName = getUrlParam("databaseName");// 获取资源库id
	mouldId = getUrlParam("mouldId");// 获取资源库id
	extend = getUrlParam("extend");// 获取资源库id
	$("#mouldSelect,#mouldExportId").val(mouldId);
	$("#dbSelect,#dbExportId").val(databaseName);
	loadLeaderTitle();
	loadButton(mouldId, databaseName);
	getfileServerUrl();
	loadMetadata(mouldId, databaseName);
	$('#resModal').on('hidden.bs.modal', function() {
		$("#resourceForm").data('bootstrapValidator').destroy();
		$('#resourceForm').data('bootstrapValidator', null);
	});
	$('#resModal').off('shown.bs.modal').on('shown.bs.modal', function (e) {
	    $(document).off('focusin.modal');// 解决编辑器弹出层文本框不能输入的问题
	});
});

function getfileServerUrl(){
	$.ajax({
		url : "../personal/getfileServerUrl",
		success : function(data) {
			fileServerUrl=data;
		},
	});
}

/**
 * 加载按钮button 暂时在js做控制
 * 
 * @param mouldId
 * @param databaseName
 */
function loadButton(mouldId, databaseName) {
    $("#highchart").hide();
    $("#userlockArea").hide();
    $("#displayArea").hide();
    $("#importAndExportArea").hide();
    $("#sendArea").hide();
    $("#bindingArea").hide();
    $("#isallseriesArea").hide();
    $("#authorizationArea").hide();
    $("#userreadArea").hide();
    $("#userbaseArea").hide();
    $("#userloginArea").hide();
    $("#userexpendArea").hide();
    $("#fabuArea").hide();
    $("#fankuiArea").hide();
    // 个人用户管理
    if (mouldId == 49) {
        $("#lockArea").show();
        $("#curdArea").hide();
        $("#bindingArea").show();
    } else if (mouldId == 53) {// 订单管理
        var html = '<button class="btn btn-info" onclick="orderdeatil(mouldId)"><i class="icon-info"></i>订单详情</button>';
        $("#curdArea").html(html);
    } else if (mouldId == 61) {
        $("#importAndExportArea").show();
    } else if (mouldId == 52) {// 图书管理
        $("#importAndExportArea").show();
    } else if (mouldId == 81 && extend == "dingjia") {// 扩展属性 包括图书定价 和 图书上架
        var html='图书价格： <input type="text" name="price" id="price" placeholder="请输入价格">\n' +
            '            <button class="btn btn-primary" onclick="ebookpricemodalshow()">\n' +
            '            <i class="icon-edit"></i>图书定价\n' +
            '            </button>'
        $("#curdArea").html(html);
    } else if (mouldId == 81 && extend == "fabu") {// 扩展属性 包括图书定价 和 图书上架
        $.ajax({
                url : "../personal/listfillminusType",
                dataType : "json",
                success : function(data) {
                    if (data.data != null) {
                        $.each(data.data, function(index, dic) {
                            $("#fillminusType").append(
                                "<option value='" + dic.seqid + "'>" + dic.fullminustype+ "</option>");
                        });
                    }
                    $('#fillminusType').selectpicker('refresh');
                },
                error : function() {
                    bootbox.alert('加载失败，请稍后重试');
                }
            });
        $("#fabuArea").show();
        $("#curdArea").hide();
    } else if (mouldId == 81 && extend == "jihuo") {// 扩展属性 图书激活码生成
        var html = '生成数量： <input type="text" class="form-control"  name="activateCount" id="activateCount" placeholder="默认生成1条">';
        html += '激活期限:<input type="text" class="form-control"  name="activateDay" id="activateDay" placeholder="默认激活期限365天"/>';
        html += '有效天数:<input type="text" class="form-control"  name="effectiveDays" id="effectiveDays" placeholder="默认有效天数30天"/>';
        html += '<button class="btn btn-default" onclick="generateActivationCode()"><i class="ion-reply"></i>生成阅读券</button>';
        $("#curdArea").html(html);
    } else if (mouldId == 75 && extend == "manjian") {// 图书满减生成
        $("#sendArea").show();
        $("#curdArea").show();
        var html = '<button class="btn btn-default" onclick="generateFullMinus()"><i class="ion-reply"></i>生成满减券</button>';
        $("#sendArea").html(html);
    } else if (mouldId == 77 && extend == "chongzhi") {// 充值券生成
        $("#curdArea").show();
        $("#sendArea").show();
        var html = '<br>激活张数： <input type="text" class="form-control"  name="count" id="count" placeholder="默认1张">';
        html += '激活截止日期:<input type="text" class="form-control"  name="endtime" id="endtime" placeholder="默认365天"/>';
        html += '<button class="btn btn-default" onclick="generateRecharge()"><i class="ion-reply"></i>生成充值券</button>';
        $("#sendArea").html(html);
    } else if (mouldId == 81) {// 首页书籍管理
        $("#curdArea").hide();
        $("#displayArea").show();
        $.ajax({
                url : "../personal/listthemeid",
                dataType : "json",
                success : function(data) {
                    if (data.data != null) {
                        $.each(data.data, function(index, dic) {
                            $("#themeids").append(
                                "<option value='" + dic.seqid + "'>"
                                + dic.title + "</option>");
                        });
                    }
                    $('#themeids').selectpicker('refresh');
                },
                error : function() {
                    bootbox.alert('加载失败，请稍后重试');
                }
            });
    } else if (mouldId == 84) {// 机构授权书籍管理
        $("#starttime,#endtime").click(function () {
            WdatePicker({el: this, dateFmt: 'yyyy-MM-dd', lang: "zh-cn"});
        });
        $.ajax({
                url : "../personal/listuserid",
                dataType : "json",
                success : function(data) {
                    if (data.data != null) {
                        $.each(data.data, function(index, dic) {
                            $('#userId').append(
                                "<option value=" + dic.seqid + ">"
                                + dic.phone + "-" + dic.name
                                + "</option>");
                            $('#userId').selectpicker('refresh');
                        });
                    }
                },
                error : function() {
                    bootbox.alert('加载失败，请稍后重试');
                }
        });
        $("#curdArea").hide();
        $("#authorizationArea").show();
    } else if (mouldId == 82) {// 后台向用户发送定时/即时消息
        $("#sendArea").show();
    } else if (mouldId == 74) {// 满减
        $("#importAndExportArea").show();
        $("#curdArea").hide();
    } else if (mouldId == 76) {// 充值
        $("#importAndExportArea").show();
        $("#curdArea").hide();
    } else if (mouldId == 63) {// 阅读
        $("#curdArea").hide();
        $("#importAndExportArea").show();
    } else if (mouldId == 97) {// 批量添加删除全平台包月书籍
        $("#curdArea").hide();
        $("#isallseriesArea").show();
    } else if (mouldId == 62 || mouldId == 86) {// 充值管理,用户拥有书籍
        $("#curdArea").hide();
    } else if (mouldId == 109) {// 用户基本信息
        $("#curdArea").hide();
        $("#userbaseArea").show();
    } else if (mouldId == 110) {// 用户阅读信息
        $("#curdArea").hide();
        $("#userreadArea").show();
        $("#readstarttime,#readendtime").click(function () {
            WdatePicker({el: this, dateFmt: 'yyyy-MM-dd', lang: "zh-cn"});
        });
    } else if (mouldId == 112) {// 用户花费信息
        $("#curdArea").hide();
        $("#userexpendArea").show();
    } else if (mouldId == 78) {// 用户卡券信息
        $("#curdArea").hide();
    } else if (mouldId == 116) {// 用户登录信息
        $("#curdArea").hide();
        $("#userloginArea").show();
    } else if (mouldId == 89) {// 用户登录信息
        $("#curdArea").hide();
        $("#fankuiArea").show();
    }
}


// 表单验证
function validForm(validFormfields) {
	$('#resourceForm').bootstrapValidator({
		message : 'This value is not valid',
		feedbackIcons : faIcon,
		fields : validFormfields
	}).on('success.field.bv', function(e, data) {
		data.element.parents('.form-group');
	}).on('success.form.bv', function(e) {
		e.preventDefault();
		var $form = $(e.target);
		$form.data('bootstrapValidator');
		insertAndUpdateRes();
	});
}

function loadLeaderTitle() {
	var activelink = $("#mainnav-menu", parent.document).find("li .active-link");
	$("#firstMenuVal").text(activelink.parent().parent().find(".menu-title").text());
	$("#secondMenuVal,#headMenuVal").text(activelink.text());
}

/**
 * 加载元数据
 * @param mouldId
 * @param databasename
 */
function loadMetadata(mouldId, databasename) {
	$("#searchDiv").children().remove();
	if (databasename == undefined || databasename == null) {
		return;
	}
	$.ajax({
				type : "POST",
				url : "../metadatas/getMetadataByField",
				data : {
					'databaseName' : databasename,
					'mouldId' : mouldId,
					'fieldName' : 'SearchShow',
					'fieldValue' : 1
				},
				success : function(data) {
					if (data.status == 200) {
						if (data.data != null) {
							var htmlMsg = '';
							var dicMap = {};
							var clsMap = {};
							var tabMap = {};
							var data = data.data;
							$.each(data,function(index, meta) {
												htmlMsg += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ meta.columnname+ '" /> ';
												if (index % 2 == 0) {
													htmlMsg += '<div class="row">';
												}
												htmlMsg += '<div class="col-sm-6">';
												switch (meta.columntype) {// 判断字段类型
												case 3:// 下拉单选
													if (meta.columnsource == 2) {// 数据来源：分类
														htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
														htmlMsg += '<div class="col-sm-9">';
														htmlMsg += '<div id="sel_'+ meta.columnname+ '"></div>';
														htmlMsg += '<input type="hidden" name="queryList['+ index+ '].nameValue" id="queryval_'+ meta.columnname+ '">';
														htmlMsg += '</div></div>';
														clsMap["#sel_"+ meta.columnname] = "#queryval_"+ meta.columnname;
													} else if (meta.columnsource == 1) {// 数据来源：字典
														htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
														htmlMsg += '<div class="col-sm-9">';
														htmlMsg += '<select class="selectpicker" id="sel_'+ meta.columnname+ '" name="queryList['+ index+ '].nameValue"></select>';
														var param = {
															'isdictype' : 0,
															'dictype' : meta.columntyperule
														};
														htmlMsg += '</div></div>';
														dicMap["#sel_"+ meta.columnname] = param;
													} else if (meta.columnsource == 3) {// 数据来源关联表
														htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
														htmlMsg += '<div class="col-sm-9">';
														htmlMsg += '<select class="selectpicker show-tick form-control" data-live-search="true" id="sel_'+ meta.columnname+ '" name="queryList['+ index+ '].nameValue"></select>';
														htmlMsg += '</div></div>';
														var param = {
															'mdbname' : databasename,
															'mdbfield' : meta.columnname
														};
														tabMap["#sel_"+ meta.columnname] = param;
													}
													break;
												case 4:// 下拉多选
													if (meta.columnsource == 2) {// 数据来源：分类
														htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
														htmlMsg += '<div class="col-sm-9">';
														htmlMsg += '<div id="sel_'+ meta.columnname+ '"></div>';
														htmlMsg += '<input type="hidden" name="queryList['+ index+ '].nameValue" id="queryval_'+ meta.columnname+ '">';
														htmlMsg += '</div></div>';
														clsMap["#sel_"+ meta.columnname] = "#queryval_"+ meta.columnname;
													} else if (meta.columnsource == 1) {// 数据来源：字典
														htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
														htmlMsg += '<div class="col-sm-9">';
														htmlMsg += '<select class="selectpicker" multiple id="sel_'+ meta.columnname+ '" name="queryList['+ index+ '].nameValue"></select>';
														var param = {
															'isdictype' : 0,
															'dictype' : meta.columntyperule
														};
														htmlMsg += '</div></div>';
														dicMap["#sel_"+ meta.columnname] = param;
													} else if (meta.columnsource == 3) {// 数据来源关联表
														htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
														htmlMsg += '<div class="col-sm-9">';
														htmlMsg += '<select class="selectpicker show-tick form-control" multiple data-live-search="true" id="sel_'+ meta.columnname+ '" name="queryList['+ index+ '].nameValue"></select>';
														htmlMsg += '</div></div>';
														var param = {
															'mdbname' : databasename,
															'mdbfield' : meta.columnname
														};
														tabMap["#sel_"+ meta.columnname] = param;
													}
													break;
												case 10:// 日期时间
													htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
													htmlMsg += '<div class="col-sm-9">';
													htmlMsg += '<div class="input-daterange input-group" id="datepicker">';
													htmlMsg += '<input class="form-control" type="text" name="queryList['+ index+ '].startValue" onfocus="WdatePicker({dateFmt:\'yyyy-MM-dd HH:mm:ss\',maxDate:\'#F{$dp.$D(enddatetime'+index+')}\'})" id="startdatetime'+index+'"/>';
													htmlMsg += '<span class="input-group-addon">to</span>';
													htmlMsg += '<input class="form-control" type="text" name="queryList['+ index+ '].endValue" onfocus="WdatePicker({dateFmt:\'yyyy-MM-dd HH:mm:ss\',minDate:\'#F{$dp.$D(startdatetime'+index+')}\'})" id="enddatetime'+index+'"/>';
													htmlMsg += '</div></div></div>';
													break;
												case 11:// 日期
													htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
													htmlMsg += '<div class="col-sm-9">';
													htmlMsg += '<div class="input-daterange input-group" id="datepicker">';
													htmlMsg += '<input class="form-control" type="text" name="queryList['+ index+ '].startValue" onfocus="WdatePicker({dateFmt:\'yyyy-MM-dd\',maxDate:\'#F{$dp.$D(enddate'+index+')}\'})" id="startdate'+index+'"/>';
													htmlMsg += '<span class="input-group-addon">to</span>';
													htmlMsg += '<input class="form-control" type="text" name="queryList['+ index+ '].endValue" onfocus="WdatePicker({dateFmt:\'yyyy-MM-dd\',minDate:\'#F{$dp.$D(startdate'+index+')}\'})" id="enddate'+index+'"/>';
													htmlMsg += '</div></div></div>';
													break;
												case 17:// 整数
												case 18:// 小数
													htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
													htmlMsg += '<div class="col-sm-9">';
													htmlMsg += '<div class="input-daterange input-group">';
													htmlMsg += '<input class="form-control" type="text" name="queryList['+ index+ '].startValue" id="start_'+ meta.columnname+ '" />';
													htmlMsg += '<span class="input-group-addon"> -- </span>';
													htmlMsg += '<input class="form-control" type="text" name="queryList['+ index+ '].endValue" id="end_'+ meta.columnname+ '" /> ';
													htmlMsg += '</div></div></div>';
													break;
												default:
													htmlMsg += '<div class="form-group"><label class="col-sm-3 control-label">'+ meta.columncname+ '：</label>';
													htmlMsg += '<div class="col-sm-9">';
													htmlMsg += '<input type="text" class="form-control" name="queryList['+ index+ '].nameValue" id="txt_'+ meta.columnname+ '" />';
													htmlMsg += '</div></div>';
													break;
												}
												htmlMsg += '</div>';
												if (index % 2 != 0) {
													htmlMsg += '</div>';
												}
											});
							htmlMsg += '<div class="row"><div class="col-sm-6"><div class="form-group"><label class="col-sm-3 control-label"></label><div class="col-sm-9"><input type="button" class="btn btn-default" onclick="searchResource()" value="查询"></div></div></div></div>';
							$("#searchDiv").append(htmlMsg);
							if (dicMap != null) {
								for ( var dic in dicMap) {
									loadDicSelectAll(dic, dicMap[dic],1);
								}
							}
							if (clsMap != null) {
								for ( var cls in clsMap) {
									loadClasses(cls, clsMap[cls]);
								}
							}
							if (tabMap != null) {
								for ( var tab in tabMap) {
									loadTableSelect(tab, tabMap[tab]);
								}
							}
							loadTbMsg(mouldId, databasename);
						}
					}
				}
			});
}

/**
 * 下载导入数据所需模板
 * 
 * @param type
 *            0只导出列 1导出所有数据
 */
function downImportAndExportModal(type) {
	var databaseName = getUrlParam("databaseName");// 获取资源库id
	var mouldId = getUrlParam("mouldId");// 获取资源库id
	var form = $("<form>");
	form.attr("style", "display:none");
	form.attr("target", "");
	form.attr("method", "post");
	form.attr("action","../metadatas/getMetadataByField");
	$("body").append(form);
	var tablecname = $("#mainnav-menu", parent.document).find("li .active-link").text().replace("管理", "");
	var input1 = $("<input>");
	input1.attr("type", "hidden");
	input1.attr("name", "databaseName");
	input1.attr("value", databaseName);
	form.append(input1);
	var input2 = $("<input>");
	input2.attr("type", "hidden");
	input2.attr("name", "mouldId");
	input2.attr("value", mouldId);
	form.append(input2);
	var input3 = $("<input>");
	input3.attr("type", "hidden");
	input3.attr("name", "fieldName");
	input3.attr("value", "ImportAndExportShow");
	form.append(input3);
	var input4 = $("<input>");
	input4.attr("type", "hidden");
	input4.attr("name", "fieldValue");
	input4.attr("value", 1);
	form.append(input4);
	var input5 = $("<input>");
	input5.attr("type", "hidden");
	input5.attr("name", "tablecname");
	input5.attr("value", tablecname);
	form.append(input5);
	var input6 = $("<input>");
	input6.attr("type", "hidden");
	input6.attr("name", "type");
	input6.attr("value", type);
	form.append(input6);
	form.submit();
	form.remove();
}

/**
 * 文件上传类型的返回
 * @param row
 * @param value
 * @returns {String}
 */
function fileformtter(row, value) {
	if(row!=null&&row!=undefined){
		var rows=row.split(","); //字符分割 
		var html='';
		$.each(rows,function(index,item){
			if(item!=undefined){
				var rowtmp = item.lastIndexOf("."); // 得到"."在第几位
				rowtmp = item.substring(rowtmp); // 截断"."之前的，得到后缀
				if (rowtmp == ".mp3"|| rowtmp == ".wav"|| rowtmp == ".wma" || rowtmp == ".vqf")  { // 根据后缀，判断是否符合音频、视频格式
					html += '<audio controls="controls">'+'<source src="'+fileServerUrl+item+'" type="audio/ogg">Your browser does not support the audio element</audio>'
				} else if (rowtmp == ".bmp" || rowtmp == ".png" || rowtmp == ".gif"|| rowtmp == ".jpg" || rowtmp == ".jpeg"){ // 根据后缀，判断是否符合图片格式
					html += "<img src=\"" +fileServerUrl+item+ "\" width=\"100px\" heigth=\"40px\" />";
				} else if (rowtmp == ".ogg" || rowtmp == ".rmvb"|| rowtmp == ".qsv"|| rowtmp == ".mp4"){
					html += '<video width="360" height="260" src="'+fileServerUrl+item+'" controls="controls">your browser does not support the video tag</video>'
				}
			}else{
				html+='';
			}
		});
	}	
	return html;
}

function dateformtter(row, value) {
	if(row == null||row == ''){
		return '';
	}else{
		var date = new Date(row);
		return date.Format("yyyy-MM-dd");
	}
}
function dateTimeformtter(row, value) {
	if(row == null||row == ''){
		return '';
	}else{
		var date = new Date(row);
		return date.Format("yyyy-MM-dd hh:mm:ss");
	}
}
function textformtter(row, value) {
    if(row == null||row == ''){
        return '';
    }else{
       	var text = row.replace(/\s+/g,'&nbsp;')
        return '<span class="colStyle" title="'+text+'">'+row+'</span>';
    }
}
/**
 * 加载表格数据
 * @param mouldId
 * @param databasename
 */
function loadTbMsg(mouldId, databasename) {
	var array = [];
	var columns = [];
	$.ajax({
				type : "POST",
				url : "../metadatas/getMetadataByField",
				data : {
					'databaseName' : databasename,
					'mouldId' : mouldId,
					'fieldName' : 'GridShow',
					'fieldValue' : 1
				},
				success : function(data) {
					if (data.status == 200) {
						if (data.data.length > 0) {
							$.each(data.data, function(index, el) {
								var field, formtter;
								if (el.columnname != 'seqid') {
									if (el.columntype == 3 || el.columntype == 4) {
										field = el.columnname + "Name";
									} else {
										field = el.columnname;
									}
									if (el.columntype == 10) {// 日期时间
										formtter = dateTimeformtter;
									} else if (el.columntype == 11) {// 日期
										formtter = dateformtter;
									} else if (el.columntype == 8) {// 文件类型
										formtter = fileformtter;
									} else if (el.columntype == 2) {// 多行
                                        formtter = textformtter;
                                    }
									if(el.editable==1){//允许直接修改列值
										array.push({
											field : field,
											title : el.columncname,
											formatter :  formtter,
                                            align: 'center',
                                            valign: 'middle',
											sortable : true,
											editable: {
								                type: 'text',  
								                validate: function (value) {
								                	var re = new RegExp(el.validexp);
								                    if(el.required==1){
								                    	if(value==null||value==undefined||value==''){
								                    		return el.columncname+"不能为空！"; 
								                    	}else if (!re.test(value)) {  
									                        return el.validmsg;  
									                    }
								                    }else if (!re.test(value)) {  
								                        return el.validmsg;  
								                    }
								                }
								            } 
										});
									}else{
										array.push({
											field : field,
											title : el.columncname,
											formatter : formtter,
                                            align: 'center',
                                            valign: 'middle',
											sortable : true
										});
									}
								}
							});
							array.unshift({
								checkbox : true,
							});
							columns.push(array);
							$("#resourceTb").bootstrapTable("destroy");
							oTable = $("#resourceTb").bootstrapTable({
								method : "POST",
								contentType:"application/x-www-form-urlencoded; charset=UTF-8",//POST需加;GET需处理中文乱码
								url : "../datalibrarys/getSelfDataList", // 获取数据的Servlet地址
								queryParams : function(params) {
									var searchCondition = $("#searchForm").serializeArray();
									searchCondition.push({
										"name" : "start",
										"value" : params.offset
									});
									searchCondition.push({
										"name" : "length",
										"value" : params.limit
									});
									if (params.sort != undefined&& params.sort.slice(-4) == "Name") {
										searchCondition.push({
											"name" : "order[0].column",
											"value" : params.sort.substr(0,params.sort.length - 4)
										});
									} else {
										searchCondition.push({
											"name" : "order[0].column",
											"value" : params.sort
										});
									}
									searchCondition.push({
										"name" : "order[0].dir",
										"value" : params.order
									});
									initialSearchCondition(searchCondition);
									return searchCondition;
								},
								responseHandler : function(res) {
									return {
										"total" : res.data.length,// 总页数
										"rows" : res.data.list // 数据
									};
								},
								striped : true, // 表格显示条纹
								locale : 'zh-CN',
								pagination : true, // 启动分页
                                paginationShowPageGo: true,
								pageSize : 10, // 每页显示的记录数
								pageNumber : 1, // 当前第几页
								pageList : [ 5, 10, 20, 50, 'ALL' ], // 记录数可选列表
								search : false, // 是否启用查询
								sortable : true, // 是否启用排序
								showColumns : true, // 显示下拉框勾选要显示的列
								showRefresh : true, // 显示刷新按钮
								clickToSelect : true, // 是否启用点击选中行
								sidePagination : "server", // 表示服务端请求
								columns : columns,
								toolbar : "#toolbar",
								showExport : true, // 是否显示导出按钮
								exportDataType : "all", // basic'导出当前页,'all'导出全部,'selected'导出选中项.
								onSort : function(name, order) {
									$("#loadEffect").modal('show');
								},
								onLoadSuccess : function(data) {
									$("#loadEffect").modal('hide');
								},
								onEditableSave: function (field, row, oldValue, $el) {//直接修改列属性：field-字段，row-修改的对应的对象
									var value="";
									Object.keys(row).forEach(function(key){
										if(key==field){
											value=row[key];
										}
									});
									$.ajax({
										type: 'POST',
										url: "../datalibrarys/updateEditableField",
										data: {
											'seqid':row.seqid,
											'field':field,
											'value':value,
											'databasename':databasename,
											'moulId':moulId,
										},
										dataType: 'JSON',
										success: function (msg, textStatus, jqXHR) {
											if (msg.actionResult.code == "SUCCESS") {
                                                bootbox.alert(msg.actionResult.msg);
												$("#resourceTb").bootstrapTable("refresh");
											} else {
												bootbox.alert(msg.actionResult.msg);
											}
										},
										error: function () { bootbox.alert("error");}
									});
								},
							});
						}
					}
				}
			});
}

/**
 * 多条件查询
 */
function searchResource() {
	$("#loadEffect").modal('show');
	$.ajax({
				type : "POST",
				url : "../datalibrarys/getSelfDataList",
				data : $("#searchForm").serializeArray(),
				success : function(data) {
					if (data.status == 200) {
						if (data.data != null && data.data.length > 0) {
							var data = {
								"total" : data.data.length,
								"rows" : data.data.list
							};
							$("#resourceTb").bootstrapTable('load', data);
						} else {
							$("#resourceTb").bootstrapTable("refresh");
						}

					}
					$("#loadEffect").modal('hide');
				}
			});
}

/**
 * 资源modal
 * 
 * @param optype
 * @returns {Boolean}
 */
function resourceModal(optype) {
	clearFormData("#resourceForm");
	$("#optype").val(optype);
	if (optype == 1) {
		var selRes = $("#resourceTb").bootstrapTable('getSelections');
		if (selRes.length != 1) {
			bootbox.alert('请选择一条数据', function() {
				return;
			});
			return;
		} else {
			if (undefined != typeof (mouldId)&& undefined != typeof (databaseName) && null != mouldId&& null != databaseName) {
				loadResForm(mouldId, databaseName, selRes[0].seqid);
			}
		}
	} else {
		loadResForm(mouldId, databaseName, null);
	}
	$("#resModal").modal('show');
	return true;
}

/**
 * 资源表单
 * 
 * @param mouldId
 * @param databasename
 * @param seqid
 */
function loadResForm(mouldId, databasename, seqid) {
	$("#resFormDiv").children().remove();
	var dbInfo = null;
	if (seqid != null && seqid > 0) {
		$.ajax({
					url : "../datalibrarys/getSelfDbInfo",
					data : {
						'databaseName' : databasename,
						'seqId' : seqid
					},
					method : 'POST',
					async : false,
					success : function(data) {
						if (data.status == 200) {
							dbInfo = data.data[0];
						}
					}
				})
	}
	$.ajax({
				method : 'POST',
				url : "../metadatas/getMetadataByField",
				data : {
					'databaseName' : databasename,
					'mouldId' : mouldId,
					'fieldName' : 'FormShow',
					'fieldValue' : 1
				},
				success : function(result) {
					if (result.status == 200) {
						var validFormfields = {};
						var dataMsg = '<input type="hidden" name="seqId" value="'+ seqid + '"/>';
						dataMsg += '<input type="hidden" name="databaseName" value="'+ databasename + '"/>';
						dataMsg += '<input type="hidden" name="mouldId" value="'+ mouldId + '"/>';
						$("#resFormDiv").append(dataMsg);
						$.each(result.data,function(index, row) {
											var rowValue = '';
											if (dbInfo != null) {
												var test = row.columnname;
												rowValue = dbInfo[test];
												column = row.columncname;
												if (rowValue == undefined||rowValue == null) {
													rowValue='';
												}
											}
											var tmpobj=new Object();
											var validators=new Object();
											if (row.required == 1) {
												validators.notEmpty={message : row.columncname+'不能为空'};
											}if(row.validexp!=null&&row.validexp!=""){
												validators.regexp={regexp : row.validexp,message : row.validmsg};
											}if(row.columnlength!=null&&row.columnlength!=""){
												validators.stringLength={max: row.columnlength,message: '文字长度'+row.columnlength};
											}
											if(row.only==1){
												validators.remote={
														url: "../personal/checkonly",
														message: '该'+row.columncname+'已被使用！',
														type: 'POST',//请求方式,
										                data: function(validator) {
										                      		return {
										                      			 columnname: row.columnname,
										                                 seqid: seqid,
										                                 index:index,
										                                 databasename: databasename,
										                            };
										                }
										                          	
												};
											}
											tmpobj.validators=validators;
											if(JSON.stringify(tmpobj)!='{"validators":{}}'){
												validFormfields['queryList['+ index + '].nameValue'] = tmpobj
											}
											if (row.required == 1) {
												row.columncname = '<span style="color: red" >✲</span>'+ row.columncname;
											}
											var formhtml = '';
											switch (row.columntype) {
											case 1:// 单行文本
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<div class="col-lg-7"><input type="text" class="form-control" name="queryList['+ index+ '].nameValue" id="f_'+ row.columnname+ '" value="'+ rowValue+ '" /></div></div>';
												$("#resFormDiv").append(formhtml);
												break;
											case 2:// 多行文本
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<div class="col-lg-7"><textarea rows="3" class="form-control" name="queryList['+ index+ '].nameValue" id="f_'+ row.columnname+ '">'+ rowValue+ '</textarea></div></div>';
												$("#resFormDiv").append(formhtml);
												break;
											case 3:// 下拉单选
												if (row.columnsource == 2) {// 数据来源：分类
													formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].nameValue" id="val_'+ row.columnname+ '">';
													formhtml += '<div class="col-lg-7"><div id="f_'+ row.columnname+ '"></div></div>';
													$("#resFormDiv").append(formhtml);
													loadClasses("#f_"+ row.columnname,"#val_"+ row.columnname,rowValue);
												} else if (row.columnsource == 1) {// 数据来源：字典
													formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
													formhtml += '<div class="col-lg-7"><select class="selectpicker show-tick form-control" id="f_'+ row.columnname+ '" name="queryList['+ index+ '].nameValue"></select></div></div>';
													$("#resFormDiv").append(formhtml);
													var param = {
														'isdictype' : 0,
														'dictype' : row.columntyperule
													};
													loadDicSelect("#f_"+ row.columnname,param, rowValue);
												} else if (row.columnsource == 3) {// 数据来源关联表
													formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
													formhtml += '<div class="col-lg-7">';
													formhtml += '<select class="selectpicker show-tick form-control" data-live-search="true" id="f_'+ row.columnname+ '" name="queryList['+ index+ '].nameValue"></select>';
													formhtml += '</div></div>';
													$("#resFormDiv").append(formhtml);
													var param = {
														'mdbname' : databasename,
														'mdbfield' : row.columnname
													};
													loadTableSelect("#f_"+ row.columnname,param, rowValue);
												}
												break;
											case 4:// 下拉多选
												if (row.columnsource == 2) {// 数据来源：分类
													formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].nameValue" id="val_'+ row.columnname+ '">';
													formhtml += '<div class="col-lg-7"><div id="f_'+ row.columnname+ '"></div></div>';
													$("#resFormDiv").append(formhtml);
													loadClasses("#f_"+ row.columnname,"#val_"+ row.columnname,rowValue);
												} else if (row.columnsource == 1) {// 数据来源：字典
													formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
													formhtml += '<div class="col-lg-7"><select class="selectpicker show-tick form-control" multiple data-live-search="false" id="f_'+ row.columnname+ '" name="queryList['+ index+ '].nameValue"></select></div></div>';
													$("#resFormDiv").append(formhtml);
													var param = {
														'isdictype' : 0,
														'dictype' : row.columntyperule
													};
													loadDicSelect("#f_"+ row.columnname,param, rowValue);
												} else if (row.columnsource == 3) {// 数据来源关联表
													formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
													formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
													formhtml += '<div class="col-lg-7">';
													formhtml += '<select class="selectpicker show-tick form-control" multiple data-live-search="true" id="f_'+ row.columnname+ '" name="queryList['+ index+ '].nameValue"></select>';
													formhtml += '</div>';
													formhtml += '</div>';
													$("#resFormDiv").append(formhtml);
													var param = {
														'mdbname' : databasename,
														'mdbfield' : row.columnname
													};
													loadTableSelect("#f_"+ row.columnname,param, rowValue);
												}
												break;
											case 5:// 密码
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 col-md-3 control-label">'+row.columncname+'：</label><div class="col-lg-7 col-md-7">';
												formhtml += '<input type="text" class="form-control" name="queryList['+ index+ '].nameValue" placeholder="'+placeholder+'" id="f_'+ row.columnname+ '" value="'+ rowValue+ '" />'
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<input id="input_'+row.columnname +'" name="file" multiple type="file" class="file-loading"/></div></div>';
												$("#resFormDiv").append(formhtml);
												initFileInput(row.columnname);
												break;
											case 7:// 富文本
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 col-md-3 control-label">'+ row.columncname+ '：</label>';
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" /><div class="col-lg-7 col-md-7">';
												formhtml += '<textarea style="visibility:hidden;" id="f_'+ row.columnname+ '" name="queryList['+ index+ '].nameValue" class="editortext form-control">'+ rowValue+ '</textarea>';
												formhtml += '</div></div>';
												$("#resFormDiv").append(formhtml);
												var editor = KindEditor.create("#f_"+ row.columnname,{
								                	items : ['source','undo','redo','quickformat','justifyleft','justifycenter','justifyright','justifyfull','fontname','fontsize','forecolor','hilitecolor','bold','italic','underline','image','link','unlink'],
								                	filePostName: "file",
								                	filterMode:true,
								                	pasteType:1,// 1纯文本粘贴，2Html粘贴
								                	//cssData: cssData,
								                	formatUploadUrl:false,
												    uploadJson : '/APMKAFManageSystem/resourcemanage/datalibrarysPersonalise/datalibraryPersonalise!uploadkindeditor.action',
												    afterUpload : function(url, data, name) { // 上传文件后执行的回调函数，必须为3个参数
											            if(name=="image" || name=="multiimage"){ // 单个和批量上传图片时
											                var img = new Image(); 
											                img.src = url;
											                img.onload = function(){ // 图片必须加载完成才能获取尺寸
											                	editor.html(editor.html().replace('<img src="' + url + '"','<img src="' + url + '" width="100%"'));
											                }
											            }
											        },
											        //调用kindeditor的afterCreate回调函数对kindeditor功能进行“扩展”，实现图片粘贴上传。
												    afterCreate:function() {
												        var editerDoc = this.edit.doc;
												        $(editerDoc).bind('paste', null, function (e) { 
												            var ele = e.originalEvent.clipboardData.items;
												            for (var i = 0; i < ele.length; ++i) {
												                if ( ele[i].kind == 'file' && ele[i].type.indexOf('image/') !== -1 ) {
												                    var file = ele[i].getAsFile();
												                    var formData = new FormData();
												                    formData.append("file",file);
												                    $.ajax({
												                        url : '../personal/uploadkindeditor',
												                        type : 'POST',
												                        data : formData,
												                        processData : false,
												                        contentType : false,
												                        dataType:"json",
												                        success : function(responseStr) {
												                            var src = responseStr.url;
												                            var imgTag = "<img src='"+src+"' width='100%'/>";
												                            editor.insertHtml(imgTag);
												                        },
												                        error : function(responseStr) {
												                            console.log("error");
												                        }
												                    });
												                }
												            }
												        });
												    },
												    afterChange: function(){
												    	this.sync();
												    }
												});
												break;
											case 8:// 文件上传
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 col-md-3 control-label">'+row.columncname+'：</label><div class="col-lg-7 col-md-7">';
												formhtml += '<input type="text" class="form-control" name="queryList['+ index+ '].nameValue" id="f_'+ row.columnname+ '" value="'+ rowValue+ '" readonly="readonly"/>'
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<input id="input_'+row.columnname +'" name="file" multiple type="file" class="file-loading"/></div></div>';
												$("#resFormDiv").append(formhtml);
												initFileInput(row.columnname);
												break;
											case 10:// 日期时间
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<div class="col-lg-7"><input type="text" class="input-group date form-control" name="queryList['+ index+ '].nameValue" id="f_'+ row.columnname+ '" value="'+ dateTimeformtter(rowValue)+ '" /></div></div>';
												$("#resFormDiv").append(formhtml);
												$("#f_" + row.columnname).click(function () {
												    WdatePicker({el: this, dateFmt: 'yyyy-MM-dd HH:mm:ss', lang: "zh-cn"});
												});
												break;
											case 11:// 日期
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<div class="col-lg-7"><input type="text" class="form-control" name="queryList['+ index+ '].nameValue" id="f_'+ row.columnname+ '" value="'+ dateformtter(rowValue)+ '" /></div></div>';
												$("#resFormDiv").append(formhtml);
												$("#f_" + row.columnname).click(function () {
													WdatePicker({el: this, dateFmt: 'yyyy-MM-dd', lang: "zh-cn"});
												});
												break;
											case 17:// 整数
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<div class="col-lg-7"><input type="text" class="form-control" name="queryList['+ index+ '].nameValue" id="f_'+ row.columnname+ '" value="'+ rowValue+ '" /></div></div>';
												$("#resFormDiv").append(formhtml);
												break;
											case 18:// 小数
												formhtml += '<div class="form-group" id="div_'+row.columnname+'"><label class="col-lg-3 control-label">'+ row.columncname+ '：</label>';
												formhtml += '<input type="hidden" name="queryList['+ index+ '].name" value="'+ row.columnname+ '" />';
												formhtml += '<div class="col-lg-7"><input type="text" class="form-control" name="queryList['+ index+ '].nameValue" id="f_'+ row.columnname+ '" value="'+ rowValue+ '" /></div></div>';
												$("#resFormDiv").append(formhtml);
												break;
											default:
												break;
											} 
										});
						validForm(validFormfields);
						return true;
					}
				}
			});
}

/**
 * 新增、修改资源信息
 */
function insertAndUpdateRes() {
	var opType = $("#optype").val();
	var url;
	if (opType == 1) {
		url = "../datalibrarys/updateRes";
	} else {
		url = "../datalibrarys/addRes";
	}
	var params = $("#resourceForm").serialize();
	$.ajax({
		type : "POST",
		url : url,
		async : false,
		data : params,
		success : function(data) {
			if (data.status == 200) {
                bootbox.alert(data.msg, function(){
                    clearFormData("#resourceForm");
                    $('#resModal').modal('hide');
                    $("#resourceTb").bootstrapTable("refresh");
                });
			} else {
				bootbox.alert(data.msg);
			}
		}
	});
}

/**
 * 删除资源信息 逻辑删除，锁定，解锁 status不传的时候默认为删除
 * 
 * @returns {Boolean}
 */
function delResource(status) {
	var selRes = $("#resourceTb").bootstrapTable('getSelections');
	if (selRes.length < 1) {
		bootbox.alert('请至少选择一条数据', function() {
			return;
		});
		return;
	} else {
		var resIds = "";
		for (var i = 0; i < selRes.length; i++) {
			resIds += selRes[i].seqid + ",";
		}
		resIds += 0;
		bootbox.confirm("确定操作?",function(result) {
							if (result) {
								var databaseName = $("#dbSelect").val();
								$.ajax({
											type : "POST",
											url : "../datalibrarys/delResBatch",
											data : {
												'resIds' : resIds,
												'databaseName' : databaseName,
												"status" : status
											},
											success : function(data) {
												if (data.code == 200) {
                                                    bootbox.alert(data.msg);
													$("#resourceTb").bootstrapTable("refresh");
												} else {
													bootbox.alert(data.msg);
												}
											}
										});
							}
						});
	}
	return true;
}

/**
 * 文件上传
 */
function initFileInput(columnname) {   
	 var databaseNameExport = getUrlParam("databaseName");// 获取资源库id
	 var selRes = $("#resourceTb").bootstrapTable('getSelections');
		var seqid = "";
		if (selRes.length < 1) {
		} else {
			seqid = selRes[0].seqid;
		}
	 var extensions=[];
	 var filesize=0;
	 //根据表名以及字段名称给文件上传加文件类型限制,以及文件大小限制
	 if(databaseNameExport=="front_userinfo"){
		 if(columnname=="image"){
			 extensions.push('jpg', 'gif', 'png','jpeg');
			 filesize=500;
		 }
	 }
	 //如果上传多个文件，数据库保存地址多个;
	 var fileurls=[];
	 //上传初始化
	 var control = $('#input_' + columnname);
     control.fileinput({
    	 language: 'zh', //设置语言
         uploadUrl: "../personal/uploadFile", //上传的地址
         allowedFileExtensions:extensions,//接收的文件后缀，如['jpg', 'gif', 'png'],不填将不限制上传文件后缀类型
         //uploadExtraData:{"seqid": seqid,'columnname':columnname},//请求的额外参数
         showUpload: false, // 是否显示上传按钮
         showRemove:false, // 是否显示移除按钮
         showCaption:false, 
         dropZoneEnabled: false,
         validateInitialCount:true,// 验证初始计数,默认false
         maxFileSize: filesize,// 单位为kb，如果为0表示不限制文件大小
         enctype: 'multipart/form-data',
     }).on("fileuploaded", function(ev, data,previewId, index) {//文件上传成功的回调
	     if(data.response){
	    	 if(data.response.status==200){
	    		 bootbox.alert('文件上传成功');
	    		 fileurls.push(data.response.data);
	    	 }
	     }else{
             bootbox.alert('文件上传失败!');
	     }  
	     $("#f_"+columnname).val(fileurls);
	     $("#f_"+columnname).trigger("input");
     });
     
}

/**
 * 导入数据modal
 * 
 * @returns {Boolean}
 */
function resImportModal() {
	 var databaseNameExport = getUrlParam("databaseName");// 获取资源库id
	 var mouldId = getUrlParam("mouldId");// 获取资源库id
	 $("#importResModal").modal('show');
	 var control = $('#importRes');
     control.fileinput({
    	 language: 'zh', //设置语言
         uploadUrl: "../personal/importFile", //上传的地址
         allowedFileExtensions:['xls','xlsx'],//接收的文件后缀，如['jpg', 'gif', 'png'],不填将不限制上传文件后缀类型
         uploadExtraData:{"databaseName": databaseNameExport,"mouldId":mouldId},//额外参数
         uploadAsync: true, //默认异步上传
         showUpload: true, //是否显示上传按钮
         showRemove : false, //显示移除按钮
         showPreview : true, //是否显示预览
         showCaption: false,//是否显示标题
         browseClass: "btn btn-primary", //按钮样式     
         dropZoneEnabled: false,//是否显示拖拽区域
         maxFileCount: 1, //表示允许同时上传的最大文件个数
         //enctype: 'multipart/form-data',
         validateInitialCount:true,
         previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
         msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
     }).on("filebatchselected", function(event, files) {
     }).on("fileuploaded", function(event, data) {
	     if(data.response){
             bootbox.alert(data.response.msg);
         }else{
	    	 bootbox.alert('导入数据失败');  
	     }  
     }).on('fileerror', function(event, data, msg) {
    	 bootbox.alert('导入数据失败'); 
     });
}

//资源上架 下架
function userlock(status) {
	updatebyfiled("status", status);
}


function isDisplay(type, status) {
    if(type==1){
        updatebyfiled("isdisplay", status);
	}else if(type==2){
        updatebyfiled("isRecommend", status);
    }else if(type==3){
        updatebyfiled("isNewbook", status);
    }
}

function isallseries(status) {
    updatebyfiled("isallseries", status);
}

function editFullminustype() {
    var fillminusType = $("#fillminusType").val();
    updatebyfiled("fullminusType", fillminusType);

}

function ebookpublish(status) {
    updatebyfiled("ebookStatus", status);

}

function ebookpricemodalshow() {
    var price = $("#price").val();
    if (!/(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/.test(price)) {
        bootbox.alert("输入正确的价格！为小数或者整数");
        return;
    }
    updatebyfiled("price", price);
}

function activateorganization() {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length < 1) {
        bootbox.alert('请至少选择一条数据', function() {
            return;
        });
        return;
    }
    var resIds = "";
    var isfrist = false;
    for (var i = 0; i < selRes.length; i++) {
        if (isfrist) {
            resIds += ",";
        }
        if (selRes[i].userType != '3') {
            alert('请选择机构用户');
            return;
        }
        if (selRes[i].email == null) {
            alert('邮箱为空，不能激活');
            return;
        }
        if (selRes[i].userType == '3' && selRes[i].userStatus == 1) {
            alert('该机构账户已经激活');
            return;
        }
        resIds += selRes[i].seqid;
        isfrist = true;
    }
    updatebyfiled("userStatus", 1);
}

function editTheme(type) {
    var themeids = $("#themeids").val();
    if (type == 1) {
        if (themeids == 0) {
            bootbox.alert('请选择专题类型！');
            return;
        }
    }
    updatebyfiled("themeId", themeids);
}

function setMaxbindingNum() {
    var maxbindingNum = 5;
    if ($("#maxbindingNum").val() != null && $("#maxbindingNum").val() != "") {
        maxbindingNum = $("#maxbindingNum").val();
        if (maxbindingNum != "" && !isPositiveInteger(maxbindingNum)) {
            bootbox.alert('请输入正整数！');
            return;
        }
    }
    updatebyfiled("maxbindingNum", maxbindingNum);

}

//修改字段状态
function updatebyfiled(fieldname, fieldval) {
	var selRes = $("#resourceTb").bootstrapTable('getSelections');
	if (selRes.length < 1) {
		bootbox.alert('请至少选择一条数据', function() {
			return;
		});
		return;
	} else {
		var resIds = "";
		var isfrist = false;
		for (var i = 0; i < selRes.length; i++) {
			if (isfrist) {
				resIds += ",";
			}
			resIds += selRes[i].seqid;
			isfrist = true;
		}
		bootbox.confirm("确认操作?",function(result) {
							if (result) {
								var databaseName = $("#dbSelect").val();
								$.ajax({
											type : "POST",
											url : "../personal/updateResByFiledBatch",
											data : {
												'resIds' : resIds,
												'databaseName' : databaseName,
												'mouldId' : mouldId,
												"fieldval" : fieldval,
												"fieldname" : fieldname
											},
											success : function(data) {
												if (data.status == 200) {
													bootbox.alert(data.msg);
													$("#resourceTb").bootstrapTable("refresh");
												} else {
													bootbox.alert(data.msg);
												}
											}
										});
							}
						});
	}
	return true;

}

/**
 * 查看订单详情
 */
function orderdeatil() {

    var mouldId = 55;
    var databasename = "front_order_detail";
    var selResources = $("#resourceTb").bootstrapTable('getSelections');
    if (selResources.length != 1) {
        bootbox.alert('请选择一个用户', function() {
            return;
        });
        return;
    } else {
        var orderid = selResources[0].seqid;
        $("#resdetailModal").modal('show');
        var array = [];
        var columns = [];
        $.ajax({
                type : "POST",
                url : "../metadatas/getMetadataByField",
                data : {
                    'databaseName' : databasename,
                    'mouldId' : mouldId,
                    'fieldName' : 'GridShow',
                    'fieldValue' : 1
                },
                success : function(msg) {
                    if (msg.status == 200) {
                        if (msg.data!= null) {
                            $.each(msg.data, function(index, el) {
                                var field, formtter;
                                if (el.columnname != 'seqid') {
                                    if (el.columntype == 3
                                        || el.columntype == 4) {
                                        field = el.columnname + "Name";
                                    } else {
                                        field = el.columnname;
                                    }
                                    if (el.columntype == 10) {
                                        formtter = dateTimeformtter;
                                    } else if (el.columntype == 11) {// 日期
                                        formtter = dateformtter;
                                    } else if (el.columntype == 8) {// 文件类型
                                        formtter = fileformtter;
                                    } else if (el.columntype == 3
                                        || el.columntype == 4) {// 下拉单选和下拉多选

                                    } else {

                                    }
                                    array.push({
                                        field : field,
                                        title : el.columncname,
                                        formatter : formtter,
                                        sortable : true
                                    });
                                }
                            });
                            array.unshift({
                                checkbox : true,
                            });
                            array.unshift({
                                field : 'seqid',
                                visible : false,
                            });
                            columns.push(array);

                            $("#resDetailTbDiv").bootstrapTable("destroy");
                            oTable = $("#resDetailTbDiv")
                                .bootstrapTable(
                                    {
                                        method : "get",
                                        url : "../datalibrarys/getSelfDataList", // 获取数据的Servlet地址
                                        queryParams : function(
                                            params) {
                                            var searchCondition = new Array();
                                            searchCondition
                                                .push({
                                                    "name" : "queryList[0].name",
                                                    "value" : "orderID"
                                                });
                                            searchCondition
                                                .push({
                                                    "name" : "queryList[0].nameValue",
                                                    "value" : orderid
                                                });
                                            searchCondition
                                                .push({
                                                    "name" : "mouldId",
                                                    "value" : mouldId
                                                });
                                            searchCondition
                                                .push({
                                                    "name" : "databaseName",
                                                    "value" : databasename
                                                });
                                            searchCondition
                                                .push({
                                                    "name" : "start",
                                                    "value" : params.offset
                                                });
                                            searchCondition
                                                .push({
                                                    "name" : "length",
                                                    "value" : params.limit
                                                });
                                            searchCondition
                                                .push({
                                                    "name" : "order[0].column",
                                                    "value" : params.sort
                                                });
                                            searchCondition
                                                .push({
                                                    "name" : "order[0].dir",
                                                    "value" : params.order
                                                });
                                            var searchResult = initialSearchCondition(searchCondition);
                                            return searchResult;
                                        },
                                        responseHandler : function(
                                            res) {
                                            return {
                                                "total" : res.recordsTotal,// 总页数
                                                "rows" : res.data
                                                // 数据
                                            };
                                        },
                                        striped : true, // 表格显示条纹
                                        locale : 'zh-CN',
                                        pagination : true, // 启动分页
                                        pageSize : 10, // 每页显示的记录数
                                        pageNumber : 1, // 当前第几页
                                        pageList : [ 5, 10, 15, 20,
                                            25 ], // 记录数可选列表
                                        search : false, // 是否启用查询
                                        sortable : true, // 是否启用排序
                                        showColumns : true, // 显示下拉框勾选要显示的列
                                        showRefresh : false, // 显示刷新按钮
                                        clickToSelect : true, // 是否启用点击选中行
                                        sidePagination : "server", // 表示服务端请求
                                        columns : columns,
                                        showExport : true, // 是否显示导出按钮
                                        exportDataType : "all", // basic'导出当前页,
                                        // 'all'导出全部,
                                        // 'selected'导出选中项.

                                    });

                        }
                    }
                }
            });
    }
}

/**
 * 机构授权图书
 */
function authorization() {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length < 1) {
        bootbox.alert('请至少选择一条数据', function() {
            return;
        });
        return;
    }
    var resIds = "";
    var isfrist = false;
    for (var i = 0; i < selRes.length; i++) {
        if (isfrist) {
            resIds += ",";
        }
        if (selRes[i].ebookStatus != 4) {
            bootbox.alert("未上架图书不能授权");
            return;
        }
        resIds += selRes[i].seqid;
        isfrist = true;
    }

    var userId = $("#userId").val();
    var starttime = $("#starttime").val() + " 00:00:00";
    var endtime = $("#endtime").val() + " 23:59:59";
    if (starttime == "") {
        bootbox.alert('请选择开始时间！');
        return;
    }
    if (endtime == "") {
        bootbox.alert('请选择结束时间！');
        return;
    }
    var date1 = getNowFormatDate();
    if (starttime < date1) {
        bootbox.alert('开始时间不能小于当前时间！');
        return;
    }
    if (endtime <= starttime) {
        bootbox.alert('结束时间不能小于开始时间！');
        return;
    }
    if (userId == 0) {
        bootbox.alert('请选择要授权的机构管理员！');
        return;
    }

    bootbox
        .confirm(
            "确认授权?",
            function(result) {
                if (result) {
                    var databaseName = $("#dbSelect").val();
                    $.ajax({
                            type : "POST",
                            url : "../personal/authorization",
                            data : {
                                'resIds' : resIds,
                                'databaseName' : databaseName,
                                "starttime" : starttime,
                                "endtime" : endtime,
                                "userId" : userId
                            },
                            success : function(msg) {
                                if (msg.status == 200) {
                                    bootbox.alert(msg.msg);
                                    $("#resourceTb").bootstrapTable("refresh");
                                } else {
                                    bootbox.alert(msg.msg);
                                }
                            }
                        });
                }
            });
}

function sendMessage() {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length < 1) {
        bootbox.alert('请至少选择一条数据', function() {
            return;
        });
        return;
    }
    var resIds = "";
    var isfrist = false;
    for (var i = 0; i < selRes.length; i++) {
        if (isfrist) {
            resIds += ",";
        }
        if (selRes[i].status == -1) {
            alert('请选择未被删除的信息！')
            return;
        }
        if (selRes[i].sendstatus == 1) {
            alert('请选择未发送的信息！')
            return;
        }
        resIds += selRes[i].seqid;
        isfrist = true;
    }
    bootbox
        .confirm(
            "确认发送系统消息?",
            function(result) {
                if (result) {
                    $.ajax({
                            type : "POST",
                            url : "../personal/sendMessage",
                            data : {
                                'resIds' : resIds,
                            },
                            success : function(msg) {
                                if (msg.status == 200) {
                                    bootbox.alert(msg.msg);
                                    $("#resourceTb").bootstrapTable("refresh");
                                } else {
                                    bootbox.alert(msg.msg);
                                }
                            }
                        });
                }
            });
}

function fankui() {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length < 1) {
        bootbox.alert('请至少选择一条数据', function() {
            return;
        });
        return;
    }
    var resIds = "";
    var isfrist = false;
    for (var i = 0; i < selRes.length; i++) {
        if (isfrist) {
            resIds += ",";
        }
        if (selRes[i].isgiven == 1) {
            alert('用户已赠送积分！')
            return;
        }
        resIds += selRes[i].seqid;
        isfrist = true;
    }
    var scorenum="";
    if ($("#scorenum").val() != null && $("#scorenum").val() != "") {
        scorenum = $("#scorenum").val();
        if (scorenum != "" && !isPositiveInteger(scorenum)) {
            bootbox.alert('请输入正整数！');
            return;
        }
    }
    bootbox.confirm("确认赠送积分?", function(result) {
                if (result) {
                    $.ajax({
                            type : "POST",
                            url : "../personal/fankui",
                            data : {
                                'resIds' : resIds,
                                'scorenum':scorenum
                            },
                            success : function(msg) {
                                if (msg.status == 200) {
                                    bootbox.alert(msg.msg);
                                    $("#resourceTb").bootstrapTable("refresh");
                                } else {
                                    bootbox.alert(msg.msg);
                                }
                            }
                        });
                }
            });
}

// 用户基本信息
function userbaseModal(type) {
    $("#highchart").show();
    var chart;
    var text;
    var name;
    if (type == 0) {
        text = '国家（地区）';
        name = '国家（地区）分布比例';
    } else if (type == 1) {
        text = '年龄';
        name = '年龄分布比例';
    } else if (type == 2) {
        text = '学习汉语年数';
        name = '学习汉语年数比例';
    } else if (type == 3) {
        text = '登录设备';
        name = '登录设备比例';
    }
    $
        .ajax({
            url : "../personal/userbaseByType",
            data : {
                'type' : type
            },
            dataType : "json",
            type : "POST",
            success : function(data) {
                chart = new Highcharts.Chart(
                    {
                        chart : {
                            renderTo : 'container',
                            plotBackgroundColor : null,
                            plotBorderWidth : null,
                            plotShadow : false
                        },
                        title : {
                            text : text
                        },
                        tooltip : {
                            headerFormat : '{series.name}<br>',
                            pointFormat : '{point.name}: <b>{point.percentage:.1f}%</b>'
                        },
                        plotOptions : {
                            pie : {
                                allowPointSelect : true,
                                cursor : 'pointer',
                                dataLabels : {
                                    enabled : true,
                                    format : '<b>{point.name}</b>: {point.percentage:.1f} %',
                                    style : {
                                        color : (Highcharts.theme && Highcharts.theme.contrastTextColor)
                                            || 'black'
                                    }
                                }
                            }
                        },
                        series : [ {
                            type : 'pie',
                            name : name,
                            data : data
                        } ]
                    });
            }
        });
}

function userreadModal(type) {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length != 1) {
        bootbox.alert('请选择一位用户进行查询', function() {
            return;
        });
        return;
    }
    var readstarttime = $("#readstarttime").val();
    var readendtime = $("#readendtime").val();

    if (readstarttime == "") {
        bootbox.alert('请选择开始时间！');
        return;
    }
    if (readendtime == "") {
        bootbox.alert('请选择结束时间！');
        return;
    }
    if (readendtime <= readstarttime) {
        bootbox.alert('结束时间要大于开始时间！');
        return;
    }
    var text1;
    var text2;
    var text3;
    if (type == 2) {
        text1 = '用户阅读书籍分类次数图表(' + readstarttime + '至' + readendtime + ')';
        text2 = '分类次数';
        text3 = '次数';
    } else if (type == 1) {
        text1 = '用户阅读书籍系列次数图表(' + readstarttime + '至' + readendtime + ')';
        text2 = '系列次数';
        text3 = '次数';
    } else if (type == 0) {
        text1 = '用户阅读书本数图表(' + readstarttime + '至' + readendtime + ')';
        text2 = '图书本数';
        text3 = '本数';
    }
    $("#highchart").hide();
    $.ajax({
            url : "../personal/userreadByType",
            data : {
                'type' : type,
                'endtime' : readendtime,
                'starttime' : readstarttime,
                'userid' : selRes[0].userID
            },
            dataType : "json",
            type : "POST",
            success : function(data) {
                getUserColumns(text1,text2,text3,data);
            }
        });

}
function userloginModal(type) {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length != 1) {
        bootbox.alert('请选择一条数据', function() {
            return;
        });
        return;
    }
    var userid = selRes[0].userid;
    var text1;
    var text2 = '登录时长';;
    var text3 = '时长';
    if (type == 0) {
        text1 = '用户总登录时长';
    } else if (type == 1) {
        text1 = '用户单日登录时长';
    }
    $("#highchart").hide();
    $
        .ajax({
            url : "../personal/getUserlogin",
            dataType : "json",
            data : {
                'userid' : userid,
                'type' : type
            },
            success : function(data) {
            	getUserColumns(text1,text2,text3,data);
            },
        });
}

function userexpendModal(type) {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length != 1) {
        bootbox.alert('请选择一条数据', function() {
            return;
        });
        return;
    }
    var userid = selRes[0].accountID;
    var text1;
    var text2;
    var text3='数量';
    if (type == 1) {
        text1 = '月花费虚拟币表';
        text2 = '虚拟币';
    } else if (type == 2) {
        text1 = '月花费积分表';
        text2 = '积分';
    } else if (type == 3) {
        text1 = '月购买书籍数量表';
        text2 = '书籍数量';
    } else if (type == 4) {
        text1 = '周花费虚拟币表';
        text2 = '虚拟币';
    } else if (type == 5) {
        text1 = '周花费积分表';
        text2 = '积分';
    } else if (type == 6) {
        text1 = '周购买书籍数量表';
        text2 = '书籍数量';
    }
    $("#highchart").hide();
    $.ajax({
            url : "../personal/getUserexpend",
            dataType : "json",
            data : {
                'userid' : userid,
                'type' : type
            },
            success : function(data) {
                getUserColumns(text1,text2,text3,data);
            },
        });
}

function getUserColumns(text1,text2,text3,data) {
    $("#highchart").show();
    Highcharts.chart('container', {
        chart : {
            type : 'column'
        },
        title : {
            text : text1
        },
        subtitle : {
            text : '请点击按钮查看坐标轴变化'
        },
        xAxis : {
            categories : data[0]
        },
        yAxis : {
            labels : {
                x : -15
            },
            title : {
                text : text2
            },
            allowDecimals : true
        },
        series : [ {
            name : text3,
            data : data[1]
        } ],
        responsive : {
            rules : [ {
                condition : {
                    maxWidth : 500
                },
                chartOptions : {
                    xAxis : {
                        labels : {
                            formatter : function() {
                                return this.value.replace(
                                    '月', '')
                            }
                        }
                    },
                    yAxis : {
                        labels : {
                            align : 'left',
                            x : 0,
                            y : -2
                        },
                        title : {
                            text : ''
                        },
                        allowDecimals : true
                    }
                }
            } ]
        }
    });
}

function genQrcode() {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length != 1) {
        bootbox.alert('请选择一条数据', function() {
            return;
        });
        return;
    }
    var resIds = selRes[0].seqid;
    $.ajax({
        url : "../personal/genQrcode",
        dataType : "json",
        data : {
            'seqid' : resIds
        },
        success : function(msg) {
            if (msg.status == 200) {
                bootbox.alert(msg.msg);
                $("#resourceTb").bootstrapTable("refresh");
            } else {
                bootbox.alert(msg.msg);
            }
        },
    });
}

function exportQrcode() {
    var selRes = $("#resourceTb").bootstrapTable('getSelections');
    if (selRes.length != 1) {
        bootbox.alert('请选择一条数据', function() {
            return;
        });
        return;
    }
    var resIds = selRes[0].seqid;
    var url = '../personal/exportQrcode';
    var form = $("<form></form>").attr("action", url).attr("method", "post");
    form.append($("<input>").attr("type", "hidden").attr("name", "seqid").attr("value", resIds));
    form.appendTo('body').submit().remove();
}