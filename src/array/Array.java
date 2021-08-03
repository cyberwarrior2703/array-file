/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ANUJ KAUSHAL
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String userid="mca102";
  String status="true";
int a[]= {1,2,3,4,5,6};
System.out.println(userid+"");
System.out.println(status+"");
System.out.print("even no in array is.......");
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
    System.out.print(a[i]+"\t");
}
System.out.println("");
System.out.print("odd no in array is.......");
for(int i=0;i<a.length;i++)
{
if(a[i]%2!=0)
    System.out.print(a[i]+"\t");
}
    }
    
}
