public class SelectionSort {
public static void main(String[] args) {
int[] arr = {15, 9, 3, 11, 7};
int length = arr.length;
int min;

System.out.print("Before sorting input array: ");
printInputArray(arr);

for (int i = 0; i < length - 1; i++) {
min = i;

for (int j = i + 1; j < length; j++) {
if (arr[j] < arr[min]) {
min = j;
}
}

int temp = arr[min];
arr[min] = arr[i];
arr[i] = temp;

System.out.print("\nIterate " + i + ": ");
printInputArray(arr);
}

System.out.print("\nAfter sorting input array: ");
printInputArray(arr);
}

public static void printInputArray(int[] values) {
for (int value : values) {
System.out.print(value + " ");
}
}
}
