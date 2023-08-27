package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
@zzadh
/* loaded from: classes2.dex */
public final class zzgr {
    private final int zzaiz;
    private final zzgq zzajb = new zzgv();
    private final int zzaiy = 6;
    private final int zzaja = 0;

    public zzgr(int i) {
        this.zzaiz = i;
    }

    private final String zzy(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzgt zzgtVar = new zzgt();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzaiz, new zzgs(this));
        for (String str2 : split) {
            String[] zzb = zzgu.zzb(str2, false);
            if (zzb.length != 0) {
                zzgx.zza(zzb, this.zzaiz, this.zzaiy, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzgtVar.write(this.zzajb.zzx(((zzgy) it.next()).zzajf));
            } catch (IOException e) {
                zzakb.zzb("Error while writing hash to byteStream", e);
            }
        }
        return zzgtVar.toString();
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str = arrayList2.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return zzy(sb.toString());
    }
}
