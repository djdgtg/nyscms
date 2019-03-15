<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>知识服务平台管理</title>
    <!--Bootstrap Stylesheet [ REQUIRED ]-->
    <link href="../static/css/bootstrap.min.css" rel="stylesheet">
    <!--Nifty Stylesheet [ REQUIRED ]-->
    <link href="../static/css/nifty.min.css" rel="stylesheet">
    <!--DataTables [ OPTIONAL ]-->
    <link href="../static/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="../static/plugins/bootstrap-table/extensions/page-jump/bootstrap-table-pagejump.css" rel="stylesheet">
    <!--jquery treegrid [ OPTIONAL ]-->
    <link href="../static/plugins/treegrid/jquery.treegrid.css" rel="stylesheet">

    <!--Font Awesome [ OPTIONAL ]-->
    <link href="../static/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!--Bootstrap Validator [ OPTIONAL ]-->
    <link href="../static/plugins/bootstrap-validator/bootstrapValidator.min.css" rel="stylesheet">

    <!--Bootstrap Select [ OPTIONAL ]-->
    <link href="../static/plugins/bootstrap-select/bootstrap-select.min.css" rel="stylesheet">
    <link href="../static/plugins/bootstrap-treeview/bootstrap-treeview.css" rel="stylesheet">

    <!--jQuery [ REQUIRED ]-->
    <script src="../static/js/jquery-2.2.4.min.js"></script>
    <!--BootstrapJS [ RECOMMENDED ]-->
    <script src="../static/js/bootstrap.min.js"></script>
    <!--Bootbox Modals [ OPTIONAL ]-->
    <script src="../static/plugins/bootbox/bootbox.min.js"></script>
    <script src="../static/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="../static/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
    <script src="../static/plugins/bootstrap-table/extensions/page-jump/bootstrap-table-pagejump.js"></script>
    <!-- <script src="../static/plugins/treegrid/jquery.treegrid.bootstrap3.js"></script> -->
    <!--Bootstrap Validator [ OPTIONAL ]-->
    <script src="../static/plugins/bootstrap-validator/bootstrapValidator.min.js"></script>

    <!--Bootstrap Select [ OPTIONAL ]-->
    <script src="../static/plugins/bootstrap-select/bootstrap-select.min.js"></script>
    <script src="../static/plugins/bootstrap-treeview/bootstrap-treeview.js"></script>
    <!--fileinput文件上传  -->
    <link type="text/css" href="../static/plugins/bootstrap-fileinput/css/fileinput.min.css" rel="stylesheet">
    <script type="text/javascript" src="../static/plugins/bootstrap-fileinput/js/fileinput.min.js"></script>
    <script type="text/javascript" src="../static/plugins/bootstrap-fileinput/js/zh.js"></script>
    <!-- bootstrap-table-editable -->
    <link href="../static/plugins/x-editable/css/bootstrap-editable.css" rel="stylesheet">
    <script src="../static/plugins/x-editable/js/bootstrap-editable.js"></script>
    <script src="../static/plugins/bootstrap-table/extensions/editable/bootstrap-table-editable.js"></script>
    <!-- excel导出 -->
    <script src="../static/plugins/bootstrap-table/extensions/export/tableExport.js"></script>
    <script src="../static/plugins/bootstrap-table/extensions/export/bootstrap-table-export.js"></script>
    <!-- WdatePicker日期时间 -->
    <script src="../static/plugins/My97DatePicker/WdatePicker.js"></script>
    <!-- kindeditor富文本编辑器 -->
    <script src="../static/plugins/kindeditor/kindeditor-all.js"></script>

    <!--DataTables Sample [ PORTAL ]-->
    <script src="../static/js/comm.js"></script>
    <script src="../static/plugins/highcharts/highcharts.js"></script>
    <script src="../static/js/resourcemanage/resource.js"></script>
    <style>
        .colStyle {
            overflow: hidden;
            white-space: nowrap;
            text-overflow: ellipsis;
            width: 150px;
            display: inline-block;
        }
    </style>
</head>
<body>
<!--Page Title-->
<div id="page-title">
    <h1 class="page-header text-overflow" id="headMenuVal">资源管理</h1>
</div>
<!--End page title-->

<!--Breadcrumb-->
<ul class="breadcrumb">
    <li><a href="#">首页</a></li>
    <li>知识组织</li>
    <li class="active">知识管理</li>
</ul>
<!--End breadcrumb-->

