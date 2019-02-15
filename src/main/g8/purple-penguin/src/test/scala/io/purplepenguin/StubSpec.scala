package io.purplepenguin

import org.scalatest._

class StubSpec extends FunSpec with Matchers {

  describe("Stub greeting") {

    it("should be \"Hello World\"") {
      Stub.greeting shouldBe "Hello World"
    }
  }
}
