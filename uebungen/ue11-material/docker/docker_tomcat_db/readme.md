1.
# Docker-Umgebung aufbauen:
#  Diesen Ordner mit dem Terminal öffnen:
	1.1 docker-compose up


2.  

# DB 1
# Datenbank backup.sql manuell in die datenbank reinprügeln (TODO: AUTOMATISCH)

//Vorüberlegung:
docker ps // (Alle laufenden Container anzeigen
docker exec -it db_container_name bash //container im terminal (bash) modus öffnen

//in datenbank einloggen:
mysql -u user -p 
passworteingabe:  xxxxx

//Show databases; USE DATABASE db; usw... etc.

//Leere datenbank z.b. "neuedb" erstellen.




//allgemein
cat backup.sql | docker exec -i CONTAINER /usr/bin/mysql -u root --password=root DATABASE

//in diesem fall:
    //ordner/zum/Backup-file.sql //neue db anlegen und leer lassen, file schreibt tabellen rein
cat db-backup/CreateDBandTables.sql | docker exec -i mysql_5_7  /usr/bin/mysql -u root --password=test  neuedb


3.
# in db container einloggen um nachzuprüfen ob alles geklappt hat:


4.
# Browser öffnen und folgenden Link eingeben:
//docker.tomcat (definiert in docker-compose.yml und danach in hosts datei)

//host            //projekt //Klasse(Servlet) siehe @ anweisung im servlet oben
http://127.0.0.100/ue10/Aufgabe1
                  //projekt //Servlet







# DB 2

//Zugriff: 
(PHP DATEN, Zum Ändern, siehe docker-compose.yml)

//ip adresse des db_containers:
docker inspect <name of container> | grep IPAddress

$servername = "172.21.0.2";  //database ip from docker db-container; diesen über docker ps und weiteren befehl zur not auslesen
$username = "admin";
$password = "test";
$database = "database";












// weitere infos:

# Backup
docker exec CONTAINER /usr/bin/mysqldump -u root --password=root DATABASE > backup.sql

# Restore
cat backup.sql | docker exec -i CONTAINER /usr/bin/mysql -u root --password=root DATABASE
