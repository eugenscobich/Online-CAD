<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Online CAD</title>

<!-- CSS -->

<!-- Application CSS -->
<link rel="stylesheet"
	href="<c:url value="/resources/styles/commons.css" />" type="text/css" />

<!-- Dojo JS -->
<script type="text/javascript">
	var djConfig = {
		parseOnLoad : true,
		isDebug : true
	};
</script>
<script type="text/javascript"
	src="<c:url value="/resources/dojo/dojo.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/spring/Spring.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/spring/Spring-Dojo.js" />"></script>
<!-- jQuery JS -->
<script type="text/javascript"
	src="<c:url value="/resources/scripts/jQuery/jquery-1.6.1.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/scripts/jQuery/jquery.history.js" />"></script>
<!-- Application JS -->
<script type="text/javascript"
	src="<c:url value="/resources/scripts/commons.js" />"></script>
</head>


<!-- PROJECT -->
<body class="container">

	<!-- PAGE's HEADER STARTS HERE  -->
	<div class="header">
		<tiles:insertAttribute name="language" />
		<h1>Online CAD</h1>
		<h2><fmt:message key="title.description"/></h2>
	</div>
	<!-- PAGE's MENU ENDS HERE  -->
	<div class="navigation" id="menu">
		<ul >
			<li class="selected">
				<a href="<c:url value="#"/>" onclick="go(this.href);">Home</a></li>
			<li>
				<a href="<c:url value="#test"/>" onclick="go(this.href);">Test</a>
			</li>
		</ul>
		<ul class="right">
			<li>
				<a href="<c:url value="#login"/>" onclick="go(this.href);">Login</a>
			</li>
		</ul>
	</div>
	<!-- PAGE's MENU ENDS HERE  -->
	<!-- PAGE's HEADER ENDS HERE  -->

	<!-- MAIN CONTAINER STARTS HERE -->
	<tiles:insertAttribute name="main-container" />
	<!-- MAINE CONTAINER ENDS HERE -->

	<!-- PAGE's FOOTER STARTS HERE -->
	<div class="footer">
		<h2>Salut Footer</h2>
	</div>
	<!-- PAGE's FOOTER ENDS HERE -->

	<form id="menuFrm" style="display: none;" method="post">
		<button id="btnMenu"></button>
	</form>

	<script type="text/javascript" defer="defer">
		Spring.addDecoration(new Spring.AjaxEventDecoration({
			formId : "menuFrm",
			elementId : "btnMenu",
			event : "onclick",
			params : {
				fragments : "main-container"
			}
		}));
		// create spinner image
		function createSpinner() {
			var newImg = document.createElement('img');
			newImg.setAttribute('src',
					'<c:url value="/resources/img/ajax-loader.gif"/>');
			newImg.setAttribute('class', 'center');
			return newImg;
		}
		function load(url) {
			// insert spinner image
			var mc = dojo.byId("main-container");
			mc.innerHTML = "";
			mc.appendChild(createSpinner());
			// get page
			getPage(url);
		}

		$(document).ready(function() {
			$.history.init(function(action) {
				if (action || action == '') {
					load(action);
					setCurrentPageInMenu(action);
				}
			});
		});

		function getPage(page) {
			document.forms['menuFrm'].action = page;
			dojo.byId("btnMenu").click();
			return false;
		}

		function go(url) {
			action = url.replace(/^.*#/, '');
			$.history.load(action);
		}

		function setCurrentPageInMenu(action) {
			var menuLinks = document.getElementById("menu")
					.getElementsByTagName("a");
			for (x in menuLinks) {
				var element = menuLinks[x];
				if (element.href) {
					var result = element.href.indexOf(action);
					if (result <= 0) {
						element.parentNode.className = null;
					} else {
						element.parentNode.className = "selected";
					}
				}
			}
			if (action == '') {
				menuLinks[0].parentNode.className = "selected";
			}
		}
	</script>
</body>
</html>





