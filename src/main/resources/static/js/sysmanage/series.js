//系列管理
//新增
var faIcon = {
    valid: 'fa fa-check-circle fa-lg text-success',
    invalid: 'fa fa-times-circle fa-lg',
    validating: 'fa fa-refresh'
}

$(window).on('load', function () {
    // 加载系列表数据
    loadSeriesTreeGrid();
    validForm();
    $('#seriesModal').on('hidden.bs.modal', function () {
        $("#addForm").data('bootstrapValidator').destroy();
        $('#addForm').data('bootstrapValidator', null);
        validForm();
    });
});


function loadSeriesTreeGrid() {
    var fileserver=getfileServerUrl();
    $("#seriesTb").supertreegrid({
        url: 'series/listCustom',
        method: 'post',
        columns: [
            {
                field: 'serialname',
                title: '系列名称',
                formatter: function (val, row) {
                    return val == null ? '' : val;
                }
            },
            {
                field: 'enSerialname',
                title: '系列英文名称',
                formatter: function (val, row) {
                    return val == null ? '' : val;
                }
            },
            {
                field: 'parentserialname',
                title: '父系列名称',
                formatter: function (val, row) {
                    return val == null ? '' : val;
                }
            },
            {
                field: 'serialurl',
                title: '系列图片',
                formatter: function (val, row) {
                    if (val == '' || val == null) {
                        return '';
                    } else {
                        return "<img src=\"" + fileserver + val + "\" width=\"100px\" heigth=\"40px\">";
                    }
                }
            },
            {
                field: 'enSerialurl',
                title: '系列英文图片',
                formatter: function (val, row) {
                    if (val == '' || val == null) {
                        return '';
                    } else {
                        return "<img src=\"" + fileserver + val + "\" width=\"100px\" heigth=\"40px\">";
                    }
                }
            },
            {
                field: 'sort',
                title: '排序',
                formatter: function (val, row) {
                    return val == null ? '' : val;
                }
            },
            {
                field: 'isdisplay',
                title: '是否前台展示',
                formatter: function (val, row) {
                    return val == 1 ? '展示' : "不展示";
                }
            },
            {
                field: 'remarks',
                title: '备注',
                formatter: function (val, row) {
                    return val == null ? '' : val;
                }
            }
        ],
        idfield: 'serialid',
        parentfield: 'parentserialid',
    });
}


/**
 * 系列modal
 */
function seriesModal(optype) {
    clearFormData("#addForm");
    $(".formcomboxtree").empty();
    $("#optype").val(optype);
    $('#seriesSelect').comboxtree({
        url: "options/getSeriesTreeOptionsByParent",
        data: {'parentId': -1, 'withNone': true}
    });

    $("#seriesModal").modal('show');
    if (optype == 1) {
        $("#modalTitle")[0].innerText = "修改系列";
        var selSeries = $('#seriesTb').data('selectedRow');
        if (selSeries == null) {
            bootbox.alert('请选择一条系列信息', function () {
                return;
            });
            return;
        } else {
            var seriesId = selSeries.serialid;
            var parentSeriesId = selSeries.parentserialid;
            var seriesName = selSeries.serialname;
            var remarks = selSeries.remarks;
            var parentClsName = "--请选择--";
            if (parentSeriesId != 0) {
                parentClsName = selSeries.parentserialname;
            }
            $(".formcomboxtree-handdiv").find('span').eq(0).text(parentClsName);

            $("#seriesName").val(seriesName);
            $("#en_seriesName").val(selSeries.enSerialname);
            $("#remarks").val(remarks);
            $("#seriesId").val(seriesId);
            $("#parentSeriesId").val(parentSeriesId);
            $("#sort").val(selSeries.sort);
            $("#isdisplay").val(selSeries.isdisplay);
            $("#val_chinaimg").val(selSeries.serialurl);
            $("#val_enimg").val(selSeries.enSerialurl);
            if (parentSeriesId == 0) {
                $("#sortdiv").hide();
                $("#disdiv").hide();
            } else {
                $("#sortdiv").show();
                $("#disdiv").show();
            }
        }
    } else {
        $("#modalTitle")[0].innerText = "新增系列";
    }
    initFileInput('file');
    initFileInput('enfile');
}


