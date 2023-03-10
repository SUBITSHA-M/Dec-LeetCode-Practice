class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);

        for(int i=0;i<piles.length;i++){
            pq.add(piles[i]);
        }
        int t=0;
        while(t<k){
            int c = pq.poll();
            int r = Math.floorDiv(c,2);
            pq.offer(c-r);
            t++;
        }
        int sum=0;
        while(!pq.isEmpty()){
           sum+=pq.poll();
        }
        return sum;
    }
}