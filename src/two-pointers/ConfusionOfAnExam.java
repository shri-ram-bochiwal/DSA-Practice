/**
 * A teacher is writing a test with n true/false questions, with 'T' denoting
 * true and 'F' denoting false. He wants to confuse the students by maximizing
 * the number of consecutive questions with the same answer (multiple trues or
 * multiple falses in a row).
 * You are given a string answerKey, where answerKey[i] is the original answer
 * to the ith question. In addition, you are given an integer k, the maximum
 * number of times you may perform the following operation:
 * Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i]
 * to 'T' or 'F').
 * Return the maximum number of consecutive 'T's or 'F's in the answer key after
 * performing the operation at most k times.
 */

public class ConfusionOfAnExam {

    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i = 0, j = 0, tCount = 0, fCount = 0, ans = 0;
        int n = answerKey.length();
        while (j < n) {
            if (answerKey.charAt(j)== 'T') {
                tCount++;
            } else {
                fCount++;
            }
            while (Math.min(tCount, fCount) > k) {
                if (answerKey.charAt(i) == 'T') {
                    tCount--;
                } else {
                    fCount--;
                }
                i++;
            }
            ans = Math.max(ans, tCount + fCount);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "TTFF";
        int k1 = 2;
        String str2 = "TFFT";
        int k2 = 1;
        String str3 = "TTFTTFTT";
        int k3 = 1;
        ConfusionOfAnExam solution = new ConfusionOfAnExam();
        System.out.println("Result For answerKey = TTFF, k = 2 : " + solution.maxConsecutiveAnswers(str1, k1));
        System.out.println("Result For answerKey = TFFT, k = 1 : " + solution.maxConsecutiveAnswers(str2, k2));
        System.out.println("Result For answerKey = TTFTTFTT, k = 2 : " + solution.maxConsecutiveAnswers(str3, k3));
    }

}
