package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class a23 {

    /* renamed from: a */
    public final int f2707a;

    /* renamed from: b */
    public final u13 f2708b = new c23();

    public a23(int i) {
        this.f2707a = i;
    }

    /* renamed from: a */
    public final String m27749a(ArrayList arrayList) {
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
        PriorityQueue priorityQueue = new PriorityQueue(this.f2707a, new v13(this));
        for (String str : split) {
            String[] m26521b = b23.m26521b(str, false);
            if (m26521b.length != 0) {
                f23.m22964c(m26521b, this.f2707a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                z13Var.f34332b.write(this.f2708b.mo8635b(((e23) it.next()).f8050b));
            } catch (IOException e) {
                k04.zzh("Error while writing hash to byteStream", e);
            }
        }
        return z13Var.toString();
    }
}
