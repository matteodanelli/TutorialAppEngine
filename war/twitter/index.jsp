<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Save our planet!</title>
		<link rel="stylesheet" type="text/css" href="/css/global.css" />
	</head>
	<body>
	<h1> Save our planet! Give us an idea!</h1>
		<form method="post" action="tweet">
				<textarea name="content"></textarea><br />
			<input type="submit" value="tweet"/>
		</form>
		<c:forEach var="e" items="${tweetList}">
${f:h(e.content)}
<hr />
</c:forEach>
	</body>
</html>