package com.blackflower.makeup;

/**
 *
 * @author emirs
 */
public class NestedClasses {
    
    int a;
    int b;
    static int c;
    
    
    public static class staticInnerClass{
        static int a;
        
        public static void sum() {
            a += 2;
            c = 5;
            
        }
    }
    
    public class innerClass{
        int a;
        
        public void sum() {
            a += 2;
        }
    }
    
}
