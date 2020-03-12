import scala.util.Random
import scala.math._

package KMeans {
    class KMeansCoordonates {
        def kMeansCoordonates(k: Int, maxIter: Int, randomState: Int) = {
            
        }

        def initializeCentroids(k: Int) = {
            val long = 180
            val lat = 90
            Seq.fill(k)(-long + Random.nextInt(( long + long) + 1) + Random.nextFloat() , -lat + Random.nextInt(( lat + lat) + 1) + Random.nextFloat());
        }

        def calculateDistance(points: Seq[(Float, Float)]) = {
            val a = points(0)._1 - points(1)._1
            val b = points(0)._2 - points(1)._2
            sqrt(pow(a, 2) + pow(b, 2))
        }

        def findNearestCentroid(point: (Float, Float), centroids: Seq[(Float, Float)]) = {
            val l = List.tabulate(centroids.length)(n => calculateDistance(Seq(point, centroids(n))))
            (l.min, l.indexOf(l.min))
        }

        def attributeClusters(points: Seq[(Float, Float)], centroids: Seq[(Float, Float)]) = {
            List.tabulate(points.length)(n => findNearestCentroid(points(n), centroids)._2)
        }
    }
}
