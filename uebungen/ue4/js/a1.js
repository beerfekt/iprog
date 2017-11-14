



//Iprog Uebung4 
//A1

const buttona1 = document.getElementById("a1");
const resultfield1 = document.getElementById("result-a1");


//Write into the given html element
function writeIntoPage(input,currentNode){
	if (input && currentNode) {
	 document.write("Hallo: " + input);  //Document write geht mit eventlistener nicht
	  currentNode.innerHTML = "<h3> Ausgabe:</h3> " + input;
	} else {
		alert("Es wurde keine Eingabe getätigt !");
	}
}


function abfrage(question){
	let input = prompt( question ,"");
	writeIntoPage(input,resultfield1);
}




buttona1.addEventListener("click", 
	() => abfrage("Bitte Namen eingeben")
); 









//A2


var buttona2 = document.getElementById("a2");
var resultfield2 = document.getElementById("result-a2");



function reverseString(input){
	var newString = "";
	for (i = 0; i < input.length; i++){
		let currentChar = input.charAt((input.length-1)-i);
		newString += currentChar; 
	}//for

	/*
		geht auch über :
		eingabe
		      .split()  //  zu array bauen
		      .reverse() // array umdrehen
		      .join("")  // zusammenfügen
    */

	return newString;
}//function



function abfrage2(word){
	//var word = prompt("A2: Bitte Wort eingeben:","");
	var invertedWord = reverseString(word);
	writeIntoPage(invertedWord,resultfield2);
}

buttona2.addEventListener("click", function(){
	abfrage2( prompt("A2: Bitte Wort eingeben:",""));
});










//A3

var buttona3 = document.getElementById("a3");
var resultfield3 = document.getElementById("result-a3");



function countVocals(string){
	var counter = 0;
    var vocals = ['A','Ä','E','I','O','Ö','U','Ü','Y','a','ä','e','i','o','u','ü','y'];

    for (i = 0; i < string.length; i++){
    	for (j = 0; j < vocals.length; j++) {
    		if (string.charAt(i) == vocals[j]){
    			++counter;
    		}
    	}// for j
    }//for i

    return counter;
}




buttona3.addEventListener("click", function(){
	var input = String(prompt("Anzahl der Vokale ausgeben",""));
	var counter = String(countVocals(input));
	writeIntoPage(counter,resultfield3);
});





//A4

var buttona4 = document.getElementById("a4");
var resultfield4 = document.getElementById("result-a4");



buttona4.addEventListener("click", function(){
	let input = String(prompt("Wörter, mit Kommas getrennt eingeben: ",""));
	let words = input.split(",");
	let output = "";

	output += "<h3> Ausgabe:</h3> ";
	output += "<ul>";

	//foreach schleife
	words.forEach (	function(word){
			output += "<li>" + word +"</li>";
	});

	output += "</ul>";	

	resultfield4.innerHTML = output;
});




//A5

var buttona5 = document.getElementById("a5");
var resultfield5 = document.getElementById("result-a5");



buttona5.addEventListener("click", function (){
	let input = prompt("Geben sie die Temperatur in Grad Celsius an:");
	//alert(typeof input);

	//prüfen ob eingabe eine nummer ist
	if (isNaN(input)) {
		alert("Kein gültiger Wert");
	} else {
		//input = parseInt(eingabe);
		let fahrenheit = (1.8 * input) + 32;
		let feedback = "Celsius: " + String(input) + "<br> fahrenheit: " + String(fahrenheit) ;
		resultfield5.innerHTML = feedback;
	}

});


/*

LAMBDA = Kurzschreibweise:

function (a,b) {}

als lambda:

(a,b) => {
	return a + b;
}

() => { do something}


statt

function() { do something }






window.onload = () => {
	
	[...]

	return; //hier geht return


}




*/



//A5

var buttona6 = document.getElementById("a6");
var resultfield6 = document.getElementById("result-a6");



buttona6.addEventListener("click", function (){

	let input = prompt("Geben sie die das Word (Palindromprüfung) ein:");
	//you can also reverse the word and check the equality
 	let leftIndex, rightIndex, leftChar, rightChar;
	let length = input.length;
	let isPalindrom = true;

	for (leftIndex = 0; leftIndex < length; leftIndex++){
		//zeiger von rechts nähern
		rightIndex = length-1-leftIndex;
		//Abbruch - wenn zeiger in mitte angekommen oder kein palindrom 
		if (leftIndex == rightIndex || !isPalindrom ) {
			break;
		}
		leftChar = input.charAt(leftIndex);
		rightChar = input.charAt(rightIndex);
		//falls Prüfung auf Konsole ausgegeben wird:
		/*
		console.log( leftChar + " <=> " + rightChar );
		console.log(isPalindrom);
		*/
		//hauptprüfung ob buchstaben gleich sind
		isPalindrom = (leftChar.localeCompare(rightChar) ) ? false : true ;
	}//for
	resultfield6.innerHTML = isPalindrom;

}); //eventlistener
