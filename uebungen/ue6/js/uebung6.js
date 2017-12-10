//Iprog Uebung6







//onload

window.onload = function(){	

	//A1

	//booleans
	let name,telefon,email;

	document.getElementById('name').addEventListener('keyup',function(){
		nameCheck(this);
	}, false);

	document.getElementById('telefon').addEventListener('change', function(){
		telefonCheck(this)
	}, false);

	document.getElementById('email').addEventListener('keyup',function(){
		emailCheck(this);
	},false);


	//A2
	document.getElementById('passwort').addEventListener('keyup', function(){
		checkPassword(this);
	}, false);


}//onload



//A1

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





//A2


function checkPassword(In){
	let input = In.value;

	console.log(input);

 	let r1  = new RegExp(/[a-zA-Z0-9|!§$&?]{6,}/);              //min 6 zeichen
	let r2 = new RegExp(/[!§$&?]+/);                          	//min 1 sonderzeichen 
	let r3 = new RegExp(/[0-9]{1}[a-zA-Z]+|[a-zA-Z]+[0-9]{1}/); //min 2 Ziffern die nicht aufeinander folgen

	if (r1.test(input) && r2.test(input) && r3.test(input) ) {
		setFeedback('green', 'sehr sicher');
	} else if (r1.test(input) && r2.test(input)) {
		setFeedback('green', 'sicher');
	} else if (r1.test(input)) {
		setFeedback('yellow', 'aktzeptabel');
	} else {
		setFeedback('red', 'unsicher');		
	}
}//checkPassword


function setFeedback( klasse, nachricht ){
	let passwordFeedback = document.getElementById('feedbackspan');
		passwordFeedback.setAttribute("class", klasse);
	    passwordFeedback.innerHTML = nachricht ;
}
