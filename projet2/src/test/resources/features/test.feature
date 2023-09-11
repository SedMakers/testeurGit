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

  @rugby
  Scenario Outline: check results of france team
    Given the fan is on the website <url>
    When he accepts cookies
    And he clicks on pools link
    Then the pools page is opened and pool A is visible
    Examples:
      | url                                   |
      | "https://www.rugbyworldcup.com/2023/" |

