<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js" type="text/javascript" ></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}" rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>ログイン</title>
</head>
<body>
<s:form>

<div class="container">
	<div class="text-left">
		<h1>社員管理システム</h1>
	</div>
	<html:errors/>
	<div class="text-right">
		<div class="col-lg-5 col-lg-offset-7">
			新しく入社された方は、こちらからアカウントを作成してください。
		</div>
	</div>
		<div class="col-lg-3 col-lg-offset-9">
			<input class="btn btn-default" type="submit" value="新規登録" disabled="disabled">
		</div>
	<div class="text-center">
		<h2>ログイン</h2>
 	<form class="form-horizontal" style="padding:50px 0">
 		<div class="form-group">
 			<div class="col-lg-3"></div>
 			<label for="loginUser" class="col-lg-2 control-label">ユーザーID：</label>
 			<div class="col-lg-7 ">
 				 <html:text property="loginUser"/>
 				<!-- input type="text" class="form-control" id="loginUser"> -->
 			</div>
 		</div>
 		<div class="form-group" style="padding:25px 0">
 			<html:text property="loginPassword"/>
 			<!-- label for="loginPassword" class="col-lg-2 control-label">パスワード</label> -->
 			<div class="col-lg-10">
 				<input type="text" class="form-control" id="loginPassword">
 			</div>
 		</div>
 		<div class="form-group" style="padding:50px 0">
 			<div class="text-center">
 				<!--input type="submit" value="ログイン" class="btn btn-primary"-->
 			<input type="submit" name="login" value="ログイン" />
</div>
</s:form>

 		</div>
	</form>
	</div>
</div>
</body>
</html>