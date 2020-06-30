var person = person || {}
person = (function(){
	let _, session, javascript
	let init = function(){
		 _ = sessionStorage.getItem('context'),
		 javascript = sessionStorage.getItem('javascript'),
		 session = sessionStorage.getItem('session')
	}
	let join = function(){
		$.ajax({
			url : _+`/user/join/form`,
			type: 'POST',
			data: $("#JoinForm").serialize(),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href=_+`/location/user/LoginForm`
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let login = function(paylode){}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('ctx')
		sessionStroage.removeItem('js')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
	}
	return {init, join, login, logout}
})()