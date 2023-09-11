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

  @timbres
  Scenario Outline: user want to see stamp details
    Given user is on <url>
    When he select stamps in category searchbar
    And he types <stamp> in searchbar
    And he clicks on the search spyglass
    Then he sees the result of ceres research
    When the consent popup appear he clicks on consent button
    Then the popup disappear
    When he clicks on stamp number <number>
    Then the detailed page of the stamp is opened
    Examples:
      | url                      | stamp   | number  |
      | "https://colnect.com/fr" | "ceres" | "FR 3a" |
