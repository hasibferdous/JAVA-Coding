
package javaapplication.features;

public class Addition {
    public static void main(String[]args){
        int a = 5, b = 10;
        int c = add(a,b);
        System.out.println("sum="+c);
    }
    public static int add(int n1, int n2){
        int s;
        s= n1+n2;
        return s;
            }
}
