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
    suche.addEventListener('click',initAjax);
}//onload


function eingabe(){
    let input  = document.getElementById('anagramm-input').value;
    if(input) return input;

};


function
initAjax(){
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
		http.open("GET", "http://escher.informatik.hs-kl.de/AnagrammService/find?search=" + eingabe());
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
}//initAjax








//A1

