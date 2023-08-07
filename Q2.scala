import scala.io.StdIn
object Q2 {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }

  def main(args: Array[String]): Unit = {
    print("Enter number list: ")
    val input = StdIn.readLine().split(" ").map(_.toInt).toList
    println(calculateSquare(input)) // Output: List(1, 4, 9, 16, 25)
  }
}
