<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
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