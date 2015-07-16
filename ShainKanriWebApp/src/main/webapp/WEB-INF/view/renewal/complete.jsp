<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"
	type="text/javascript"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}"
	rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>社員更新完了</title>
</head>
<body>
	<jsp:include page="/WEB-INF/view/common/header.jsp" />
	<div class="container">
		<s:form>
			<html:errors />
			<div class="text-center" style="padding: 15px 0">
				<h1>社員更新完了</h1>
			</div>
			<div class="text-center" style="padding: 15px 0">社員が更新されました。</div>
			<div class="text-center" style="padding: 15px 0">
				<input type="submit" name="research" value="検索画面に戻る" />
			</div>
		</s:form>
	</div>
</body>
</html>