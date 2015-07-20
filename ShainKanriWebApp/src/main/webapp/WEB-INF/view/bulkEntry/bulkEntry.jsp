<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}"
	rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>社員一括登録</title>
</head>
<body>
	<jsp:include page="/WEB-INF/view/common/header.jsp" />
	<div class="container">
		<html:errors />
		<div class="row text-center">
			<h1>社員一括登録</h1>
		</div>
		<div class="row">
			<div class="col-lg-offset-4">
				<s:form styleClass="form-horizontal">
					<div class="form-group">
						<div class="text-center">
							<div class="col-lg-6">
								<input type="submit" name="file" value="ファイル選択" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="text-center">
							<div class="col-lg-6">
								<input type="submit" name="data" value="データ確認" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="text-center">
							<div class="col-lg-6">
								<input type="submit" name="entry" value="登録" />
							</div>
						</div>
					</div>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>