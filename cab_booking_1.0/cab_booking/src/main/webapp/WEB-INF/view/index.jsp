<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial;}

/* Style the tab */
.tab {
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}
#outer{
 width: 50%;
  margin: 0 auto;
 display: flex;
  justify-content: center;
}

.tabcontent button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.tabcontent button:hover {
  opacity:1;
}
.mid{
 width: 50%;
  margin: 0 auto;
 display: flex;
  justify-content: center;
}

</style>
</head>
<body>
  <div class="mid">
    <h1>Cab Booking System</h1>
  </div>


<div class="tab" id="outer">
  <button class="tablinks" onclick="openCity(event, 'Rider')" id="defaultOpen">Rider</button>
  <button class="tablinks" onclick="openCity(event, 'Driver')">Driver</button>
</div>

<div id="Rider" class="tabcontent" >
<a href="/user_signin"><button style="width:auto;">Login</button></a>
<a href="/user_signup"><button style="width:auto;">Sign Up</button></a>

<a style="float: right;" href="/user/get-all-user"><button style="width:auto;">User</button></a>
<a style="float: right;" href="/admin/get-all-user"><button style="width:auto;">Admin</button></a>
</div>


<div id="Driver" class="tabcontent">

<a href="/driver_signin"><button style="width:auto;">Login</button></a>
<a href="/driver_signup"><button style="width:auto;">Sign Up</button></a>

<a style="float: right;" href="/user/get-all-driver"><button style="width:auto;">User</button></a>
<a style="float: right;" href="/admin/get-all-driver"><button style="width:auto;">Admin</button></a>
</div>

<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>
   
</body>
</html> 


</body>
</html> 
