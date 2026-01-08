package Queue;

public class CircularQueueArrayImplementation {

    public static class Cqueue {
        int f = -1, r = -1, size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full dude!");
            }
            if (size == 0) {
                f = r = 0;
                arr[r] = val;
            } else if (r < arr.length - 1) {
                r++;
                arr[r] = val;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) throw new Exception("Queue is empty dude!");
            else if (f == arr.length - 1) {
                int val = arr[f];
                f = 0;
                size--;
                return val;
            } else {
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) throw new Exception("Queue is empty dude!");
            else return arr[f];
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }

        public void display() throws Exception {
            if (size == 0) throw new Exception("Queue is empty!");
            if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else if (f > r) {
                for (int i = f; i <= arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int j = 0; j <= r; j++) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Cqueue q = new Cqueue();

        q.add(45);
        q.add(50);
        q.remove();
        System.out.println(q.isEmpty());
        q.add(35);
        q.add(57);
        q.add(56);
        q.add(56);
        q.remove();
        q.display();
        System.out.println(q.peek());
    }


}

// for display logic
/*
==================== DRY RUN FOR display() ====================

Initial:
arr = [0, 0, 0, 0, 0]
f = -1, r = -1, size = 0

---------------------------------------------------------------
q.add(45)
f = 0, r = 0
arr = [45, 0, 0, 0, 0]
size = 1

---------------------------------------------------------------
q.add(50)
r = 1
arr = [45, 50, 0, 0, 0]
size = 2

---------------------------------------------------------------
q.remove()   // removes 45
f = 1
arr = [45, 50, 0, 0, 0]   // 45 still exists physically
size = 1                 // but is logically removed

---------------------------------------------------------------
q.add(35)
r = 2
arr = [45, 50, 35, 0, 0]
size = 2

---------------------------------------------------------------
q.add(57)
r = 3
arr = [45, 50, 35, 57, 0]
size = 3

---------------------------------------------------------------
q.add(56)
r = 4
arr = [45, 50, 35, 57, 56]
size = 4

---------------------------------------------------------------
q.add(56)   // wrap around
r = 0
arr = [56, 50, 35, 57, 56]
size = 5

---------------------------------------------------------------
q.remove()  // removes 50
f = 2
size = 4

---------------------------------------------------------------
display() logic:

f = 2, r = 0  => f > r (circular case)

Print from f to end:
arr[2] -> 35
arr[3] -> 57
arr[4] -> 56

Then print from 0 to r:
arr[0] -> 56

---------------------------------------------------------------
Final Output:
35 57 56 56

===============================================================
Key Insight:
Queue removal only moves 'f'.
Removed elements may still exist in array memory
but are NOT part of the logical queue.
===============================================================
*/

