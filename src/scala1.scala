object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}

object CurryTest extends App {

  def filter( xs: List[Int], p: Int => Boolean): List[Int] =
    if ( xs.isEmpty) xs
    else if ( p( xs.head)) xs.head :: filter( xs.tail, p)
    else filter( xs.tail, p)

  def modN( n: Int)( x: Int)= ( x % n) == 0

  val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
  print( "2-vel oszthatók  : ")  ; println( filter( nums, modN(2)))
  print( "3-mal oszthatók  : ")  ; println( filter( nums, modN(3)))
  print( "4-gyel oszthatók : ")  ; println( filter( nums, modN(4)))
  print( "5-tel oszthatók  : ")  ; println( filter( nums, modN(5)))
}