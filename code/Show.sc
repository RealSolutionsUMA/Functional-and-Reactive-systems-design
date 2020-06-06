trait Show[A] {
  def show(x: A): String
}

case class Person(name: String, age: Int)

object ShowInstances {
  implicit val showInt: Show[Int] = (x: Int) =>
    x.toString

  implicit val showDouble: Show[Double] = (x: Double) =>
    x.toString

  implicit val showPerson: Show[Person] = (x: Person) =>
    s"Person(${x.name}, ${x.age})"

  // type classes can even be resolved recursively
  implicit def showList[A](implicit ev: Show[A]): Show[List[A]] = (xs: List[A]) =>
    xs
      .map(ev.show)
      .mkString("List(", ", ", ")")
}

object Shower {
  def show[A](a: A)(implicit evidence: Show[A]): String =
    evidence.show(a)
}
