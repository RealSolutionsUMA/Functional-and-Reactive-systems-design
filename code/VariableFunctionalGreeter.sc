def greetCapitalized(name: String): String = {
  val capitalizedName = name.capitalize
  val prependGreeting = s"Greetings $capitalizedName"
  prependGreeting
}
