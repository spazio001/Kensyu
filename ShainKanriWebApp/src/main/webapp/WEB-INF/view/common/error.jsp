<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"
	type="text/javascript"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}"
	rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>エラー</title>
</head>
<body>
	<jsp:include page="/WEB-INF/view/common/header.jsp" />
	<div class="container">
		<div class="text-center" style="padding: 15px 0">
			<h1>エラー</h1>
		</div>
		<div class="text-center" style="padding: 15px 0">
			予期せぬエラーが発生しました。</div>
		<div class="text-center" style="padding: 15px 0">
			<a href="${f:url('/search/')}" class="btn btn-default">検索画面に戻る</a>
		</div>
	</div>
</body>
</html>