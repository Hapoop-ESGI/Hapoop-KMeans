import KMeans._

object Main extends App {
  val str = new KMeansCoordonates().initializeCentroids(4)
  println(str)
  val res = new KMeansCoordonates().findNearestCentroid((1, 2), str)
  println(res)

  val str1 = new KMeansWords().initializeCentroids(4)
  println(str1)
  val res1 = new KMeansWords().findNearestCentroid((1, 2), str1)
  println(res1)
}