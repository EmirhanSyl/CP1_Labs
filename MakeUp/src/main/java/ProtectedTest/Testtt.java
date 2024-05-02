package ProtectedTest;

/**
 *
 * @author emirs
 */
public class Testtt {
    public static void main(String[] args) {
        // Static Nested Class Objeleştirme
        NestedTest.StaticNested staticNested = new NestedTest.StaticNested();
        
        // Inner Class Objeleştirme
        NestedTest nestedTest = new NestedTest();
        NestedTest.InnerClass innerClass = nestedTest.new InnerClass();
        
    }
}
