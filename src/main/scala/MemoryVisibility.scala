object MemoryVisibility extends App {
  var number = 0
  var ready = false

  new Thread(() => {
    while (!ready) {
      println("Waiting...")
      Thread.`yield`()
    }
    println(number)
  }).start()

  number = 2525
  println("Updated!")
  ready = true
}