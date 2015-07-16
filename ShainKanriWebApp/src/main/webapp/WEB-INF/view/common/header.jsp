<header class="navbar navbar-static-top">
	<div class="container">
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="navbar-header" style="font-size:15px">
				<label style="margin-top:10px">社員管理システム</label>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="${f:url('/search/')}">社員検索</a></li>
				<li><a href="${f:url('/entry/')}">社員登録</a></li>
				<li><a href="${f:url('/shelfEntry/')}">社員一括登録</a></li>
				<li><a href="${f:url('/logout/')}">ログアウト</a></li>
			</ul>
			<div class="">
				<a class="navbar-text navbar-right">ユーザーID：${f:h(userDataDto.loginUser)}</a>
			</div>
		</nav>
	</div>
</header>