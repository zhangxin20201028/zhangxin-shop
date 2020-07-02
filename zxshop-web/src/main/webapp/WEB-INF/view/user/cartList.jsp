<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container-fluid">
	<div>
		<fieldset>
			<label for="address">配送地址:</label><br>
			<textarea rows="3" cols="35" id="address"></textarea>
		</fieldset>
		<fieldset>
			<button type="button" class="btn btn-info btn-sm" onclick="createOrder()">下单</button>
		</fieldset>
	</div>
	<!-- 查询结果 -->
	<div>
		<table class="table">
			<tr>
				<th>id <input id="ids" type="checkbox"></th>
				<th>标题</th>
				<th>价格</th>
				<th>购买数量</th>
				<th>总价格</th>
				<th>图片</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${cartList}" var="cart">
				<tr>
					<td>${cart.id}<input type="checkbox" value="${cart.id}" name="id"></td>
					<td>${cart.sku.title}</td>
					<td>${cart.sku.price}</td>
					<td>${cart.pnum}</td>
					<td>${cart.pnum*cart.sku.price}</td>
					<td><img src="/pic/${cart.sku.cartThumbnail}" width="40" height="40"></td>
					<td>
						<button type="button" class="btn btn-danger btn-sm" onclick="del(${sku.id})">删除</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
<script>
	//查询
	function query(page){
		
		var query = $("#queryForm").serialize();
		$("#workContent").load('./sku/list?pageNum='+page,query);
				
	}
	//删除
	function del(id){
		if(!confirm('确认删除么？'))
			return;
		var ids=new Array();
		ids.push(id);
		$.post('./user/delCart',{ids:ids},function(data){
			if(data=='ok'){
				alert('删除成功');
				//query("${pageInfo.pageNum}")
			}else{
				alert('删除失败')
			}
			
		})
	}
 
	function toAddSku(spuid) {
		$("#workContent").load('./sku/toAdd',{spuId:spuid});
	}

</script>
