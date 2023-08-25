package com.daaw;

import com.daaw.i6;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public class ez0 extends i6 {
    public int g;
    public de1[] h;
    public de1[] i;
    public int j;
    public b k;
    public gd l;

    /* loaded from: classes.dex */
    public class a implements Comparator<de1> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(de1 de1Var, de1 de1Var2) {
            return de1Var.c - de1Var2.c;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Comparable {
        public de1 p;
        public ez0 q;

        public b(ez0 ez0Var) {
            this.q = ez0Var;
        }

        public boolean a(de1 de1Var, float f) {
            boolean z = true;
            if (!this.p.a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = de1Var.i[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.p.i[i] = f3;
                    } else {
                        this.p.i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.p.i;
                fArr[i2] = fArr[i2] + (de1Var.i[i2] * f);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.p.i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                ez0.this.G(this.p);
            }
            return false;
        }

        public void b(de1 de1Var) {
            this.p = de1Var;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.p.i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.p.c - ((de1) obj).c;
        }

        public final boolean d(de1 de1Var) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = de1Var.i[i];
                float f2 = this.p.i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.p.i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.p != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.p.i[i] + " ";
                }
            }
            return str + "] " + this.p;
        }
    }

    public ez0(gd gdVar) {
        super(gdVar);
        this.g = 128;
        this.h = new de1[128];
        this.i = new de1[128];
        this.j = 0;
        this.k = new b(this);
        this.l = gdVar;
    }

    @Override // com.daaw.i6
    public void C(i6 i6Var, boolean z) {
        de1 de1Var = i6Var.a;
        if (de1Var == null) {
            return;
        }
        i6.a aVar = i6Var.e;
        int b2 = aVar.b();
        for (int i = 0; i < b2; i++) {
            de1 d = aVar.d(i);
            float g = aVar.g(i);
            this.k.b(d);
            if (this.k.a(de1Var, g)) {
                F(d);
            }
            this.b += i6Var.b * g;
        }
        G(de1Var);
    }

    public final void F(de1 de1Var) {
        int i;
        int i2 = this.j + 1;
        de1[] de1VarArr = this.h;
        if (i2 > de1VarArr.length) {
            de1[] de1VarArr2 = (de1[]) Arrays.copyOf(de1VarArr, de1VarArr.length * 2);
            this.h = de1VarArr2;
            this.i = (de1[]) Arrays.copyOf(de1VarArr2, de1VarArr2.length * 2);
        }
        de1[] de1VarArr3 = this.h;
        int i3 = this.j;
        de1VarArr3[i3] = de1Var;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && de1VarArr3[i4 - 1].c > de1Var.c) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a());
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        de1Var.a = true;
        de1Var.a(this);
    }

    public final void G(de1 de1Var) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == de1Var) {
                while (true) {
                    int i2 = this.j;
                    if (i >= i2 - 1) {
                        this.j = i2 - 1;
                        de1Var.a = false;
                        return;
                    }
                    de1[] de1VarArr = this.h;
                    int i3 = i + 1;
                    de1VarArr[i] = de1VarArr[i3];
                    i = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.daaw.i6, com.daaw.ak0.a
    public void a(de1 de1Var) {
        this.k.b(de1Var);
        this.k.e();
        de1Var.i[de1Var.e] = 1.0f;
        F(de1Var);
    }

    @Override // com.daaw.i6, com.daaw.ak0.a
    public de1 c(ak0 ak0Var, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            de1 de1Var = this.h[i2];
            if (!zArr[de1Var.c]) {
                this.k.b(de1Var);
                b bVar = this.k;
                if (i == -1) {
                    if (!bVar.c()) {
                    }
                    i = i2;
                } else {
                    if (!bVar.d(this.h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    @Override // com.daaw.i6, com.daaw.ak0.a
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override // com.daaw.i6
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.b(this.h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
