val prependGreeting: String => String = name => s"Greetings $name !"
val capitalize: String => String = string => string.capitalize

val greetCapitalized: String => String = capitalize andThen prependGreeting
