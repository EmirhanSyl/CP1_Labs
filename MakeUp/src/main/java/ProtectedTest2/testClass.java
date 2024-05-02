package ProtectedTest2;

/**
 *
 * @author emirs
 */
import ProtectedTest.protClass;
public class testClass extends protClass{
    public void aaaaa(String[] args) {
        super.a = 5; 
    }
    int b = super.a;
}
