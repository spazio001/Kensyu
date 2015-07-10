<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ログイン</title>
</head>
<body>
<h1>社員管理システム</h1>

<html:errors/>
<s:form>
<div align="right">新しく入社された方は、こちらからアカウントを作成してください。<br/>
<input type="button" name="button" value="新規登録" disabled = true/>
</div>
<div align="center">
<h2 style="font-size:40px;">ログイン</h2>
<p/>
ユーザーID：
<html:text property="loginUser"/>
<p/>
パスワード：
<html:text property="loginPassword"/>
<p/>
<input type="submit" name="login" value="ログイン" />
</div>
</s:form>
</body>
</html>