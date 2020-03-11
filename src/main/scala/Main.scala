import KMeans._

object Main extends App {
  val str = new KMeansCoordonates().initializeCentroids(4)
  println(str)
}