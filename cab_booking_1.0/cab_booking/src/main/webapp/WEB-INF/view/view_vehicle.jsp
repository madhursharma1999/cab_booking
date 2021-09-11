<%@ page import="java.util.List" %>
<%@ page import="com.example.cab_booking.entities.Vehicle" %>

<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {margin:0;}

.icon-bar {
  width: 100%;
  background-color: #555;
  overflow: auto;
}

.icon-bar a {
  float: left;
  width: 25%;
  text-align: center;
  padding: 12px 0;
  transition: all 0.3s ease;
  color: white;
  font-size: 36px;
}

.icon-bar a:hover {
  background-color: #000;
}

.active {
  background-color: #04AA6D;
}

p{

  font-family: 'Montserrat', sans-serif;
  font-size: 14px;
  letter-spacing: 1px;
}
</style>
<body>

<div class="icon-bar">
  <a class="active" href="/check-driver"><i class="fa fa-home"></i></a> 
  <a href="/check-driver"><i class="fa fa-taxi"></i></a> 
  <a href="/check-driver"><i class="fa fa-history"></i></a> 
  	<a href="/session_invalidate_driver">Logout</a> 
</div>

<div style="margin: 20px;">
<table cellpadding="6">
  
  <tr>
    <td>
      <a href="#"><i class="fa fa-user fa-5x"></i></a> 
  </td>
  <td>
  <%-- <%
  User user = (User)request.getAttribute("user");
  out.println("<p>Id : "+ user.getUid()+"</p>");
  out.println("<p>UserName : "+ user.getUsername()+"</p>");
  out.println("<p>Phone : "+ user.getPhone()+"</p>");
  out.println("<p>Rating : "+ user.getRating()+"</p>");
  out.println("<p>Email : "+ user.getEmail()+"</p>");
  %> --%> 
  
   <%
   Vehicle vehicle = (Vehicle)request.getAttribute("vehicle");
	    
  /* if(user == null && session.getAttribute("user_session")==null){
	  response.sendRedirect("/");
  }
  else
  {
	if(user==null){
		user = (User)session.getAttribute("user_session");
	}else
	{
		 session.setAttribute("user_session", user);
	} */
	out.println("<p>Id : "+ vehicle.getVid()+"</p>");
	  out.println("<p>Vehicle model : "+vehicle.getVehicle_model()+"</p>");
	  out.println("<p>Vehicle type : "+ vehicle.getVehicle_type()+"</p>");
	  out.println("<p>Registration no. : "+ vehicle.getReg_no()+"</p>");
	  out.println("<p>Charge : "+ vehicle.getCharge()+"</p>");
	  %>
	  
	  
	<br/>

  
<%-- <form  action="/book_driver" method="post">
	<input type="hidden" id="uid" name="uid" value=<%=user.getUid()%>>
	<input id='submit' type='submit'  value ='book now'>
	 </form>
	 <br>
	 <br>
	
<form  action="/user_booking_history" method="post">
	<input type="hidden" id="uid" name="uid" value=<%=user.getUid()%>>
	<input id='submit' type='submit'  value ='view booking history'>
	 </form> --%>
  </td>
  </tr>
</table>
  

</div>

</body>
</html> 
