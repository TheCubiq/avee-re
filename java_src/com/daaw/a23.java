package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class a23 {
    public final int a;
    public final u13 b = new c23();

    public a23(int i) {
        this.a = i;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        z13 z13Var = new z13();
        PriorityQueue priorityQueue = new PriorityQueue(this.a, new v13(this));
        for (String str : split) {
            String[] b = b23.b(str, false);
            if (b.length != 0) {
                f23.c(b, this.a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                z13Var.b.write(this.b.b(((e23) it.next()).b));
            } catch (IOException e) {
                k04.zzh("Error while writing hash to byteStream", e);
            }
        }
        return z13Var.toString();
    }
}
