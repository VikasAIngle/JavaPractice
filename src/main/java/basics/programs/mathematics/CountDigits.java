package basics.programs.mathematics;

import basics.programs.array.BaseClass;

public class CountDigits extends BaseClass {
    
    public static void main(String[] args) {

        int n = 9253;
        int count =0;
        
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("Count of digits: "+count);
    }
    
}
