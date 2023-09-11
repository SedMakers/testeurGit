Feature:

  Scenario Outline: un etudiant remplie et valide le formulaire d'inscritpion
    Given un etudiant sur le site <url>
    When il saisit son userName <username>
    And il saisit son password <password>
    And il clique sur le bouton login
    Then le message d'erreur <message> apparait en rouge
    Examples:
      | url                       | username  | password  | message                           |
      | "https://demoqa.com/login" | "User" | "Name" | "Invalid username or password!" |
