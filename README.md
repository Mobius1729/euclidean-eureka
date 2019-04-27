# euclidean-eureka
A Java program which outputs the greatest common factor of two integers using the Euclidean algorithm.
The Euclidean algorithm is a well known method of determinning the greatest common factor (GCF) of two integers. It is particularly useful when dealing with large numbers.

The Euclidean algorithm for GCF(X,Y), where X and Y are integers, is:
If X = 0, then GCF(0,Y) = Y, and there are no further steps.
If Y = 0, then GCF(X,0) = X, and there are no further steps.
If neither X or Y are 0, then we must follow the remaining steps.
Let X = Y * N + R.
Then we must find GCF(Y,R), as GCF(Y,R) = GCF(X,Y).

For a full understanding of the Euclidean algorithm, view this great article on Khan Academy: https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm

For a more technical explanation, take a look at this article on Wolfram MathWorld:
http://mathworld.wolfram.com/EuclideanAlgorithm.html

