<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

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
<script type="text/javascript"
	src="<c:url value="/resources/dojo/dojo.js"/>"
	djConfig="parseOnLoad: true"></script>
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
		<h1>Online CAD</h1>
		<h2>Web Application for CAD development</h2>
	</div>
	<!-- PAGE's MENU ENDS HERE  -->
	<div class="navigation">
		<ul id="menu">
			<li class="selected"><a href="<c:url value="#"/>"
				onclick="go(this.href);">Home</a></li>
			<li><a href="<c:url value="#test"/>" onclick="go(this.href);">Test</a>
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
					setCurrentInMenu(action);
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
		
		function setCurrentInMenu(action) {
			var menuLink = document.getElementById("menu")
					.getElementsByTagName("a");
			for (x in menuLink) {
				var res = menuLink[x].href.indexOf(action);
				if (res <= 0) {
					menuLink[x].parentNode.className = null;
				} else {
					menuLink[x].parentNode.className = "selected";
				}
			}
		}
	</script>
</body>
</html>





