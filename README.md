# K-Means implementation for distributed clustering

k-means is one of the most commonly used clustering algorithms that clusters the data points into a predefined number of clusters.

So far we could implement the initialization of the operations required for the main algorithm. Define the coordinates:

```python
  class KMeansCoordonates {
        def kMeansCoordonates(k: Int, maxIter: Int, randomState: Int)
```

along with centroid initializations, distance calculation, searching the nearest centroid.
We finally define the method

```python
        def attributeClusters(points: Seq[(Float, Float)], centroids: Seq[(Float, Float)]) 
```

which assigns the corresponding cluster to each point in the given input.

We didn't implement, however, the core of each iteration of the k-means algorithm. It will be the next step in order to finish this implementation.
