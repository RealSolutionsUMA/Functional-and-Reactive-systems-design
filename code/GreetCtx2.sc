var name = "Santi"

def greet() = s"Greeetings $name !"
def greetReversed() = {
  name = name.reverse
}

def greetOther(whom: String) = {
  name = whom
}

greetReversed()
greetOther("Pepe")

println(
  greet()
)
