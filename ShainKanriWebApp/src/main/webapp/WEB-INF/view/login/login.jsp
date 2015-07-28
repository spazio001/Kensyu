<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}"
	rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>ログイン</title>
</head>
<body>
	<div class="container">
		<html:errors />
		<div class="row">
			<h1>社員管理システム</h1>
		</div>
		<div class="row">
			<div class="col-lg-offset-7 col-lg-5">
				新しく入社された方は、こちらからアカウントを作成してください。</div>
			<div class="col-lg-offset-9 col-lg-3">
				<input class="btn btn-default" type="submit" value="新規登録"
					disabled="disabled" />
			</div>
		</div>
		<div class="row text-center">
			<h2>ログイン</h2>
		</div>
		<div class="row">
			<div class="col-lg-offset-4">
				<s:form styleClass="form-horizontal">
					<div class="form-group">
						<label for="loginUser" class="control-label col-lg-2">ユーザーID：</label>
						<div class="col-lg-3">
							<html:text styleClass="form-control" property="loginUser" />
						</div>
					</div>
					<div class="form-group">
						<label for="loginPassword" class="control-label col-lg-2">パスワード：</label>
						<div class="col-lg-3">
							<html:password styleClass="form-control" property="loginPassword" />
						</div>
					</div>
					<div class="form-group">
						<div class="text-center">
							<div class="col-lg-6">
								<input type="submit" name="login" value="ログイン" />
							</div>
						</div>
					</div>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>