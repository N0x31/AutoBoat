# AutoBoat

Utilisation de classes orientées objet

1. Crée un formulaire dont le contenu varie en fonction du choix de l’utilisateur dans une liste déroulante, dans un projet nommé AutoBoat
2. Crée une classe parente Vehicle et deux classes héritées Car et Boat, contenant chacune un attribut spécifique
3. Crée des objets de classes différentes en fonction du choix de l’utilisation à l’envoi d’un formulaire
4. Surcharge une méthode afin d’afficher des contenus différents selon la classe de l’objet
5. Crée un nouveau type de véhicule Moto qui aura un attribut spécifique power (la puissance en CV)
6. Surcharge getDescription de Moto pour qu'il affiche brand, model et power (inspire toi de getDescription des autres classes)
7. Ajoute la valeur Moto à la liste déroulante de MainActivity, et affiche le contenu de getDescription de la classe Moto à la sélection de cette valeur

Critéres de validation
- Le fichier strings.xml contient tous les textes qui sont affichés dans la UI (sauf ceux saisis par l'utilisateur, et une exception peut-être faite pour les textes du Spinner).
- Il n'y a pas de variable globale dans l'application.
- MainActivity affiche bien les champs en fonction de ce qui est choisi dans la liste déroulante (Kilomètre pour Voiture et Nombre d’heures pour Bateau), et le bouton Envoyer est désactivé si “Sélectionnez…” est choisi.
- Au clic sur Envoyer, tu arrives sur VehicleActivity et le texte affiché correspond bien au choix du type de véhicule fait dans le formulaire (pour Voiture tu as le kilométrage, pour Bateau le nombre d’heure)
- Le texte affiché dans VehicleActivity appelle bien une méthode des classes Car ou Boat et non pas une fonction dans l'Activity.
- La classe Moto existe et contient l'attribut power. Une surcharge de la méthode getDescription est présente et fonctionnelle.
