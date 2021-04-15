# TP Android
Dans ce TP à trous vous donnera une trame pour la conception d'une application permettant de manipuler des API Android tel que la Camera ou une carte ainsi que les outils Firebase


## Initialisation
1. Récupérer le projet
1. Créer un projet sur Firebase
1. Connecter le projet Firebase à l'application
1. Activer l'authentification par email / mot de passe sur Firebase (Onglet Authentication)
## Authentification
1. Faire fonctionner l'authentification : récupérer les informations saisies par l'utilisateur
1. Ajouter les contrôles pour indiquer à l'utilisateur qu'il doit saisir les champs email et mot de passe
1. Tester l'authentification
1. Faire fonctionner la fonction mot de passe oublié : récupérer les informations saisies par l'utilisateur
1. Ajouter les contrôles pour indiquer à l'utilisateur qu'il doit saisir le champ email
1. Tester la modification du mot de passe pensez à vérifier vos SPAM)
1. Modifier le template de mail pour qu'il soit en francais et qu'il contienne le prénom du destinataire (exemple : Bonjour John, ...)
1. Pour les points 5 et 8 transformer les toasts en snackbar et personnaliser les messages affichés
1. Créer une interface d'inscription contenant les champs email et mot de passe et un bouton pour la validation
1. Connecter le bouton de validation à la méthode firebase : 
createUserWithEmailAndPassword
1. Authentifier l'utilisateur quand il a créé son compte pour accéder à l'activité : MapsActivity
## Carte
1. Sans faire les manipulations, prendre connaissance des informations dans le fichier res/values/google_maps_api.xml
1. Modifier le paramètrage du projet pour qu'il utilise la propriété "google_maps_key" du fichier google_maps_api.xml pour autoriser l'accès à la map Google
1. Verifier que le SDK cloud Firestore soit intégré au projet sinon ajoutez le
1. Dans l'appel à la méthode setOnMapLongClickListener dans l'activité : MapsActivité, modifier l'intent pour qu'il transmette en paramètre les coordonnées de l'emplacement séléctionné à l'activité NouvelleAnnonceActivity
1. Récupérer les coordonnées géographiques transmise via un intent dans l'activité NouvelleAnnonceActivity
## Nouvelle annonce
1. Dans l'activité NouvelleAnnonceActivity modifier l'appel et la méthode Ajouter pour que celle-ci enregistre les coordonnées géographique passez en paramètre dans l'étape précédente
1. Dans l'activité NouvelleAnnonceActivity modifier l'appel et la méthode Ajouter pour que celle-ci enregistre la référence de l'utilisateur connecté
1. Implémenter la méthode PlacerAnnonces l'activité MapsActivity pour que les annonces soient affichées en temps réel sur la carte
1. Modifier le paramètrage de la carte pour avoir un bouton permettant de rediriger la vue de la carte sur notre position
1. Sur l'activité MapsActivity ajouter un composant : AppBar
1. Sur le composant : AppBar, ajouter un bouton représentant une icone utilisateur permettant d'ouvrir l'activité ProfilActivity
1. Verifier que le SDK cloud Storage soit intégré au projet sinon ajoutez le
1. Implémenter la fonction : ChargerInformationsUtilisateur dans l'activité ProfilActivity
1. Modifier l'icone du bouton en bas à droite de l'activité ProfilActivity pour afficher un signe check ou autre pour indiquer une validation
1. Faire fonctionner la fonction prendrePhoto dans l'activité ProfilActivity (aide : [https://developer.android.com/training/camera/photobasics](https://developer.android.com/training/camera/photobasics))
1. Ajouter une image ([Exemple](https://www.flaticon.com/free-icon/user_1946429?term=user&page=1&position=20&page=1&position=20&related_id=1946429&origin=search)) au projet
1. Implémenter la fonction ChargerInformationsUtilisateur(), pour l'ImageView ivPhoto définir par défaut l'image précédement ajouter si l'utilisateur n'a pas de photo de profil