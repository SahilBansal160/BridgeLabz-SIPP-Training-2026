//package core-java-practice.leet-code-codebase;

public class palindrome {
   public static void main(String[] args) {
        palindrome obj=new palindrome();
        System.out.println(obj.isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
       String s=""+x;
        int left=0;
        int right=s.length()-1;
        while(left<=right){
           if(s.charAt(left)!=s.charAt(right)){
            return false;
           }
           
            left++;
            right--;
           
        }
           return true;
        }
    }
    

