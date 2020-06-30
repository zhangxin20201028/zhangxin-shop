<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container-fluid">
	<!-- 查询条件 -->
	<div>
		<form action="" id="queryForm">
			<fieldset>
				<label for="key">关键字</label><input id="key" name="key"
					value="${skuVo.key}">
					<label for="sortColumn">价格范围--</label> 
					<input name="minPrice" type="text">
					<label for="sortColumn">到</label> 
					<input name="maxPrice" type="number" value="${skuVo.maxPrice}">
			</fieldset>
			<fieldset>
				<button type="button" class="btn btn-warning" onclick="query(1)">查询</button>
			</fieldset>
		</form>
	</div>
	<!-- 查询结果 -->
	<div>
		<table class="table">
			<tr>
				<th>id <input type="checkbox"></th>
				<th>标题</th>
				<th>卖点</th>
				<th>spu名</th>
				<th>品牌</th>
				<th>分类</th>
				<th>价格</th>
				<th>图片</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${pageInfo.list}" var="sku">
				<tr>
					<td>${sku.id}</td>
					<td>${sku.title}</td>
					<td>${sku.sellPoint}</td>
					<td>${sku.spu.goodsName}</td>
					<td>${sku.spu.brand.name}</td>
					<td>${sku.spu.category.name}</td>
					<td>${sku.price}</td>
					<td><img src="/pic/${sku.image}" width="40" height="40"></td>
					<td>
						<button type="button" class="btn btn-danger btn-sm"
							onclick="del(${sku.id})">删除</button>
						<button type="button" class="btn btn-warning btn-sm"
							onclick="toUpdate(${sku.id})">修改</button>
						<button type="button" class="btn btn-info btn-sm" onclick="toAddSku(${spu.id})">添加SKU</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<nav aria-label="Page navigation example">
			<ul class="pagination">
				<li class="page-item"><a class="page-link" href="#">首页</a></li>
				<c:forEach begin="1" end="${pageInfo.pages}" var="page">
					<li class="page-item"><a class="page-link"
						href="javascript:void(0)" onclick="query(${page})">${page}</a></li>
				</c:forEach>
				<li class="page-item"><a class="page-link" href="#">尾页</a></li>
			</ul>
		</nav>
	</div>
</div>
<script>
	// 跳转到添加页面
	function toAdd(){
		$("#workContent").load('./sku/toAdd');
	}
	//查询
	function query(page){
		
		var query = $("#queryForm").serialize();
		$("#workContent").load('./sku/list?pageNum='+page,query);
				
	}
	
	function del(id){
		if(!confirm('确认删除么？'))
			return;
		var ids=new Array();
		ids.push(id);
		$.post('./sku/del',{ids:ids},function(data){
			if(data=='ok'){
				alert('删除成功');
				query("${pageInfo.pageNum}")
			}else{
				alert('删除失败')
			}
			
		})
	}
	function toUpdate(id){
		$("#workContent").load('./sku/toUpdate',{id:id});
	}
	function toAddSku(spuid) {
		$("#workContent").load('./sku/toAdd',{spuId:spuid});
	}

</script>
