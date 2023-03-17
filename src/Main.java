import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for(int i = 0; i < 100000; i++){
            testList.add((int)(Math.random()*100000 + 1));
        }
        //testList.add(47);
        int target = (int)(Math.random()*100000 + 1);
        System.out.println(testList);
        int location = search(testList,target);
        if(location == -1){
            System.out.println(target + " not found");
        }else{
            System.out.println(target + " found at index " + location);
        }
    }

    //Steps:
    //Step One: Traverse through every value in arrayList using loop
    //Step Two: Get value at index
    //Step Three: Check if target is a value
    //Step Four: Return index of value
    //Step Five: If element is not in Array, return -1
    /**
     * Searches for the target integer in an ArrayList. If it is
     * not found, return -1.
     * @param array - ArrayList to be searched
     * @param target - number being searched for
     * @return index of first location of target number, -1 if not found
     */
    public static int search(ArrayList<Integer> array, int target){
        for(int i = 0; i < array.size(); i++){
            if(array.get(i) == target){
                return i;
            }
        }
        return -1;
    }
}