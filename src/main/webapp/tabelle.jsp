<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>

<html>
<body>

<table>
<%


File[] files = new File("C:\\Users\\Sebi\\Ablage\\").listFiles(); 
int i = 1;
for (File file : files) {
    if (file.isFile()) {
        out.println(i + " " +" "+ " " +  file.getName() + "<br>");
        i++;
    }
}
%>

</table>

<a href="index.jsp">Main Page</a>
</body>
</html>
