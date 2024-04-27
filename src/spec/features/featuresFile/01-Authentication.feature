@authentification @tnr
Feature: Authentification
  ETQ utilisateur je souhaite m'authentifier
  
    Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @login-valide
  Scenario: Je souhaite tester la page LOGIN
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @login-invalide
  Scenario: Je souhaite tester la page LOGIN
    Then Je verifie le message d'erreur

  