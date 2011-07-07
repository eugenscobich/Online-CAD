<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<fmt:message key="locale" />:

	<c:url var="englishLocaleUrl" value="/">
		<c:param name="locale" value="en" />
	</c:url>
	<c:url var="russianLocaleUrl" value="/">
		<c:param name="locale" value="ru" />
	</c:url>

	<a href='<c:out value="${englishLocaleUrl}"/>'>
		<fmt:message key="locale.english" />
	</a> 
	<a href='<c:out value="${russianLocaleUrl}"/>'>
		<fmt:message key="locale.russian" />
	</a>
</div>