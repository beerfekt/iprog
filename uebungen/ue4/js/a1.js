



//Iprog Uebung4 
//A1

var buttona1 = document.getElementById("a1");
var resultfield1 = document.getElementById("result-a1");


function writeIntoPage(input){
	if (input) {
	 // document.write("Hallo: " + input);
	  resultfield1.innerHTML = "<h3> Eingabe:</h3><br> " + input;
	} else {
		alert("Es wurde keine Eingabe getätigt !");
	}
}


function abfrage(question){
	var input = prompt( question ,"");
	writeIntoPage(input);
}




buttona1.addEventListener("click", function (){
	abfrage("Bitte Namen eingeben");
}); 













