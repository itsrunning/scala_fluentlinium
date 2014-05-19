package functional.specs

import functional.base.FunctionalTest


class googleSearch extends FunctionalTest{
  behavior of "Google Home Page"

  it should "go to home page" in {
    goToHomePage
    verifyIsAtHomePage

  }
}
