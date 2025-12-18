package z_hard;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1, 3};
        int[] nums2 = {2}; 
        System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    if (nums1.length > nums2.length) {
	        // Ensure nums1 is the smaller array
	        return findMedianSortedArrays(nums2, nums1);
	    }

	    int n1 = nums1.length;
	    int n2 = nums2.length;
	    int low = 0, high = n1;

	    while (low <= high) {
	        int cut1 = (low + high) / 2;
	        int cut2 = (n1 + n2 + 1) / 2 - cut1;

	        int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
	        int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
	        int right1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
	        int right2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

	        if (left1 <= right2 && left2 <= right1) {
	            if ((n1 + n2) % 2 == 0) {
	                return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
	            } else {
	                return Math.max(left1, left2);
	            }
	        } else if (left1 > right2) {
	            high = cut1 - 1;
	        } else {
	            low = cut1 + 1;
	        }
	    }

	    throw new IllegalArgumentException("Input arrays are not sorted properly");
	}

	
//	public static double medianOfTwoArrays(int[] arr1, int[] arr2) {
//		int m = arr1.length; 
//		int n = arr2.length;
//		int[] merge = new int[m+n];
//		
//		int i = 0, j = 0, k = 0;
//		while (i < m && j < n) {
//			if (arr1[i] < arr2[j]) {
//				merge[k++] = arr1[i++];
//			} else {
//				merge[k++] = arr2[j++];
//			}
//		}
//		while(i<m) {
//			merge[k++]=arr1[i++]; 
//		}
//		while(j<n) {
//			merge[k++]=arr2[j++];
//		}
//		
//		int total = m+n;
//		if(total % 2 == 1) {
//			return merge[total / 2];
//		}
//		else {
//			System.out.println(total / 2);
//			return (merge[total / 2 -1] + merge[total /2]) / 2.0;
//		}
//	}
	
	
}
