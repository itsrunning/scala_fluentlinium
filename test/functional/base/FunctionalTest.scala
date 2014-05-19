package functional.base

import org.fluentlenium.core.FluentPage
import org.specs2.matcher.MustMatchers
import org.scalatest.FlatSpecLike
import functional.pages._


trait FunctionalTest
  extends testPages
  with FlatSpecLike
  with MustMatchers
  {}

trait testPages
  extends homePage{ }

class Page extends FluentPage(Driver.webDriver) with MustMatchers
