<%@page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%
String username = request.getParameter("userName");
session.putValue("username",username);
String password = request.getParameter("Password");

session.setAttribute("name",username);
//System.out.println(role1);
try{
	Connection con=dbConnection.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from userdata where fName='"+username+"' AND urole='Student'");
   
	if(rs.next()){
		if(rs.getString(5).equals(password)){
				response.sendRedirect("Student.html");
			
		}else{
			response.sendRedirect("LoginError.jsp");
		}
	}else{
		response.sendRedirect("LoginError.jsp");
	}		

}catch(Exception e){
out.println("Error"+e.getMessage());
}
%>