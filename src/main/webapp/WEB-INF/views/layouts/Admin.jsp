<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <definition name="user" template="/WEB-INF/views/layouts/Public.jsp">
    	<put-attribute name="header" value="/WEB-INF/views/common/Header.jsp"/>
    	<put-attribute name="title" value="사용자 화면"/>
    	<put-attribute name="navigator" value="/WEB-INF/views/common/Navigator.jsp"/>
    	<put-attribute name="content" value=""/>
    	<put-attribute name="footer" value="/WEB-INF/views/common/Footer.jsp"/>
    	<put-attribute name="home" value="/WEB-INF/views/Home.jsp"/>
    	
    </definition>
    <definition name="*/*.user" extends="user">
   <put-attribute name="content" value="/WEB-INF/views/{1}/{2}"/>
    </definition>
   
   
   
      <definition name="admin" template="/WEB-INF/views/layouts/Public.jsp">
    	<put-attribute name="header" value="/WEB-INF/views/common/Header.jsp"/>
    	<put-attribute name="title" value="관리자 화면"/>
    	<put-attribute name="navigator" value="/WEB-INF/views/common/Navigator.jsp"/>
    	<put-attribute name="content" value=""/>
    	<put-attribute name="footer" value="/WEB-INF/views/common/Footer.jsp"/>
    	<put-attribute name="home" value="/WEB-INF/views/Home.jsp"/>
    	
    </definition>
    <definition name="*/*.admin" extends="public">
    	<put-attribute name="content" value="/WEB-INF/views/{1}/{2}"/>
    </definition>
</body>
</html>