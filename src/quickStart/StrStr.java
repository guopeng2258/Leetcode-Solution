package quickStart;

/**
 * @author pengyuan.guo
 * @date 2022年08月09日 16:28
 * @description leetcode 28
 * 遍历第一个字符串 取长度为n的串与第二个字符串进行对比
 * 对比方法：
 * 遍历，一个字符不同就返回
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        char[] charsI = haystack.toCharArray();
        char[] charsJ = needle.toCharArray();
        int num = needle.length();
        int res = -1;
        for (int i = 0; i < charsI.length - num + 1 ; i++) {
            boolean flag = true;
            for (int j = 0; j < num; j++) {
                if (charsI[i + j] != charsJ[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                return i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "aaaaa";
        String b = "bba";
        System.out.println(new StrStr().strStr(a, b));
    }
}
