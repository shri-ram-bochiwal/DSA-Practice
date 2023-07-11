/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */

public class ReverseWordsInString {

    public String reverseWords(String s){
        String[] str = s.split(" ");
        String ans = "";
        for(int i = str.length-1; i>=0; i--){
            if(str[i].trim().equals("")){
                continue;
            }
            ans = ans + " " + str[i];
        }
        return ans.substring(1).trim();
    }

    public static void main(String[] args){
        String str1 = "the sky is blue";
        String str2 = "  hello world  ";
        String str3 = "a good   example";
        ReverseWordsInString solution = new ReverseWordsInString();
        System.out.println("Result For s = \"the sky is blue\" : " + solution.reverseWords(str1));
        System.out.println("Result For s = \"  hello world  \" : " + solution.reverseWords(str2));
        System.out.println("Result For s = \"a good   example\" : " + solution.reverseWords(str3));
    }

}

