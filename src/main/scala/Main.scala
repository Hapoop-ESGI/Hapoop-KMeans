import KMeans._

object Main extends App {
  val str = new KMeansCoordonates().initializeCentroids(4)
  println(str)
  println(new KMeansCoordonates().calculateDistance(Seq((1, 2), (3, 4))))
}