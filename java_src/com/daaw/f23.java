package com.daaw;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class f23 {
    public static long a(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? a((j * j) % 1073807359, i >> 1) : j * (a((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    public static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            k04.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long e = e(strArr, 0, 6);
        d(i, e, b(strArr, 0, 6), 6, priorityQueue);
        long a = a(16785407L, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            e = ((((((e + 1073807359) - ((((b23.a(strArr[i3 - 1]) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((b23.a(strArr[i3 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            d(i, e, b(strArr, i3, 6), length2, priorityQueue);
            i3++;
        }
    }

    public static void d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        e23 e23Var = new e23(j, str, i2);
        if ((priorityQueue.size() != i || (((e23) priorityQueue.peek()).c <= e23Var.c && ((e23) priorityQueue.peek()).a <= e23Var.a)) && !priorityQueue.contains(e23Var)) {
            priorityQueue.add(e23Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static long e(String[] strArr, int i, int i2) {
        long a = (b23.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((b23.a(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
