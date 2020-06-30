"use strict";
function Session(x){
	sessionStorage.setItem('context', x)
	sessionStorage.setItem('javascript', x+'/resources/javascript')
	sessionStorage.setItem('css', x+'/resources/css')
	sessionStorage.setItem('imge', x+'/resources/imge')
}