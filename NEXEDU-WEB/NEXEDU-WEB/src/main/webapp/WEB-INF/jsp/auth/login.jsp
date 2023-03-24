<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
// 샘플 스크립트
window.onload = function() {
    document.getElementById('username').focus();
    
    let obj = document.getElementById('login');

    obj.onclick = function() {
        let id = document.getElementById('username');
        let pwd = document.getElementById('password');
    
        if (id.value == "") {
            alert('사용자 아이디를 입력하여 주십시오');
            id.focus();
            return;
        }    

        if (pwd.value == "") {
            alert('비밀번호를 입력하여 주십시오');
            pwd.focus();
            return;
        }
    
        document.getElementById('frm').submit();
    }
};
</script>
</head>
<body>
	<form id="frm" method="post" action="/auth/proc">
	사용자 아이디 : <input type="text" name="username" id="username" /> </br>
	비밀번호 : <input type="password" name="password" id="password" /> </br>
	<input type="button" id="login" value="로그인"/> 
	</form>
</body>
</html>
