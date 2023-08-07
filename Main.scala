import scala.io.StdIn
object Main {
  def filterEvenNumbers(numbers: List[Int]): List[Int]= {
    numbers.filter(number => number % 2 == 0)
  }
  def main(args:Array[String]): Unit = {
    print("Enter number list: ")
    val input = StdIn.readLine().split(" ").map(_.toInt).toList
    println(filterEvenNumbers(input)) // Output: List(2, 4, 6, 8, 10)
  }
}
