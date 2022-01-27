Exercice Design Pattern session 2 / 3

Nous allons modéliser une classe abstraite « Pokemon ». Un pokemon a des « Type »s. Certains « Pokemons » peuvent évoluer. Ils implémentent alors l’interface « IEvoluable » avec la méthode « évoluer » qui retourne un « Pokemon ». Pour l’exemple vous allez implémenter le cas de la famille Bulbizarre. Il est de types : « Plante » et « Poison » et il peut évoluer en « Herbizarre » qui peut lui-même évoluer en « Florizarre ». Il s’agit de votre version 1 du jeu.
Sans toucher aux classes existantes de la version 1, nous allons introduire les mega évolutions et les obscures.
L’interface « IMegaEvoluable » possède la méthode « evoluer » mais qui retourne un « MegaPokemon ». Appliquée à « Florizarre », cela donnera un « MegaFlorizarre ». Quel Design Pattern pouvez-vous mettre en place sans toucher à « Florizarre » directement ?
Un Pokemon obscur perd le premier de ses types et ajoute une méthode « purifier », quel pattern utiliser pour modéliser les Pokemon obscurs ? Exemple les « FlorizarreObscur », « HerbizarreObscur » et « BulbizarreObscur » n’ont plus que le type « Poison ».

-	Quels design patterns allez-vous utiliser ?
-	Proposez le diagramme UML en utilisant PlantUML
o	Si besoin, indiquez les design patterns à l’aide de commentaires
-	Proposez une implémentation en java
-	Créer les tests vérifiant que
o	Que « évoluer » sur « Florizarre » donne « Herbizarre » implémentant « Pokemon »
o	Que « évoluer » sur « Herbizarre » donne « Florizarre » implémentant « Pokemon »
o	Que « évoluer » sur « Florizarre » donne « MegaFlorizarre » implémentant « MegaPokemon »
o	Vérifiez que « Florizarre », « Herbizarre » et « Bulbizarre » ont deux types : « Poison », « Plante »
o	Vérifiez que « FlorizarreObscur », « HerbizarreObscur » et « BulbizarreObscur » ont un seul type : « Poison » et une méthode « purifier ».
Votre projet doit m’être rendu :
-	sous forme de projet github
-	qui compile avec gradle
-	dont les tests passent
Vous pouvez évidemment partir du projet du cours. Je prendrais votre projet avec les commits du jeudi 17 février 2022 maximum.

Merci de m’envoyer l’url de votre projet Github à l’adresse : guillaume.barry@soprabanking.com

Je vous confirmerais systématiquement la bonne réception du projet et si j’ai réussi à l’ouvrir. Donc si vous n’avez pas de retour de ma part relancez moi.