<!--Page content-->
<div id="page-content">
    <div class="panel">
        <form id="searchForm" class="panel-body form-horizontal">
            <input type="hidden" name="mouldId" id="mouldSelect"/>
            <input type="hidden" name="databaseName" id="dbSelect"/>
            <div id="searchDiv"></div>
        </form>
    </div>
    <div class="panel">
        <div id="toolbar">
			<span id="curdArea">
					<button class="btn btn-primary" onclick="resourceModal(0)"><i class="icon-plus"></i> 新增</button>
					<button class="btn btn-mint" onclick="resourceModal(1)"><i class="icon-edit"></i> 修改</button>
					<button class="btn btn-danger" onclick="delResource(-1)"><i class="icon-remove"></i> 删除</button>
			</span>
            <span id="userlockArea">
					<button class="btn btn-primary" onclick="userlock(1)"><i class="icon-unlock"></i> 解锁</button>
					<button class="btn btn-danger" onclick="userlock(-2)"><i class="icon-lock"></i> 锁定</button>
			</span>
            <span id="importAndExportArea">
					<button class="btn btn-primary" onclick="downImportAndExportModal(0)">
						<i class="icon-download-alt"></i> 下载导入模板
					</button>
					<button class="btn btn-primary" onclick="resImportModal()">
						<i class="icon-signin"></i> 导入数据
					</button>
					<button class="btn btn-primary" onclick="downImportAndExportModal(1)">
						<i class="icon-signout"></i> 导出数据
					</button>
			</span>
            <span id="sendArea">
					<button class="btn btn-primary" onclick="sendMessage()">
						<i class="icon-envelope-alt"></i> 发送消息
					</button>
			</span>
            <span id="fankuiArea">
                数量： <input type="text" name="scorenum" class="form-control"
                           id="scorenum" placeholder="默认10积分">
					<button class="btn btn-primary" onclick="fankui()">
						<i class="icon-plus"></i> 赠送积分
					</button>
            </span>
            <span id="isallseriesArea">
					<button class="btn btn-primary" onclick="isallseries(1)">
						<i class="icon-plus"></i> 添加全平台包月
					</button>
					<button class="btn btn-danger" onclick="isallseries(0)">
						<i class="icon-remove"></i> 删除全平台包月
					</button>
			</span>
            <span id="displayArea">
					专题类型：<select name="themeids" id="themeids" class="selectpicker show-tick form-control"
                                 data-width="98%"
                                 data-first-option="false" title='---请选择专题---' required
                                 data-live-search="true">
				</select>
					<button class="btn btn-mint" onclick="editTheme(1)">
						<i class="icon-edit"></i> 修改书籍专题
					</button>
					<button class="btn btn-danger" onclick="editTheme(0)">
						<i class="icon-remove"></i> 取消书籍专题
					</button> <br>
					<button class="btn btn-primary" onclick="isDisplay(1,1)">
						<i class="icon-plus"></i> 添加首页系列展示
					</button>
					<button class="btn btn-danger" onclick="isDisplay(1,0)">
						<i class="icon-remove"></i> 取消首页系列展示
					</button> <br>
					<button class="btn btn-primary" onclick="isDisplay(2,1)">
						<i class="icon-plus"></i> 添加首页推荐展示
					</button>
					<button class="btn btn-danger" onclick="isDisplay(2,0)">
						<i class="icon-remove"></i> 取消首页推荐展示
					</button> <br>
					<button class="btn btn-primary" onclick="isDisplay(3,1)">
						<i class="icon-plus"></i> 添加首页新书展示
					</button>
					<button class="btn btn-danger" onclick="isDisplay(3,0)">
						<i class="icon-remove"></i> 取消首页新书展示
					</button>
            </span>
            <span id="userbaseArea">
					<button onclick="userbaseModal(0)" class="btn btn-primary">国家（地区）</button>
					<button onclick="userbaseModal(1)" class="btn btn-primary">年龄</button>
					<button onclick="userbaseModal(2)" class="btn btn-primary">学习汉语年数</button>
					<button onclick="userbaseModal(3)" class="btn btn-primary">登录设备</button>
            </span>
            <span id="userreadArea">
					查询开始时间 <input type="text" class="form-control" name="readstarttime"
                                  id="readstarttime"/> 查询结束时间 <input type="text" class="form-control"
                                                                     name="readendtime" id="readendtime"/>
					<button onclick="userreadModal(1)" class="btn btn-primary">阅读系列</button>
					<button onclick="userreadModal(2)" class="btn btn-primary">阅读分类</button>
				</span>
            <span id="userloginArea">
					<button onclick="userloginModal(0)" class="btn btn-primary">总登录时长</button>
					<button onclick="userloginModal(1)" class="btn btn-primary">单日登录时长</button>
				</span>
            <span id="userexpendArea">
					<button onclick="userexpendModal(1)" class="btn btn-primary">月花费虚拟币</button>
					<button onclick="userexpendModal(2)" class="btn btn-primary">月花费积分</button>
					<button onclick="userexpendModal(3)" class="btn btn-primary">月购买书籍</button>
					<button onclick="userexpendModal(4)" class="btn btn-primary">周花费虚拟币</button>
					<button onclick="userexpendModal(5)" class="btn btn-primary">周花费积分</button>
					<button onclick="userexpendModal(6)" class="btn btn-primary">周购买书籍</button>
            </span>
            <span id="bindingArea">
					 数量： <input type="text" name="maxbindingNum" id="maxbindingNum" placeholder="默认5台">
					<button class="btn btn-primary" onclick="setMaxbindingNum()">
						<i class="icon-edit"></i>设备最大绑定数
					</button>
					<button class="btn btn-primary" onclick="activateorganization()">
						<i class="icon-plus"></i> 激活机构用户
					</button>
            </span>
            <!--机构授权start-->
            <span id=authorizationArea>
				<select name="userId" id="userId"
                        class="selectpicker show-tick form-control" data-width="98%"
                        data-first-option="false" title='请选择机构用户(必选)' required
                        data-live-search="true">
				</select> 开始时间 <input type="text" class="form-control" name="starttime"
                                      placeholder="默认当天00:00:00" id="starttime"/> 结束时间 <input type="text"
                                                                                              class="form-control"
                                                                                              name="endtime"
                                                                                              id="endtime"
                                                                                              placeholder="默认当天23:59:59"/>
					通知手机号码 <input type="text" class="form-control"
                                  name="phone" id="phone" placeholder="输入该机构的联系人手机号"/>
				<button class="btn btn-primary" onclick="authorization()">
					<i class="icon-plus"></i> 授权
				</button>
            </span>
            <!--机构授权end-->
            <span id=fabuArea>
				满减类型<select name="fillminusType" id="fillminusType"
                            class="curdArea selectpicker show-tick" data-width="98%"
                            data-first-option="false" title='---请选择满减类型---' required
                            data-live-search="true">
				</select>
				<button class="btn btn-primary" onclick="editFullminustype()"><i class="icon-plus"></i> 批量满减</button>
				<button class="btn btn-primary" onclick="ebookpublish(4)"><i
                        class="icon-circle-arrow-up"></i>图书上架</button>
				<button class="btn btn-danger" onclick="ebookpublish(3)"><i
                        class="icon-circle-arrow-down"></i>图书下架</button>
                <button class="btn btn-primary" onclick="genQrcode()">
						<i class="icon-plus"></i> 生成二维码</button>
                <button class="btn btn-primary" onclick="exportQrcode()">
						<i class="icon-download-alt"></i> 导出二维码</button>
            </span>
        </div>
        <div class="panel-body">
            <table id="resourceTb" class="demo-add-niftycheck"></table>
        </div>
        <div class="panel panel-body" align="center" id="highchart">
            <div id="container" style="width: 800px; height: 700px"></div>
            <button id="large">放大</button>
            <button id="small">缩小</button>
        </div>
    </div>
