import java.util.Scanner;
import java.util.*;
class search{
    void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array ");
        int len=sc.nextInt();
        System.out.println("Enter elements of array ");
        int arr[]=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to find ");
        int num=sc.nextInt();
        boolean flag=false; int p=0;
        loop1: {    //using labels
        for(int i:arr)
        { p++;
            if(i==num)
            {
                flag=true;
                break loop1;
            }
        }} 
        if(flag)
        System.out.println("Element is present in the array at "+(p-1)+" location");
        else
        System.out.println("Element is not present in the array ");
    }}
        