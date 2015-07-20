<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}"
	rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>社員登録完了</title>
</head>
<body>
	<jsp:include page="/WEB-INF/view/common/header.jsp" />
	<div class="container">
		<s:form>
			<html:errors />
			<div class="text-center" style="padding: 15px 0">
				<h1>社員登録完了</h1>
			</div>
			<div class="text-center" style="padding: 15px 0">社員が登録されました。</div>
			<div class="text-center" style="padding: 15px 0">
				<input type="submit" name="research" value="検索画面に戻る" />
			</div>
		</s:form>
	</div>
</body>
</html>