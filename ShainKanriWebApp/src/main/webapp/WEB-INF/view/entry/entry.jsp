<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>社員登録</title>
</head>
<body>
<h1></h1>

<html:errors/>
<s:form>
<div align="center">
<h2 style="font-size:40px;">社員登録</h2>
<p/>
社員番号
<html:text property="shainNo"/>
<p/>
氏名　　
<html:text property="shainName"/>
<p/>
生年月日
<html:text property="shainBirthday"/>例）9999/99/99
<p/>
性別　　
<html:radio property="shainSex" value="1"/>男性
<html:radio property="shainSex" value="2"/>女性
<html:radio property="shainSex" value="3"/>その他
<p/>
郵便番号
<html:text property="shainPostcode"/>
<input type="button" name="button" value="郵便番号から住所検索" disabled = true/>
<p/>
住所　　
<html:text property="shainAddress"/>
<p/>
電話番号
<html:text property="shainTelno"/>例）99999999999（ハイフン除く）
<p/>
<input type="submit" name="entry" value="登録" />
</div>
</s:form>
</body>
</html>