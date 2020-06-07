import $ivy.`org.typelevel::cats-effect:2.1.3`, cats.effect.IO

import scala.util.Random

val ioByVariable = {
  val random = new Random(0L)
  val x = IO(random.nextInt)
  for {
    a <- x
    b <- x
  } yield (a, b)
}

val ioByComposition = {
  val random = new Random(0L)
  for {
    a <- IO(random.nextInt)
    b <- IO(random.nextInt)
  } yield (a, b)
}

println(ioByVariable.unsafeRunSync()) // (-1155484576,-723955400)
println(ioByComposition.unsafeRunSync()) // (-1155484576,-723955400)
