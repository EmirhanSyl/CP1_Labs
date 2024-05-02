
/**
 *
 * @author emirs
 */
public class DiscreateStructures_Lab6 {
    public static void main(String[] args) {
        char[] uni = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char[] arr1 = {'B', 'D', 'G', 'H'};
        char[] arr2 = {'A', 'B', 'G'};
        int[] result = getUnionCharacteristic(uni, arr1, arr2);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    static int[] getUnionCharacteristic(char[] uni, char[] arr1, char[] arr2){
        char[] unionSet = union(arr1, arr2);
        
        String resultString = "";
        for (int i = 0; i < uni.length; i++) {
            boolean isExists = false;
            for (int j = 0; j < unionSet.length; j++) {
                if (unionSet[j] == uni[i]) {
                    isExists = true;
                }
            }
            if (!isExists) {
                resultString += uni[i];
            }
        }
        char[] complementSet = new char[resultString.length()];
        for (int i = 0; i < complementSet.length; i++) {
            complementSet[i] = resultString.charAt(i);
        }
        return getCharacteristic(uni, complementSet);
    }
    
    public static int[] getCharacteristic(char[] uni, char[] arr){
        int[] result = new int[uni.length];
        for (int i = 0; i < uni.length; i++) {
            boolean isExists = false;
            for (int j = 0; j < arr.length; j++) {
                if(uni[i] == arr[j]){
                    isExists = true;
                }
            }
            result[i] = (isExists) ? 1:0;
        }
        return result;
    }
    
    public static char[] union(char[] arr1, char[] arr2){
        String same = "";
        for (int i = 0; i < arr1.length; i++) {
            boolean isExists = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isExists = true;
                }
            }
            if (isExists) {
                same += arr1[i];
            }
        }
        char[] result = new char[arr1.length + arr2.length - same.length()];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            String a = "" + arr2[i];
            if (!same.contains(a)) {
                result[i] = arr2[i];
            }
        }
        
        return result;
    }
    
    
}
