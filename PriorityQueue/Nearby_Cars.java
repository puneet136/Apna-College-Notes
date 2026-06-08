package PriorityQueue;

import java.util.PriorityQueue;

public class Nearby_Cars {
    static class points implements Comparable<points>{
        int x;
        int y;
        int distSq;
        int idx;

        public points(int x, int y, int distSq,int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(points p2){
            return this.distSq - p2.distSq;
        }
    }
    static void main(String[] args) {
        int [][] pts = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<points> pq = new PriorityQueue<>();
        for(int i = 0 ; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new points(pts[i][0], pts[i][1],distSq, i));
        }

        //nearest K cars
        for(int i = 0 ; i<k ; i++){
            System.out.println("Car " + pq.remove().idx);
        }
    }
}
