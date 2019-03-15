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
    <!--JAVASCRIPT-->
    <!--jQuery [ REQUIRED ]-->
    <script src="static/js/jquery-2.2.4.min.js"></script>

    <!--Bootbox Modals [ OPTIONAL ]-->
    <script src="static/plugins/bootbox/bootbox.min.js"></script>
    <!--DataTables Sample [ PORTAL ]-->
    <script src="static/js/comm.js"></script>
    <script src="static/js/sysmanage/platformdata.js"></script>
    <script src="static/plugins/highcharts/highcharts.js"></script>
</head>
<body>
<!--Page Title-->
<div id="page-title">
    <h1 class="page-header text-overflow">平台数据</h1>
</div>
<!--End page title-->

<!--Breadcrumb-->
<ol class="breadcrumb">
    <li><a href="#">首页</a></li>
    <li>数据分析</li>
    <li class="active">平台数据</li>
</ol>
<!--End breadcrumb-->

<!--Page content-->
<div id="page-content">
    <div class="panel panel-body">
        <div class=" fixed-table-toolbar">
            <div class="bars pull-left">
                <div id="toolbar" class="table-toolbar-left">
                    <button onclick="platformdataModal(0)" class="btn btn-primary">当天登陆人数</button>
                    <button onclick="platformdataModal(1)" class="btn btn-primary">当月登陆人数</button>
                    <button onclick="platformdataModal(2)" class="btn btn-primary">图书收藏人数</button>
                    <button onclick="platformdataModal(3)" class="btn btn-primary">图书销量</button>
                </div>
            </div>
        </div>
    </div>
    <div class="panel panel-body" align="center" id="highchart">
        <div id="container" style="width: 800px; height: 700px"></div>
        <button id="large">放大</button>
        <button id="small">缩小</button>
    </div>
</div>
</body>
</html>

