<header class="navbar navbar-static-top">
	<div class="container">
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="navbar-header">
				<a class="navbar-text">社員管理システム</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="${f:url('/search/')}">社員検索</a></li>
				<li><a href="${f:url('/entry/')}">社員登録</a></li>
				<li><a href="${f:url('/renewal/')}">社員一括登録</a></li>
				<li><a href="${f:url('/logout/')}">ログアウト</a></li>
			</ul>
			<div class="col-lg-8">
				<a class="navbar-text navbar-right">ユーザーID：</a>
			</div>
		</nav>
	</div>
</header>