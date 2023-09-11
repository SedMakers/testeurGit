Feature:

  Scenario Outline: un etudiant remplie et valide le formulaire d'inscritpion
    Given un etudiant sur le site <url>
    When il saisit son userName <username>
    And il saisit son password <password>
    And il clique sur le bouton login
    Then le message d'erreur <message> apparait en rouge
    Examples:
      | url                       | username  | password  | message                    |
      | "https://demoqa.com/login" | "User" | "Name" | "Invalid username or password!" |

  @rugby
  Scenario Outline: check results of france team
    Given the fan is on the website <url>
    When he accepts cookies
    And he clicks on pools link
    Then the pools page is opened and pool A is visible
    Examples:
      | url                                   |
      | "https://www.rugbyworldcup.com/2023/" |