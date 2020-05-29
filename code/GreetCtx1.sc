var name = "Santi"

def greet() = s"Greeetings $name !"
def greetReversed() = {
  name = name.reverse
}

greetReversed()
println(
  greet()
)
