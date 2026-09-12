class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<int[]>pq = new PriorityQueue<>(
            (a,b) -> a[0]==b[0]?a[1]-b[1]:a[0]-b[0]
        );

        for(var entry: map.entrySet()){
            pq.add(new int[]{entry.getValue(),entry.getKey()});

            if(pq.size()>k){
                pq.poll();
            }
        }

        int arr[] = new int[k];
        for(int i=k-1;i>=0;i--){
            arr[i] = pq.poll()[1];
        }
        return arr;


    }
}
