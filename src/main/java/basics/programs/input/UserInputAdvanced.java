package basics.programs.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UserInputAdvanced {
    
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        /*
        What actually happens at runtime:
        1. OS sends bytes from keyboard
        2. JVM reads bytes via System.in
        3. InputStreamReader decodes bytes -> UTF-16 chars
        4. Buffered stores chars in internal buffer
        5. readLine() scans buffer until \n
         */
        
        // Read until an empty line:
        /*
        Hello world
        This is Java
        BufferedReader example
         */
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";
        while((line=bufferedReader.readLine())!=null && !line.isEmpty()){
            stringBuilder.append(line).append("\n");
        }
        String multiLineText = stringBuilder.toString();
        System.out.println("Multiline line String Text: \n"+multiLineText);
        
        // Competitive Programming Style (T test cases)
        
        /*
        2
        3
        1 2 3
        4
        4 5 6 7
         */
        
        int T =  Integer.parseInt(bufferedReader.readLine());
        while(T-- >0){
            int n = Integer.parseInt(bufferedReader.readLine());
            int arr[] = new int[n];
            String[] parts = bufferedReader.readLine().split(" ");
            for (int i=0; i<n; i++){
                arr[i] = Integer.parseInt(parts[i]);
            }
            System.out.println(Arrays.toString(arr));
        }
        
    }

//    Key rules to remember (this saves bugs)
//    readLine() never includes newline
//    You must manually parse everything
//    Never assume input format — read problem statement twice
//    Prefer StringBuilder for multiline text
//    For speed → avoid regex-heavy logic in loops
}
