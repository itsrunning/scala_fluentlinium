package functional.pages

import functional.base.{Page}


trait homePage extends Page{

      def goToHomePage {
        goTo("http://google.com")
      }

      def verifyIsAtHomePage{
        title() must be ("Google")
      }

}
