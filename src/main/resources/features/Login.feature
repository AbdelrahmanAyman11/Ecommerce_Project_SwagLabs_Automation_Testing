#Feature :  Verify login property
#  Scenario Outline :  check login with invalid credentials.
#  Given I am in the login page
#  When I fill required data with "<username>" and "<password>" and click login
#  Then It should to navigate to home page
#
#    Examples:
#    |    username     |     password    |
#    |    ahmed        |     4598        |
#    |    fas          |     ky76        |
#    |    tag          |     12345!      |
