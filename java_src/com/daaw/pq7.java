package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class pq7 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        yq7 yq7Var = (yq7) obj;
        yq7 yq7Var2 = (yq7) obj2;
        sq7 it = yq7Var.iterator();
        sq7 it2 = yq7Var2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(yq7Var.o()).compareTo(Integer.valueOf(yq7Var2.o()));
    }
}
