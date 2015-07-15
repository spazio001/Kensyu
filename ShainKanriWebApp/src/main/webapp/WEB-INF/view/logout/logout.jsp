<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"
	type="text/javascript"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}"
	rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>ログアウト</title>
</head>
<body>
	<div class="container">
		<s:form>
			<html:errors />
			<div class="text-center" style="padding:15px 0">
				<h1>社員管理システム</h1>
			</div>
			<div class="text-center" style="padding:15px 0">
				ログアウトしました。
			</div>
			<div class="text-center" style="padding:15px 0">
				<input type="submit" name="close" value="閉じる"/>
			</div>
		</s:form>
	</div>
</body>
</html>