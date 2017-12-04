//Iprog Uebung6




//A1

//booleans
let name,telefon,email;


//onload

window.onload = function(){	

	document.getElementById('name').addEventListener('keyup',function(){
		nameCheck(this);
	}, false);

	document.getElementById('telefon').addEventListener('change', function(){
		telefonCheck(this)
	}, false);

	document.getElementById('email').addEventListener('keyup',function(){
		emailCheck(this);
	},false);

}//onload



function nameCheck(input){
	let regex = new RegExp("^[A-Z]{1}([a-z]{1,}(|-[A-Z]{1}[a-z]+))$");
	if (regex.test(input.value)){
		name = true;
	} else {
		name = false;
	}
	checkAll();
}//nameCheck


function telefonCheck(input){
	let regex = new RegExp(/^[0]{1}[0-9]{3,}-[1-9]{1}[0-9]{3,}$/);
	if (regex.test(input.value)){
		telefon = true;
	} else {
		telefon = false;
	}
	checkAll();
}//telefonCheck


function emailCheck(input){
	let regex = new RegExp(/^[a-z]{4}[0-9]{4}@stud.(hs|fh)-kl.de$/);
	if ( regex.test(input.value) ){
		email = true;
	} else {
		email = false;
	}
	checkAll();
}//emailInput


function checkAll(){
	if (name && telefon && email) {
		speichern.disabled = false;
	} else {
		speichern.disabled = true;
	}
}//checkAll





