import scala.util.Random
import scala.math._

package KMeans {
    class KMeansWords {

        val MAXWORDCOUNT = 140

        def kMeansWords(k: Int, maxIter: Int, randomState: Int) = {
            
        }

        def initializeCentroids(k: Int) = {
            Seq.fill(k)(Random.nextInt(MAXWORDCOUNT), (Random.nextInt(MAXWORDCOUNT/2)))
        }

        def calculateDistance(points: Seq[(Int, Int)]) = {
            val a = points(0)._1 - points(1)._1
            val b = points(0)._2 - points(1)._2
            sqrt(pow(a, 2) + pow(b, 2))
        }

        def findNearestCentroid(point: (Int, Int), centroids: Seq[(Int, Int)]) = {
            val l = List.tabulate(centroids.length)(n => calculateDistance(Seq(point, centroids(n))))
            (l.min.toInt, l.indexOf(l.min))
        }

        def attributeClusters(points: Seq[(Int, Int)], centroids: Seq[(Int, Int)]) = {
            List.tabulate(points.length)(n => findNearestCentroid(points(n), centroids)._2)
        }

        def findCentroid(cluster: List[(Int, Int)]) = {
            val x = List.tabulate(cluster.length)(n => cluster(n)._1).sum / (if (cluster.length > 0) cluster.length else 1)
            val y = List.tabulate(cluster.length)(n => cluster(n)._2).sum / (if (cluster.length > 0) cluster.length else 1)
            (x, y)
        }

        def getFullCluster(points: Seq[(Int, Int)], clusterList: Seq[Int], cluster: Int) = {
            List.tabulate(clusterList.length)(n => if(clusterList(n) == cluster){ points(n) }).filterNot(_ == ()).asInstanceOf[List[(Int, Int)]]
        }

        def firstIteration(points: Seq[(Int, Int)], k: Int) = {
            val centroids = initializeCentroids(k)
            val clusteredPoints = attributeClusters(points, centroids)
            
        }

    }
}
