import scala.util.Random

package KMeans {
    class KMeansCoordonates {
        def kMeansCoordonates(k: Int, maxIter: Int, randomState: Int) = {
            
        }

        def initializeCentroids(k: Int) = {
            val long = 180
            val lat = 90
            Seq.fill(k)(-long + Random.nextInt(( long + long) + 1) + Random.nextFloat() , -lat + Random.nextInt(( lat + lat) + 1) + Random.nextFloat());
        }

        def calculateDistance(points: (Float, Float)) = {
            
        }
    }
}
