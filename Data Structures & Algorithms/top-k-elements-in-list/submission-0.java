class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num:nums) freq.put(num,freq.getOrDefault(num,0)+1);
        List<Integer>[] bucket = new List[nums.length+1];
        for( int num :freq.keySet()){
         int frequency=freq.get(num);
          if(bucket[frequency]==null){
           bucket[frequency]=new ArrayList<>();
                      }
            bucket[frequency].add(num);
        }
        int[] res = new int[k];
int idx=0;

     for(int i=nums.length;i>=0 && idx<k;i--){
   if(bucket[i]!=null){
      for(int n: bucket[i]){
          res[idx++] = n;
          if(idx==k) break;
      }
   }
}
        return res ;
    }
}
