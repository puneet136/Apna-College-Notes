package PriorityQueue;
import java.util.*;

public class Implementation {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s){
            return this.rank - s.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));  //O(logn)
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 10));
        pq.add(new Student("D", 5));
        pq.add(new Student("E", 9));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+pq.peek().rank);  //O(1)
            pq.remove();        //O(logn)
        }
    }
}
