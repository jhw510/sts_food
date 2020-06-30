var person = person || {}
person = (function(){
let _
	let init = function(){
		 _ = sessionStorage.getItem('context')
	}
	let join = function(payload){
		$.ajax({
			url : _+`/user/join/form`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href = _+`/location/user/LoginForm`
			},
			error: function(err){
				alert(err)
			}
		})
	}
	
	let login = function(payload){
		$.ajax({
			url : _+`/person/users/${payload.userid}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert(res)
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('ctx')
		sessionStroage.removeItem('js')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('img')
	}
	return {init, join, login, logout}
})()