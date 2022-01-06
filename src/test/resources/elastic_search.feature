Feature: Elastic Search Data Repository

  Scenario: Exists n es data
    Given Exists 2 es data "Index":
    Then All es data "Index" should be:
    """
    [0]: {
      id='id#1'
      someString='someString#1'
      someInt=1,
      someBoolean=true
    }
    [1]: {
      id='id#2'
      someString='someString#2'
      someInt=2,
      someBoolean=false
    }
    size=2
    """

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

  Scenario: Es data should be
    Given Exists es data "Index":
      | id      | someString  | someInt | someBoolean |
      | idValue | stringValue | 101     | true        |
    Then Es data "Index.id[idValue]" should be:
    """
      someString='stringValue'
      someInt=101,
      someBoolean=true
    """

