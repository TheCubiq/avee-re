package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class mx8 {

    /* renamed from: g */
    public static final Comparator f19275g = new Comparator() { // from class: com.daaw.cx8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((lx8) obj).f17897a - ((lx8) obj2).f17897a;
        }
    };

    /* renamed from: h */
    public static final Comparator f19276h = new Comparator() { // from class: com.daaw.dx8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((lx8) obj).f17899c, ((lx8) obj2).f17899c);
        }
    };

    /* renamed from: d */
    public int f19280d;

    /* renamed from: e */
    public int f19281e;

    /* renamed from: f */
    public int f19282f;

    /* renamed from: b */
    public final lx8[] f19278b = new lx8[5];

    /* renamed from: a */
    public final ArrayList f19277a = new ArrayList();

    /* renamed from: c */
    public int f19279c = -1;

    public mx8(int i) {
    }

    /* renamed from: a */
    public final float m15681a(float f) {
        if (this.f19279c != 0) {
            Collections.sort(this.f19277a, f19276h);
            this.f19279c = 0;
        }
        float f2 = this.f19281e * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f19277a.size(); i2++) {
            lx8 lx8Var = (lx8) this.f19277a.get(i2);
            i += lx8Var.f17898b;
            if (i >= f2) {
                return lx8Var.f17899c;
            }
        }
        if (this.f19277a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f19277a;
        return ((lx8) arrayList.get(arrayList.size() - 1)).f17899c;
    }

    /* renamed from: b */
    public final void m15680b(int i, float f) {
        lx8 lx8Var;
        int i2;
        lx8 lx8Var2;
        int i3;
        if (this.f19279c != 1) {
            Collections.sort(this.f19277a, f19275g);
            this.f19279c = 1;
        }
        int i4 = this.f19282f;
        if (i4 > 0) {
            lx8[] lx8VarArr = this.f19278b;
            int i5 = i4 - 1;
            this.f19282f = i5;
            lx8Var = lx8VarArr[i5];
        } else {
            lx8Var = new lx8(null);
        }
        int i6 = this.f19280d;
        this.f19280d = i6 + 1;
        lx8Var.f17897a = i6;
        lx8Var.f17898b = i;
        lx8Var.f17899c = f;
        this.f19277a.add(lx8Var);
        int i7 = this.f19281e + i;
        while (true) {
            this.f19281e = i7;
            while (true) {
                int i8 = this.f19281e;
                if (i8 <= 2000) {
                    return;
                }
                i2 = i8 - 2000;
                lx8Var2 = (lx8) this.f19277a.get(0);
                i3 = lx8Var2.f17898b;
                if (i3 <= i2) {
                    this.f19281e -= i3;
                    this.f19277a.remove(0);
                    int i9 = this.f19282f;
                    if (i9 < 5) {
                        lx8[] lx8VarArr2 = this.f19278b;
                        this.f19282f = i9 + 1;
                        lx8VarArr2[i9] = lx8Var2;
                    }
                }
            }
            lx8Var2.f17898b = i3 - i2;
            i7 = this.f19281e - i2;
        }
    }

    /* renamed from: c */
    public final void m15679c() {
        this.f19277a.clear();
        this.f19279c = -1;
        this.f19280d = 0;
        this.f19281e = 0;
    }
}
