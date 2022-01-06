Feature: Elastic Search Data Repository

  Scenario: Exists es data
    Given Exists es data "Index":
      | id      | someString  | someInt | someBoolean |
      | idValue | stringValue | 101     | true        |
    Then All es data "Index" should be:
    """
    [0]: {
      id='idValue'
      someString='stringValue'
      someInt=101,
      someBoolean=true
    }
    size=1
    """

