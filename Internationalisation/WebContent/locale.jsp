<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<bean:message key="label.selectlanguage" />:<br>
	<html:link page="/changeLocale.do?method=english"><bean:message key="language.english"/></html:link>
	<html:link page="/changeLocale.do?method=hindi"><bean:message key="language.hindi"/></html:link>
	<html:link page="/changeLocale.do?method=german"><bean:message key="language.german"/></html:link>
	<html:link page="/changeLocale.do?method=marathi"><bean:message key="language.marathi"/></html:link>
	<br><br>
	<bean:message key="label.message"></bean:message>
</body>
</html>