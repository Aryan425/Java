import java.util.Scanner;
import java.util.*;
class dupli{
    int arr[]=new int[100]; int arr1[]=new int[100];
    int len,p=0;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array ");
        len=sc.nextInt(); 

        System.out.println("Enter elements of array :");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
    }
    void Duplicate(){
        for(int i=0;i<len;i++){ int t=0;
            for(int j=i;j<len;j++){
               if(arr[i]==arr[j])
                t++;
            }
            if(t==1){
            arr1[p]=arr[i];
            p++;}
        }
    }
    void print(int a[],int v){
        for(int i=0;i<v;i++){ 
            System.out.print(" , "+a[i]);
        }System.out.println("");
    }
    void main(){
        Scanner sc=new Scanner(System.in);
        dupli b=new dupli();
        b.input();
        System.out.println("Original array :");
        b.print(arr,len);
        System.out.println("Array after deletion of duplicate :");
        b.Duplicate();
        b.print(arr1,p);
    }
}
        