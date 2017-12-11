//Iprog Uebung8




/*

A1

Entwickeln Sie einen entsprechenden AJAX-Request, mit dem der Anagramm-Service
angesprochen wird. Der Aufgabe der Anfrage URL lautet:
http://escher.informatik.hs-kl.de/AnagrammService/find?search=<suchwort>
<suchwort> entspricht in der obigen Abbildung dem Wort Ferien. Das Ergebnis des
Service entspricht einer durch Kommas getrennten Wortliste:

*/





//onload

window.onload = function(){	
	//A1
    let suche = document.getElementById('suche');
    suche.addEventListener('click',initAjaxGET);
    //A2
    let sucheJSON = document.getElementById('suche-json');
    sucheJSON.addEventListener('click',initAjaxJSON);
}//onload


function eingabe(id){
	let element = document.getElementById(id);
	if (element == null) return;
    let input  = element.value;
    if(input) return input;
};


function
initAjaxGET(){
	//prüfung ob ie oder neue technologie
	var http = null;
	if ( window.XMLHttpRequest) {
		http = new XMLHttpRequest();
	} else if ( window.ActiveXObject) {
		http = new ActiveXObject("Microsoft.XMLHTTP");
	} 
	
	//wenn http erstellt wurde
	if (http != null) {
		//open: legt ziel und anfrageart fest
        //         "anfrageart", "ziel"
		http.open("GET", "http://escher.informatik.hs-kl.de/AnagrammService/find?search=" + eingabe('anagramm-input'),true);
		//funktion die bei Änderung des Zustands triggert
		http.onreadystatechange = function() {
			//zustand der anfrage == 
			if (http.readyState == 4  /*XMLHttpRequest.DONE //geht auch statt 4*/ ){
				//schreibe erhaltene antwort ins feld
				document.getElementById ("anagramm-feedback-list").innerHTML =  http.responseText;
			}
		};//onreadystatechange
		http.send(null);
	}//IF
}//initAjaxGET






/*
A2
Ein bei Services oft verwendetes Rückgabeformat ist JSON, das sich sehr einfach in
JavaScript-Objekte umwandeln lässt.
Unter der URL
http://escher.informatik.hs-kl.de/AnagrammService/jsonFind?search=<suchwort>
finden Sie dieselbe Funktionalität, nur dass jetzt keine Kommaseparierte Wortliste zurück
geleifert wird, sondern ein JSON-Format.
Implementieren Sie nun analog zur Aufgabe 1 eine Variante, die den JSON-Service nutzt
und die Daten entsprechend verarbeitet.






var xmlhttp = new XMLHttpRequest();
var url = "myTutorials.txt";

xmlhttp.onreadystatechange = function() {
if (this.readyState == 4 && this.status == 200) {
    var myArr = JSON.parse(this.responseText);
    myFunction(myArr);
    }
};

xmlhttp.open("GET", url, true);
xmlhttp.send(); 







*/

function initAjaxJSON(){
	
	let url = "http://escher.informatik.hs-kl.de/AnagrammService/jsonFind?search=" + eingabe('input-json');

	//prüfung ob ie oder neue technologie
	var http = null;
	if ( window.XMLHttpRequest) {
		http = new XMLHttpRequest();
	} else if ( window.ActiveXObject) {
		http = new ActiveXObject("Microsoft.XMLHTTP");
	} 

	//request response
	if (http != null) {
		http.open("GET",url,true);			
		http.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200	) {
				console.log("	http empfangen: json");
    			var json = JSON.parse(this.responseText);
//    			console.log("	http empfangen:" + print(json));
    			if (json)	document.getElementById('anagramm-feedback-json').innerHTML = json;
    		}//if
		};//onreadystateChange
		http.send(null);
	}//if

}//initAjaxJSON


//LOOP throug json dont work

function print(json){
	for (var key in json) {
	  if (json.hasOwnProperty(key)) {
	    var val = json[key];
	    console.log(val);
	  }
	}
}