</div>
<!--End page content-->
<!--Default Bootstrap Modal-->
<div class="modal fade" id="resModal" role="dialog" tabindex="-1" aria-labelledby="resModal" aria-hidden="true"
     style="overflow: auto" data-backdrop="static">
    <div class="modal-dialog" style="width: 70%">
        <div class="modal-content">
            <!--Modal header-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="pci-cross pci-circle"></i></button>
                <h4 class="modal-title">资源数据</h4>
                <div><label>带<span style="color: red">✲</span>为必填</label></div>
            </div>
            <form id="resourceForm" method="post" class="form-horizontal">
                <!--Modal body-->
                <div class="modal-body" id="resFormDiv"></div>
                <!--Modal footer-->
                <div class="modal-footer">
                    <button data-dismiss="modal" class="btn btn-default" type="button">取消</button>
                    <button class="btn btn-primary">保存</button>
                </div>
            </form>
        </div>
    </div>
</div>
<!--End Default Bootstrap Modal-->

<!--导入数据start-->
<div class="modal fade" id="importResModal" role="dialog" tabindex="-1" aria-labelledby="importResModal"
     aria-hidden="true">
    <div class="modal-dialog" style="width: 40%">
        <div class="modal-content">
            <!--Modal header-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="pci-cross pci-circle"></i></button>
                <h4 class="modal-title">导入数据</h4>
            </div>
            <form id="importResForm" method="post" class="form-horizontal">
                <!--Modal body-->
                <div class="modal-body" id="importDiv">
                    <div class="form-group">
                        <div class="col-lg-3">
                            <label class="control-label"
                                   style="text-align: right;width: 165px;height: 40px;line-height: 29px;">上传文件:</label>
                        </div>
                        <div class="col-lg-7">
                            <input id="importRes" name="file" multiple type="file" data-show-caption="true"/>
                        </div>
                    </div>
                </div>
                <!--Modal footer-->
                <div class="modal-footer">
                    <button class="btn btn-primary" id="importResId">确认</button>
                </div>
            </form>
        </div>
    </div>
</div>
<!--导入数据end-->
</body>
</html>

