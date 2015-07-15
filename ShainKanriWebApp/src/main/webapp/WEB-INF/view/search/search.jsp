<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"
	type="text/javascript"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<link href="${f:url('/css/bootstrap-responsive.min.css')}"
	rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<title>社員検索</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/common/header.jsp"/>

	<div class="container">
		<html:errors />
		<div class="row text-center">
			<h1>社員管理システム</h1>
		</div>
		<div class="row">
			<div class="col-lg-offset-4">
				<s:form styleClass="form-horizontal">
					<div class="form-group">
						<label for="shainNo" class="control-label col-lg-2">社員番号：</label>
						<div class="col-lg-3">
							<html:text styleClass="form-control" property="shainNo" />
						</div>
					</div>
					<div class="form-group">
						<label for="shainName" class="control-label col-lg-2">氏名：</label>
						<div class="col-lg-3">
							<html:text styleClass="form-control" property="shainName" />
						</div>
					</div>
					<div class="form-group">
						<label for="shainBirthday" class="control-label col-lg-2">生年月日：</label>
						<div class="col-lg-3">
							<html:text styleClass="form-control" property="shainBirthday" />
						</div>
						<div class="text-left" style="padding: 6px 0">
							<label>例）9999/99/99</label>
						</div>
					</div>
					<div class="form-group">
						<label for="shainSex" class="control-label col-lg-2">性別：</label>
						<div class="col-lg-5">
							<label class="radio-inline"> <input type="radio"
								name="inlineRadioOptions" id="man" value="1">男性
							</label> <label class="radio-inline"> <input type="radio"
								name="inlineRadioOptions" id="woman" value="2">女性
							</label> <label class="radio-inline"> <input type="radio"
								name="inlineRadioOptions" id="other" value="3">その他
							</label>
						</div>
					</div>
					<div class="form-group">
						<label for="shainPostcode" class="control-label col-lg-2">郵便番号：</label>
						<div class="col-lg-3">
							<html:text styleClass="form-control" property="shainPostcode" />
						</div>
						<div class="col-lg-3">
							<input class="btn btn-default" type="submit" value="郵便番号から検索"
								disabled="disabled" />
						</div>
					</div>
					<div class="form-group">
						<label for="shainAddress" class="control-label col-lg-2">住所：</label>
						<div class="col-lg-6">
							<html:text styleClass="form-control" property="shainAddress" />
						</div>
					</div>
					<div class="form-group">
						<label for="shainTelno" class="control-label col-lg-2">電話番号：</label>
						<div class="col-lg-3">
							<html:text styleClass="form-control" property="shainTelno" />
						</div>
						<div class="text-left" style="padding: 6px 0">
							<label>例）99999999999（ハイフン除く）</label>
						</div>
					</div>
					<div class="form-group">
						<html:hidden styleClass="form-control" property="insertTime" />
					</div>
					<div class="form-group">
						<html:hidden styleClass="form-control" property="lastUpdateTime" />
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