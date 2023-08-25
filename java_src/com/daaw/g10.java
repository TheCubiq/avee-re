package com.daaw;

import com.daaw.ie1;
import com.daaw.zj;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class g10 {
    public static Comparator<zj.s> a = new a();
    public static Comparator<zj.s> b = new b();
    public static Comparator<zj.s> c = new c();
    public static Comparator<zj.s> d = new d();

    /* loaded from: classes.dex */
    public class a implements Comparator<zj.s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(zj.s sVar, zj.s sVar2) {
            return sVar.f().compareTo(sVar2.f());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Comparator<zj.s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(zj.s sVar, zj.s sVar2) {
            return sVar.g().compareTo(sVar2.g());
        }
    }

    /* loaded from: classes.dex */
    public class c implements Comparator<zj.s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(zj.s sVar, zj.s sVar2) {
            return g10.a(sVar.e(), sVar2.e());
        }
    }

    /* loaded from: classes.dex */
    public class d implements Comparator<zj.s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(zj.s sVar, zj.s sVar2) {
            return g10.a(sVar.d(), sVar2.d());
        }
    }

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static Comparator<zj.s> b(ie1.h hVar, int i) {
        int i2 = hVar.a;
        if (i2 != 8) {
            i = i2;
        }
        return c(hVar, i);
    }

    public static Comparator<zj.s> c(ie1.h hVar, int i) {
        Comparator<zj.s> comparator = null;
        if (hVar == null) {
            return null;
        }
        boolean z = hVar.b;
        switch (hVar.a) {
            case 0:
            case 1:
            case 2:
            case 8:
                comparator = a;
                break;
            case 3:
                comparator = b;
                break;
            case 4:
            case 5:
                comparator = c;
                z = !z;
                break;
            case 6:
            case 7:
                comparator = d;
                z = !z;
                break;
        }
        return (comparator == null || !z) ? comparator : Collections.reverseOrder(comparator);
    }
}
