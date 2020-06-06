import scala.annotation.tailrec

def trim(s: String, pred: Char => Boolean): String = {
  @tailrec
  def filter(chars: List[Char], acc: List[Char]): List[Char] = chars match {
    case head :: tail =>
      if (pred(head)) filter(tail, head :: acc)
      else filter(tail, acc)
    case Nil => acc
  }

  filter(
    s.toList,
    Nil
  ).reverse.mkString
}
