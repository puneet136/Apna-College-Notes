
import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{      //Generic Type
        private class Node{
            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;      //n - Nodes
        @SuppressWarnings("FieldMayBeFinal")
        private int N;      //N - Bucket Size
        private LinkedList<Node> buckets[];    //N = buckets.length and buckets[] is nothing but it is a array

        public HashMap(){       //Constructor of HashMap Class
            this.N = 4;
            this.buckets =  new LinkedList[4];
            for(int i=0 ; i<4 ;i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;

        }

        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldbucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0;i<N*2 ;i++){
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> ll : oldbucket) {
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key , node.value);
                }
            }
        }
        public void put(K Key , V value){
            int bi = hashFunction(Key);

            int di = searchInLL(Key , bi);  //Data Index - index inside in the bucket and di = valid(0+)

            if(di == -1){       //Key Doesn't Exist
                buckets[bi].add(new Node(Key, value));
                n++;
            }
            else{       //Key Exist
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda =(double)n/N;

            if(lambda > 2.0){
                //Rehashing
                rehash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            }
            else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean contains(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                return null;
            }
            else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList<K> KeySet(){
            ArrayList<K> keys =  new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for(int di = 0;di<ll.size(); di++){
                    Node node = ll.get(di);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("China", 190);
        map.put("Canada", 5);

        ArrayList<String> keys = map.KeySet();
        for(int i=0;i<keys.size();i++){
            System.out.println("{"+keys.get(i) + " , " + map.get(keys.get(i)) + "}");
        }
    }
}
