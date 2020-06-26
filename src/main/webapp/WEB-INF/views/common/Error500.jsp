<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>500 ERROR</title>	
	<link href="https://fonts.googleapis.com/css?family=Muli:400" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Passion+One" rel="stylesheet">	
	<link type="text/css" rel="stylesheet" href="css/font-awesome.min.css" />	
	<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<style>
* {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
}
body {
  padding: 0;
  margin: 0;
}
#notfound {
  position: relative;
  height: 100vh;
}
#notfound .notfound-bg {
  position: absolute;
  width: 100%;
  height: 100%;
  background-image: url(https://cdn.pixabay.com/photo/2015/10/12/15/07/water-984196_960_720.jpg);
  background-size: cover;
}
#notfound .notfound-bg:after {
  content: '';
  position: absolute;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.25);
}
#notfound .notfound {
  position: absolute;
  left: 50%;
  top: 50%;
  -webkit-transform: translate(-50%, -50%);
      -ms-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
}
#notfound .notfound:after {
  content: '';
  position: absolute;
  left: 50%;
  top: 50%;
  -webkit-transform: translate(-50% , -50%);
      -ms-transform: translate(-50% , -50%);
          transform: translate(-50% , -50%);
  width: 100%;
  height: 600px;
  background-color: rgba(255, 255, 255, 0.7);
  -webkit-box-shadow: 0px 0px 0px 30px rgba(255, 255, 255, 0.7) inset;
          box-shadow: 0px 0px 0px 30px rgba(255, 255, 255, 0.7) inset;
  z-index: -1;
}
.notfound {
  max-width: 600px;
  width: 100%;
  text-align: center;
  padding: 30px;
  line-height: 1.4;
}
.notfound .notfound-404 {
  position: relative;
  height: 250px;
}
.notfound .notfound-404 h1 {
  font-family: 'Passion One', cursive;
  position: absolute;
  left: 50%;
  top: 50%;
  -webkit-transform: translate(-50%, -50%);
      -ms-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  font-size: 220px;
  margin: 0px;
  color: #222225;
  text-transform: uppercase;
}
.notfound h2 {
  font-family: 'Muli', sans-serif;
  font-size: 26px;
  font-weight: 400;
  text-transform: uppercase;
  color: #222225;
  margin-top: 26px;
  margin-bottom: 20px;
}
.notfound-search {
  position: relative;
  padding-right: 120px;
  max-width: 420px;
  width: 100%;
  margin: 30px auto 20px;
}
.notfound-search input {
  font-family: 'Muli', sans-serif;
  width: 100%;
  height: 40px;
  padding: 3px 15px;
  color: #fff;
  font-weight: 400;
  font-size: 18px;
  background: #222225;
  border: none;
}
.notfound-search button {
  font-family: 'Muli', sans-serif;
  position: absolute;
  right: 0px;
  top: 0px;
  width: 120px;
  height: 40px;
  text-align: center;
  border: none;
  background: #FF00B4;
  cursor: pointer;
  padding: 0;
  color: #fff;
  font-weight: 400;
  font-size: 16px;
  text-transform: uppercase;
}
.notfound a {
  font-family: 'Muli', sans-serif;
  display: inline-block;
  font-weight: 400;
  text-decoration: none;
  background-color: transparent;
  color: #222225;
  text-transform: uppercase;
  font-size: 14px;
}
.notfound-social {
  margin-bottom: 15px;
}
.notfound-social>a {
  display: inline-block;
  height: 40px;
  line-height: 40px;
  width: 40px;
  font-size: 14px;
  color: #fff;
  background-color: #222225;
  margin: 3px;
  -webkit-transition: 0.2s all;
  transition: 0.2s all;
}
.notfound-social>a:hover {
  color: #fff;
  background-color: #FF00B4;
}
@media only screen and (max-width: 480px) {
  .notfound .notfound-404 {
    height: 146px;
  }
  .notfound .notfound-404 h1 {
    font-size: 146px;
  }
  .notfound h2 {
    font-size: 22px;
  }
}
</style>
<body>
	<div id="notfound">
		
		<div class="notfound-bg"></div>
		<div class="notfound">
			<div class="notfound-404">
				<img src="https://freefrontend.com/assets/img/500-error-page-html-templates/500-Internal-Error-Page.gif" width="500px" height="250px"">
			</div>
			<h2>웁스 500 에러가 떠버렸어요</h2>
			<form class="notfound-search">
				<input type="text" placeholder="Search...">
				<button type="button">Search</button>
			</form>
			<div class="notfound-social">
				<a href="#"><i class="fa fa-facebook"></i></a>
				<a href="#"><i class="fa fa-twitter"></i></a>
				<a href="#"><i class="fa fa-pinterest"></i></a>
				<a href="#"><i class="fa fa-google-plus"></i></a>
			</div>
			<a href="/">Back To Homepage</a>
		</div>
	</div>
</body>
</html>