package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if(c == 0 || c == r) 1
    else pascal(c - 1,r - 1) + pascal(c,r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def balance_aux(chars: List[Char], cont: Int): Boolean = {
      if(chars.isEmpty) cont == 0
      else {
        val head = chars.head
        val ok =
          if (head == "(") cont + 1
          else if (head == ")") cont -1
          else cont
        if (ok > 0) balance_aux(chars.tail,ok)
        else false
      }
    }
    balance_aux(chars,0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {return 1}
}
