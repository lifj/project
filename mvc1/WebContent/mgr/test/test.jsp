<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page contentType="text/html;charset=UTF-8"%> 

<html>
	<head>
		<title>动态面板</title>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery1.8/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery1.8/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/mgr/test/test.js"></script>
	
	</head>	  
<body>
	<input type="hidden" id="contextPath" value="<%=request.getContextPath()%>"/>
	<h2>this is a test page !</h2>
	<input type="text" id="tt" value="">
</body>
</html>
