# RangeSum

## Description
This Java project demonstrates the use of recursion to calculate the sum of elements within a specific range of an array. The `RangeSum` method recursively sums array elements from the start index to the end index. This project highlights the power of recursion in solving array-related problems in Java.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `RangeSum.java` file and execute it. The program will sum the elements of an array between specified indices and display the result.

### Example Output
The sum of elements 2 through 5 is 18

### Key Features:
- **Recursive Method**: The `RangeSum` method uses recursion to calculate the sum of elements in a given range of an array.
- **Array Traversal**: The program traverses through a subset of the array and adds the elements together.

### Methods:
- `RangeSum(int[] array, int start, int end)`: Recursively sums the elements of the array between the `start` and `end` indices.

### Example:
```java
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int sum = RangeSum(numbers, 2, 5);
System.out.println("The sum of elements 2 through 5 is " + sum);
