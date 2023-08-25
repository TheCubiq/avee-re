package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class mx8 {
    public static final Comparator g = new Comparator() { // from class: com.daaw.cx8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((lx8) obj).a - ((lx8) obj2).a;
        }
    };
    public static final Comparator h = new Comparator() { // from class: com.daaw.dx8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((lx8) obj).c, ((lx8) obj2).c);
        }
    };
    public int d;
    public int e;
    public int f;
    public final lx8[] b = new lx8[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public mx8(int i) {
    }

    public final float a(float f) {
        if (this.c != 0) {
            Collections.sort(this.a, h);
            this.c = 0;
        }
        float f2 = this.e * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            lx8 lx8Var = (lx8) this.a.get(i2);
            i += lx8Var.b;
            if (i >= f2) {
                return lx8Var.c;
            }
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.a;
        return ((lx8) arrayList.get(arrayList.size() - 1)).c;
    }

    public final void b(int i, float f) {
        lx8 lx8Var;
        int i2;
        lx8 lx8Var2;
        int i3;
        if (this.c != 1) {
            Collections.sort(this.a, g);
            this.c = 1;
        }
        int i4 = this.f;
        if (i4 > 0) {
            lx8[] lx8VarArr = this.b;
            int i5 = i4 - 1;
            this.f = i5;
            lx8Var = lx8VarArr[i5];
        } else {
            lx8Var = new lx8(null);
        }
        int i6 = this.d;
        this.d = i6 + 1;
        lx8Var.a = i6;
        lx8Var.b = i;
        lx8Var.c = f;
        this.a.add(lx8Var);
        int i7 = this.e + i;
        while (true) {
            this.e = i7;
            while (true) {
                int i8 = this.e;
                if (i8 <= 2000) {
                    return;
                }
                i2 = i8 - 2000;
                lx8Var2 = (lx8) this.a.get(0);
                i3 = lx8Var2.b;
                if (i3 <= i2) {
                    this.e -= i3;
                    this.a.remove(0);
                    int i9 = this.f;
                    if (i9 < 5) {
                        lx8[] lx8VarArr2 = this.b;
                        this.f = i9 + 1;
                        lx8VarArr2[i9] = lx8Var2;
                    }
                }
            }
            lx8Var2.b = i3 - i2;
            i7 = this.e - i2;
        }
    }

    public final void c() {
        this.a.clear();
        this.c = -1;
        this.d = 0;
        this.e = 0;
    }
}
