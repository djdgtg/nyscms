<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from www.themeon.net/nifty/v2.3/pages-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 01 Mar 2016 16:53:39 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>农业社管理平台登录</title>
    <!--STYLESHEET-->
    <!--=================================================-->
    <!--Bootstrap Stylesheet [ REQUIRED ]-->
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <!--Nifty Stylesheet [ REQUIRED ]-->
    <link href="static/css/nifty.min.css" rel="stylesheet">
    <!--Font Awesome [ OPTIONAL ]-->
    <link href="static/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!--Demo [ DEMONSTRATION ]-->
    <link href="static/css/demo/nifty-demo.min.css" rel="stylesheet">
    <!--validator [ OPTIONAL ]-->
    <link href="static/plugins/bootstrap-validator/bootstrapValidator.min.css" rel="stylesheet">
    <!--SCRIPT-->
    <!--=================================================-->
    <!--Page Load Progress Bar [ OPTIONAL ]-->
    <link href="static/plugins/pace/pace.min.css" rel="stylesheet">
    <!--JAVASCRIPT-->
    <!--=================================================-->
    <!--jQuery [ REQUIRED ]-->
    <script src="static/js/jquery-2.2.4.min.js"></script>
    <!--BootstrapJS [ RECOMMENDED ]-->
    <script src="static/js/bootstrap.min.js"></script>
    <!--Fast Click [ OPTIONAL ]-->
    <script src="static/plugins/fast-click/fastclick.min.js"></script>
    <!--Nifty Admin [ RECOMMENDED ]-->
    <script src="static/js/nifty.min.js"></script>
    <!--Background Image [ DEMONSTRATION ]-->
    <script src="static/js/demo/bg-images.js"></script>
    <!--validator [ OPTIONAL ]-->
    <script src="static/plugins/bootstrap-validator/bootstrapValidator.min.js"></script>
    <!--bootbox [ OPTIONAL ]-->
    <script src="static/plugins/bootbox/bootbox.min.js"></script>
    <script src="static/plugins/pace/pace.min.js"></script>
    <script src="static/js/login.js"></script>
	<!--
	REQUIRED
	You must include this in your project.
	RECOMMENDED
	This category must be included but you may modify which plugins or components which should be included in your project.
	OPTIONAL
	Optional plugins. You may choose whether to include it in your project or not.
	DEMONSTRATION
	This is to be removed, used for demonstration purposes only. This category must not be included in your project.
	SAMPLE
	Some script samples which explain how to initialize plugins or components. This category should not be included in your project.
	Detailed information and more samples can be found in the document.
	-->

</head>
<!--TIPS-->
<!--You may remove all ID or Class names which contain "demo-", they are only used for demonstration. -->
<body>
	<div id="container" class="cls-container">
		<!-- BACKGROUND IMAGE -->
		<!--===================================================-->
		<div id="bg-overlay" class="bg-img img-balloon"></div>
		<!-- HEADER -->
		<!--===================================================-->
		<div class="cls-header cls-header-lg">
			<div class="cls-brand">
				<a class="box-inline" href="static/index.html">
					<!-- <img alt="Nifty Admin" src="static/img/logo.png" class="brand-icon"> -->
					<span class="brand-title">Nifty <span class="text-thin">Admin</span></span>
				</a>
			</div>
		</div>
		<!--===================================================-->
		<!-- LOGIN FORM -->
		<!--===================================================-->
		<div class="cls-content">
			<div class="cls-content-sm panel">
				<div class="panel-body">
					<p class="pad-btm">Sign In to your account</p>
					<form id="loginForm">
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon"><i class="icon-user"></i></div>
								<input type="text" class="form-control" placeholder="Username" name="username">
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon"><i class="icon-lock"></i></div>
								<input type="password" class="form-control" placeholder="Password" name="passwd">
							</div>
						</div>
						<div class="form-group">
							<div class="text-left">
								<label class="form-icon">
								<input type="checkbox" name="autoLogin"> 自动登录
								</label>
							</div>
						</div>
						<button class="btn btn-primary btn-lg btn-block" type="submit">
							Login
						</button>
					</form>
				</div>
			</div>
			<#--<div class="pad-ver">
				<a href="static/reminder.html" class="btn-link mar-rgt">Forgot password ?</a>
			</div>-->
		</div>
		<!--===================================================-->
		<!-- DEMO PURPOSE ONLY -->
		<!--===================================================-->
		<div class="demo-bg">
			<div id="demo-bg-list">
				<div class="demo-loading"><i class="fa fa-refresh"></i></div>
				<img class="demo-chg-bg bg-trans" src="static/img/bg-img/thumbs/bg-trns.jpg" alt="Background Image">
				<img class="demo-chg-bg" src="static/img/bg-img/thumbs/bg-img-1.jpg" alt="Background Image">
				<img class="demo-chg-bg active" src="static/img/bg-img/thumbs/bg-img-2.jpg" alt="Background Image">
				<img class="demo-chg-bg" src="static/img/bg-img/thumbs/bg-img-3.jpg" alt="Background Image">
				<img class="demo-chg-bg" src="static/img/bg-img/thumbs/bg-img-4.jpg" alt="Background Image">
				<img class="demo-chg-bg" src="static/img/bg-img/thumbs/bg-img-5.jpg" alt="Background Image">
				<img class="demo-chg-bg" src="static/img/bg-img/thumbs/bg-img-6.jpg" alt="Background Image">
				<img class="demo-chg-bg" src="static/img/bg-img/thumbs/bg-img-7.jpg" alt="Background Image">
			</div>
		</div>
		<!--===================================================-->
	</div>
	<!--===================================================-->
	<!-- END OF CONTAINER -->

</body>

<!-- Mirrored from www.themeon.net/nifty/v2.3/pages-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 01 Mar 2016 16:53:43 GMT -->
</html>
