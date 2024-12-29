```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)
  val result = list.map(x => if (x % 2 == 0) x * 2 else x)
  println(result) // Output: List(1, 4, 3, 8, 5)

  val list2 = List(1, 2, 3, 4, 5).view
  val result2 = list2.map(x => if (x % 2 == 0) x * 2 else x).force
  println(result2) // Output: List(1, 4, 3, 8, 5)

  val list3 = List(1, 2, 3, 4, 5)
  var sum = 0
  list3.foreach(x => sum = sum + x)
  println(sum) // Output: 15

  val list4 = List(1, 2, 3, 4, 5)
  val sum2 = list4.reduce((x,y) => x + y)
  println(sum2) // Output: 15

  //Example of pattern matching
  val list5 = List(1,2,3,4,5)
  for(x <- list5) {
    x match {
      case 1 => println("one")
      case 2 => println("two")
      case 3 => println("three")
      case _ => println("other")
    }
  }

  //Example of a map where a function is passed in
  val list6 = List(1,2,3,4,5)
  val doubledList = list6.map(x => x * 2)
  println(doubledList) //Output: List(2, 4, 6, 8, 10)
}
```