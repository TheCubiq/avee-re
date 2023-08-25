package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class h27 {
    /* renamed from: a */
    public static boolean m21081a(Iterable iterable, ty6 ty6Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(ty6Var);
            return m21079c((List) iterable, ty6Var);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(ty6Var);
        boolean z = false;
        while (it.hasNext()) {
            if (ty6Var.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static void m21080b(List list, ty6 ty6Var, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (ty6Var.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            list.remove(i2);
        }
    }

    /* renamed from: c */
    public static boolean m21079c(List list, ty6 ty6Var) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!ty6Var.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        m21080b(list, ty6Var, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m21080b(list, ty6Var, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
