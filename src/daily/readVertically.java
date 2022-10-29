package daily;

public class readVertically {
    /*
String[] input = new String[]{
  "hello",
  "wolrd",
};
String output = readVertically(input);
System.out.println(output); // --> "hweolllrod"

input = new String[]{
  "hi",
  "wolrd",
};
output = readVertically(input);
System.out.println(output); // --> "hwiolrd"
 */
    public String readVertically(String[] arr) {
        String output ="";
        int max= 0;
        for(int i =0; i<arr.length;i++){
            if(max < arr[i].length()) max = arr[i].length();
        }
        for(int i=0; i<max; i++){
            for(int j =0; j<arr.length; j++){
                if(arr[j].length()-1<i){
                    continue;
                }
                else{
                    output += String.valueOf(arr[j].charAt(i));
                }
            }
        }
        return output;
    }
}
