<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<html>
<jsp:include page="../common/Header.jsp"/>
<body>
	
	<section class="parallax section"
		style="background-image: url(http://static.ssgcdn.com/cmpt/edit/201803/14/182018031418464820347862039786_342.png);background-size:1550px 750px; width: 100%; height: 100%;">
		<div class="wrapsection">
		
			<div class="container">
				<div class="row">
					<div class="col-md-12 sol-sm-12">
						<div class="maintitle">
							<h1 class="section-title justtitle">
								<input id="mainHome" type="button" value="후르츠바스켓" />
							</h1>
							<nav
								class="collapse navbar-collapse bs-navbar-collapse navbar-right"
								role="navigation">
								<ul class="nav navbar-nav">
									<li>
										
											<h3>
												<input id="home_btn" type="button" value="홈으로" />
											</h3>
										
									</li>
									<li>
										<h3>
											<input id="login_btn" type="button" value="로그인" />
										</h3>
									</li>
									<li>
										<h3>
											<input id="join_btn" type="button" value="회원가입" />
										</h3>
									</li>

								</ul>
							</nav>
							<p class="lead bottom0 wow bounceInUp"></p>
							<div>
								<input id="search" v-model="searchWord" type="text"
									style="background-repeat: no-repeat; background-position: 88% 50%, 98% 50%;"
									title="검색" />
							</div>
							<div id="box">
								<input @click="search" id="google_search" type="button"
									value=" 검색" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	
<div class="container-fluid bg-3 text-center">    
  <h3>Some of my Work</h3><br>
  <div class="row">
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p>Some text..</p>
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p>Some text..</p>
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
    </div>
  </div>
</div><br>

	</section>



<script>
app.init("${context}")

/* $('#join_btn').click(function(e){
	e.preventDefault()
	console.log('이동화면 진입')
	alert("${ctx}");
	location.href= "${ctx}/user/join/form"   
})
 */
</script>