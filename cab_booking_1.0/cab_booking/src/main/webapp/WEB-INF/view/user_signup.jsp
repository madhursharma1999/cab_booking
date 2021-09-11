<!DOCTYPE html>
<html>

<head>
	<style type="text/css">
	body,
	.signup {
		background-color: #d3d3d3;
		font-family: 'Montserrat', sans-serif;
		font-size: 14px;
		letter-spacing: 1px;
	}
	
	.login {
		position: relative;
		height: 560px;
		width: 405px;
		margin: auto;
		padding: 60px 60px;
		background-size: cover;
		box-shadow: 0px 30px 60px -5px #000;
		background-blend-mode: lighten;
	}
	
	form {
		padding-top: 80px;
	}
	
	.active {
		border-bottom: 2px solid #1161ed;
	}
	
	.nonactive {
		color: rgba(255, 255, 255, 0.2);
	}
	
	h2 {
		padding-left: 12px;
		font-size: 22px;
		text-transform: uppercase;
		padding-bottom: 5px;
		letter-spacing: 2px;
		display: inline-block;
		font-weight: 100;
	}
	
	h2:first-child {
		padding-left: 0px;
	}
	
	span {
		text-transform: uppercase;
		font-size: 12px;
		opacity: 0.4;
		display: inline-block;
		position: relative;
		top: -65px;
		transition: all 0.5s ease-in-out;
	}
	
	.text {
		border: none;
		width: 89%;
		padding: 10px 20px;
		display: block;
		height: 15px;
		border-radius: 20px;
		background: rgb(210 210 210/ 80%);
		border: 2px solid rgb(255 255 255/ 79%);
		overflow: hidden;
		margin-top: 15px;
		transition: all 0.5s ease-in-out;
	}
	
	.text:focus {
		outline: 0;
		border: 2px solid rgba(255, 255, 255, 0.5);
		border-radius: 20px;
		background: rgba(0, 0, 0, 0);
	}
	
	.text:focus+span {
		opacity: 0.6;
	}
	
	input[type="text"],
	input[type="password"] {
		font-family: 'Montserrat', sans-serif;
		color: #fff;
	}
	
	input {
		display: inline-block;
		padding-top: 20px;
		font-size: 14px;
	}
	
	h2,
	span,
	.custom-checkbox {
		margin-left: 20px;
	}
	
	.custom-checkbox {
		-webkit-appearance: none;
		background-color: rgba(255, 255, 255, 0.1);
		padding: 8px;
		border-radius: 2px;
		display: inline-block;
		position: relative;
		top: 6px;
	}
	
	.custom-checkbox:checked {
		background-color: rgba(17, 97, 237, 1);
	}
	
	.custom-checkbox:checked:after {
		content: '\2714';
		font-size: 10px;
		position: absolute;
		top: 1px;
		left: 4px;
		color: #fff;
	}
	
	.custom-checkbox:focus {
		outline: none;
	}
	
	label {
		display: inline-block;
		padding-top: 10px;
		padding-left: 5px;
	}
	
	.signup {
		background-color: #1161ed;
		color: #FFF;
		width: 100%;
		padding: 10px 20px;
		display: block;
		height: 39px;
		border-radius: 20px;
		margin-top: 30px;
		transition: all 0.5s ease-in-out;
		border: none;
		text-transform: uppercase;
	}
	
	.signup:hover {
		background: #4082f5;
		box-shadow: 0px 4px 35px -5px #4082f5;
		cursor: pointer;
	}
	
	.signup:focus {
		outline: none;
	}
	
	hr {
		border: 1px solid rgba(255, 255, 255, 0.1);
		top: 85px;
		position: relative;
	}
	
	a {
		text-align: center;
		display: block;
		top: 120px;
		position: relative;
		text-decoration: none;
		color: rgba(255, 255, 255, 0.2);
	}
	</style>
</head>

<body>
	<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
	<div class="login">
		<h2 class="active" style="">sign up</h2>
		<form action="/add-user" method="post">
			<label for="username"><b>Username</b></label>
			<input class="text" type="text" placeholder="Enter Username" name="username" required>
			<label for="password"><b>Password</b></label>
			<input class="text" type="password" placeholder="Enter Password" name="password" required>
			<label for="phone"><b>Phone</b></label>
			<input class="text" type="text" placeholder="Enter phone" name="phone" required>
			<label for="email"><b>Email</b></label>
			<input class="text" type="text" placeholder="Enter email" name="email" required>
			<input type="hidden" name="rating" value="5">
			<button class="signup" type="submit">Sign Up</button>
		</form>
	</div>
</body>

</html>