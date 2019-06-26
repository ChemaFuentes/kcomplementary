Feature: K-Complementary checker
	Find K-complementary pairs in a given array of integers. An Array A, pair (i, j) is K- complementary if K = A[i] + A[j];

Scenario Outline: K-Complementary check
 	Given a integer array "<intArray>" and a given k <k>
 	When I invoke k-complementary checker
 	Then I get k-complementary tuples "<kcTuples>"

  Examples:
	| intArray | k | kcTuples |
  |[0,1,2,3,4,5,6]| 3 |[[0,3],[1,2]]|
  |[0,1,2,3,4,5,6]| 100 |[]|
  |[0,1,2,3,4,5,6,7,8,9,10]| 10 |[[0,10],[1,9],[2,8],[3,7],[4,6]]|