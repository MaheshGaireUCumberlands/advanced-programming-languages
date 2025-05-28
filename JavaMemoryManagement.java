public class JavaMemoryManagement {

    static class NumberHolder {
        int[] numbers;

        NumberHolder(int size) {
            numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = i + 1;
            }
        }

        void printNumbers() {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Dynamic memory allocation using 'new'
        NumberHolder holder = new NumberHolder(5);
        holder.printNumbers();

        // Remove reference, eligible for garbage collection
        holder = null;

        // Suggest JVM to run garbage collector (no guarantee)
        System.gc();

        System.out.println("Finished Java memory management example.");
    }
}
