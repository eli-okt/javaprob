class ArrayMethods {

  private int[] values;

  public ArrayMethods(int[] initialValues) {
    values = initialValues;
  }


  
  public void swapFirstAndLast() {
    int temp = values[0];
    values[0] = values[values.length - 1];
    values[values.length - 1] = temp;
  }


  
  public void shiftRight() {
    int last = values[values.length - 1];
    for (int i = values.length - 2; i >= 0; i--) {
      values[i + 1] = values[i];
    }
    values[0] = last;
  }



  public void replaceEvenWithZero() {
    for (int i = 0; i < values.length; i++) {
      if (values[i]%2==0) {
        values[i] = 0;
      }
    }
  }


  public void replaceAllWithNeighbors() {

    for (int i = 1; i < values.length-1; i++) {
      if (values[i-1]>values[i+1]) {
        values[i] = values[i-1];
      }
      else if (values[i-1]<values[i+1]) {
        values[i] = values[i+1];
      }
    }
  } 


  public void removeMiddle() {
    
    int[] temp = new int[values.length-1];
    
    if (values.length%2==0) {
      int mid = values.length/2;
      for (int i = mid; i < values.length - 2; i++) {
        values[i] = values[i + 2];
      }
      values[values.length - 1] = 0;
      values[values.length - 2] = 0;
    }
    else {
      int mid = values.length / 2;     
      for (int i = mid + 1; i < values.length - 1; i++) {
        values[i] = values[i + 1];
      }
      values[values.length - 1] = 0;
    }

    for (int i=0; i<values.length-1; i++) {
      temp[i] = values[i];
    }

    values = temp;

  }



  public void moveAllEvenToFront() {
    
    int[] temp = new int[values.length];
    int index = 0;
    
    for (int i = 0; i < values.length; i++) {
      if (values[i]%2 == 0) {
        temp[index] = values[i];
        index++;
      }
    }
    for (int i = 0; i < values.length; i++) {
      if (values[i]%2 != 0) {
        temp[index] = values[i];
        index++;
      }
    }
    values = temp;
  }

  
  public int  getSecondLargest() { 
    int largest = values[0];
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 1; i < values.length; i++) {
      if (values[i] > largest) {
        secondLargest = largest;
        largest = values[i];
      }
      else if (values[i] > secondLargest) {
        secondLargest = values[i];
      }
    }
    return secondLargest;
  }

  
  public boolean isIncreasingOrder() {
    for (int i = 1; i < values.length; i++) {
      if (values[i] < values[i-1]) {
        return false;
      }
    }
    return true;
  }


  public boolean hasTwoAdjacentDuplicate() {
    for (int i = 1; i < values.length; i++) {
      if (values[i] != values[i-1]) {
        return false;
      }
    }
    return true;
  }


  public boolean hasDuplicate() {
    for (int i = 1; i < values.length; i++) {
      for (int j = 1; i < values.length; i++) {
        if (values[i] == values[j-1]) {
        return true;
      }
      }
    }
    return false;
  }

  public void printArray() {
    
    for (int i = 0; i < values.length; i++) {
      System.out.print(values[i] + " ");
    }
    
    System.out.println();
  }
    
}
