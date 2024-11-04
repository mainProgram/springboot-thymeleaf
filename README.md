### Environnement ###

JDK 17

Tomcat 9

Maven 3.*

### Tâches ###
1. Créer un projet web maven nommé companyspringboot
2. Créer un fichier index.html sur templates
3. Créer deux controllers LoginController et WelcomeController dans le packet com.groupeisi.companyspringboot.controller qui vont permettre de charger respectivement index.html et welcome.html
4. Télécharger un template de connexion pour la page index.html
5. Créer les packages entities, dao, service, mapper, dto (com.groupeisi.companyspringboot)
6. Gérer les logs dans les servlets et les services
7. Ajouter les tests unitaires pour les services avec mockito et JUnit jupiter
8. Ajouter un fichier de configuration hibernate dans application.properties
9. Gérer la sécurité avec spring security
10. Ajouter l'entité Product(ref String, name String, stock double) et son controller
11. Mettre à jour le projet : dao, dto, mapper, service, controller, html en gerant l'ajout et la liste des produits.
12. Ajouter les entités Purchase(id long, dateP Date, quantity double, product Product) et Sale(id long, dateP Date, quantity double, product Product)
13. Mettre à jour le projet : dao, dto, mapper, service, controller, html en gérant l'ajout et la liste des achats et des ventes.
14. Ajouter Bootstrap dans le projet
15. Ajouter un navbar dans welcome.html, ce navbar sera aussi disponible dans toutes les autres pages html
16. Pour toutes les autres pages : les tables seront dans un card, les formulaires seront aussi dans un card