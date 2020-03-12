import scala.util.Random
import scala.math._

package KMeans {
    class KMeansWords {

        val MAXWORDCOUNT = 140

        def kMeansWords(k: Int, maxIter: Int, randomState: Int) = {
            
        }

        def initializeCentroids(k: Int) = {
            Seq.fill(k)(Random.nextInt(MAXWORDCOUNT), Random.nextInt((MAXWORDCOUNT - Random.nextInt(MAXWORDCOUNT))/2));
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
    }
}
