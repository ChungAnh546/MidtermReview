<%@ page import="vn.edu.iuh.fit.midtermreview.backend.services.LopHocService" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.midtermreview.backend.models.LopHoc" %>
<%@ page import="java.util.Optional" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="insert.jsp">Hello Servlet</a>
<a href="controls?action=sv_list">Hello Servlet sv</a>
<%
  LopHocService lopHocService = new LopHocService();
  List<LopHoc> lopHoc = lopHocService.findAll();

%>
<table>
    <%
        for (LopHoc lopHoc1 : lopHoc)
        {
    %>
  <tr>
      <td><%=lopHoc1.getId()%></td>
    <td><%=lopHoc1.getTenlop()%></td>
    <td><%=lopHoc1.getGiaoviencn()%></td>

  </tr>
    <%}%>
</table>
</body>
</html>