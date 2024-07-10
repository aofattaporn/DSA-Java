package Arrays;

public class SingleDimensionArrays {

    public int[] arr;

    // time : O(1)
    // space : O(n)
    public SingleDimensionArrays(int sizeOfArrays) {
        this.arr = new int[sizeOfArrays];
        for (int i = 0; i < this.arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // time : O(1)
    // space : O(1)
    public void insert(int location, int valueToBeInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Insert Element Successfully");
            } else {
                System.out.println("This Element is added");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Can't to Access element out of bound");
        }
    }

    // time : O(1)
    // space : O(1)
    public void access(int location){
        try {
            System.out.printf("Element that's access is %d \n", arr[location]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Can't to Access element out of bound");
        }
    }

    // time : O(n)
    // space : O(1)
    public void traversal(){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element index %d is %d \n", i, arr[i]);
        }
    }

    // time : O(n)
    // space : O(1)
    public void search(int findElement){
        for (int i = 0; i < arr.length; i++) {
            if(findElement == arr[i]){
                System.out.printf("Element index %d is %d \n", i, arr[i]);
                return;
            }
        }
        System.out.printf("Not found element in arrays\n");
    }

    // time : O(1)
    // space : O(1)
    public void deleting(int valueToBeDeleteIndex){
        try {
            arr[valueToBeDeleteIndex] = Integer.MIN_VALUE;
            System.out.printf("Element that's delete is %d \n", arr[valueToBeDeleteIndex]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Can't to Access element out of bound");
        }
    }


}
