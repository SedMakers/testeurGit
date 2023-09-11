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

  Scenario: Player want to find the right gunslinger build
    Given player go to "https://maxroll.gg/"
    When player clic on the lost ark section
    And click on build
    And click on the "5" class
    And click on the "Peacemaker" build
    Then Player can see the build
