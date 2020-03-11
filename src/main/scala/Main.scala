import KMeans._

object Main extends App {
  val str = new KMeansCoordonates().initializeCentroids(4)
  println(str)
  val res = new KMeansCoordonates().findNearestCentroid((1, 2), str)
  println(res)
}