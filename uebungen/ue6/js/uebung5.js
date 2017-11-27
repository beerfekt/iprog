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


window.onload = function(){
	console.log('onload funzt');

	//Aufgabe 1
	let name = document.getElementById('name');
	let telefon = document.getElementById('telefon');
	let eMail = document.getElementById('email');
	let buttSpeichern = document.getElementById('speichern');
	console.log('variablen eingelesen');

	//eventlistener
	name.addEventListener('blur', checkName, false);
/*
	telefon.addEventListener('blur',checkTelefon ,false);
	eMail.addEventListener('blur',checkEMail,false);
*/
	buttSpeichern.addEventListener('click',doSomething ,false);
}


function doSomething(){
	console.log('submit: do something');
}

//element.removeAttribute("disabled");
//or set that property directly:
//element.disabled = false;


let nameKorrekt, telefonKorrekt, eMailKorrekt;

// Ein Name beginnt mit einem Großbuchstaben und 
// endet immer mit einem Kleinbuchstaben.



function checkName ( name ) {

	var regexName = /([\u00c0-\u01ffa-zA-Z\.'\-]{3,})/;
	var regexTelefon = /01234567890/;
	var regexeMail = //;

	if(this.value.match(regexName) ){
		console.log('whitelist erfüllt');
	} else {
		console.log('whitelist nicht erfüllt');
	}

/*
	const letters = {"abcdefghijklmnopqrstuvwxyzäöü-"}.split("");

	for (let i = 0; i < letters.length; i++) {
		for (let j = 0; j < name.length; j++){

		}
	}
*/




}


function checkTelefon (){}

function checkEmail(){}


