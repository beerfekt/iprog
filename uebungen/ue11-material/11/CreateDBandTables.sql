

DROP TABLE Adresse;
DROP TABLE Verlag;
DROP TABLE Buch;
DROP TABLE BuchAutoren;
DROP TABLE Autor;



CREATE TABLE Adresse     (id INT  PRIMARY KEY, ort VARCHAR(50) );
CREATE TABLE Verlag      (id INT  PRIMARY KEY, name VARCHAR(50), adrId INT );
CREATE TABLE Buch        (id INT  PRIMARY KEY, titel VARCHAR(50), bestand INT, verlagId INT );
CREATE TABLE BuchAutoren (id INT  PRIMARY KEY, buchId INT, autorId INT);
CREATE TABLE Autor       (id INT  PRIMARY KEY, vorname VARCHAR(20), nachname VARCHAR(20) );



INSERT INTO Adresse VALUES (0, 'Braunschweig/Wiesbaden');
INSERT INTO Adresse VALUES (1, 'New Jersey');
INSERT INTO Adresse VALUES (2, 'Farnham');
INSERT INTO Adresse VALUES (3, 'Reading, Massachusetts');
INSERT INTO Adresse VALUES (4, 'Landsberg');
INSERT INTO Adresse VALUES (5, 'New York');
INSERT INTO Adresse VALUES (6, 'San Francisco');
INSERT INTO Adresse VALUES (7, 'Berlin');
INSERT INTO Adresse VALUES (8, 'München');



INSERT INTO Verlag VALUES (0, 'Vieweg', 0);
INSERT INTO Verlag VALUES (1, 'Prentice Hall', 1);
INSERT INTO Verlag VALUES (2, 'OReilly', 2);
INSERT INTO Verlag VALUES (3, 'Addison-Wesley', 3);
INSERT INTO Verlag VALUES (4, 'mitp', 4);
INSERT INTO Verlag VALUES (5, 'Wiley', 5);
INSERT INTO Verlag VALUES (6, 'Morgan Kaufmann', 6);



INSERT INTO Buch VALUES (0, 'Distributed Systems', 5, 1);
INSERT INTO Buch VALUES (1, 'Verteilte Systeme', 5, 0);
INSERT INTO Buch VALUES (2, 'The Essential Client/Server Survival Guide', 5, 5);
INSERT INTO Buch VALUES (3, 'Datenbanken: Konzepte und Sprachen', 5, 4);
INSERT INTO Buch VALUES (4, 'Datenbanken: Implementierungstechniken', 5, 4);
INSERT INTO Buch VALUES (5, 'Enterprise JavaBeans', 5, 2);
INSERT INTO Buch VALUES (6, 'Java Message Service', 5, 2);
INSERT INTO Buch VALUES (7, 'Java Servlet Programming', 5, 2);
INSERT INTO Buch VALUES (8, 'Concurrent Programming in Java', 5, 3);
INSERT INTO Buch VALUES (9, 'Principles of Transaction Processing', 5, 6);
INSERT INTO Buch VALUES (10, 'Modern Operating Systems', 5, 1);
INSERT INTO Buch VALUES (11, 'Objektorientierte Analyse und Design', 5, 3);
INSERT INTO Buch VALUES (12, 'The Essential Distributed Objects Survival Guide', 5, 5);
INSERT INTO Buch VALUES (13, 'Refactoring', 5, 3);
INSERT INTO Buch VALUES (14, 'UML Distilled', 5, 3);
INSERT INTO Buch VALUES (15, 'Analysis Patterns', 5, 3);
INSERT INTO Buch VALUES (16, 'Design Patterns', 5, 3);
INSERT INTO Buch VALUES (17, 'Component Software', 5, 3);
INSERT INTO Buch VALUES (18, 'Mastering Enterprise JavaBeans', 5, 5);
INSERT INTO Buch VALUES (19, 'EJB Design Patterns', 5, 5);


