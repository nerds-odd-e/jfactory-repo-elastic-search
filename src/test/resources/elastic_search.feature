Feature: Elastic Search Data Repository

  Scenario: Exists es data
    Given Exists es data "Index":
      | someString  | someInt | someBoolean |
      | stringValue | 101     | true        |
    Then All es data "Index" should be:
    """
    [0]: {
      someString='stringValue'
      someInt=101,
      someBoolean=true
    }
    size=1
    """

