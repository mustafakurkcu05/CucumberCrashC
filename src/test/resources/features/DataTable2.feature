Feature: data tables

  Scenario: dt


    Given data table as list
      | 1 |
      | 2 |
      | 3 |


    Given data table as map
      | key1 | val1 |
      | key2 | val2 |
      | key3 | val3 |






    Given data table list of lists
      | 1  | 2  | 3  |
      | 21 | 22 | 23 |
      | 31 | 32 | 33 |
      | 41 | 42 | 43 |




    Given data table list of maps
      | key1 | key2 | key3 |
      | 1    | 11   | 21   |
      | 2    | 12   | 22   |
      | 3    | 13   | 23   |
      | 4    | 14   | 24   |


    Given data table list of lists
      | 1  | 2  | 3  |