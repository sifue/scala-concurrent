object ConcurrentCollections extends App {

  val concurrentHashMap = scala.collection.concurrent.TrieMap[String, Int]()
  concurrentHashMap.putIfAbsent("one", 1)
  println(concurrentHashMap)

}
