<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link href="${f:url('/css/bootstrap.min.css')}" rel="stylesheet">
<script src="${f:url('/js/bootstrap.min.js')}"></script>
<script src="${f:url('/js/handlebars-v3.0.3.js')}"></script>
<title>社員検索</title>
</head>
<body>
	<jsp:include page="/WEB-INF/view/common/header.jsp" />

	<div class="container">
		<html:errors />
		<div class="row text-center">
			<h1>社員管理システム</h1>
		</div>
		<s:form styleId="searchForm" styleClass="form-horizontal">
			<div class="row">
				<label for="shainNo" class="control-label col-lg-1">社員番号：</label>
				<div class="col-lg-2">
					<html:text styleClass="form-control" property="shainNo" />
				</div>
				<label for="shainName" class="control-label col-lg-1">氏名：</label>
				<div class="col-lg-2">
					<html:text styleClass="form-control" property="shainName" />
				</div>
				<label for="shainBirthday" class="control-label col-lg-1">年齢：</label>
				<div class="col-lg-2" style="padding: 5px 0">
					<html:select property="ageRenge" value="none">
						<html:option value="none">選択してください</html:option>
						<html:option value="0-9">０～９歳</html:option>
						<html:option value="10-19">１０～１９歳</html:option>
						<html:option value="20-29">２０～２９歳</html:option>
						<html:option value="30-39">３０～３９歳</html:option>
						<html:option value="40-49">４０～４９歳</html:option>
						<html:option value="50-59">５０～５９歳</html:option>
						<html:option value="60-200">６０歳以上</html:option>
					</html:select>
				</div>
				<label for="shainSex" class="control-label col-lg-1">性別：</label>
				<div class="col-lg-2">
					<label class="checkbox-inline"> <input type="checkbox"
						name="shainSex" id="man" value="1">男性
					</label> <label class="checkbox-inline"> <input type="checkbox"
						name="shainSex" id="woman" value="2">女性
					</label>
				</div>
			</div>
			<div class="row" style="padding: 20px 0">
				<label for="shainPostcode" class="control-label col-lg-1">郵便番号：</label>
				<div class="col-lg-2">
					<html:text styleClass="form-control" property="shainPostcode" />
				</div>
				<div class="col-lg-2">
					<input class="btn btn-default" type="submit" value="郵便番号から検索"
						disabled="disabled" />
				</div>
				<label for="shainAddress" class="control-label col-lg-1">住所：</label>
				<div class="col-lg-6">
					<html:text styleClass="form-control" property="shainAddress" />
				</div>
			</div>
			<div class="row">
				<label for="shainTelno" class="control-label col-lg-1">電話番号：</label>
				<div class="col-lg-3">
					<html:text styleClass="form-control" property="shainTelno" />
				</div>
				<div class="col-lg-3 text-left" style="padding: 6px 0">
					<label>例）99999999999（ハイフン除く）</label>
				</div>
				<div class="col-lg-5">
					<input type="button" id="searchButton" name="search" value="検索" />
				</div>
			</div>
			<!-- 			<table class="table table-bordered table-hover table-condensed"> -->
			<!-- 				<thead> -->
			<!-- 					<tr> -->
			<!-- 						<th width=40;></th> -->
			<!-- 						<th width=80;>社員番号</th> -->
			<!-- 						<th width=200;>氏名</th> -->
			<!-- 						<th width=80;>生年月日</th> -->
			<!-- 						<th width=50;>年齢</th> -->
			<!-- 						<th width=50:>性別</th> -->
			<!-- 						<th width=80;>郵便番号</th> -->
			<!-- 						<th>住所</th> -->
			<!-- 						<th width=150;>電話番号</th> -->
			<!-- 					</tr> -->
			<!-- 				</thead> -->
			<%-- 				<c:forEach var="shain" item="${shaindata} varStatus="status"> --%>
			<!-- 				<tbody> -->
			<!-- 						<tr> -->
			<%-- 							<td>"${shain.shainNo}"</td> --%>
			<%-- 							<td>"${shain.shainName}"</td> --%>
			<%-- 							<td>"${shain.shainBirthday}"</td> --%>
			<%-- 							<td>"${shain.age}"</td> --%>
			<%-- 							<td>"${shain.shainSex}"</td> --%>
			<%-- 							<td>"${shain.shainPostcode}"</td> --%>
			<%-- 							<td>"${shain.shainAddress}"</td> --%>
			<%-- 							<td>"${shain.shainTelno}"</td> --%>
			<!-- 						</tr> -->
			<!-- 					</tbody> -->
			<%-- 				</c:forEach> --%>
			<div id="searchResultList"></div>
			<%--
			<div class="text-right">
				<nav>
					<ul class="pagination">
						<li><a href="#" aria-label="Previous"> <span
								aria-hidden="true">&laquo;</span>
						</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#" aria-label="Next"> <span
								aria-hidden="true">&raquo;</span>
						</a></li>
						<label>全件：１００件</label>
					</ul>
				</nav>
			</div>
 --%>
		</s:form>
	</div>
	<script id="search-result-template" type="text/x-handlebars-template">
			<div class="text-right">１ページ：２０件表示</div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th width="40";></th>
						<th width="100";>社員番号</th>
						<th width="200";>氏名</th>
						<th width="100";>生年月日</th>
						<th width="50";>年齢</th>
						<th width="50":>性別</th>
						<th width="100";>郵便番号</th>
						<th>住所</th>
						<th width="150";>電話番号</th>
					</tr>
			{{#resultList}}
					<tr>
						<td align="center";><input type="radio" name="shain" value=""></td>
						<td>{{shainNo}}</td>
						<td>{{shainName}}</td>
						<td>{{shainBirthday}}</td>
						<td>{{age}}</td>
						<td>{{shainSex}}</td>
						<td>{{shainPostcode}}</td>
						<td>{{shainAddress}}</td>
						<td>{{shainTelno}}</td>
					</tr>
			{{/resultList}}
				</thead>
			</table>
			<h1>{{count}}</h1>
			<div class="form-group">
				<div class="text-center">
					<div class="col-lg-4"></div>
					<div class="col-lg-2">
						<input type="submit" name="update" value="社員更新" />
					</div>
					<div class="col-lg-2">
						<input type="submit" name="delete" value="社員削除" />
					</div>
				</div>
				<div class="col-lg-4"></div>
			</div>
	</script>
	<script type="text/javascript">
		$(function() {
			$("#searchButton").click(function() {
				$.ajax({
					type : 'POST',
					url : "${f:url('/ajax/search')}",
					data : $("#searchForm").serialize(),
					dataType : "json",
					success : function(data, textStatus, jqXHR) {
						var source = $("#search-result-template").html();
						var template = Handlebars.compile(source);
						var html = template(data);
						$("#searchResultList").empty();
						$("#searchResultList").html(html);
						//alert(html)
					},
					error : function(jqXHR, textStatus, errorThrown) {
						alert("Error")
					}
				}

				);
			});
		});
	</script>
</body>
</html>