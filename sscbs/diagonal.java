import java.util.Scanner;
import java.util.*;
class diagonal{
    void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dimention of square 2-D array ");
        int m=sc.nextInt();
        System.out.println("Enter elements of array ");
        int arr[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
              arr[i][j]=sc.nextInt();  
            }
        } 
        System.out.println("Original array:"); 
        for(int i[]:arr){//to display
            for(int j:i){
                System.out.print(j+" ");}
                System.out.println();
            }
       System.out.println("lower limit of array array:"); 
           for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i<j)
                System.out.print("0 ");
                else
                System.out.print(arr[i][j]+" ");}
            System.out.println(); }
        }
    }
                
        
