import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int arr[] = new int[100];

System.out.println("Enter how many elements:");
int n;
n = sc.nextInt();

System.out.println("Enter the values...");
for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}

System.out.println("Enter the search value...");
int srch = sc.nextInt();

int low = 0;
int high = n - 1;
int mid = 0;

while (low <= high) {
    mid = (low + high) / 2;

    if (arr[mid] == srch) {
        System.out.println("Value is found at index " + mid);
        break;
    } else if (arr[mid] > srch) {
        high = mid - 1;
    } else if (arr[mid] < srch) {
        low = mid + 1;
    }
}

if (low > high) {
    System.out.println("The value " + srch + " is not found");
}
}
}
