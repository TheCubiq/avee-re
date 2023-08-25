package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class yd1 {

    /* renamed from: h */
    public static final Comparator<C3694c> f33522h = new C3692a();

    /* renamed from: i */
    public static final Comparator<C3694c> f33523i = new C3693b();

    /* renamed from: a */
    public final int f33524a;

    /* renamed from: e */
    public int f33528e;

    /* renamed from: f */
    public int f33529f;

    /* renamed from: g */
    public int f33530g;

    /* renamed from: c */
    public final C3694c[] f33526c = new C3694c[5];

    /* renamed from: b */
    public final ArrayList<C3694c> f33525b = new ArrayList<>();

    /* renamed from: d */
    public int f33527d = -1;

    /* renamed from: com.daaw.yd1$a */
    /* loaded from: classes.dex */
    public static class C3692a implements Comparator<C3694c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C3694c c3694c, C3694c c3694c2) {
            return c3694c.f33531a - c3694c2.f33531a;
        }
    }

    /* renamed from: com.daaw.yd1$b */
    /* loaded from: classes.dex */
    public static class C3693b implements Comparator<C3694c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C3694c c3694c, C3694c c3694c2) {
            float f = c3694c.f33533c;
            float f2 = c3694c2.f33533c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    /* renamed from: com.daaw.yd1$c */
    /* loaded from: classes.dex */
    public static class C3694c {

        /* renamed from: a */
        public int f33531a;

        /* renamed from: b */
        public int f33532b;

        /* renamed from: c */
        public float f33533c;

        public C3694c() {
        }

        public /* synthetic */ C3694c(C3692a c3692a) {
            this();
        }
    }

    public yd1(int i) {
        this.f33524a = i;
    }

    /* renamed from: a */
    public void m3856a(int i, float f) {
        C3694c c3694c;
        int i2;
        C3694c c3694c2;
        int i3;
        m3855b();
        int i4 = this.f33530g;
        if (i4 > 0) {
            C3694c[] c3694cArr = this.f33526c;
            int i5 = i4 - 1;
            this.f33530g = i5;
            c3694c = c3694cArr[i5];
        } else {
            c3694c = new C3694c(null);
        }
        int i6 = this.f33528e;
        this.f33528e = i6 + 1;
        c3694c.f33531a = i6;
        c3694c.f33532b = i;
        c3694c.f33533c = f;
        this.f33525b.add(c3694c);
        int i7 = this.f33529f + i;
        while (true) {
            this.f33529f = i7;
            while (true) {
                int i8 = this.f33529f;
                int i9 = this.f33524a;
                if (i8 <= i9) {
                    return;
                }
                i2 = i8 - i9;
                c3694c2 = this.f33525b.get(0);
                i3 = c3694c2.f33532b;
                if (i3 <= i2) {
                    this.f33529f -= i3;
                    this.f33525b.remove(0);
                    int i10 = this.f33530g;
                    if (i10 < 5) {
                        C3694c[] c3694cArr2 = this.f33526c;
                        this.f33530g = i10 + 1;
                        c3694cArr2[i10] = c3694c2;
                    }
                }
            }
            c3694c2.f33532b = i3 - i2;
            i7 = this.f33529f - i2;
        }
    }

    /* renamed from: b */
    public final void m3855b() {
        if (this.f33527d != 1) {
            Collections.sort(this.f33525b, f33522h);
            this.f33527d = 1;
        }
    }

    /* renamed from: c */
    public final void m3854c() {
        if (this.f33527d != 0) {
            Collections.sort(this.f33525b, f33523i);
            this.f33527d = 0;
        }
    }

    /* renamed from: d */
    public float m3853d(float f) {
        m3854c();
        float f2 = f * this.f33529f;
        int i = 0;
        for (int i2 = 0; i2 < this.f33525b.size(); i2++) {
            C3694c c3694c = this.f33525b.get(i2);
            i += c3694c.f33532b;
            if (i >= f2) {
                return c3694c.f33533c;
            }
        }
        if (this.f33525b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C3694c> arrayList = this.f33525b;
        return arrayList.get(arrayList.size() - 1).f33533c;
    }
}
