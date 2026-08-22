package INFOSYS_PREP;

import java.util.*;

public class GasStation {

    public static void main(String[] args) {

        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int totalGas = 0;
        int totalCost = 0;

        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {

            totalGas += gas[i];
            totalCost += cost[i];

            tank += gas[i] - cost[i];

            // Cannot reach next station
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        // Not enough total gas
        if (totalGas < totalCost) {
            System.out.println(-1);
        } else {
            System.out.println(start);
        }
    }
}