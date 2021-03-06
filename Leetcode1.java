import java.util.HashMap;


		class Solution {
		    public int[] twoSum(int[] nums, int target) {
		     
				if(nums== null ||nums.length<2) {
					return new int[] {-1,-1};			
				}        
				int[] sum = new int[] {-1,-1};
				HashMap<Integer,Integer>map= new HashMap<>() ;
				for(int i =0;i<nums.length;i++) {
		            int complement = target - nums[i];
			if(map.containsKey(complement)) {
				sum[0]=map.get(complement);
				sum[1]=i;
				break;
			}
					map.put(nums[i],i);
					
				}
				return sum;
			}

		}
