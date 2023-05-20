package com.dnta.example

import org.scalatest.matchers.should._
import org.scalatest.wordspec.AnyWordSpec

class HelloTest extends AnyWordSpec with Matchers {
  "Hello" when {
    "say" should {
      "hello" in {
        Hello.greeting shouldBe "hello"
      }
    }
  }
}
