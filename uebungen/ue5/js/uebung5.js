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


//https://stackoverflow.com/questions/762011/whats-the-difference-between-using-let-and-var-to-declare-a-variable

// Scoped -> zum nähesten Block (kann kleiner als funktionsblock sein)
// Kein Zugriff solange nicht deklariert
let output = document.getElementById('output');
var vname = document.getElementById('vn');
let nname = document.getElementById('nn');

// Scoped zum nähesten funktionsblock
// var




function showInput () {
	let vorname = vname.value;
	let nachname = nname.value;
	let feedback = " <br> Du hast folgende Felder vergessen du Depp: <br> <ul class='feedback'>";

	if (vorname && nachname){
		output.innerHTML = "eingabe: " + vname.value + " " + nname.value;
	} else {
		if ( !vorname ) { feedback += "<li>vorname</li>"; }			
 		if ( !nachname ) { feedback += "<li>nachname</li></ul>"; }
		output.innerHTML = feedback;
	}//if else
}//showInput




//AUFGABE 2)



function addColor(){
	let colorSelect = document.getElementById('colorSelect');
	let neueFarbe = document.getElementById('color').value;

	//Sicherung falls keine Eingabe
	if (!neueFarbe) {
		alert('gib ne Farbe ein du Depp!');
		return;
	}

	//1. neue option erstellen
	var option = document.createElement("OPTION");
	//2. text einfügen
	option.innerHTML = neueFarbe;             
	//Node an Selectbox anhängen
	colorSelect.appendChild(option);  
}//addColor




//AUFGABE 3)




function toRight(){
	var l = document.getElementById("selectorLeft");
	var r = document.getElementById("selectorRight");

	r.add(l.options[l.selectedIndex]);
}


//auf der einen seite löschen, auf der anderen seite hinzufügen


function toLeft(){
	var l = document.getElementById("selectorLeft");
	var r = document.getElementById("selectorRight");

	var option = l.options[l.selectedIndex];



}




//1. man holt das element das gerade markiert ist
//2. hole mir die right box und appende das element
// 2.2 damit sich der baum wieder stabilisiert


function moveLeft(){
	let leftBox = element('leftSelect');
	let rightBox = element('rightSelect');
	rightEntry = rightBox.options[rightBox.selectedIndex];
	leftBox.appendChild(rightEntry);
}






function element(id){
 	try {
 		return document.getElementById(id);
 	} catch (err){
 		console.log("Konnte Element nicht ausgeben weil: " + err);
 	}
}