// 表单验证
function validForm() {
    $('#addForm').bootstrapValidator({
        feedbackIcons: faIcon,
        fields: {
            'serialname': {
                message: '系列名不能为空',
                validators: {
                    notEmpty: {
                        message: '系列名不能为空.'
                    },
                    stringLength: {
                        min: 1,
                        max: 100,
                        message: '系列名长度必须在1~100位之间'
                    }
                }
            },
            'sort': {
                message: '排序不能为空',
                validators: {
                    notEmpty: {
                        message: '排序不能为空.'
                    },
                    regexp: {
                        regexp: /^\d+(\.\d+)?$/,
                        message: '请输入整数！'
                    }
                }
            }
        }
    }).on('success.field.bv', function (e, data) {
        var $parent = data.element.parents('.form-group');
        $parent.removeClass('has-success');
    }).on('success.form.bv', function (e) {
        // Prevent form submission
        e.preventDefault();

        // Get the form instance
        var $form = $(e.target);

        // Get the BootstrapValidator instance
        var bv = $form.data('bootstrapValidator');

        // Use Ajax to submit form data
        var opType = $("#optype").val();
        ;
        if (opType == 1) {
            insertAndUpdateSeries("series/update");
        } else {
            insertAndUpdateSeries("series/add");
        }
    });
}


// 添加更新系列
function insertAndUpdateSeries(url) {
    $("#parentSeriesId").val($("#seriesSelect").val());
    $.ajax({
        type: "POST",
        url: url,
        data: $("#addForm").serialize(),
        success: function (data) {
            if (data.status == 200) {
                clearFormData("#addForm");
                $('#seriesModal').modal('hide');
                bootbox.alert(data.msg);
                $('#seriesSelect').comboxtree('refresh');
                $("#seriesTb").supertreegrid('refresh');
            } else {
                bootbox.alert(data.msg);
            }

        }
    });
}

/**
 * 删除系列
 *
 * @returns
 */
function delSeries() {
    var selSeries = $('#seriesTb').data('selectedRow');
    if (selSeries == null) {
        bootbox.alert('请选择一个系列', function () {
            return;
        });
        return;
    } else {
        bootbox.confirm("确定删除?", function (result) {
            if (result) {
                $.ajax({
                    type: "POST",
                    url: "series/del",
                    data: {"seriesId": selSeries.serialid},
                    success: function (data) {
                        if (data.status == 200) {
                            bootbox.alert(data.msg);
                            $('#seriesSelect').comboxtree('refresh');
                            $("#seriesTb").supertreegrid('refresh');
                        } else {
                            bootbox.alert(data.msg);
                        }

                    }
                });
            }

        });
    }
}


/**
 * 文件上传
 */
function initFileInput(columnname) {
    //上传初始化
    var control = $('#'+columnname);
    control.fileinput({
        language: 'zh', //设置语言
        uploadUrl: "personal/uploadFile", //上传的地址
        allowedFileExtensions:['jpg', 'gif', 'png'],//接收的文件后缀，如['jpg', 'gif', 'png'],不填将不限制上传文件后缀类型
        //uploadExtraData:{"id": 1, "fileName":'123.mp3'},//请求的额外参数
        uploadAsync: true, //默认异步上传
        showUpload: true, //是否显示上传按钮
        showRemove : true, //显示移除按钮
        showPreview : true, //是否显示预览
        showCaption: false,//是否显示标题
        browseClass: "btn btn-primary", //按钮样式
        dropZoneEnabled: false,//是否显示拖拽区域
        //minImageWidth: 50, //图片的最小宽度
        //minImageHeight: 50,//图片的最小高度
        //maxImageWidth: 1000,//图片的最大宽度
        //maxImageHeight: 1000,//图片的最大高度
        //maxFileSize: 300,//单位为kb，如果为0表示不限制文件大小
        //minFileCount: 0,
        maxFileCount: 1, //表示允许同时上传的最大文件个数
        enctype: 'multipart/form-data',
        validateInitialCount:true,
        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
        msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
    }).on("filebatchselected", function(event, files) {
    }).on("fileuploaded", function(event, data,previewId, index) {
        if(data.response){
            if(data.response.status==200){
                bootbox.alert('文件上传成功');
                $("#classImg").val(data.response.data);
            }
        }else{
            bootbox.alert(data.response.msg);
        }
    });
}