INSERT INTO Autor VALUES (0, 'Andrew S.', 'Tanenbaum');
INSERT INTO Autor VALUES (1, 'Marten', 'van Steen');
INSERT INTO Autor VALUES (2, 'Günther', 'Bengel');
INSERT INTO Autor VALUES (3, 'Richard', 'Monson-Haefel');
INSERT INTO Autor VALUES (4, 'Jason', 'Hunter');
INSERT INTO Autor VALUES (5, 'William', 'Crawford');
INSERT INTO Autor VALUES (6, 'Doug', 'Lea');
INSERT INTO Autor VALUES (7, 'Phillip A.', 'Bernstein');
INSERT INTO Autor VALUES (8, 'Eric', 'Newcomer');
INSERT INTO Autor VALUES (9, 'Martin', 'Fowler');
INSERT INTO Autor VALUES (10, 'Clemens', 'Szyperski');
INSERT INTO Autor VALUES (11, 'Erich', 'Gamma');
INSERT INTO Autor VALUES (12, 'Richard', 'Helm');
INSERT INTO Autor VALUES (13, 'Ralph', 'Johnson');
INSERT INTO Autor VALUES (14, 'John', 'Vlissides');
INSERT INTO Autor VALUES (15, 'Andreas', 'Heuer');
INSERT INTO Autor VALUES (16, 'Gunter', 'Saake');
INSERT INTO Autor VALUES (17, 'Robert', 'Orfali');
INSERT INTO Autor VALUES (18, 'Dan', 'Harkey');
INSERT INTO Autor VALUES (19, 'Jeri', 'Edwards');
INSERT INTO Autor VALUES (20, 'Grady', 'Booch');
INSERT INTO Autor VALUES (21, 'David A.', 'Chappell');
INSERT INTO Autor VALUES (22, 'Ed', 'Roman');
INSERT INTO Autor VALUES (23, 'Scott', 'Ambler');
INSERT INTO Autor VALUES (24, 'Tyler', 'Jewell');
INSERT INTO Autor VALUES (25, 'Floyed', 'Marinescu');


INSERT INTO BuchAutoren VALUES (1, 0, 0 );
INSERT INTO BuchAutoren VALUES (2, 0, 1 );
		
INSERT INTO BuchAutoren VALUES (3, 1, 2 );
		
INSERT INTO BuchAutoren VALUES (4, 2, 17 );
INSERT INTO BuchAutoren VALUES (5, 2, 18 );
INSERT INTO BuchAutoren VALUES (6, 2, 19 );
		
INSERT INTO BuchAutoren VALUES (7, 3, 15 );
INSERT INTO BuchAutoren VALUES (8, 3, 16 );
		
INSERT INTO BuchAutoren VALUES (9, 4, 15 );
INSERT INTO BuchAutoren VALUES (10, 4, 16 );
		
INSERT INTO BuchAutoren VALUES (11, 5, 3 );
		
INSERT INTO BuchAutoren VALUES (12, 6, 3 );
INSERT INTO BuchAutoren VALUES (13, 6, 21 );
		
INSERT INTO BuchAutoren VALUES (14, 7, 4 );
INSERT INTO BuchAutoren VALUES (15, 7, 5 );
		
INSERT INTO BuchAutoren VALUES (16, 8, 6 );
		
INSERT INTO BuchAutoren VALUES (17, 9, 7 );
INSERT INTO BuchAutoren VALUES (18, 9, 8 );
		
INSERT INTO BuchAutoren VALUES (19, 10, 0 );
		
INSERT INTO BuchAutoren VALUES (20, 11, 20 );		

INSERT INTO BuchAutoren VALUES (21, 12, 17 );
INSERT INTO BuchAutoren VALUES (22, 12, 18 );
INSERT INTO BuchAutoren VALUES (23, 12, 19 );

INSERT INTO BuchAutoren VALUES (24, 13, 9 );		
INSERT INTO BuchAutoren VALUES (25, 14, 9 );		
INSERT INTO BuchAutoren VALUES (26, 15, 9 );		

INSERT INTO BuchAutoren VALUES (27, 16, 11 );
INSERT INTO BuchAutoren VALUES (28, 16, 12 );
INSERT INTO BuchAutoren VALUES (29, 16, 13 );
INSERT INTO BuchAutoren VALUES (30, 16, 14 );
		
INSERT INTO BuchAutoren VALUES (31, 17, 10 );
		
INSERT INTO BuchAutoren VALUES (32, 18, 22 );		
INSERT INTO BuchAutoren VALUES (33, 18, 23 );		
INSERT INTO BuchAutoren VALUES (34, 18, 24 );
		
INSERT INTO BuchAutoren VALUES (35, 19, 25 );	

