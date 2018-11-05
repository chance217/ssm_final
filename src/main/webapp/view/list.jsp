<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("app_path", request.getContextPath());
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css">

<title>员工列表</title>
</head>
<body>
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>SSM_FINAL_1.0.0</h1>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary">添加</button>
				<button class="btn btn-danger">删除</button>
			</div>
		</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>UserId</th>
						<th>UserName</th>
						<th>UserAge</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${pageInfo.list }" var="u">
						<tr>
							<td>${u.id }</td>
							<td>${u.name }</td>
							<td>${u.age }</td>
							<td>
								<button class="btn btn-primary btn-sm">编辑</button>
								<button class="btn btn-danger btn-sm">删除</button>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<!-- 显示分页信息  -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6">当前${pageInfo.pageNum }页,总${pageInfo.pages}页，总${pageInfo.total }记录
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation example">
					<ul class="pagination">
						<li class="page-item"><a class="page-link" href="${app_path }/users?pn=1">首页</a></li>
						<li class="page-item"><c:if
								test="${pageInfo.hasPreviousPage }">

								<a class="page-link"
									href="${app_path }/users?pn=${pageInfo.pageNum-1}"> <span
									aria-hidden="true">&laquo;</span>
								</a>
							</c:if>
						</li>
						<c:forEach items="${pageInfo.navigatepageNums }" var="pg">
							<c:if test="${pg==pageInfo.pageNum }">
								<li class="page-item active"><a class="page-link" href="#">${pg }</a></li>
							</c:if>
							<c:if test="${pg!=pageInfo.pageNum }">
								<li class="page-item"><a class="page-link"
									href="${app_path}/users?pn=${pg}">${pg }</a></li>
							</c:if>
						</c:forEach>
						<li class="page-item"><c:if
								test="${pageInfo.hasNextPage }">

								<a class="page-link"
									href="${app_path }/users?pn=${pageInfo.pageNum+1}"> <span
									aria-hidden="true">&raquo;</span>
								</a>
							</c:if>
						</li>

						<li class="page-item"><a class="page-link" href="${app_path }/users?pn=${pageInfo.pages}">尾页</a></li>
					</ul>
				</nav>
			</div>
			<div></div>
		</div>
	</div>


	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"></script>
	<script
		src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>
</html>