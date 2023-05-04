Feature: a user should be able to order Pizza from Swiggy

  @pizza
  Scenario Outline: Order Pizza From Swiggy
    Given a user is on the home of Swiggy

    And he Enters location as "<city>"
    And he selects first location from suggested location in suggestion-box
    And he redirects to ItemPage
    And he hover over search icon
    And He Enters Item as "Pizza"
    And he select first suggested Item in pizza category
    And he click on restaurants
    And he searches restaurant and select first restaurant
    And he adds first item to cart
    And doingWait
    And click on viewCart
    Then he should be able to order a pizza successfully


    Examples:
      | city    |
      | Pune    |
      | Delhi   |
