public class sayTheNumber {
    // initialise numbers from which to extract words.
    // group numbers into according list strings.
    private static String[] lessThanTwenty = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    private static String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    private static String[] clusters = {"","Thousand","Million","Billion","Trillion"};

    // Define function that takes the numerical value and breaks it into parts with 3 digits each.

    public static String sayNumber(long num) {

        if(num==0) return "Zero.";

        String ans = new String();

        int index=0;
        while(num>0){

            // conditional body to check whether numerical value is divisible by 1000,
            // if not, convert number into 3 a digit number ie a number between 100-999
            if(num%1000!=0){
                ans = convertThreeDigit(num%1000) + clusters[index]+", " + ans;
            }

            // add value into index variable
            index++;
            num/=1000;
        }
        // use substring and trim methods for punctuation
        return ans.trim().substring(0,ans.length()-3)+".";

    }

    // define function that captures the 3-digit number and builds the string using recursion.
    private static String convertThreeDigit(long num){
        // initialise base case
        if(num==0)return "";
        if(num<20) return lessThanTwenty[(int)num]+" ";
        else if(num<100) return tens[(int)num/10] + " " + convertThreeDigit(num%10);
        else return lessThanTwenty[(int)num/100] + " "+"Hundred"+" "+convertThreeDigit(num%100);
    }

    // test function
    public static void main(String[] args) {
        int n1 = 0;
        long n2 = 11;
        long n3 = 1254367125;
        int n4 = 100;

        System.out.println(sayNumber(n1)+"\n"+sayNumber(n2)+"\n"+sayNumber(n3)+"\n"+sayNumber(n4));
        
        // reference - https://www.codeproject.com/Questions/5344056/Please-assist-convert-numbers-from-0-to-9999999999
    }
}
