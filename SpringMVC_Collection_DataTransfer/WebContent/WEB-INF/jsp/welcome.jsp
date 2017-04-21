<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.css" />
</head>
<body class="container">
	<hr>
	<form action="hello.action">
		<table class="table table-striped table-bordered ">
		 <thead class="thead-inverse">
			<tr class="info">
				<th>#</th>
				<th>姓名</th>
				<th>电话1</th>
				<th>电话2</th>
				<th>电话3</th>
			</tr>
		</thead>
	  	<tbody>
			<tr>
				<td><input name="user[0].id" value="1"></td>
				<td><input name="user[0].username" value="John"></td>
				<td><input name="user[0].phones[0]" value="13800138000"></td>
				<td><input name="user[0].phones[1]" value="13800138001"></td>
				<td><input name="user[0].phones[2]" value="13800138002"></td>
			</tr>
			<tr>
				<td><input name="user[1].id" value="2"></td>
				<td><input name="user[1].username" value="Alice"></td>
				<td><input name="user[1].phones[0]" value="15800138000"></td>
				<td><input name="user[1].phones[1]" value="15800138001"></td>
				<td><input name="user[1].phones[2]" value="15800138002"></td>
			</tr>
			</tbody>
		</table>		
			<input type="submit" class="btn-primary" value="提交">
	</form>
</body>
</html>