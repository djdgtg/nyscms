<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>北语社图书管理平台</title>
    <!--Bootstrap Stylesheet [ REQUIRED ]-->
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <!--Nifty Stylesheet [ REQUIRED ]-->
    <link href="static/css/nifty.min.css" rel="stylesheet">
    <!--Font Awesome [ OPTIONAL ]-->
    <link rel="stylesheet" href="static/plugins/font-awesome/css/font-awesome.min.css">
    <!--Bootstrap Validator [ OPTIONAL ]-->
    <link href="static/plugins/bootstrap-validator/bootstrapValidator.min.css" rel="stylesheet">
    <!--Ion Icons [ OPTIONAL ]-->
    <link href="static/plugins/bootstrap-treeview/bootstrap-treeview.css" rel="stylesheet">
    <link href="static/plugins/treegrid/jquery.treegrid.css" rel="stylesheet"/>
    <link href="static/css/style.css" rel="stylesheet"/>
    <!--jQuery [ REQUIRED ]-->
    <script src="static/js/jquery-2.2.4.min.js"></script>
    <script src="static/plugins/bootstrap-treeview/bootstrap-treeview.js"></script>
    <script src="static/plugins/treegrid/jquery.treegrid.min.js"></script>
    <script src="static/plugins/treegrid/jquery.treegrid.bootstrap3.js"></script>
    <!--BootstrapJS [ RECOMMENDED ]-->
    <script src="static/js/bootstrap.min.js"></script>
    <!--Bootstrap Validator [ OPTIONAL ]-->
    <script src="static/plugins/bootstrap-validator/bootstrapValidator.min.js"></script>
    <!--Bootbox Modals [ OPTIONAL ]-->
    <script src="static/plugins/bootbox/bootbox.min.js"></script>
    <!--fileinput文件上传  -->
    <link type="text/css" href="static/plugins/bootstrap-fileinput/css/fileinput.min.css" rel="stylesheet">
    <script type="text/javascript" src="static/plugins/bootstrap-fileinput/js/fileinput.min.js"></script>
    <script type="text/javascript" src="static/plugins/bootstrap-fileinput/js/zh.js"></script>
    <!--DataTables Sample [ PORTAL ]-->
    <script src="static/js/comm.js"></script>
    <script src="static/js/pageextend.js"></script>
    <script src="static/js/sysmanage/series.js"></script>
</head>
<body>
<!--Page Title-->
<div id="page-title">
    <h1 class="page-header text-overflow">系列管理</h1>
</div>
<!--End page title-->

<!--Breadcrumb-->
<ol class="breadcrumb">
    <li><a href="#">首页</a></li>
    <li>系统管理</li>
    <li class="active">系列管理</li>
</ol>
<!--End breadcrumb-->

<!--Page content-->
<div id="page-content">
    <div class="panel panel-body">
        <div class="bootstrap-table">
            <div class=" fixed-table-toolbar">
                <div class="bars pull-left">
                    <div id="toolbar" class="table-toolbar-left">
                        <button onclick="seriesModal(0)" class="btn btn-primary"><i class="ion-plus"></i> 新增</button>
                        <button onclick="seriesModal(1)" class="btn btn-mint"><i class="ion-edit"></i> 修改</button>
                        <button class="btn btn-danger" onclick="delSeries()"><i class="ion-close"></i> 删除</button>
                        <input type="hidden" class="form-control" id="optype">
                    </div>
                </div>
            </div>
        </div>
        <div class="fixed-table-container" style="padding-bottom: 0px;">
            <div class="fixed-table-body">
                <table id="seriesTb"></table>
            </div>
        </div>
    </div>
</div>
<!--End page content-->
<!--Default Bootstrap Modal-->
<div class="modal fade" id="seriesModal" role="dialog" tabindex="-1" aria-labelledby="seriesModal"
     data-backdrop="static" aria-hidden="true">
    <div class="modal-dialog" style="width:900px;">
        <div class="modal-content">
            <!--Modal header-->
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><i class="pci-cross pci-circle"></i></button>
                <h4 class="modal-title" id="modalTitle"></h4>
            </div>
            <form id="addForm" method="post" class="form-horizontal">
                <!--Modal body-->
                <div class="modal-body">
                    <div class="form-group">
                        <label class="col-lg-3 control-label">父级系列：</label>
                        <div class="col-lg-7">
                            <input name="parentserialid" id="seriesSelect" type="text" class="form-control"
                                   placeholder="父系列编号"/>
                            <input type="hidden" class="form-control" name="serialid" id="seriesId">
                        </div>
                    </div>
                    <br>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">系列名称：</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="serialname" placeholder="系列名称"
                                   id="seriesName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">系列中文封面图：</label>
                        <div class="col-lg-7">
                            <input type="file" data-show-caption="true" class="form-control" name="file"
                                   placeholder="上传系列中文封面" id="file"/>
                            <input type="hidden" class="form-control" name="serialurl" id="val_chinaimg"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-3 control-label">系列英文名称：</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="enSerialname" placeholder="系列英文名称"
                                   id="en_seriesName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">系列英文封面图：</label>
                        <div class="col-lg-7">
                            <input type="file" data-show-caption="true" class="form-control" name="file"
                                   placeholder="上传系列英文封面" id="enfile"/>
                            <input type="hidden" class="form-control" name="enSerialurl" id="val_enimg"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-3 control-label">系列备注：</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="remarks" placeholder="系列备注"
                                   id="remarks">
                        </div>
                    </div>
                    <div class="form-group" id="sortdiv">
                        <label class="col-lg-3 control-label">系列排序：</label>
                        <div class="col-lg-7">
                            <input type="text" class="form-control" name="sort" placeholder="系列排序" id="sort">
                        </div>
                    </div>
                    <div class="form-group" id="disdiv">
                        <label class="col-lg-3 control-label">是否首页展示：</label>
                        <div class="col-lg-7">
                            <select class="form-control" name="isdisplay" id="isdisplay">
                                <option value="1">展示</option>
                                <option value="0">不展示</option>
                            </select>
                        </div>
                    </div>
                </div>

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
</body>
</html>

