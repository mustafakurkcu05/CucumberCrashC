Feature: scenario outline




  Scenario Outline: scenario ouline

    Given  the user whose name "<name>" is <age> years old
    When   knowledge about user
      | name | <name> |
      | age  | <age>  |
    When   loop count is <for>

    Examples:
      | name | age | for |
      | ali  | 12  | 10  |
      | veli | 22  | 30  |
      | veli | 22  | 30  |
      | veli | 22  | 30  |
      | veli | 22  | 30  |
      | veli | 22  | 30  |
      | veli | 22  | 30  |
      | veli | 22  | 30  |
      | veli | 22  | 30  |