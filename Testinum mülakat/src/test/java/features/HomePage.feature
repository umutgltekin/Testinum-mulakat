
Feature:Product add cart
  Scenario:Add cart
    Given Should see home page
    When Search "Roman"
    When click Search
    Then Should see product page
    When click product name "Roman Sanatı"
    Then Should see product detail page
    When click add cart
    Then Cart icon equals 1.
    When click cart
    When click go to cart
    When click incresa product
    When click refresh
    Then cart update write
    When Delete product
    Then should see empty carty


