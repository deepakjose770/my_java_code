package com.deepak.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Meeting_Scheduler_1229 {
    public static void main(String[] args) {
        int[][] slots1 = {{60, 120}, {10,50}, {140,210}};
        int[][] slots2 = {{0, 15}, {60,70}};
        System.out.println(new Meeting_Scheduler_1229().minAvailableDuration(slots1, slots2, 8));

    }

    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a,b)-> a[0] - b[0]);
        Arrays.sort(slots2, (a,b)-> a[0] - b[0]);

        int slot1Len = slots1.length;
        int slot2Len = slots2.length;

        int a = 0;
        int b = 0;

        while (a < slot1Len && b < slot2Len) {

            int slotStart = Math.max(slots1[a][0], slots2[b][0]);
            int slotEnd = Math.min(slots1[a][1], slots2[b][1]);


            if (slotEnd - slotStart > duration) {
                return Arrays.asList(slotStart, slotStart+duration);
            }

            if (slots1[a][1] < slots2[b][1]) {
                a++;
            } else {
                b++;
            }

        }
        return Collections.emptyList();
    }
}
