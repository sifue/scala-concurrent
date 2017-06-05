object MemoryVisibility extends App {
  var number = 0
  var ready = false

  new Thread(() => {
    while (!ready) {
      Thread.`yield`()
    }
    println(number)
  }).start()

  number = 2525
  ready = true
}