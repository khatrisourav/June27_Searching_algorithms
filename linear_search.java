import java.util.Scanner;

public class linear_search {

public static void main (String [] args ) {
Scanner s1 = new Scanner (System.in);
System.out.println ("Enter the size of the array ");
int size = s1.nextInt();
int array [] = new int [size];

for ( int i = 0;i<size;i++) {
int number = s1.nextInt();
array[i] = number;
} 
/*for printing the array 
for ( int i = 0;i<size;i++) {
System.out.println (array[i]);
} 
*/

// find the number takes value from user for searching a number 
int target = s1.nextInt();
int index =-1 ;
for ( int i = 0;i<size;i++) {
if (array[i]==target ) {

index = i ;
break;
}
}

if (index==-1) {
System.out.println ("Element not found" );
}
else {
System.out.println ("Element found at " +index + " " + "index");
}
}
}
