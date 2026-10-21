package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class CountGoodMeals {

        public static int countPairs(int[] deliciousness) {
            int MOD = 1_000_000_007;
            long count = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (int value : deliciousness) {

                for (int power = 1; power <= (1 << 21); power <<= 1) {
                    int complement = power - value;

                    count += map.getOrDefault(complement, 0);
                    count %= MOD;
                }

                map.put(value, map.getOrDefault(value, 0) + 1);
            }

            return (int) count;
        }

        public static void main(String[] args) {
            int[] deliciousness = {1, 3, 5, 7, 9};

            System.out.println(countPairs(deliciousness));
        }
    }
