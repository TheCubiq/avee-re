package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzgx {
    private static long zza(long j, int i) {
        if (i == 0) {
            return 1L;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? zza((j * j) % 1073807359, i / 2) : j * (zza((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    private static String zza(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzakb.e("Unable to construct shingle");
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

    private static void zza(int i, long j, String str, int i2, PriorityQueue<zzgy> priorityQueue) {
        zzgy zzgyVar = new zzgy(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().zzajg <= zzgyVar.zzajg && priorityQueue.peek().value <= zzgyVar.value)) && !priorityQueue.contains(zzgyVar)) {
            priorityQueue.add(zzgyVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void zza(String[] strArr, int i, int i2, PriorityQueue<zzgy> priorityQueue) {
        if (strArr.length < i2) {
            zza(i, zzb(strArr, 0, strArr.length), zza(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long zzb = zzb(strArr, 0, i2);
        zza(i, zzb, zza(strArr, 0, i2), i2, priorityQueue);
        long zza = zza(16785407L, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            long j = zzb + 1073807359;
            zzb = (((((j - ((((zzgu.zzz(strArr[i3 - 1]) + 2147483647L) % 1073807359) * zza) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zzgu.zzz(strArr[(i3 + i2) - 1]) + 2147483647L) % 1073807359)) % 1073807359;
            zza(i, zzb, zza(strArr, i3, i2), strArr.length, priorityQueue);
        }
    }

    private static long zzb(String[] strArr, int i, int i2) {
        long zzz = (zzgu.zzz(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zzz = (((zzz * 16785407) % 1073807359) + ((zzgu.zzz(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zzz;
    }
}
