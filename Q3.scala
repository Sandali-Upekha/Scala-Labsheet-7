import scala.io.StdIn
object Q3 {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n <= 3) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else {
      var i = 5
      while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
      }
      true
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => isPrime(number))
  }

  def main(args: Array[String]): Unit = {
    print("Enter number list: ")
    val input = StdIn.readLine().split(" ").map(_.toInt).toList
    println(filterPrime(input))
  }
}

