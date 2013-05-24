import org.scalatest.FunSuite

class TestScalaTemplate extends FunSuite {

  test("message should contain 'Scala'") {
    assert(ScalaTemplate.message.contains("Scala"), ScalaTemplate.message)
  }

}
