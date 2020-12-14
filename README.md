# UnoRulesIDM
Question 1 : 

 

Les différentes variantes du FM sont les suivantes :  

Uno Challenge : Cette variante a une influence sur le nombre de manches à jouer, on enchaîne les manches en éliminant à chaque manche les joueurs ayant comptabilisé 500 points.
Le seul restant est le gagnant. Contrairement au jeu classique.

Cumul +2 : Si cette variante est sélectionnée, elle ajoute la possibilité pendant le déroulement du jeu à annuler l’effet de la carte +2 en jouant une carte +2. 

Cartes Identiques : Si cette variante est sélectionnée, elle ajoute la possibilité de jouer deux cartes simultanément pendant le déroulement de la partie. 

Suites : Si cette variante est sélectionnée, elle ajoute la possibilité de rejouer une carte de même couleur suivante. 

Deux joueurs : Le fait de jouer à deux change les conséquences de certaines cartes. Par exemple, la carte Inversion signifierait Rejouer et non changer de sens. 

 

Question 2 : 

 

Configuration Valide :  

 

{UnoRules, Objectif, Déroulement de la partie, Variantes, Pénalités, Nombre de Joueurs, Manches} 
X

 

{Se débarasser de toutes ses cartes, {Une carte même couleur ou même nombre, Possibilité de jouer 2 cartes simultanément}, Cartes Identiques, {Prochain joueur pioche 2 cartes et rejouer, Rejouer}, Deux joueurs, Une manche} 

 

 {Uno Challenge, {Une carte même couleur ou même nombre, Possibilité de cumuler la carte +2}, Cumul +2, {Prochain joueur pioche 2 cartes et passer son tour, Changer de sens}, Entre 3 et 10 joueurs, Jouer manches jusqu’à ce qu’il reste un joueur en ayant éliminé les joueurs qui comptent 500 points} 

 

{Uno Challenge, Une carte même couleur ou même nombre, {Prochain joueur pioche 2 cartes et passer son tour, Changer de sens}, Entre 3 et 10 joueurs, Jouer manches jusqu’à ce qu’il reste un joueur en ayant éliminé les joueurs qui comptent 500 points} 

 

Configurations invalides : 

 

{UnoRules, Objectif, Déroulement de la partie, Variantes, Pénalités, Nombre de Joueurs, Manches} 
X

{Se débarrasser de toutes ses cartes, Possibilité de jouer 2 cartes simultanément, Cumul +2, {Prochain joueur pioche 2 cartes et rejouer, Changer de sens}, Deux joueurs, Une manche} 

 

{Possibilité de jouer 2 cartes simultanément, Cumul +2, {Prochain joueur pioche 2 cartes et rejouer, Changer de sens}, Deux joueurs, Une manche} 

 

{Se débarrasser de toutes ses cartes, {Possibilité de jouer 2 cartes simultanément}, Suites, Rejouer, Entre 3 et 10 joueurs, Une manche} 

 

 

Configurations folles : 

 {UnoRules, Objectif, Déroulement de la partie, Variantes, Pénalités, Nombre de Joueurs, Manches} 
X

 

{Se débarasser de toutes ses cartes, {Une carte même couleur ou même nombre, Possibilité de jouer 2 cartes simultanément, Possibilité de Cumuluer la carte +2,
Possibilité de jouer simultanément une carte de même couleur suivante}, 
{Cartes Identiques, Cumul, Suites}, {Prochain joueur pioche 2 cartes et rejouer, Rejouer}, Deux joueurs, Une manche} 

 

Nombre de variantes du Uno : Une Infinité 

 

 

Question 3 :  Voir UnoRules/uno.json et unoExample.json

 

Question 4 :  

Avec le FM : Le FM retournera un fichier XML. Je créerai une classe Java et en utilisant SAX Parser , 
je vais extraire du fichier XML un texte. En concaténant ainsi les éléments sélectionnés manuellement et automatiquement,
j’obtiendrai un String que je pourrai afficher. 

Avec le DSL : Nous utiliserons le Model model que retournera l’utilisateur après avoir utilisé notre grammaire créée ci-dessus à l’aide du langage Xtext. 
Les langages Java et Xtend seront ensuite utilisés pour traiter le modèle et en tirer les règles sélectionnées par l’utilisateur.  

Avec le JSON : A l’aide d’une classe Java que je vais créer, je vais avant tout vérifier que le ficher JSON respecte le schéma fourni lors de la question 3.
Ensuite, j’utiliserai la dépendance json_simple pour manipuler le fichier JSON afin d’en tirer les choix qui s’y trouvent. 

 

Question 4B : J'ai fait le générateur du DSL. Voir UnoGenerator.java

 

Question 5 : 

L’idée serait de créer un compilateur donc qui prend un modèle écrit par l’utilisateur sur la base de notre grammaire et de générer un fichier JSON. 
Pour ce faire, nous utiliserons le langage Xtext, Xtend et Java.
La dépendance json_simple nous permettra d’écrire dans un fichier JSON les informations traitées venant du modèle écrit par l’utilisateur.  

 

Question 5B : Voir UnoToJson.java
