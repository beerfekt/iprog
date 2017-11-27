//Iprog - Uebung 5


/*


PROTOTYP = Objekt in javascript (nur bedingt)
			Objekte können on the fly erstellt werden (ohne Klasse)

			let objektOnFly {
	            //body of the objekt, in js you can build classes
	            //objekte können nach lust und laune erweitert werden
	            //da keine Klasse (bauplan)
			}




*/


//AUFGABE 1)

let telefonBoolean = false;

window.onload = function(){
	console.log('onload funzt');

	//Aufgabe 1
	let name = document.getElementById('name');
	let telefon = document.getElementById('telefon');
	let eMail = document.getElementById('email');
	let feedback = document.getElementById('feedback');

	let buttSpeichern = document.getElementById('speichern');
	console.log('variablen eingelesen');

	//eventlistener
	buttSpeichern.addEventListener('click', speichern ,false);
	//name.addEventListener('keyup', checkName, false);
	telefon.addEventListener('change',function (){
		var regexTelefon =  /^0\d{3,}-[1-9]{1}\d{3,}$/g;
// /^(0[0,9]{3,})-([1-9]{1}[0-9]{3,})$/g  -> falsch? warum
		if (this.value.match(regexTelefon)){
			console.log("telefon richtig");
			telefonBoolean = true;
		} else {
			console.log("telefon falsch");
			telefonBoolean = false;
		}

			checkAll(buttSpeichern);

	} ,false);
	//eMail.addEventListener('keyup',checkEMail,false);



}


function speichern(){
	console.log('speichern');
}

//element.removeAttribute("disabled");
//or set that property directly:
//element.disabled = false;



// Ein Name beginnt mit einem Großbuchstaben und 
// endet immer mit einem Kleinbuchstaben.



/*
REGEX:
testen mit: https://regexr.com/

/inhalt/
/^ anfang bis ende $/
^ anfang bis open end
irgendein anfang bis dieses ende $/
[von-bis]{anzahl der zeichen von-bis?}
(das|oderdas)



/^[a-z]{4}[0-9]{4}@stud.(hs|fh)-kl.de$/g




*/

function checkName ( ) {
/*
	var regexName = /([\u00c0-\u01ffa-zA-Z\.'\-]{3,})/;
	var regexTelefon = /01234567890/;
	var regexeMail = //;

	if(this.value.match(regexName) ){
		console.log('whitelist erfüllt');
	} else {
		console.log('whitelist nicht erfüllt');
	}//if else


	const letters = {"abcdefghijklmnopqrstuvwxyzäöü-"}.split("");

	for (let i = 0; i < letters.length; i++) {
		for (let j = 0; j < name.length; j++){

		}
	}
*/
}//checkName


function checkTelefon (){
   var regexTelefon =  /^0\d{3,}-[1-9]{1}\d{3,}$/g;
// /^(0[0,9]{3,})-([1-9]{1}[0-9]{3,})$/g  -> falsch? warum
/*
	if (formfield.value.match(regexTelefon)){
		console.log("telefon richtig");
		return true;
	} else {
		console.log("telefon falsch");
		return false;	
	}
*/
}

//function checkEmail(){}

function checkAll(buttSpeichern){
	console.log("checkall wird aufgerufen");
	//wenn jede funktion true liefert:
	if (telefonBoolean ){
		console.log('checktelefon funktioniert');
		buttSpeichern.disabled = false;	
	} else {
		buttSpeichern.disabled = true;	
		console.log('checktelefon funktioniert nicht');	
	}

}




//A2




//A3

