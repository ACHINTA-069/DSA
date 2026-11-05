public class First {

    static class BinaryHeap {
        int[] arr;
        int size;
        int capacity;

        public BinaryHeap(int cap) {
            capacity = cap;
            arr = new int[capacity];
            size = 0;
        }

        // Return parent index
        public int parent(int i) {
            return (i - 1) / 2;
        }

        // Return left child index
        public int LeftChild(int i) {
            return 2 * i + 1;
        }

        // Return right child index
        public int RightChild(int i) {
            return 2 * i + 2;
        }

        // Insert a key
        public void Insert(int x) {
            if (size == capacity) {
                System.out.println("Heap Overflow");
                return;
            }

            arr[size] = x;
            int k = size;
            size++;

            while (k != 0 && arr[parent(k)] > arr[k]) {
                int temp = arr[parent(k)];
                arr[parent(k)] = arr[k];
                arr[k] = temp;
                k = parent(k);
            }
        }

        // Remove a key
        public void Remove(int key) {

            int index = -1;

            // Find the key
            for (int i = 0; i < size; i++) {
                if (arr[i] == key) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Key not found");
                return;
            }

            // Replace with last element
            arr[index] = arr[size - 1];
            size--;

            // Heapify Up if required
            while (index != 0 && arr[parent(index)] > arr[index]) {
                int temp = arr[parent(index)];
                arr[parent(index)] = arr[index];
                arr[index] = temp;
                index = parent(index);
            }

            // Heapify Down
            while (LeftChild(index) < size) {

                int smallest = index;

                if (LeftChild(index) < size &&
                        arr[LeftChild(index)] < arr[smallest]) {
                    smallest = LeftChild(index);
                }

                if (RightChild(index) < size &&
                        arr[RightChild(index)] < arr[smallest]) {
                    smallest = RightChild(index);
                }

                if (smallest == index)
                    break;

                int temp = arr[index];
                arr[index] = arr[smallest];
                arr[smallest] = temp;

                index = smallest;
            }
        }

        // Display the heap
        public void display() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BinaryHeap b1 = new BinaryHeap(20);

        b1.Insert(10);
        b1.Insert(20);
        b1.Insert(5);
        b1.Insert(30);
        b1.Insert(15);
        b1.Insert(2);

        System.out.println("Heap:");
        b1.display();

        b1.Remove(10);

        System.out.println("After removing 10:");
        b1.display();

        b1.Remove(2);

        System.out.println("After removing 2:");
        b1.display();
    }
}