import KMeans._
import scala.util.Random


object Main extends App {
  // val str = new KMeansCoordonates().initializeCentroids(4)
  // println(str)
  // val res = new KMeansCoordonates().findNearestCentroid((1, 2), str)
  // println(res)

  val str1 = new KMeansWords().initializeCentroids(4)
  println(str1)
  val res1 = new KMeansWords().findNearestCentroid((1, 2), str1)
  println(res1)
  val points = Seq.fill(15)(Random.nextInt(140), Random.nextInt(70))
  println(points)
  val l = new KMeansWords().attributeClusters(points, str1)
  println(l)
  val c1 = new KMeansWords().getFullCluster(points, l, 1)
  println(c1)
  val avg = new KMeansWords().findCentroid(c1)
  println(avg)
}