import java.util.*;
import java.util.concurrent.*;


//i want to write the code by my own hands, stop

public class Hello_w_orld {
    public static void main(String[] args) {
        
        int array[] = {1};                               // Creates an integer array containing only the number 1.

        List<String> list = new ArrayList<>();           // Creates a dynamic list of Strings.
        list.add("Hello");                               // Adds the string "Hello" to the list.

        Set<String> set = new HashSet<>();               // Creates a Set (no guaranteed order) of Strings.
        set.add("World");                                // Adds the string "World" to the set.

        Map<Integer, String> map = new HashMap<>();      // Creates a Map that maps Integers to Strings.
        map.put(0, list.get(0) + " " + set.iterator().next());  // Inserts key 0 with value "Hello World".

        Stack<String> stack = new Stack<>();             // Creates a Stack (LIFO).
        stack.push(map.get(0));                          // Pushes "Hello World" onto the stack.

        Queue<String> queue = new LinkedList<>();        // Creates a Queue (FIFO).
        queue.add(stack.pop());                          // Pops from stack and adds "Hello World" to the queue.

        Deque<String> deque = new ArrayDeque<>();        // Creates a double-ended queue.
        deque.add(queue.poll());                         // Removes from queue and adds to deque.

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(); // Creates a priority-based queue (ascending order).
        priorityQueue.add(deque.poll());                 // Adds "Hello World" to the priority queue.

        TreeSet<String> treeSet = new TreeSet<>();       // Creates a sorted Set.
        treeSet.add(priorityQueue.poll());               // Adds the element from the priority queue to the TreeSet.

        ConcurrentLinkedQueue<String> concurrentQueue = new ConcurrentLinkedQueue<>(); // Creates a thread-safe queue.
        concurrentQueue.add(treeSet.first());            // Adds the first (and only) element of the TreeSet.

        System.out.println(concurrentQueue.poll());      // Prints and removes the element: "Hello World".
    }

}