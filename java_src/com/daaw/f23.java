package com.daaw;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class f23 {
    /* renamed from: a */
    public static long m22966a(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? m22966a((j * j) % 1073807359, i >> 1) : j * (m22966a((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    /* renamed from: b */
    public static String m22965b(String[] strArr, int i, int i2) {
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

    /* renamed from: c */
    public static void m22964c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            m22963d(i, m22962e(strArr, 0, length), m22965b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long m22962e = m22962e(strArr, 0, 6);
        m22963d(i, m22962e, m22965b(strArr, 0, 6), 6, priorityQueue);
        long m22966a = m22966a(16785407L, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            m22962e = ((((((m22962e + 1073807359) - ((((b23.m26522a(strArr[i3 - 1]) + 2147483647L) % 1073807359) * m22966a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((b23.m26522a(strArr[i3 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            m22963d(i, m22962e, m22965b(strArr, i3, 6), length2, priorityQueue);
            i3++;
        }
    }

    /* renamed from: d */
    public static void m22963d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        e23 e23Var = new e23(j, str, i2);
        if ((priorityQueue.size() != i || (((e23) priorityQueue.peek()).f8051c <= e23Var.f8051c && ((e23) priorityQueue.peek()).f8049a <= e23Var.f8049a)) && !priorityQueue.contains(e23Var)) {
            priorityQueue.add(e23Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: e */
    public static long m22962e(String[] strArr, int i, int i2) {
        long m26522a = (b23.m26522a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            m26522a = (((m26522a * 16785407) % 1073807359) + ((b23.m26522a(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return m26522a;
    }
}
