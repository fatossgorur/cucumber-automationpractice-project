Feature: Register Test

  Scenario Outline: Create account
    Given navigate to website
    And click sign in button
    And type email "<email>"
    And click create an account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type company "<company>"
    And type address "<address>"
    Examples:
      | email | firstname | lastname | password | company | address |

    | cucumber.deneme@gmail.com | cucumber | deneme | deneme123 | teb | istanbul dudullu |
    | kisi1.soyadi@gmail.com | kisi1 | kisisoyadi | den123 | testinium | istanbul acibadem |
    | kisi2.soyadi@gmail.com | kisi2 | kisisoyadi | kisi123 | testinium | istanbul acibadem |