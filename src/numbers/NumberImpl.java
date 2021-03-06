package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class NumberImpl {

	public static void main(String[] args) {
		NumberImpl numImpl = new NumberImpl();
		// product array
		int arr[] = new int[] {10, 3, 5, 6, 2};
		int prod[] = numImpl.productArray(arr);
		System.out.println("Product array: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(prod[i] + " ");
		}
		System.out.println();
		
		// Sum of 2 nos. equal to key in less than O(n2)
		System.out.println("2 nos. in an array sum up to the given key: " + numImpl.sumTwoNumbers(arr, 9));
		System.out.println("2 nos. in an array sum up to the given key: " + numImpl.sumTwoNumbers(arr, 14));
		
		// Union and intersection of 2 sorted arrays
		int[] arr1 = {1, 3, 4, 5, 7};
		int[] arr2 = {2, 3, 5, 6};
		int[] res = numImpl.unionSortedArrays(arr1, arr2);
		System.out.println("Union of 2 sorted arrays:");
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
		List<Integer> resList = numImpl.intersectionSortedArrays(arr1, arr2);
		System.out.println("Intersection of 2 sorted arrays:");
		for(int resEle : resList) {
			System.out.print(resEle + " ");
		}
		System.out.println();
		int[] unionarr1 = {1, 2, 2, 3};
		int[] unionarr2 = {1, 4, 5};
		List<Integer> resList2 = numImpl.unionOfUnsortedArrays(unionarr1, unionarr2);
		System.out.println("Union of 2 unsorted arrays: " + resList2);
		
		// Max contiguous sum
		int[] arr3 = {3, 5, -9, 2, 4, -1, 7 };
		System.out.println("Max contiguous sum of the array: " + numImpl.maxContiguousSum(arr3));
		
		// Separate even odd numbers in an array
		numImpl.separateEvenOdd(arr3);
		System.out.println("Separation of even odd nos in an array:");
		for(int resEle : arr3) {
			System.out.print(resEle + " ");
		}
		System.out.println();
		
		// Remove duplicates in an array without using a map
		int[] arr4 = {1, 3, 5, 9, 7, 8, 3, 2, 1, 3, 13, 3};
		int arrLen = numImpl.removeDuplicates(arr4);
		System.out.println("Remove suplicates in an array:");
		for(int i=0; i<arrLen; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		// Find indices start and end for a particular value in a sorted integer array with duplicates
		int[] arr7 = {1, 3, 5, 9, 7, 8, 3, 2, 1, 3, 13, 3};
		Arrays.sort(arr7);
		for(int i=0; i<arr7.length; i++) {
			System.out.print(arr7[i] + " ");
		}
		System.out.println();
		numImpl.findIndicesOfDuplicates(arr7, 3);
		
		// Randomize an array of nos.
		System.out.println("Randomize: ");
		numImpl.randomize(arr3);
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		// Intersection of 2 unsorted arrays
		int[] arr5 = {1, 3, 4, 5, 7, 3};
		int[] arr6 = {2, 3, 5, 6, 3, 3};
		resList = numImpl.intersection(arr5, arr6);
		System.out.println("Intersection of 2 UN-sorted arrays:");
		for(int resEle : resList) {
			System.out.print(resEle + " ");
		}
		System.out.println();
		
		// Stock buy sell profit - 1 time
		int[] stock = {1, 2, 6, 80, 100};
		numImpl.stockBuySell1Time(stock);
		
		// Stock buy sell profit - 1 time optimized
		int[] stock2 = {100, 80, 6, 2, 1};
		numImpl.stockBuySell1TimeOptimized(stock2);
		
		// Stock buy sell profit - k times
		int[] stock1 = {100, 180, 260, 310, 40, 535, 695};
		numImpl.stockBuySellKTimes(stock1);
		
		// Sq root of a number
		System.out.println();
		System.out.println("Square root of a number: " + numImpl.sqroot(81));
		
		// max sub array product
		int[] arr8 = {2, 3, -5, 1, 0, -17, 23, 3};
		System.out.println("Max sub-array product: " + numImpl.maxProduct(arr8));
		
		// kth largest number in an array
		// {-17, -5, 0, 1, 2, 3, 3, 23}
		System.out.println("5th largest number in arr = " + numImpl.kLargestNum(arr8, 5));
		
		int[] arr9 = {5,  5, 10, 40, 50, 35};
		System.out.println("Max non-consecutive sum: " + numImpl.maxNonConsecutiveSum(arr9));
		
		int[] arr10 = {1,3,-1,-3,5,3,6,7};
		int[] swRes = numImpl.slidingWindowMax(arr10, 3);
		System.out.println("Sliding window array: ");
		for (int each : swRes) {
			System.out.print(each + " ");
		}
		System.out.println();
		
		System.out.println("k most frequent elements in O(n): ");
		int[] arr11 = {1,1,1,1,2,3,3,3,3,4,4,4,4,5,5,5};
		System.out.print(numImpl.kMostFrequent(arr11, 2));
		System.out.println();
		
		// Add 2 nos. without arithmetic operators
		System.out.println("Sum: " + numImpl.addNoArithmeticOperators(2, 3));
		
       // Let us search 3 in below array
       int arr12[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
       int key = 1;
       System.out.println("Index of the element is: "
                      + numImpl.rotatedBinarySearch(arr12, key));
       
       int arr13[] = {0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println("Trappung rain water. Max water trapped = " + numImpl.trapRainWater(arr13));
       
       int arr14[][] = {{1,2,3},{4,5,6},{7,8,9}};
       System.out.println("Original array: ");
       for (int i=0; i<arr14.length; i++) {
    	   for (int j=0; j<arr14[0].length; j++) {
    		   System.out.print(arr14[i][j] + " ");
    	   }
    	   System.out.println();
       }
       numImpl.rotateMatrix90(arr14);
       System.out.println("Rotated array:");
       for (int i=0; i<arr14.length; i++) {
    	   for (int j=0; j<arr14[0].length; j++) {
    		   System.out.print(arr14[i][j] + " ");
    	   }
    	   System.out.println();
       }
       
       // max points on a straight line given a 2d points array
       int[][] arr15 = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
       System.out.println("Max points on a staright line: " + numImpl.maxPointsOnLine(arr15));
       
       // N queens problem
       numImpl.placeNQueens(4);
       
		// Search in a 2D matrix - efficiently
		//		[
		//		  [1,   4,  7, 11, 15],
		//		  [2,   5,  8, 12, 19],
		//		  [3,   6,  9, 16, 22],
		//		  [10, 13, 14, 17, 24],
		//		  [18, 21, 23, 26, 30]
		//		]
		//		Given target = 5, return true.
		//		
		//		Given target = 20, return false.
		int[][] arr16 = {{1,4,7,11,15},{2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(numImpl.search2DMatrix(arr16, 5));
		System.out.println(numImpl.search2DMatrix(arr16, 20));
		
		//		Maximal square area in a 2d matrix of 1's and 0's
		//		1 0 1 0 0
		//		1 0 1 1 1
		//		1 1 1 1 1
		//		1 0 0 1 0
		int[][] arr17 = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
		System.out.println("Maximal square area: " + numImpl.maximalSquare(arr17));
		
		int[] arr18 = {5,4,0,3,1,6,2};
		System.out.println("Nesting array size: " + numImpl.arrayNestingSize(arr18));
		
		System.out.println("Comparing 2 versio numbers: " + numImpl.compareVersionNumbers("0.3", "1.25"));
		
		String[] logs = {"0:start:0", "1:start:2", "1:end:5", "0:end:6"};
		System.out.println("Exclusive time of functions: ");
		int[] exclTimeOfFuncs = numImpl.exclusiveTime(2, Arrays.asList(logs));
		for(int each : exclTimeOfFuncs) {
			System.out.print(each + " ");
		}
		System.out.println();
		
		int[][] positions = {{1, 2}, {2, 3}, {6, 1}};
		System.out.println("Falling squares resultant height: " + numImpl.fallingSquares(positions));
		System.out.println();
		int[][] positions2 = {{100, 100}, {200, 100}};
		System.out.println("Falling squares resultant height: " + numImpl.fallingSquares(positions2));
		System.out.println();
		
		System.out.println("Roman to integer: " + numImpl.romanToInteger("MCMXCIV"));
		
		int[][] arr19 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Spiral matrix output: " + numImpl.spiralMatrix(arr19));
		
		int[] digits = {1, 2, 3};
		int[] res9 = numImpl.plusOne(digits);
		System.out.print("Plus one: ");
		for (int i=0; i<res9.length; i++) {
			System.out.print(res9[i]);
		}
		System.out.println();
		
    	int[][] envelopes = {{30,50},{12,2},{3,4},{12,15}};
		System.out.println("Max envelopes: " + numImpl.maxEnvelopes(envelopes));
		
		int[] arr21 = {-3, 1, 3, 5, 7}; 
		System.out.println("No. of ways to reach target using the array: " + numImpl.findWaysToTarget(arr21, 6));
		
		int[] nums = {3,2,1,0,4};
		int[] nums34 = {2,3,1,1,4};
		System.out.println("Can jump: " + numImpl.canJump(nums));
	}

	/**
	 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size)
	 * such that prod[i] is equal to the product of all the elements of arr[] except arr[i].
	 * Solve it without division operator and in O(n
	 */
	public int[] productArray(int[] arr) {
		if (arr == null || arr.length == 0) {
			return new int[0];
		}
		int len = arr.length;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int[] prod = new int[arr.length];
		
		left[0] = 1;
		right[len-1] = 1;
		
		for (int i=1; i<len; i++) {
			left[i] = arr[i-1]*left[i-1];
		}
		
		for (int j=len-2; j>=0; j--) {
			right[j] = arr[j+1]*right[j+1];
		}
		
		for(int i=0; i<len; i++) {
			prod[i] = left[i]*right[i];
		}	
		return prod;
	}
	
	/**
	 * Product except self without additional space.
	 * 
	 * @param nums
	 * @return
	 */
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int left = 1;
        int right = 1;
        res[0] = 1;
    
        for (int i=1; i<nums.length; i++) {
            left *= nums[i-1];
            res[i] = left;
        }
        
        for (int i=nums.length-2; i>=0; i--) {
            right *= nums[i+1];
            res[i] *= right;
        }
        
        return res;
    }
	
	/*
	 * Check if 2 nos. in an array sum up to the given key in less than O(n2)
	 */
	public boolean sumTwoNumbers(int[] arr, int key) {
		int i = 0;
		int j = arr.length-1;
		Arrays.sort(arr);
		while(i<arr.length && j>=0 && i != j) {
			if ((arr[i] + arr[j]) == key) {
				return true;
			} else if ((arr[i] + arr[j]) > key) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}
	
	public int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i + 1);
	    }
	    return result;
	}
	
	/**
	 * Given an array of integers and an integer k, you need to find the total number of continuous 
	 * subarrays whose sum equals to k.

		Example 1:
		
		Input:nums = [1,1,1], k = 2
		Output: 2
	 * @param nums
	 * @param k
	 * @return
	 */
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res = 0;

        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
            if (map.containsKey(sum-k)) {
                res+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
	
	/**
	 * Two sum optimized on add method.
	 */
    private Map<Integer, Integer> numFreq = new HashMap<>();
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if (numFreq.containsKey(number)) {
        	numFreq.put(number, 2);
        } else {
        	numFreq.put(number, 1);
        }
    }   
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (int key : numFreq.keySet()) {
            int diff = value - key;
            if (numFreq.containsKey(diff)) {
                int num = numFreq.get(diff);
                if (key != diff || num==2) {
                    return true;
                }
            }
        }
        return false;
    }
	
	public int[] unionSortedArrays(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while(i<arr1.length && j<arr2.length) {
			if (arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				k++;
				i++;
			} else if (arr1[i] > arr2[j]) {
				res[k] = arr2[j];
				k++;
				j++;
			} else {
				res[k] = arr1[i];
				i++;
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			res[k++] = arr1[i++];
		}
		while(j<arr2.length) {
			res[k++] = arr2[j++];
		}
		return res;
	}
	
	public List<Integer> intersectionSortedArrays(int[] arr1, int[] arr2) {
		List<Integer> res = new ArrayList<Integer>();
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				res.add(arr1[i]);
				i++;
				j++;
			}
		}
		return res;
	}
	
	public List<Integer> unionOfUnsortedArrays(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
			return Collections.emptyList();
		}
		
		List<Integer> res = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
			res.add(arr1[i]);
		}
		
		for (int i=0; i<arr2.length; i++) {
			if (!map.containsKey(arr2[i])) {
				res.add(arr2[i]);
			}
		}
		return res;
		
	}
	
	public int maxContiguousSum(int[] arr) {
		int sum = 0;
		int maxsum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if (sum < 0) {
				sum = 0;
			}
			maxsum = Math.max(maxsum, sum);
		}
		return maxsum;
	}
	
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = 0;
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                cnt++;
                max = Math.max(max, sum);
                sum = 0;
            }
            maxsum = Math.max(maxsum, sum);
        }
        if (cnt == nums.length) {
            return max;
        }
        return maxsum;
    }
	
	public void separateEvenOdd(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = n-1;
		while(i<j) {
			while(i<n && arr[i]%2 != 0) {
				i++;
			}
			while(j>=0 && arr[j]%2 == 0) {
				j--;
			}
			if (i<j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	
	// {1, 3, 5, 9, 7, 8, 3, 2, 1};
	// {1, 1, 2, 3, 3, 5, 7, 8, 9}
	// {1, 2, 3, 5, 7, 8, 9}
	public int removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int[] tmp = arr;
		int i = 0;
		int j = 0;
		while(i<n-1) {
			if (tmp[i] == tmp[i+1]) {
				i++;
			} else {
				arr[j++] = tmp[i++];
			}
		}
		if (arr[j-1] != tmp[n-1]) {
			arr[j++] = tmp[n-1];
		}
		return j;
	}
	
	// Find indices start and end for a particular value in a sorted integer array with duplicates
	// 1 1 2 3 3 3 3 5 7 8 9 13 
	public void findIndicesOfDuplicates(int[] arr, int key) {
		int n = arr.length;
		int[] tmp = arr;
		int i = 0;
		int st = -1;
		while(i<n) {
			if (tmp[i] == key) {
				if (st==-1) {
					st = i;
				}
			}else if (st != -1) {
				break;
			}
			i++;
		}
		
		System.out.println("Indices of start and end of duplicate sorted array: Start= " + st + "; end=" + (i-1));
	}
	

//	class GFG 
//	{
//	    //if x is present in arr[] then returns the index of
//	    //FIRST occurrence of x in arr[0..n-1], otherwise
//	    //returns -1 
//	    public static int first(int arr[], int low, int high, int x, int n)
//	    {
//	        if(high >= low)
//	        {
//	            int mid = low + (high - low)/2;
//	            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
//	                return mid;
//	             else if(x > arr[mid])
//	                return first(arr, (mid + 1), high, x, n);
//	            else
//	                return first(arr, low, (mid -1), x, n);
//	        }
//	    return -1;
//	    }
//	  
//	    //if x is present in arr[] then returns the index of
//	    //LAST occurrence of x in arr[0..n-1], otherwise
//	    //returns -1 
//	    public static int last(int arr[], int low, int high, int x, int n)
//	    {
//	        if (high >= low)
//	        {
//	            int mid = low + (high - low)/2;
//	            if (( mid == n-1 || x < arr[mid+1]) && arr[mid] == x)
//	                 return mid;
//	            else if (x < arr[mid])
//	                return last(arr, low, (mid -1), x, n);
//	            else
//	                return last(arr, (mid + 1), high, x, n);
//	        }
//	    return -1;
//	    }
//	     
//	    public static void main (String[] args)
//	    {
//	         
//	        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
//	        int n = arr.length;
//	        int x = 8;
//	        System.out.println("First Occurrence = " + first(arr, 0, n-1, x, n));
//	        System.out.println("Last Occurrence = " + last(arr, 0, n-1, x, n));
//	 
//	    }
//	}
	
	public void randomize(int[] arr) {
		int n = arr.length -1;
		for(int i=n-1; i>0; i--) {
			Random rand = new Random();
			int random = rand.nextInt(i);
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
	}

	public List<Integer> intersection(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr1.length; i++) {
			Integer cnt = map.get(arr1[i]) ;
			if (cnt == null) {
				map.put(arr1[i], 1);
			} else {
				map.put(arr1[i], cnt+1);
			}
		}		
		List<Integer> resList = new ArrayList<Integer>();
		for(int i=0; i<arr2.length; i++) {
			Integer cnt = map.get(arr2[i]) ;
			if (cnt != null && cnt != 0) {
				resList.add(arr2[i]);
				map.put(arr2[i], cnt-1);
			}
		}
		return resList;
	}
	
	public double sqroot(int num) {
		double f1 = num/2;
		double f2 = (f1 + num/f1)/2;
		
		while(Math.abs(f1-f2) > 0.01) {
			f1 = f2;
			f2 = (f1 + num/f1)/2;		
		}
		
		return f1;
	}
	
	/** Sqroot using binary search
		 // if mid*mid<x => mid<=x/mid (e.g.mid=3,x=10)
        // if mid<=x/mid => mid*mid<=x
	 * 
	 * @param x
	 * @return
	 */
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int lo = 1;
        int hi = x;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (mid <= x/mid){
                if (mid+1 > x/(mid+1)) {
                    return mid;
                }
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
	
	/**
	 * Given an array of int, find a contiguous sub-array whose product is maximum.
	 * 
	 */
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSoFar = 1;
        int minSoFar = 1;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] >= 0) {
                maxSoFar = Math.max(maxSoFar*nums[i], nums[i]);
                minSoFar = Math.min(minSoFar*nums[i], nums[i]);
            }
            
            if (nums[i] < 0) {
                int tmp = maxSoFar;
                maxSoFar = Math.max(minSoFar*nums[i], nums[i]);
                minSoFar = Math.min(tmp * nums[i], nums[i]);
            }
            
            max = Math.max(max, maxSoFar);
        }
        return max;
    }
	
	public void stockBuySell1Time(int[] arr) {
		int max = 0;
		int n = arr.length;
		int buy = 0, sell = 0;
		for(int i=n-1; i>0; i--) {
			for (int j=i-1; j>=0; j--) {
				if (arr[i] - arr[j] > max) {
					max = arr[i] - arr[j];
					buy = j;
					sell = i;
				}
			}
		}
		System.out.println("Max profit is by buying on day " + (buy+1) + " and selling on day " + (sell+1) + " ; Profit: " + max);
	}
	
	// {1, 2, 6, 80, 100}
	// {100, 80, 6, 2, 1}
	public void stockBuySell1TimeOptimized(int[] arr) {
		int min_val = arr[0];
		int max_profit = arr[1] - arr[0];
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int diff = arr[i] - min_val;
			if (diff > max_profit) {
				max_profit = diff;
			}
			if (arr[i] < min_val) {
				min_val = arr[i];
			}
		}
		System.out.println("Max profit (optimized): " + max_profit);
	}
	
	// kth largest number in an array
	// Efficiency: O(nlogk) - nlogk to heapify k elemnets n times
	public int kLargestNum(int[] arr, int k) {
		Queue<Integer> q = new PriorityQueue<Integer>(k);
		
		for (int num : arr) {
			q.add(num);
			if (q.size() > k) {
				q.remove();
			}
		}
		return q.peek();
	}
	
	/**
	 * Given an array nums, there is a sliding window of size k which is moving
	 * from the very left of the array to the very right. You can only see the k
	 * numbers in the window. Each time the sliding window moves right by one
	 * position. For example, Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
	 * Therefore, return the max sliding window as [3,3,5,5,6,7].
	 */
	public int[] slidingWindowMax(int[] arr, int k) {
		int[] res = new int[arr.length - k +1];
		int count = 0;
		Queue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		for (int i=0; i<arr.length-k+1; i++) {
			for (int j=i; j<i+k; j++) {
				pq.add(arr[j]);
			}
			res[count++] = pq.poll();
			pq.clear();
		}
		return res;
	}
	
	
	// {100, 180, 260, 310, 40, 535, 695}
	public void stockBuySellKTimes(int[] arr) {
		int n = arr.length;
		int i = 0;
		Interval[] inter = new Interval[n/2 + 1];
		int cnt = 0;
		while(i<n-1) {
			// Find local minima
			while(i<n-1 && arr[i+1]<=arr[i]) {
				i++;
			}
			
			if (i==n-1) {
				break;
			}
			
			inter[cnt] = new Interval();
			inter[cnt].buy = i++;
			
			//Find local maxima
			while(i<n && arr[i]>arr[i-1]) {
				i++;
			}
			inter[cnt].sell = i-1;
			cnt++;
		}
		if (cnt == 0) {
			System.out.println("No profit.");
		} else {
			for (int k=0; k<cnt; k++) {
				System.out.print("{" + inter[k].buy + ", " + inter[k].sell + "}, ");
			}
		}
	}
	
	private class Interval {
		int buy;
		int sell;
	}
	
	/**
	 * The API: int read4(char *buf) reads 4 characters at a time from a file.
	 * The return value is the actual number of characters read. For example, it
	 * returns 3 if there is only 3 characters left in the file. By using the
	 * read4 API, implement the function int read(char *buf, int n) that reads n
	 * characters from the file.
	 */
	public int read(char[] buf, int n) {
		boolean eof = false;
		int count = 0;
		int total = 0;
		char[] tmp = new char[4];	
		
		while(!eof && total < n) {
			// count = read4(tmp); // Commenting since it cannot be compiled. This line exists in actual code.
			eof = count < 4;
			
			count = Math.min(count, n-total);
			
			for(int i=0; i<count; i++) {
				buf[total++] = tmp[i];
			}
		}
		return total;
	}
	
	/**
	 * If readreadMultiCall can be called multiple times.
	 * Example:
	 * File file("abc");
		Solution sol;
		// Assume buf is allocated and guaranteed to have enough space for storing all characters from the file.
		sol.read(buf, 1); // After calling your read method, buf should contain "a". We read a total of 1 character 
		from the file, so return 1.
		sol.read(buf, 2); // Now buf should contain "bc". We read a total of 2 characters from the file, so return 2.
		sol.read(buf, 1); // We have reached the end of file, no more characters can be read. So return 0.
	 */
    private int bufPtr = 0;
    private int bufCnt = 0;
    private char[] buf4 = new char[4];
    
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int readMultiCall(char[] buf, int n) {
        int ptr = 0;
        
        while(ptr < n) {
            if (bufCnt == 0) {
                //bufCnt = read4(buf4); //Commented for code to compile. This line exists.
            }
            
            while(ptr<n && bufPtr<bufCnt) {
                buf[ptr++] = buf4[bufPtr++];
            }
            
            if (bufCnt < 4) {
                break;
            }
            
            if (bufPtr == bufCnt) {
                bufPtr = 0;
                bufCnt = 0;
            }
            
        }
        return ptr;
    }
	
	/**
	 * Given an array of positive numbers, find the maximum sum of a subsequence
	 * with the constraint that no 2 numbers in the sequence should be adjacent
	 * in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10
	 * 7 should return 15 (sum of 3, 5 and 7).Answer the question in most
	 * efficient way.
	 * 
	 * @param arr
	 * @return
	 */
	// {5,  5, 10, 40, 50, 35}
	public int maxNonConsecutiveSum(int[] arr) {
		
		if (arr.length < 1) {
			return 0;
		}
		
		int previncl = arr[0]; //max sum including the previous element
		int prevexcl = 0; // max sum excluding the previous element
		
		int excl = 0;
		int incl = 0;
		
		for (int i=1; i<arr.length; i++) {
			excl = Math.max(previncl, prevexcl); // max sum excluding the current element
			incl = prevexcl + arr[i]; // max sum including the current element
			previncl = incl;
			prevexcl = excl;
		}
		
		return Math.max(incl, excl);
	}
	
	/**
	 * You are a professional robber planning to rob houses along a street. Each
	 * house has a certain amount of money stashed. All houses at this place are
	 * arranged in a circle. That means the first house is the neighbor of the
	 * last one. Meanwhile, adjacent houses have security system connected and
	 * it will automatically contact the police if two adjacent houses were
	 * broken into on the same night.
	 * 
	 * Given a list of non-negative integers representing the amount of money of
	 * each house, determine the maximum amount of money you can rob tonight
	 * without alerting the police.
	 * 
	 * @param nums
	 * @return
	 */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(robUtil(nums, 1, nums.length-1), robUtil(nums, 0, nums.length-2));
    }
    
    private int robUtil (int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        int prevIncl = nums[start];
        int prevExcl = 0;
        
        int curIncl = 0;
        int curExcl = 0;
        
        for (int i=start+1; i<=end; i++) {
            curIncl = nums[i] + prevExcl;
            curExcl = Math.max(prevIncl, prevExcl);
            prevIncl = curIncl;
            prevExcl = curExcl;
        }
        return Math.max(curIncl, curExcl);
    }
	
	/**
	 * Find k most frequent occurring elements in the array.
	 * 
	 */
	public List<Integer> kMostFrequent(int[] arr,  int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		List<Integer>[] freqMap = new List[n+1];
		
		for(int i=0; i<n; i++) {
			Integer val = map.get(arr[i]);
			if (val == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], val+1);
			}
		}
		
		for(Integer key : map.keySet()) {
			int freq = map.get(key);
			if (freqMap[freq] == null) {
				freqMap[freq] = new ArrayList();
			}
			freqMap[freq].add(key);
		}
		
		List<Integer> res = new ArrayList();
		for(int i=freqMap.length-1; i>=0; i--) {
			if (freqMap[i] != null) {
				res.addAll(freqMap[i]);
			}
		}
		
		return res.subList(0, k);
	}
	
	/**
	 * Add 2 numbers without using arithmetic operators.
	 *
	 */
	public int addNoArithmeticOperators(int x, int y) {
		int carry = 0;
		while(y != 0) {
            // carry now contains common
            // set bits of x and y
			carry = x & y;
            // Sum of bits of x and 
            // y where at least one 
            // of the bits is not set
			x = x ^ y;
            // Carry is shifted by 
            // one so that adding it 
            // to x gives the required sum
			y = carry << 1;
		}		
		return x;
	}
	
	/**
	 * Binary sum of 2 binary numbers provided as string input.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public String binarySum(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		int sum = 0;
		int carry = 0;
		
		StringBuilder sb = new StringBuilder();
		
		while(i>=0 || j>=0) {
			sum = carry;
			if (i>=0) {
				sum += a.charAt(i) - '0';
				i--;
			}
			if (j>=0) {
				sum += b.charAt(j) - '0';
				j--;
			}
			sb.append(sum%2);
			carry = sum/2;
		}
		if (carry != 0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}
	
	/**
	 * Find 2 nos. whose sum is closest to 0.
	 * 
	 */
	public NumPair twoNumbersSumToZero(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int minSum = Integer.MAX_VALUE;
		int sum = 0;
		NumPair pair = new NumPair();
		Arrays.sort(arr);
		
		while(i<j) {
			sum = arr[i] + arr[j];
			if (Math.abs(sum) < Math.abs(minSum)) {
				minSum = sum;
				pair.low = arr[i];
				pair.high = arr[j];
			}
			if (sum < 0) {
				i++;
			} else {
				j--;
			}
		}		
		return pair;	
	}
	
	private class NumPair {
		int low;
		int high;
	}

	/**
	 * Given a set, we need to find maximum and minimum possible product among all subsets of the set.
	 * 
	 * @param arr
	 * @return
	 */
	public Product maxMinProd(int[] arr) {
		int prevMaxProd = arr[0];
		int prevMinProd = arr[0];
		int curMaxProd = arr[0];
		int curMinProd = arr[0];
		int maxProd = arr[0];
		int minProd = arr[0];
		
		Product prod = new Product();
		
		for (int i=1; i<arr.length; i++) {
			/*
			 * Current maximum product is maximum of following 1) prevMax *
			 * curelement (when curelement is +ve) 2) prevMin * curelement (when
			 * curelement is -ve) 3) Element itself 4) Previous max product
			 */
			curMaxProd = Math.max(prevMaxProd*arr[i], Math.max(prevMinProd*arr[i], arr[i]));
			curMaxProd = Math.max(curMaxProd, prevMaxProd);
			
			curMinProd = Math.min(prevMinProd*arr[i], Math.min(prevMaxProd*arr[i], arr[i]));
			curMinProd = Math.min(curMinProd, prevMinProd);
			
			maxProd = Math.max(maxProd, curMaxProd);
			minProd = Math.max(minProd, curMinProd);
			
			prevMaxProd = curMaxProd;
			prevMinProd = curMinProd;
		}
		prod.maxProd = maxProd;
		prod.minProd = minProd;
		
		return prod;
	}
	
	private class Product {
		int maxProd;
		int minProd;
	}

	/**
	 * Given a set of integers, the task is to divide it into two sets S1 and S2
	 * such that the absolute difference between their sums is minimum.
	 * 
	 * If there is a set S with n elements, then if we assume Subset1 has m
	 * elements, Subset2 must have n-m elements and the value of
	 * abs(sum(Subset1) – sum(Subset2)) should be minimum.
	 * 
	 * @param arr
	 * @return
	 */
	public int partitionSubsets(int[] arr) {
		int sumTotal = 0;
		int n = arr.length;
		for (int i=0; i<n; i++) {
			sumTotal += arr[i];
		}
		return partitionUtil(arr, n, 0, sumTotal);
	}
	
	private int partitionUtil(int[] arr, int n, int curTotal, int sumTotal) {
		if (n == 0) {
			return Math.abs((sumTotal - curTotal) - curTotal);
		}
		
        // For every item arr[i], we have two choices
        // (1) We do not include it first set
        // (2) We include it in first set
        // We return minimum of two choices
		return Math.min(partitionUtil(arr, n-1, curTotal + arr[n-1], sumTotal), partitionUtil(arr, n-1, curTotal, sumTotal));
	}
	
	/**
	 * Given an array of integers nums and a positive integer k, 
	 * find whether it's possible to divide this array into k non-empty subsets whose sums are all equal.

		Example 1:
		
		Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
		Output: True
		Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.

	 * @param nums
	 * @param k
	 * @return
	 */
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            sum+=num;
        }
        
        if (sum%k !=0 || max > sum/k) {
            return false;
        }
        boolean[] visited = new boolean[nums.length];
        return canPartitionUtil(nums, k, 0, sum/k, visited, 0);
    }
    
    private boolean canPartitionUtil(int[] nums, int k, int curSum, int targetSum, boolean[] visited, int startIndex) {
        if (k == 0) {
            return true;
        }
        
        if (curSum == targetSum) {
            return canPartitionUtil(nums, k-1, 0, targetSum, visited, 0);   
        }
        
        for (int i=startIndex; i<nums.length; i++) {
            if (!visited[i] && nums[i]+curSum<=targetSum) {
                visited[i] = true;
                if (canPartitionUtil(nums, k, nums[i]+curSum, targetSum, visited, startIndex+1)) {
                    return true;
                }
                visited[i] = false;
            }    
        }
        return false;
    }
	
	public int rotatedBinarySearch(int[] arr, int key) {
		if (arr == null || arr.length == 0) {
			System.out.println("Invalid input.");
			return -1;
		}
		
		int n = arr.length;
		int pivot = findPivot(arr, 0, n-1);
		if (pivot == -1) { // Array is not rotated
			return binarySearch(arr, 0, n-1, key);
		}
		if (arr[pivot] == key) {
			return pivot;
		} else if (key < arr[0]) {
			return binarySearch(arr, pivot+1, n-1, key);
		} else {
			return binarySearch(arr, 0, pivot-1, key);
		}
	}
	
	private int findPivot(int[] arr, int l, int h) {
		if (h < l) {
			return -1;
		}
		
		int mid = (l + h)/2;
		if (mid < h && arr[mid] > arr[mid+1]) {
			return mid;
		}
		if (mid > l && arr[mid] < arr[mid-1]) {
			return mid-1;
		}
		if (arr[mid] <= arr[l]) {
			return findPivot(arr, l, mid-1);
		} else {
			return findPivot(arr, mid+1, h);
		}
	}
	
	private int binarySearch(int[] arr, int l, int h, int key) {
		if (h < l) {
			return -1;
		}
		
		int mid = (l + h)/2;
		if (arr[mid] == key) {
			return mid;
		} else if (key < arr[mid]) {
			return binarySearch(arr, l, mid-1, key);
		} else {
			return binarySearch(arr, mid+1, h, key);
		}
	}
	
	/**
	 * Given an array of integers nums sorted in ascending order, find the starting and ending position 
	 * of a given target value.

		If target is not found in the array, return [-1, -1].
		
		Input: nums = [5,7,7,8,8,10], target = 8
		Output: [3,4]
	 * @param nums
	 * @param target
	 * @return
	 */
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        
        int beginIndex = 0;
        int endIndex = nums.length - 1;
        
        int st = findStart(nums, target, beginIndex, endIndex);
        int end = findEnd(nums, target, beginIndex, endIndex);
        
        return new int[] {st, end};
    }
    
    private int findStart(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (mid > 0 && nums[mid] == target && nums[mid-1] != target) {
                return mid;
            } else if (mid > 0 && nums[mid] == target) {
                return findStart(nums, target, low, mid-1);
            } else if (mid == 0 && nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return findStart(nums, target, mid+1, high);
            } else {
                return findStart(nums, target, low, mid-1);
            }
        }
        return -1;
    }
    
    private int findEnd(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (mid < high && nums[mid] == target && nums[mid+1] != target) {
                return mid;
            } else if (mid < high && nums[mid] == target) {
                return findEnd(nums, target, mid+1, high);  
            } else if (mid == high && nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return findEnd(nums, target, mid+1, high);
            } else {
                return findEnd(nums, target, low, mid-1);
            }
        }
        return -1;
    }
	
	/**
	 * Given n non-negative integers representing an elevation map where the
	 * width of each bar is 1, compute how much water it is able to trap after
	 * raining.
	 * 
	 * Reference - https://leetcode.com/problems/trapping-rain-water/description/
	 * 
	 * @param arr
	 * @return
	 */
	public int trapRainWater(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = n-1;
		int maxleft = 0; 
		int maxright = 0;
		int res = 0;
		
		while(i<j) {
			if (arr[i] <= arr[j]) {
				if (arr[i] >= maxleft) {
					maxleft = arr[i];
				} else {
					res+=maxleft-arr[i];
				}
				i++;
			} else {
				if(arr[j] >= maxright) {
					maxright = arr[j];
				} else {
					res+=maxright-arr[j];
				}
				j--;
			}
		}
		return res;
	}
	
	/**
	 * You are given an n x n 2D matrix representing an image.
	 * 
	 * Rotate the image by 90 degrees (clockwise).
	 * 
	 * Given input matrix = [ [1,2,3], 
	 * 						  [4,5,6], 
	 * 					      [7,8,9] ],
	 * 
	 * rotate the input matrix in-place such that it becomes: [ [7,4,1],
	 * 															[8,5,2],
	 * 														    [9,6,3] ]
	 * 
	 * Reference - https://leetcode.com/problems/rotate-image/discuss/18872/A-common-method-to-rotate-the-image
	 * 
	 * 
	 * clockwise rotate
	 * first reverse up to down, then swap the symmetry 
	 * 1 2 3     7 8 9     7 4 1
	 * 4 5 6  => 4 5 6  => 8 5 2
	 * 7 8 9     1 2 3     9 6 3
	 * 
	 * 
	 * anticlockwise rotate
	 * first reverse left to right, then swap the symmetry
	 * 1 2 3     3 2 1     3 6 9
	 * 4 5 6  => 6 5 4  => 2 5 8
	 * 7 8 9     9 8 7     1 4 7

	 * 
	 * @param arr
	 */
	public void rotateMatrix90(int[][] arr) {
		int r = arr.length;
		
		int firstRow = 0;
		int lastRow = r-1;
		
		while(firstRow < lastRow) {
			int[] tmp = arr[firstRow];
			arr[firstRow] = arr[lastRow];
			arr[lastRow] = tmp;
			firstRow++;
			lastRow--;
		}
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<i; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}
	}
	
	/**
	 * Given n points on a 2D plane, find the maximum number of points that lie
	 * on the same straight line.
	 * 
	 * 
	 * A line is determined by two factors,say y=ax+b
	 * 
	 * If two points(x1,y1) (x2,y2) are on the same line(Of course).
	 * 
	 * Consider the gap between two points.
	 * 
	 * We have (y2-y1)=a(x2-x1),a=(y2-y1)/(x2-x1) a is a rational, b is canceled
	 * since b is a constant
	 * 
	 * If a third point (x3,y3) are on the same line. So we must have y3=ax3+b
	 * 
	 * Thus,(y3-y1)/(x3-x1)=(y2-y1)/(x2-x1)=a
	 * 
	 * Since a is a rational, there exists y0 and x0,
	 * y0/x0=(y3-y1)/(x3-x1)=(y2-y1)/(x2-x1)=a
	 * 
	 * So we can use y0&x0 to track a line;
	 * 
	 * @param arr
	 * @return
	 */
	public int maxPointsOnLine(int[][] arr) {
		int n = arr.length;
		Map<String, Integer> map = new HashMap<>();
		int res = 0;
			
		for(int i=0; i<n; i++) {
			int maxRes = 0;
			int overlap = 0;
			map.clear();
			for (int j=i+1; j<n; j++) {
				int x1 = arr[i][0];
				int x2 = arr[j][0];
				int y1 = arr[i][1];
				int y2 = arr[j][1];
				
				int x = x1-x2;
				int y = y1-y2;
				
				if (x==0 && y==0) {
					overlap++;
					continue;
				}
				
				int gcd = gcd(x, y); // gcd will never be zero
				
				x = x/gcd;
				y = y/gcd;
				
				String key = x+":"+y;
				Integer val = map.get(key);
				if (val == null) {
					map.put(key, 1);
				} else {
					map.put(key, val+1);
				}
				maxRes = Math.max(maxRes, map.get(key));
			}
			res = Math.max(maxRes + overlap + 1, res);
		}
		return res;
	}
	
	private int gcd(int a, int b) {
		if (b==0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
	/**
	 * Place n queens on a n*n chess board such that they do not collide with each other.
	 * 
	 * @param n
	 */
	public void placeNQueens(int n) {
		List<Integer[]> res = new ArrayList<>();
		Integer[] columns = new Integer[n];
		placeNQueensUtil(n, 0, columns, res);
		System.out.println("Queen positions: ");
		for (Integer[] each : res) {
			for (int pos : each) {
				System.out.print(pos + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private void placeNQueensUtil(int n, int row, Integer[] columns, List<Integer[]> res) {
		if (row == n) {
			res.add(columns.clone());
			return;
		}
		for (int col=0; col<n; col++) {
			if (checkValidPos(columns, row, col)) {
				columns[row] = col;
				placeNQueensUtil(n, row+1, columns, res);
			}
		}
	}
	
	private boolean checkValidPos(Integer[] columns, int row1, int col1) {
		for (int row2 = 0; row2 < row1; row2++) {
			int col2 = columns[row2];
			// check previous row's queen position
			if (col2 == col1) {
				return false;
			}
			// check diagonal - if distance bw rows == dist bw columns, then
			// they are on the same diagonal
			int col = Math.abs(col1 - col2);
			int row = row1 - row2;

			if (row - col == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

		Integers in each row are sorted in ascending from left to right.
		Integers in each column are sorted in ascending from top to bottom.
		For example,
		
		Consider the following matrix:
		
		[
		  [1,   4,  7, 11, 15],
		  [2,   5,  8, 12, 19],
		  [3,   6,  9, 16, 22],
		  [10, 13, 14, 17, 24],
		  [18, 21, 23, 26, 30]
		]
		Given target = 5, return true.
		
		Given target = 20, return false.
		
		We can rule out one row or one column each time, so the time complexity is O(m+n).
	 * @param arr
	 * @param key
	 * @return
	 */
	public boolean search2DMatrix(int[][] arr, int key) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		
		int m = arr.length;
		int n = arr[0].length;
		int r = 0;
		int c = n-1;
		while (r<m && c>=0) {
			if (key == arr[r][c]) {
				return true;
			} else if (key < arr[r][c]) {
				c--;
			} else {
				r++;
			}
		}
		return false;
	}
	
	/**
	 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing
	 * only 1's and return its area.

		For example, given the following matrix:
		
		1 0 1 0 0
		1 0 1 1 1
		1 1 1 1 1
		1 0 0 1 0
		Return 4.
	 * @param arr
	 * @return
	 */
	public int maximalSquare(int[][] arr) {
		if (arr == null || arr.length == 0 || arr[0].length == 0) {
			return 0;
		}
		int m = arr.length;
		int n = arr[0].length;
		int[][] b = new int[m+1][n+1];
		int res = 0;
		
		for(int i=1; i<m+1; i++) {
			for (int j=1; j<n+1; j++) {
				if (arr[i-1][j-1] == 1) {
					b[i][j] = Math.min(b[i][j-1], Math.min(b[i-1][j-1], b[i-1][j])) + 1;
					res = Math.max(res, b[i][j]);
				}
			}
		}
		return res*res;
	}
	
	/**
	 * A zero-indexed array A of length N contains all integers from 0 to N-1. 
	 * Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } 
	 * subjected to the rule below.

		Suppose the first element in S starts with the selection of element A[i] of index = i,
		the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy,
		we stop adding right before a duplicate element occurs in S.
		
		Example 1:
		Input: A = [5,4,0,3,1,6,2]
		Output: 4
		Explanation: 
		A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
		
		One of the longest S[K]:
		S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
	 * @param arr
	 * @return
	 */
	public int arrayNestingSize(int[] arr) {
		int n = arr.length;
		int maxSize = 0;
		
		for(int i=0; i<n; i++) {
			int size = 0;
			for (int j=i; arr[j]>=0; size++) {
				int k = arr[j];
				arr[j] = -1;
				j = k;
			}
			maxSize = Math.max(maxSize, size);
		}
		return maxSize;
	}
	
	/**
	 * Compare version numbers represented as string. Compare two version
	 * numbers version1 and version2. If version1 > version2 return 1, if
	 * version1 < version2 return -1, otherwise return 0.
	 * 
	 * @param ver1
	 * @param ver2
	 * @return
	 */
	public int compareVersionNumbers(String ver1, String ver2) {
		String[] verNum1 = ver1.split("\\.");
		String[] verNum2 = ver2.split("\\.");
		
		int length1 = verNum1.length;
		int length2 = verNum2.length;
		
		int maxLen = Math.max(length1, length2);
		
		for(int i=0; i<maxLen; i++) {
			Integer num1 = i>length1? 0 : Integer.parseInt(verNum1[i]);
			Integer num2 = i>length2? 0 : Integer.parseInt(verNum2[i]);
			if (num1 != num2) {
				return num1.compareTo(num2);
			}
		}	
		return 0;		
	}
	
	/**
	 * Given the running logs of n functions that are executed in a
	 * nonpreemptive single threaded CPU, find the exclusive time of these
	 * functions.
	 * 
	 * Each function has a unique id, start from 0 to n-1. A function may be
	 * called recursively or by another function.
	 * 
	 * A log is a string has this format : function_id:start_or_end:timestamp.
	 * For example, "0:start:0" means function 0 starts from the very beginning
	 * of time 0. "0:end:0" means function 0 ends to the very end of time 0.
	 * 
	 * Exclusive time of a function is defined as the time spent within this
	 * function, the time spent by calling other functions should not be
	 * considered as this function's exclusive time. You should return the
	 * exclusive time of each function sorted by their function id.
	 * 
	 * Example 1: Input: n = 2 logs = ["0:start:0", "1:start:2", "1:end:5",
	 * "0:end:6"] Output:[3, 4] Explanation: Function 0 starts at time 0, then
	 * it executes 2 units of time and reaches the end of time 1. Now function 0
	 * calls function 1, function 1 starts at time 2, executes 4 units of time
	 * and end at time 5. Function 0 is running again at time 6, and also end at
	 * the time 6, thus executes 1 unit of time. So function 0 totally execute 2
	 * + 1 = 3 units of time, and function 1 totally execute 4 units of time.
	 * 
	 * @param n
	 * @param logs
	 * @return
	 */
	public int[] exclusiveTime(int n, List<String> logs) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[n];
		int prevTime = 0;
		for (String log : logs) {
			String[] parts = log.split(":");
			if (!st.isEmpty()) {
				res[st.peek()] += Integer.parseInt(parts[2]) - prevTime;
			}
			prevTime = Integer.parseInt(parts[2]);
			if (parts[1].equals("start")) {
				st.push(Integer.parseInt(parts[0]));
			} else {
				res[st.pop()]++;
				prevTime++;
			}
		}
		return res;
	}
	
	/**
	 * 
	 * On an infinite number line (x-axis), we drop given squares in the order
	 * they are given.
	 * 
	 * The i-th square dropped (positions[i] = (left, side_length)) is a square
	 * with the left-most point being positions[i][0] and sidelength
	 * positions[i][1].
	 * 
	 * The square is dropped with the bottom edge parallel to the number line,
	 * and from a higher height than all currently landed squares. We wait for
	 * each square to stick before dropping the next.
	 * 
	 * The squares are infinitely sticky on their bottom edge, and will remain
	 * fixed to any positive length surface they touch (either the number line
	 * or another square). Squares dropped adjacent to each other will not stick
	 * together prematurely.
	 * 
	 * 
	 * Return a list ans of heights. Each height ans[i] represents the current
	 * highest height of any square we have dropped, after dropping squares
	 * represented by positions[0], positions[1], ..., positions[i].
	 * 
	 * Input: [[1, 2], [2, 3], [6, 1]]
			Output: [2, 5, 5]
			Explanation:
			
			After the first drop of positions[0] = [1, 2]:
			_aa
			_aa
			-------
			The maximum height of any square is 2.
			
			
			After the second drop of positions[1] = [2, 3]:
			__aaa
			__aaa
			__aaa
			_aa__
			_aa__
			--------------
			The maximum height of any square is 5.  
			The larger square stays on top of the smaller square despite where its center
			of gravity is, because squares are infinitely sticky on their bottom edge.
			
			
			After the third drop of positions[1] = [6, 1]:
			__aaa
			__aaa
			__aaa
			_aa
			_aa___a
			--------------
			The maximum height of any square is still 5.
			
			Thus, we return an answer of [2, 5, 5].
	 * 
	 * @param positions
	 * @return
	 */
	public List<Integer> fallingSquares(int[][] positions) {
		int n = positions.length;
		List<Integer> res = new ArrayList<>();
		List<Inter> intervals = new ArrayList<>();
		int max = 0;
		for (int i=0; i<n; i++) {
			Inter cur = new Inter(positions[i][0], positions[i][1]+positions[i][0], positions[i][1]);
			max = Math.max(getMaxHeight(intervals, cur), max);
			res.add(max);
		}
		
		return res;
	}
	
	private int getMaxHeight(List<Inter> intervals, Inter cur) {		
		int prevMaxHeight = 0;
		for (Inter inter: intervals) {
			// no overlap
			if (inter.end <= cur.start) {
				continue;
			}
			// no overlap
			if (inter.start >= cur.end) {
				continue;
			}
			prevMaxHeight = Math.max(inter.height, prevMaxHeight);
		}
		cur.height += prevMaxHeight;
		intervals.add(cur);
		return cur.height;	
	}
	
	private class Inter {
		int start;
		int end;
		int height;
		
		public Inter(int start, int end, int height) {
			this.start = start;
			this.end = end;
			this.height = height;
		}
	}
	
	/**
	 * Convert a roman numeral representation to integer.
	 * 
	 * Input: "MCMXCIV" Output: 1994 
	 * Explanation: M = 1000, CM = 900, XC = 90
	 * and IV = 4.
	 * 
	 * @param str
	 * @return
	 */
	public int romanToInteger(String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}
		
		int sum = 0;
		for (int i=0; i<str.length()-1; i++) {
			if (getNumericValue(str.charAt(i)) >= getNumericValue(str.charAt(i+1))) {
				sum += getNumericValue(str.charAt(i));
			} else {
				sum -= getNumericValue(str.charAt(i));
			}
		}
		sum += getNumericValue(str.charAt(str.length()-1));
		return sum;
	}

	private int getNumericValue(char ch) {
		int val  = 0;
		switch(ch) {
		case 'I':
			val = 1;
			break;
		case 'V':
			val = 5;
			break;
		case 'X':
			val = 10;
			break;
		case 'L':
			val = 50;
			break;
		case 'C':
			val =100;
			break;
		case 'D':
			val = 500;
			break;
		case 'M':
			val = 1000;
			break;
		}
		return val;
	}
	
	/**
	 * Integer to roman.
	 * 
	 * @param num
	 * @return
	 */
    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }
      
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        int i = 0;
        int rem = 0;
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            rem = num % 10;
            if (i == 0) {
                res.insert(0, units[rem]);
            }
            if (i == 1) {
                res.insert(0, tens[rem]);
            }
            if (i == 2) {
                res.insert(0, hundreds[rem]);
            }
            if (i == 3) {
                res.insert(0, thousands[rem]);
            }
            i++;
            num = num/10;
        }
        
        return res.toString();
    }
	
	/**
	 * 
	 * Given a matrix of m x n elements (m rows, n columns), return all elements
	 * of the matrix in spiral order.
	 * 
	 * Example 1:
	 * 
	 * Input: [ [ 1, 2, 3 ], 
	 * 			[ 4, 5, 6 ], 
	 * 			[ 7, 8, 9 ] ] 
	 * Output:
	 * [1,2,3,6,9,8,7,4,5]
	 * 
	 * @param arr
	 * @return
	 */
	public List<Integer> spiralMatrix(int[][] arr) {
		if (arr == null) {
			return Collections.emptyList();
		}
		int m = arr.length;
		int n = arr[0].length;
		
		if (m == 0) {
			return Collections.emptyList();
		}
		
		int rowBegin = 0;
		int rowEnd = m-1;
		int colBegin = 0;
		int colEnd = n-1;
		List<Integer> res = new ArrayList<>();
		
		while(rowBegin<=rowEnd && colBegin<=colEnd) {
			for (int i=colBegin; i<=colEnd; i++) {
				res.add(arr[rowBegin][i]);
			}
			rowBegin++;
			for (int i=rowBegin; i<=rowEnd; i++) {
				res.add(arr[i][colEnd]);
			}
			colEnd--;
			for (int i=colEnd; i>=colBegin && rowBegin<=rowEnd; i--) {
				res.add(arr[rowEnd][i]);
			}
			rowEnd--;
			for (int i=rowEnd; i>=rowBegin && colBegin<=colEnd; i--) {
				res.add(arr[i][colBegin]);
			}
			colBegin++;
		}
		return res;
	}
	
	/**
	 * You have k lists of sorted integers in ascending order. Find the smallest
	 * range that includes at least one number from each of the k lists.
	 * 
	 * We define the range [a,b] is smaller than range [c,d] if b-a < d-c or a <
	 * c if b-a == d-c.
	 * 
	 * Example 1: Input:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]] Output:
	 * [20,24] Explanation: List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
	 * List 2: [0, 9, 12, 20], 20 is in range [20,24]. List 3: [5, 18, 22, 30],
	 * 22 is in range [20,24].
	 * 
	 * @param nums
	 * @return
	 */
    public int[] smallestRange(List<List<Integer>> nums) {
        Queue<Element> pq = new PriorityQueue<>(new Comparator<Element>() {
        	public int compare(Element e1, Element e2) {
        		return e1.value - e2.value;
        	}
        });
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.size(); i++) {
        	int val = nums.get(i).get(0);
            Element ele = new Element(i, 0, val);
            max = Math.max(max, val);
            pq.offer(ele);
        }
        int range = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        while(pq.size() == nums.size()) {
        	Element ele = pq.poll();
        	if (max-ele.value < range) {
        		range = max-ele.value;
        		start = ele.value;
        		end = max;
        	}
        	if (ele.index+1 < nums.get(ele.row).size()) {
        		Element e = new Element(ele.row, ele.index+1, nums.get(ele.row).get(ele.index+1));
        		pq.offer(e);
        		if (e.value > max) {
        			max = e.value;
        		}
        	}
        }
        return new int[] {start, end};
    }
    
    public class Element {
        private int row;
        private int index;
        private int value;
        
        public Element(int row, int index, int value) {
            this.row = row;
            this.index = index;
            this.value = value;
        }     
    }
    
    /**
	 * Given a non-empty array of digits representing a non-negative integer,
	 * plus one to the integer.
	 * 
	 * The digits are stored such that the most significant digit is at the head
	 * of the list, and each element in the array contain a single digit.
	 * 
	 * You may assume the integer does not contain any leading zero, except the
	 * number 0 itself.
	 * 
	 * Example 1:
	 * 
	 * Input: [1,2,3] Output: [1,2,4] Explanation: The array represents the
	 * integer 123.
	 * 
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i=n-1; i>=0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
                return digits;
			} else {
				digits[i] = 0;
			}
		}
		
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
	}
	
	/**
	 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

		If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
		
		The replacement must be in-place and use only constant extra memory.
		
		Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
		
		1,2,3 → 1,3,2
		3,2,1 → 1,2,3
		1,1,5 → 1,5,1
		
		According to Wikipedia, a man named Narayana Pandita presented the following simple algorithm to solve this problem in the 14th century.

		Find the largest index k such that nums[k] < nums[k + 1]. If no such index exists, just reverse nums and done.
		Find the largest index l > k such that nums[k] < nums[l].
		Swap nums[k] and nums[l].
		Reverse the sub-array nums[k + 1:].
	 * @param nums
	 */
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int i = 0;
        for (i=nums.length-1; i>0; i--) {
            if (nums[i] > nums[i-1]) {
                break;
            }
        }
        if (i==0) {
            Arrays.sort(nums);
            return;
        }
        
        for (int j=nums.length-1; j>i-1; j--) {
            if (nums[j] > nums[i-1]) {
                swap(nums, i-1, j);
                break;
            }
        }
        int j = nums.length-1;
        while (i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int a , int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
	
	private void swap(StringBuilder str, int i, int j) {
		char tmp = str.charAt(i);
		str.setCharAt(i, str.charAt(j));
		str.setCharAt(j, tmp);
	}
	
	/**
	 * Validate if a given string can be interpreted as a decimal number.

		Some examples:
		"0" => true
		" 0.1 " => true
		"abc" => false
		"1 a" => false
		"2e10" => true
		" -90e3   " => true
		" 1e" => false
		"e3" => false
		" 6e-1" => true
		" 99e2.5 " => false
		"53.5e93" => true
		" --6 " => false
		"-+3" => false
		"95a54e53" => false
	 * @param s
	 * @return
	 */
	public boolean isValidNumber(String s) {
		boolean pointSeen = false;
		boolean eSeen = false;
		boolean numSeen = false;
		boolean numAfterE = false;
		
		s = s.trim();
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				numSeen = true;
				numAfterE = true;
			}else if (s.charAt(i) == '.') {
				if (pointSeen || eSeen) {
					return false;
				}
				pointSeen = true;
			} else if (s.charAt(i) == 'e') {
				if (eSeen || !numSeen) {
					return false;
				}
				eSeen = true;
				numAfterE = false;
			} else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
				if (i != 0 && s.charAt(i-1) != 'e') {
					return false;
				}
			} else {
				return false;
			}
		}
		
		return numSeen && numAfterE;
	}
	
	/**
	 * You have a number of envelopes with widths and heights given as a pair of integers (w, h). One envelope can fit into another if and only if both the width and height of one envelope is greater than the width and height of the other envelope.

		What is the maximum number of envelopes can you Russian doll? (put one inside other)
		
		Note:
		Rotation is not allowed.
		
		Example:
		
		Input: [[5,4],[6,4],[6,7],[2,3]]
		Output: 3 
		Explanation: The maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
	 * @param envelopes
	 * @return
	 */
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) {
        	return 0;
        }
        if (envelopes.length == 1) {
        	return 1;
        }
        // Sort the width in ascending order and if the width is same, sort the height in descending order
        Arrays.sort(envelopes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o2[1] - o1[1];
				} 
				return o1[0] - o2[0];
			}
        });
        
        // find longest increasing subsequence on the height values only
        int[] heights = new int[envelopes.length];
        int[] lis = new int[envelopes.length];
        for (int i=0; i<envelopes.length; i++) {
        	heights[i] = envelopes[i][1];
        	lis[i] = 1;
        }
        
        int max = 1;
        for (int i=1; i<envelopes.length; i++) {
        	for (int j=0; j<i; j++) {
        		if (heights[i] > heights[j] && lis[i] < lis[j]+1) {
        			lis[i] = lis[j] + 1;
        			max = Math.max(max, lis[i]);
        		}
        	}
        }       
        return max;
    }
    
	/**
	 * There are a row of n houses, each house can be painted with one of the
	 * three colors: red, blue or green. The cost of painting each house with a
	 * certain color is different. You have to paint all the houses such that no
	 * two adjacent houses have the same color.
	 * 
	 * The cost of painting each house with a certain color is represented by a
	 * n x 3 cost matrix. For example, costs[0][0] is the cost of painting house
	 * 0 with color red; costs[1][2] is the cost of painting house 1 with color
	 * green, and so on... Find the minimum cost to paint all houses.
	 * 
	 * @param costs
	 * @return
	 */
    public int minCostPaintHouses(int[][] costs) {
        if (costs == null || costs.length == 0 || costs[0].length != 3) {
            return 0;
        }
        
        int n = costs.length; // no. of houses
        
        for (int i=1; i<n; i++) {
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
        }
        return Math.min(costs[n-1][0], Math.min(costs[n-1][1], costs[n-1][2]));
    }
    
    /**
	 * Generic version of the above problem. There are a row of n houses, each
	 * house can be painted with one of the k colors. The cost of painting each
	 * house with a certain color is different. You have to paint all the houses
	 * such that no two adjacent houses have the same color.
	 * 
	 * The cost of painting each house with a certain color is represented by a
	 * n x k cost matrix. For example, costs[0][0] is the cost of painting house
	 * 0 with color 0; costs[1][2] is the cost of painting house 1 with color 2,
	 * and so on... Find the minimum cost to paint all houses.
	 * 
	 * @param costs
	 * @return
	 */
    public int minCostII(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        
        for (int i=1; i<costs.length; i++) {
            for (int j=0; j<costs[0].length; j++) {
                costs[i][j] += findMin(costs, i-1, j);
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<costs[0].length; i++) {
            if (min > costs[costs.length-1][i]) {
                min = costs[costs.length-1][i];
            }
        }
        return min;
    }
    
    private int findMin(int[][] costs, int i, int j) {
        int min = Integer.MAX_VALUE;
        for (int k=0; k<costs[0].length; k++) {
            if (k != j) {
                if (min > costs[i][k]) {
                    min = costs[i][k];
                }
            }
        }
        return min;
    }
    
    /**
     * Given a triangle, find the minimum path sum from top to bottom. 
     * Each step you may move to adjacent numbers on the row below.

		For example, given the following triangle
		
		[
		     [2],
		    [3,4],
		   [6,5,7],
		  [4,1,8,3]
		]
		The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] res = new int[triangle.get(n-1).size()];
        for (int i=0; i<res.length; i++) {
            res[i] = triangle.get(n-1).get(i);
        }
        for (int i=n-2; i>=0; i--) {
            List<Integer> list = triangle.get(i);
            for (int j=0; j<list.size(); j++) {
                res[j] = list.get(j) + Math.min(res[j], res[j+1]);
            }
        }
        return res[0];
    }
    
    /**
     * We are given an array asteroids of integers representing asteroids in a row.

		For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
		
		Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
		
		Example 1:
		Input: 
		asteroids = [5, 10, -5]
		Output: [5, 10]
		Explanation: 
		The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.
		Example 2:
		Input: 
		asteroids = [8, -8]
		Output: []
		Explanation: 
		The 8 and -8 collide exploding each other.
		Example 3:
		Input: 
		asteroids = [10, 2, -5]
		Output: [10]
		Explanation: 
		The 2 and -5 collide resulting in -5.  The 10 and -5 collide resulting in 10.
		Example 4:
		Input: 
		asteroids = [-2, -1, 1, 2]
		Output: [-2, -1, 1, 2]
		Explanation: 
		The -2 and -1 are moving left, while the 1 and 2 are moving right.
		Asteroids moving the same direction never meet, so no asteroids will meet each other.
     * @param asteroids
     * @return
     */
    public int[] asteroidCollision(int[] asteroids) {
    	int [] result = {};
        if (asteroids == null || asteroids.length == 0) {
            return result;
        }
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<asteroids.length; i++) {
            if (asteroids[i] > 0 || res.isEmpty() || res.get(res.size()-1) < 0) {
                res.add(asteroids[i]);
            } else {
            	if (-asteroids[i] >= res.get(res.size()-1)) {
            		if (-asteroids[i] > res.remove(res.size()-1)) {
            			i--;
            		}
            	}
            }
        }
        int[] finalResult = new int[res.size()];
        for (int i=0; i<res.size(); i++) {
        	finalResult[i] = res.get(i);
        }
        return finalResult;
    }
    
    /**
     * Search for target in a sorted array of unknown size.
     * Given an integer array sorted in ascending order, write a function to search target in nums.  If target exists, then return its index, otherwise return -1. However, the array size is unknown to you. You may only access the array using an ArrayReader interface, where ArrayReader.get(k) returns the element of the array at index k (0-indexed).

		You may assume all integers in the array are less than 10000, and if you access the array out of bounds, ArrayReader.get will return 2147483647.
		
		 
		
		Example 1:
		
		Input: array = [-1,0,3,5,9,12], target = 9
		Output: 4
		Explanation: 9 exists in nums and its index is 4
     * @param reader
     * @param target
     * @return
     */
    /** - Below code is commented as ArrayReader interface in not implemented.
    public int search(ArrayReader reader, int target) {
        int i = 1;
        while(reader.get(i) < target) {
            i = i << 1;
        }
        int hi = i;
        int lo = i >> 1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (reader.get(mid) == target) {
                return mid;
            } else if (reader.get(mid) > target) {
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return -1;
    }
    */
    
    /**
	 * 3sum Given an array nums of n integers, are there elements a, b, c in
	 * nums such that a + b + c = 0? Find all unique triplets in the array which
	 * gives the sum of zero.
	 * 
	 * Note:
	 * 
	 * The solution set must not contain duplicate triplets.
	 * 
	 * @param num
	 * @return
	 */
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>(); 
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
               }
            }
        }
        return res;
    }
    
    /**
     * Random pick with weighted index.
     * Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.

			Note:
			
			1 <= w.length <= 10000
			1 <= w[i] <= 10^5
			pickIndex will be called at most 10000 times.

     */
    Random rand;
    int[] sum;
    public NumberImpl(int[] w) {
        for (int i=1; i<w.length; i++) {
            w[i] += w[i-1];
        }
        sum = w;
        rand = new Random();
    }
    
    public int pickIndex() {
        int index = rand.nextInt(sum[sum.length-1])+1;
        int lo = 0;
        int hi = sum.length-1;
        
        while(lo < hi) {
            int mid = lo + (hi-lo)/2;
            if (sum[mid] == index) {
                return mid;
            } else if (index > sum[mid]) {
                lo = mid+1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
    
	/**
	 * Given an integer array, find number of ways to calculate a target number
	 * using only array elements and addition or subtraction operator.
	 * 
	 * @param arr
	 * @param target
	 * @return
	 */
    public int findWaysToTarget(int[] arr, int target) {
    	return findWaysToTargetUtil(arr, arr.length, target);
    }
    
    private int findWaysToTargetUtil(int[] arr, int n, int target) {
    	if (n<=0 && target != 0) {
    		return 0;
    	}
    	if (target == 0) {
    		return 1;
    	}
        // Return total count of three cases 
        // 1. Don't consider current element 
        // 2. Consider current element and subtract it from target 
        // 3. Consider current element and add it to target
    	return findWaysToTargetUtil(arr, n-1, target-arr[n-1]) + 
    			findWaysToTargetUtil(arr, n-1, target+arr[n-1]) +
    			findWaysToTargetUtil(arr, n-1, target);
    }
    
    /**
     * Write an algorithm to determine if a number is "happy".

		A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
		
		Example: 
		
		Input: 19
		Output: true
		Explanation: 
		1^2 + 9^2 = 82
		8^2 + 2^2 = 68
		6^2 + 8^2 = 100
		1^2 + 0^2 + 0^2 = 1
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int sum = 0;
            while (n > 0) {
                int rem = n%10;
                sum+= (rem*rem);
                n = n/10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
        }
        return false;
    }
    
    /**
	 * Suppose you have a long flowerbed in which some of the plots are planted
	 * and some are not. However, flowers cannot be planted in adjacent plots -
	 * they would compete for water and both would die.
	 * 
	 * Given a flowerbed (represented as an array containing 0 and 1, where 0
	 * means empty and 1 means not empty), and a number n, return if n new
	 * flowers can be planted in it without violating the no-adjacent-flowers
	 * rule.
	 * 
	 * Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: True Example 2:
	 * Input: flowerbed = [1,0,0,0,1], n = 2 Output: False
	 * 
	 * @param flowerbed
	 * @param n
	 * @return
	 */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        
        int cnt = 0;
        for (int i=0; i<flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = i>0?flowerbed[i-1]:0;
                int next = i<(flowerbed.length-1)?flowerbed[i+1]:0;
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    cnt++;
                }
            }
        }
        return cnt >= n;
    }
    
    /**
     * A frog is crossing a river. The river is divided into x units and at each unit there may or may not exist a stone. The frog can jump on a stone, but it must not jump into the water.

		Given a list of stones' positions (in units) in sorted ascending order, determine if the frog is able to cross the river by landing on the last stone. Initially, the frog is on the first stone and assume the first jump must be 1 unit.
		
		If the frog's last jump was k units, then its next jump must be either k - 1, k, or k + 1 units. Note that the frog can only jump in the forward direction.
		
		Example 1:
		
		[0,1,3,5,6,8,12,17]
		
		There are a total of 8 stones.
		The first stone at the 0th unit, second stone at the 1st unit,
		third stone at the 3rd unit, and so on...
		The last stone at the 17th unit.
		
		Return true. The frog can jump to the last stone by jumping 
		1 unit to the 2nd stone, then 2 units to the 3rd stone, then 
		2 units to the 4th stone, then 3 units to the 6th stone, 
		4 units to the 7th stone, and 5 units to the 8th stone.
		Example 2:
		
		[0,1,2,3,4,8,9,11]
		
		Return false. There is no way to jump to the last stone as 
		the gap between the 5th and 6th stone is too large.
     * @param stones
     * @return
     */
    public boolean canCross(int[] stones) {
        if (stones == null | stones.length == 0) {
            return false;
        }
        
        Map<Integer, Set<Integer>> map = new HashMap<>();
        map.put(0, new HashSet<Integer>());
        map.get(0).add(1);
        
        for (int i=1; i<stones.length; i++) {
            map.put(stones[i], new HashSet<Integer>());
        }
        
        for (int i=0; i<stones.length-1; i++) {
            int stone = stones[i];
            for (Integer key : map.get(stone)) {
                int reach = stone + key;
                if (reach == stones[stones.length-1]) {
                    return true;
                }
                Set<Integer> set = map.get(reach);
                if (set != null) {
                    // stone can be reached
                    set.add(key);
                    if (key-1 > 0) {
                        set.add(key-1);
                    }
                    set.add(key+1);
                }
            }
        }
        return false;
    }
    
    /**
     * Given an array of non-negative integers, you are initially positioned at the first index of the array.

		Each element in the array represents your maximum jump length at that position.
		
		Determine if you are able to reach the last index.
		
		Example 1:
		
		Input: [2,3,1,1,4]
		Output: true
		Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
		Example 2:
		
		Input: [3,2,1,0,4]
		Output: false
		Explanation: You will always arrive at index 3 no matter what. Its maximum
		             jump length is 0, which makes it impossible to reach the last index.
     */
    public boolean canJump(int[] nums) {
    	if (nums == null || nums.length == 0) {
    		return false;
    	}
    	
    	if (nums.length == 1) {
    		return true;
    	}
    	
    	int reach = 0;
    	int i = 0;
    	for (i=0; i<nums.length && reach >= i; i++) {
    		reach = Math.max(i+nums[i], reach);
    	}
    	
    	return i==nums.length;
    }
    
	/**
	 * Sparse matrix multiplication. Given two sparse matrices A and B, return
	 * the result of AB.
	 * 
	 * You may assume that A's column number is equal to B's row number.
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
    public int[][] multiply(int[][] A, int[][] B) {
        int mA = A.length;
        int nA = A[0].length;
        int nB = B[0].length;
        
        int[][] C = new int[mA][nB];
        
        for (int i=0; i<mA; i++) {
            for (int k=0; k<nA; k++) {
                if (A[i][k] != 0) {
                    for (int j=0; j<nB; j++) {
                        if (B[k][j] != 0) {
                            C[i][j] += A[i][k]*B[k][j];   
                        }
                    }   
                }
            }
        }
        return C;
    }
    
    /**
     * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.

		Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
		 
		
		Example 1:
		
		Input:
		matrix = [
		  [1,2,3,4],
		  [5,1,2,3],
		  [9,5,1,2]
		]
		Output: True
		Explanation:
		In the above grid, the diagonals are:
		"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
		In each diagonal all elements are the same, so the answer is True.
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (i-1 < 0 || j-1 < 0) {
                    continue;
                }
                if (matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
     * Input: 5
		Output:
		[
		     [1],
		    [1,1],
		   [1,2,1],
		  [1,3,3,1],
		 [1,4,6,4,1]
		]
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        
        for (int i=0; i<=numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j=0; j<i; j++) {
                if (j==0 || j==i-1) {
                    tmp.add(1);
                } else {
                    tmp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(tmp);
        }
        return res.subList(1, res.size());
    }
    
    /**
     * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

		Note: The algorithm should run in linear time and in O(1) space.
		
		Example 1:
		
		Input: [3,2,3]
		Output: [3]
		Example 2:
		
		Input: [1,1,1,3,3,2,2,2]
		Output: [1,2]
	 * Note: Refer to Boyer-Moore majority vote algorithm.
     * @param nums
     * @return
     */
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int num1 = nums[0];
        int num2 = nums[0];
        
        for (int num : nums) {
            if (num == num1) {
                cnt1++;
            } else if (num == num2) {
                cnt2++;
            } else if (cnt1 == 0) {
                cnt1++;
                num1 = num;
            } else if (cnt2 == 0) {
                cnt2++;
                num2 = num;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (num == num1) {
                cnt1++;
            } else if (num == num2) {
                cnt2++;
            }
        }
        
        if (cnt1 > nums.length/3) {
            res.add(num1);
        }
        if (cnt2 > nums.length/3) {
            res.add(num2);
        }
        return res;
    }
    
    /**
     * Given a list of non-negative numbers and a target integer k, 
     * write a function to check if the array has a continuous subarray of 
     * size at least 2 that sums up to a multiple of k, that is, sums up to 
     * n*k where n is also an integer.
     * 
     * Note: Solution help:
     * For e.g. in case of the array [23,2,6,4,7] the running sum is [23,25,31,35,42] 
     * and the remainders are [5,1,1,5,0]. We got remainder 5 at index 0 and at index 3. 
     * That means, in between these two indexes we must have added a number which is multiple of the k. 
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int rem = 0;
        map.put(0, -1); // This ensures if second element adds up to remainder of 0
        for (int i=0; i<nums.length; i++) {
            sum+=nums[i];
            if (k!=0) {
                sum = sum%k;
            }
            Integer index = map.get(sum);
            if (index != null) {
                if(i - index >1) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
    
    /**
     * Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. 
     * Return the maximum valued number you could get.

		Example 1:
		Input: 2736
		Output: 7236
		Explanation: Swap the number 2 and the number 7.
		Example 2:
		Input: 9973
		Output: 9973
		Explanation: No swap.
     * @param num
     * @return
     */
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int[] buckets = new int[10];
        
        for (int i=0; i<digits.length; i++) {
            buckets[digits[i]-'0'] = i;
        }
        
        for (int i=0; i<digits.length; i++) {
            for (int k=9;  k>digits[i]-'0'; k--) {
                if (buckets[k] > i) {
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.parseInt(String.valueOf(digits));
                }
            }
        }
        
        return num;
    }
    
    /**
     * Union-find algorithm.
     * Given a list accounts, each element accounts[i] is a list of strings, where the first element accounts[i][0] 
     * is a name, and the rest of the elements are emails representing emails of the account.

       Now, we would like to merge these accounts. Two accounts definitely belong to the same person if there is some 
       email that is common to both accounts. Note that even if two accounts have the same name, they may belong to 
       different people as people could have the same name. A person can have any number of accounts initially, 
       but all of their accounts definitely have the same name.

      After merging the accounts, return the accounts in the following format: the first element of each account is the 
      name, and the rest of the elements are emails in sorted order. The accounts themselves can be returned in any 
      order.

	Example 1:
	Input: 
	accounts = [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], 
	["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]
	Output: [["John", 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com'], 
	["John", "johnnybravo@mail.com"], ["Mary", "mary@mail.com"]]
	Explanation: 
	The first and third John's are the same person as they have the common email "johnsmith@mail.com".
	The second John and Mary are different people as none of their email addresses are used by other accounts.
	We could return these lists in any order, for example the answer [['Mary', 'mary@mail.com'], 
	['John', 'johnnybravo@mail.com'], 
	['John', 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com']] would still be accepted.
     * @param accounts
     * @return
     */
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        if (accounts == null || accounts.size() == 0) {
            return new ArrayList<List<String>>();
        }
        
        int[] parents = new int[accounts.size()];
        
        for (int i=0; i<accounts.size(); i++) {
            parents[i] = i;    
        }
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<accounts.size(); i++) {
            for (int j=1; j<accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                Integer index = map.get(email);
                if (index == null) {
                    index = i;
                    parents[index] = i;
                } else {
                    int p1 = find(parents, i);
                    int p2 = find(parents, index);
                    parents[p2] = p1;
                }
                map.put(email, index);
            }
        }
        
        Map<Integer, Set<String>> owners = new HashMap<>();
        for (int i=0; i<accounts.size(); i++) {
            int parent = find(parents, i);
            List<String> emails = accounts.get(i);
            owners.putIfAbsent(parent, new TreeSet<String>());
            owners.get(parent).addAll(emails.subList(1, emails.size()));
        }
        
        List<List<String>> res = new ArrayList<>();
        for (Integer i : owners.keySet()) {
            String name = accounts.get(i).get(0);
            List<String> tmp = new ArrayList<>();
            tmp.add(name);
            tmp.addAll(owners.get(i));
            res.add(tmp);
        }
        
        return res;
    }
    
    private int find(int[] parents, int index) {
        if (parents[index] == index) {
            return index;
        }
        return find(parents, parents[index]);
    }
    
    /**
     * A car travels from a starting position to a destination which is target miles east of the starting position.

	Along the way, there are gas stations.  Each station[i] represents a gas station that is station[i][0] miles 
	east of the starting position, and has station[i][1] liters of gas.
	
	The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it.  
	It uses 1 liter of gas per 1 mile that it drives.
	
	When the car reaches a gas station, it may stop and refuel, 
	transferring all the gas from the station into the car.
	
	What is the least number of refueling stops the car must make in order to reach its destination?  
	If it cannot reach the destination, return -1.
	
	Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there.  
	If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
	
	Input: target = 100, startFuel = 1, stations = [[10,100]]
	Output: -1
	Explanation: We can't reach the target (or even the first gas station).
	Example 3:
	
	Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
	Output: 2
	Explanation: 
	We start with 10 liters of fuel.
	We drive to position 10, expending 10 liters of fuel.  We refuel from 0 liters to 60 liters of gas.
	Then, we drive from position 10 to position 60 (expending 50 liters of fuel),
	and refuel from 10 liters to 50 liters of gas.  We then drive to and reach the target.
	We made 2 refueling stops along the way, so we return 2.
     * @param target
     * @param startFuel
     * @param stations
     * @return
     */
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int cur = startFuel;
        int res = 0;
        int i = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        
        for (res = 0; cur < target; res++) {
            while (i<stations.length && cur >= stations[i][0]) {
                pq.add(-stations[i++][1]);
            }
            if (pq.isEmpty()) {
                return -1;
            }
            cur+= -pq.poll();
        } 
        return res;
    }
	
    /**
    Today, the bookstore owner has a store open for customers.length minutes.  Every minute, some number of customers (customers[i]) enter the store, and all those customers leave after the end of that minute.

	On some minutes, the bookstore owner is grumpy.  If the bookstore owner is grumpy on the i-th minute, grumpy[i] = 1, otherwise grumpy[i] = 0.  When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise they are satisfied.

	The bookstore owner knows a secret technique to keep themselves not grumpy for minutes minutes straight, but can only use it once.

	Return the maximum number of customers that can be satisfied throughout the day.



	Example 1:

	Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
	Output: 16
	Explanation: The bookstore owner keeps themselves not grumpy for the last 3 minutes. 
	The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
    */
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int sum = 0;
        int makeSatisfied = 0;
        int makeSatisfiedMax = 0;
        for(int i=0; i<n; i++) {
            if (grumpy[i] == 0) {
                sum+=customers[i];
            }
            makeSatisfied+=customers[i] * grumpy[i];
            if (i >= minutes) {
                makeSatisfied -= customers[i-minutes] * grumpy[i-minutes];
            }
            makeSatisfiedMax = Math.max(makeSatisfiedMax, makeSatisfied);
        }
        return sum + makeSatisfiedMax;
    }
    
    /**
    You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique. You are also given an integer k.

	For every i and j where 0 <= i < j < arr.length, we consider the fraction arr[i] / arr[j].

	Return the kth smallest fraction considered. Return your answer as an array of integers of size 2, where answer[0] == arr[i] and answer[1] == arr[j].



	Example 1:

	Input: arr = [1,2,3,5], k = 3
	Output: [2,5]
	Explanation: The fractions to be considered in sorted order are:
	1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
	The third fraction is 2/5.
    */
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Queue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] i1, int[] i2) {
                int frac1 = arr[i1[0]]*arr[i2[1]];
                int frac2 = arr[i1[1]]*arr[i2[0]];
                return frac1 - frac2;
            }
        });
        
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            pq.add(new int[] {i, n-1});
        }
        
        for (int i=0; i<k-1; i++) {
            int[] tmp = pq.remove();
            if (tmp[1]-1 > tmp[0]) {
                tmp[1]--;
                pq.add(tmp);
            }
        }
        
        int[] res = pq.peek();
        
        return new int[] {arr[res[0]], arr[res[1]]};
    }
    
    public NumberImpl(){}
}
