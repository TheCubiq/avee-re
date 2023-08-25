package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class yd1 {
    public static final Comparator<c> h = new a();
    public static final Comparator<c> i = new b();
    public final int a;
    public int e;
    public int f;
    public int g;
    public final c[] c = new c[5];
    public final ArrayList<c> b = new ArrayList<>();
    public int d = -1;

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            float f = cVar.c;
            float f2 = cVar2.c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public int a;
        public int b;
        public float c;

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public yd1(int i2) {
        this.a = i2;
    }

    public void a(int i2, float f) {
        c cVar;
        int i3;
        c cVar2;
        int i4;
        b();
        int i5 = this.g;
        if (i5 > 0) {
            c[] cVarArr = this.c;
            int i6 = i5 - 1;
            this.g = i6;
            cVar = cVarArr[i6];
        } else {
            cVar = new c(null);
        }
        int i7 = this.e;
        this.e = i7 + 1;
        cVar.a = i7;
        cVar.b = i2;
        cVar.c = f;
        this.b.add(cVar);
        int i8 = this.f + i2;
        while (true) {
            this.f = i8;
            while (true) {
                int i9 = this.f;
                int i10 = this.a;
                if (i9 <= i10) {
                    return;
                }
                i3 = i9 - i10;
                cVar2 = this.b.get(0);
                i4 = cVar2.b;
                if (i4 <= i3) {
                    this.f -= i4;
                    this.b.remove(0);
                    int i11 = this.g;
                    if (i11 < 5) {
                        c[] cVarArr2 = this.c;
                        this.g = i11 + 1;
                        cVarArr2[i11] = cVar2;
                    }
                }
            }
            cVar2.b = i4 - i3;
            i8 = this.f - i3;
        }
    }

    public final void b() {
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    public final void c() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    public float d(float f) {
        c();
        float f2 = f * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            c cVar = this.b.get(i3);
            i2 += cVar.b;
            if (i2 >= f2) {
                return cVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<c> arrayList = this.b;
        return arrayList.get(arrayList.size() - 1).c;
    }
}
