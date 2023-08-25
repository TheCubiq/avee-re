package com.daaw;

import com.daaw.C3845zj;
import com.daaw.ie1;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class g10 {

    /* renamed from: a */
    public static Comparator<C3845zj.C3864s> f10140a = new C1350a();

    /* renamed from: b */
    public static Comparator<C3845zj.C3864s> f10141b = new C1351b();

    /* renamed from: c */
    public static Comparator<C3845zj.C3864s> f10142c = new C1352c();

    /* renamed from: d */
    public static Comparator<C3845zj.C3864s> f10143d = new C1353d();

    /* renamed from: com.daaw.g10$a */
    /* loaded from: classes.dex */
    public class C1350a implements Comparator<C3845zj.C3864s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C3845zj.C3864s c3864s, C3845zj.C3864s c3864s2) {
            return c3864s.m2209f().compareTo(c3864s2.m2209f());
        }
    }

    /* renamed from: com.daaw.g10$b */
    /* loaded from: classes.dex */
    public class C1351b implements Comparator<C3845zj.C3864s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C3845zj.C3864s c3864s, C3845zj.C3864s c3864s2) {
            return c3864s.m2208g().compareTo(c3864s2.m2208g());
        }
    }

    /* renamed from: com.daaw.g10$c */
    /* loaded from: classes.dex */
    public class C1352c implements Comparator<C3845zj.C3864s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C3845zj.C3864s c3864s, C3845zj.C3864s c3864s2) {
            return g10.m22101a(c3864s.m2210e(), c3864s2.m2210e());
        }
    }

    /* renamed from: com.daaw.g10$d */
    /* loaded from: classes.dex */
    public class C1353d implements Comparator<C3845zj.C3864s> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C3845zj.C3864s c3864s, C3845zj.C3864s c3864s2) {
            return g10.m22101a(c3864s.m2211d(), c3864s2.m2211d());
        }
    }

    /* renamed from: a */
    public static int m22101a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: b */
    public static Comparator<C3845zj.C3864s> m22100b(ie1.C1695h c1695h, int i) {
        int i2 = c1695h.f13560a;
        if (i2 != 8) {
            i = i2;
        }
        return m22099c(c1695h, i);
    }

    /* renamed from: c */
    public static Comparator<C3845zj.C3864s> m22099c(ie1.C1695h c1695h, int i) {
        Comparator<C3845zj.C3864s> comparator = null;
        if (c1695h == null) {
            return null;
        }
        boolean z = c1695h.f13561b;
        switch (c1695h.f13560a) {
            case 0:
            case 1:
            case 2:
            case 8:
                comparator = f10140a;
                break;
            case 3:
                comparator = f10141b;
                break;
            case 4:
            case 5:
                comparator = f10142c;
                z = !z;
                break;
            case 6:
            case 7:
                comparator = f10143d;
                z = !z;
                break;
        }
        return (comparator == null || !z) ? comparator : Collections.reverseOrder(comparator);
    }
}
