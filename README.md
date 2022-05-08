# l2s4-projet-2022


# Equipe

- Amadou Barro
- Malika Boubacar
- Lo Mané
- Mikou Youssef

# Sujet

[Le sujet 2022](https://www.fil.univ-lille1.fr/portail/index.php?dipl=L&sem=S4&ue=Projet&label=Documents)

# Livrables

## Livrable 1

Pour la modélisation du labyrinthe nous avons choisis l'algorithme de recherche récursif (Backstracking) dont le but consiste à choisir une cellule de départ et de la fixer comme visitée ensuite verifier si elle posséde des cellules voisines non visitées .
Si tel est le cas , alors elle choisit aléatoirement une cellule voisine ; supprimer le mur entre la cellule de départ et la cellule choisit ; l'ajouter dans la pile ; reprendre la meme démarche récursivement .

### Atteinte des objectifs

Nous avons pu atteindre tous les objectifs que nous nous sommes fixés au départ ; nous avons testés nos méthodes .
labyrinthe fonctionnel

### Difficultés restant à résoudre
Cependant nous avons rencontré un Bug au moment de la géneration du labyrinthe
## Livrable 2

l'objectifs du second Livrable : Modélisations des personnages et des objets;
Implémentation du Second labyrinthe

### Atteinte des objectifs

objectifs atteints

### Difficultés restant à résoudre

## Livrable 3

Objectif : modélisations des actions

### Atteinte des objectifs
Tous les objectifs n'ont pas été atteints, Cependant nous avons pu gérer : les indices, la quête du joueur
### Difficultés restant à résoudre
Gérer le déplacement des personnages

## Livrable 4
Modélisation complète
### Atteinte des objectifs
Objectifs : tous les objectifs atteints
### Difficultés restant à résoudre
Aucune difficulté.
Cependant, nous avons pu créer l'archive exécutable mais en tapant la commande :
 *java -jar jeu/jeu.jar* ou *java -jar jeu.jar* pour lancer la méthode main ne fonctionne pas.
on nous affiche cette erreur :
" Error: Could not find or load main class src.game.MainMaze
Caused by: java.lang.ClassNotFoundException: src.game.MainMaze "

une alternative possible qui fonctionne :
  *java -classpath classes factory.RobotMain*

Bonne partie!!

# Journal de bord

## Semaine 1

## Semaine 2

Cette semaine on a fait le choix d'implementer un algorithme récursive afin de
représenter le labyrinthe.
Pour implementer cet algorithme, on a utilisé deux classes: *"Board"*,*"Cell"* et un *Enum*.
Nous avons aussi implementer pas mal de méthodes qui permettent soit : **Ajouter des cellules**, **supprimer le mur entre deux cellules**, **verifier si une cellule a des cellules voisines** ,etc...
Vous pourrez avoir un aperçu du labyrinthe en éxécutant le main contenu dans Boardmain .

## Semaine 3

 * Pour cette semaine , Malika Boubacar s'est chargée d'apporter les modifications nécessaires
 * tels que : Suppression de deux murs(NORD ET OUEST), Ajouts de constructeurs et d'une méthode dans l'Enum direction
 * De mon coté ( Amadou Barro) je me suis chargé d'apporter des modifications à la méthode **addNeighbor** faîtes par Mané Lo et initialisé toutes
 * les cellules avec leurs cellules voisines respectives  
 * Pour la semaine prochaine, nous allons entamer la derniére étape afin de génerer le labyrinthe finale.

## Semaine 4

 * pour cette semaine , Malika s'est chargée de faire les tests des méthodes des deux classes java (**Board** - **Cell**)
 * Mané s'est occupée du Diagramme UML .
 * Barro et Youssef s'est chargé de modifier la méthode **addNeighbor** et de **getNeighbor** en lés déplaçant dans la classe Board.
 * Ce qui nous a obligé à deplaçer les méthodes *chooseRandomCell* et *hasUnvisitedCell* dans **Board**
## Semaine 5

## Semaine 6
* Nous avons implémenter le second algorithme ( exhaustif )
* Mané Lo s'est occupé du diagramme UML
* Malika Boubacar et moi (Amadou Barro) sommes occupés de coder les personnages et des Objets
* Nous en avons profité pour commencer à coder les Actions

## Semaine 7

* Coder les actions du Héros et quelques personnages ( sphynx et altruistes)
* modifications des Objets

## Semaine 8
* Coder les actions du Héros et le reste des  personnages (marchand , fou)

## Semaine 9
* Ajout d'une méthode dans la classe Cell
* Quelques ajout dans la classe Direction

## Semaine 10
* Coder les tests des méthodes des classes Characters et Objets
* Quelques ajouts dans la classe Board (ajout de la méthode **getNeighbor**)

## Semaine 11
* Livrable3 ( Modélisation des actions)

## Semaine 12
* Interface texte
*  Modélisation complète
