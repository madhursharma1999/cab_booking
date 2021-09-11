<%@ page import="java.util.List" %>
<%@ page import="com.example.cab_booking.entities.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  <a  href="/check-driver"><i class="fa fa-home"></i></a> 
  <a href="/check-driver"><i class="fa fa-taxi"></i></a> 
  <a class="active" href="/check-driver"><i class="fa fa-history"></i></a> 
  	<a href="/session_invalidate_driver">Logout</a> 
</div>

<div style="margin: 20px;">

<h2>Booking History</h2><br>
<table border="2" width="70%" cellpadding="2">
	<tr><th>booking id</th><th>distance</th><th>user id</th><th>total fare</th></tr>
    <c:forEach var="bh" items="${b}"> 
    <tr>
    <td>${bh.booking_id}</td>
    <td>${bh.distance}</td>
    <td>${bh.uid}</td>
    <td>${bh.total_fare}</td>
    </tr>
    </c:forEach>
    </table> 
</div>

</body>
</html> 
