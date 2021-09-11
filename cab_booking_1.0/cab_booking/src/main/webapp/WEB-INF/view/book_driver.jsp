<%@ page import="java.util.List" %>
<%@ page import="com.example.cab_booking.entities.User" %>

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
  <a  href="/login-user"><i class="fa fa-home"></i></a> 
  <a class="active" href="/login-user"><i class="fa fa-taxi"></i></a> 
  <a href="/login-user"><i class="fa fa-history"></i></a> 
  	<a href="/session_invalidate">Logout</a> 
</div>

<div style="margin: 20px;">

  
  <tr>
    <td>
      <a href="#"><i class="fa fa-user fa-5x"></i></a> 
  </td>
  <td>
  <h3>user id:${uid }</h3>
	<form  action="/book_driver_success" method="post">
	<input type="hidden" id="uid" name="uid" value=${uid }><br>
	Distance:<br><input type="text" placeholder="distance" name="distance" required><br>
	<!-- <input type="text" placeholder="vehicle_type" name="vehicle_type" required> -->
	Vehicle Type<br><input type="checkbox" id="vehicle1" name="vehicle_type" value="bike">
  <label for="vehicle1">bike</label><br>
  <input type="checkbox" id="vehicle2" name="vehicle_type" value="auto">
  <label for="vehicle2"> auto</label><br>
  <input type="checkbox" id="vehicle3" name="vehicle_type" value="car">
  <label for="vehicle3"> car</label><br>
	<input id='submit' type='submit'  value ='book now'>
	 </form>
    
  </td>
  </tr>

  

</div>

</body>
</html> 
