package Lab4;

public class SelectionSort {

    void sort(float[] numberList){
        int sorted = 0;
        int current = 0;
        int min = 0;
        for(int i = 0;i < numberList.length;i++)
        {
            if(numberList[current] < numberList[min]){
                min = current;
            }
            else{
                current++;
                if(current == numberList.length){
                    float temp = numberList[sorted];
                    numberList[sorted] = numberList[min];
                    numberList[min] = temp;

                    sorted++;
                    current = min = sorted;
                }
            }
        }
    }
}
