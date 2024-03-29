package lianxi;

import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class _100层楼 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        HashMap<Integer, Integer> map = new HashMap<>(32);
        int num = 10000000;
        while (num-- > 0) {
            int random = (int) (Math.random() * 100);
            int i = _100(random);
            if (map.containsKey(i)){
                Integer integer = map.get(i);
                integer++;
                map.put(i,integer);
            } else {
                map.put(i,1);
            }
        }
//        map.forEach((key,values)->{
//            System.out.println("key:"+key+"\t"+"values:"+values);
//        });


        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("dsda");
            }
        });
    }

    /**
     * @param n 标识多少层楼会破
     * @return
     */
    public static int _100(int n) {
        int result = 0;
        int a1 = 0, a = 10, b;
        while (a <= 100) {
            if (n < a) {
                for (b = a1; b < a; b++) {
                    result++;
                    if (b == n) {
                        return result;
                    }
                }
            } else if (n == a) {
                result++;
                return result;
            } else if (n > a) {
                int i = 100 - a;
                int sqrt = (int) Math.sqrt(i);
                a1 = a;
                a += sqrt;
                result++;
            }
        }
        return result;
    }
}
