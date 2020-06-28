<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<link href="/resource/css/jquery/screen.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resource/js/jquery.validate.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form  id="specForm">
		
		<div class="form-group row">
		    <label for="specName" class="col-sm-2 col-form-label">规格名称</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="specName" name="specName">
		    </div>
		 </div>
		 <div class="form-group row">
			 <div class="col-sm-1">
			 </div>
		 	<div class="col-sm-6">
		 	<table id="table">
		 		<tr>
		 			<td>属性名称</td>
		 			<td>显示顺序</td>
		 			<td><button type="button" onclick="addLine()">添加</button></td>
		 		</tr>
		 		<tr>
		 			<td><input name="options[0].optionName"></td>
		 			<td><input type="number" name="options[0].orders"></td>
		 			<td><button type="button" onclick="removeLine($(this))">删除</button></td>
		 		</tr>
		 	</table>
		 	</div>
		 </div>
		 <div class="form-group row">
		 	<button type="button" onclick="commitData()">提交</button>
		 </div>
	</form>
</div>
</body>
<script type="text/javascript">
	var index=1;
	function addLine() {
		$("#table").append('<tr>\
	 			<td><input name="options[0].optionName"></td>\
	 			<td><input type="number" name="options[0].orders"></td>\
	 			<td><button type="button" onclick="removeLine($(this))">删除</button></td>\
	 		</tr>');
		   index++;
	}
	function removeLine(btnObj) {
		btnObj.parent().parent().remove();
	}
	function commitData() {
		var formData =new FormData($("#specForm")[0]);
		$.ajax({
			url:"/spec/add",
			type:"post",
			processData:false,
			contentType:false,
			data:formData,
			success:function(data){
				alert(data);
			}
		});
	}
</script>
</html>