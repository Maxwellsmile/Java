package com.hxj.demo03;
/**
 * int k = 0;
 * Demo2 t1 = 
 *    print("constructor code");
 *      i=0  constructor code  k=0  n=0  j=0
 *      ++i i=1  ++k k=1  ++n n=1
 *    new Demo2("t1");
 *      i=1  t1  k=1  n=1  j=0
 *      ++i i=2  ++k k=2  ++n n=2
 * Demo2 t2 = 
 *    print("constructor code");
 *      i=2  constructor code  k=2  n=2  j=0
 *      ++i i=3  ++k k=3  ++n n=3
 *    new Demo2("t2");
 *      i=3  t2  k=3  n=3  j=0 
 *      ++i i=4  ++k k=4  ++n n=4
 * int i = print("i");  = 5       
 *      i=4  i  k=4  n=4  j=0 
 *      ++i i=5  ++k k=5  ++n n=5
 * int j = print("j");  = 6
 *      i=5  j  k=5  n=5  j=0 
 *      ++i i=6  ++k k=6  ++n n=6  
 * int n = 99;   
 * 
 * print("static code");
 *     i=6  static code  k=6  n=99  j=6 
 *     ++i i=7  ++k k=7  ++n n=100  
 * print("constructor code");
 *     i=7  constructor code  k=7  n=100  j=6 
 *     ++i i=8  ++k k=8  ++n n=101
 *       
 * new Demo2("T")
 *     i=8  T  k=8  n=101  j=6 
 *          
 * @author hxj
 *
 */
public class Demo2 {
    public static int k = 0;
    public static Demo2 t1 = new Demo2("t1");
    public static Demo2 t2 = new Demo2("t2");
    public static int i = print("i");
    public static int j = print("j");
    public static int n = 99;

    static {
        print("static code");
    }
    
    {
        print("constructor code");
    }
    
    public Demo2(String string) {
        
        print(string);
    }
    
    public static int print(String s) {
        System.out.println("i="+i +"   "+s+ "  k=" + k + "  n=" + n + "   j=" + j);
        ++i;
        ++k;
        ++n;
        return i;
    }
    
    public static void main(String[] args) {
        Demo2 d=new Demo2("T");
    }
}
