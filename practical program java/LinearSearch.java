import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int arr[] = new int[100];

System.out.println("Enter how many elements...");
int n;
n = sc.nextInt();

System.out.println("Enter " + n + " values...");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

System.out.println("Enter the search value...");
int srch = sc.nextInt();
int i;

for (i = 0; i < n; i++) {
if (arr[i] == srch) {
System.out.println(srch + " is found and the position is: " + (i + 1));
break;
}
}

if (i == n) {
System.out.println(srch + " not found");
}
}
}
