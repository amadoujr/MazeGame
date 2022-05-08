JCC = javac
JFLAGS = -g

# cette commande permet de compiler les fichiers .class et
# de les placer dans le repertoir cls

cls:src/game/MainMaze.java
	$(JCC) -d cls -sourcepath src src/game/MainMaze.java

# cette commande permet de compiler la javadoc de chaque package et
# de la placer dans le repertoir doc

doc :src/game/*.java src/grille/*.java src/ src/characters/*.java  src/objets/*.java
	javadoc -d doc -sourcepath src -subpackages game grille objets

clean:
	rm -r cls*
	rm -r doc*
