package lianxi;

/**
 * @ClassName:SuShu
 * @Description:TODO
 * @Author:wangjianhuan
 * @Date:2020/10/27 22:52
 */
public class SuShu {
        public static void main(String[] args) {
            int i, j;
            int[] a = new int[101];
            for (i = 1; i < 101; i++) {
                a[i]=i;
            }

            for (i=2;i<101;i++)
                if (a[i] != 0) {
                    for (j = i + 1; j < 101; j++) {
                        if (j % i == 0) {
                            a[j] = 0;
                        }
                    }
                }

            for (i = 2;i<101; i++){
                if (a[i]!=0){
                    System.out.println(a[i]);
                }
            }
        }
}