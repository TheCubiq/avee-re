package com.daaw;

import java.util.Comparator;
/* loaded from: classes2.dex */
public final class t58 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        y68 y68Var = (y68) obj;
        y68 y68Var2 = (y68) obj2;
        q58 q58Var = new q58(y68Var);
        q58 q58Var2 = new q58(y68Var2);
        while (q58Var.hasNext() && q58Var2.hasNext()) {
            int compareTo = Integer.valueOf(q58Var.zza() & 255).compareTo(Integer.valueOf(q58Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(y68Var.mo2805f()).compareTo(Integer.valueOf(y68Var2.mo2805f()));
    }
}
