package lecture.chapter13;
public class SortingAlgorithms {

  public static void main(String[] args) {

    int[] toSort = {50, 70, 100, 80, 40, 30, 20, 10 ,60};
    System.out.println("Unsortiert: ");
    printArray(toSort);

    System.out.println("Sortierte Arrays:");
    System.out.println("===================");
    System.out.println("Bubble Sort V1 sortiert: ");
    int[] sorted = bubbleSort(toSort.clone());
    printArray(sorted);

    System.out.println("Bubble Sort V2 sortiert: ");
    sorted = bubbleSortV2(toSort.clone());
    printArray(sorted);

    System.out.println("Bubble Sort V3 sortiert: ");
    sorted = bubbleSortV3(toSort.clone());
    printArray(sorted);

    System.out.println("SelectionSort sortiert: ");
    sorted = selectionSort(toSort.clone());
    printArray(sorted);

  }


  public static int[] bubbleSort(int[] numbers){

    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers.length-1; j++){
        if(numbers[j] > numbers[j+1]){
          swap(numbers, j, j+1);
        }
      }
    }

    return numbers;
  }

  public static int[] bubbleSortV2(int[] numbers){

    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers.length-1-i; j++){
        if(numbers[j] > numbers[j+1]){
          swap(numbers, j, j+1);
        }
      }
    }

    return numbers;
  }

  public static int[] bubbleSortV3(int[] numbers){
    boolean swapped = true;
    int sortedArea = 1;

    while(swapped){
      swapped = false;
      for(int j = 0; j < numbers.length-sortedArea; j++){
        if(numbers[j] > numbers[j+1]){
          swap(numbers, j, j+1);
          swapped = true;
        }
      }
      sortedArea++;
    }

    return numbers;
  }

  public static int[] selectionSort(int[] numbers){

    int sortedMarker = numbers.length-1;

    while(sortedMarker > 0){
      int maxPos = 0;
      for(int i = 1; i <= sortedMarker; i++){
        if(numbers[i] > numbers[maxPos]){
          maxPos = i;
        }
      }

      if(maxPos != sortedMarker) {
        swap(numbers, maxPos, sortedMarker);
      }
      sortedMarker--;
    }

    return numbers;
  }


  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  public static void printArray(int[] numbers){
    for(int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + ((i == numbers.length-1)?"" : ", "));
    }
    System.out.println();
  }

  private static void printRuntimeDuration(String algorithmName, int elementCount, long startTime, long endTime, long swapCount){
    long durationInNanoSeconds = endTime - startTime;
    long durationInMilliSeconds = (long) (durationInNanoSeconds / 10e5);

    System.out.println("Runtime for " + elementCount + " Elements with " + algorithmName + ": " + durationInNanoSeconds + " ns (" + durationInMilliSeconds + " ms); swapped " + swapCount + " times");
  }
}