import Arrays.SingleDimensionArrays;

public class Main {
    public static void main(String[] args) {

        SingleDimensionArrays singleDimensionArrays = new SingleDimensionArrays(3);
        singleDimensionArrays.insert(0, 1);
        singleDimensionArrays.insert(1, 2);
        singleDimensionArrays.insert(2, 3);
        singleDimensionArrays.access(0);
        singleDimensionArrays.search(-1);
        singleDimensionArrays.deleting(2);

        singleDimensionArrays.traversal();

    }
}