package com.daaw;

import android.opengl.GLES20;
/* loaded from: classes.dex */
public class qr1 {
    public rc0 a;
    public sr1 b;
    public wr1[] c;
    public final int e = 4;
    public f0<y31, sr1> f = null;
    public f0<y31, sr1> g = null;
    public boolean h = true;
    public boolean i = true;
    public int d = 0;

    /* loaded from: classes.dex */
    public static class a {
        public final int a = 4;
        public final String b;
        public final int c;
        public final int d;
        public final int e;

        public a(String str, int i, int i2) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = i * a();
        }

        public final int a() {
            int i = this.d;
            if (i == 5126) {
                return 4;
            }
            if (i == 5121) {
                return 1;
            }
            q6.k("unknown dataType");
            return 4;
        }

        public String toString() {
            return this.b + " (" + this.c + ")";
        }
    }

    public qr1(rc0 rc0Var, sr1 sr1Var, a... aVarArr) {
        this.a = rc0Var;
        this.b = sr1Var;
        this.c = new wr1[aVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            wr1[] wr1VarArr = this.c;
            if (i2 >= wr1VarArr.length) {
                break;
            }
            a aVar = aVarArr[i2];
            wr1VarArr[i2] = new wr1(sr1Var.i(aVar.b), aVar.b, aVar.c, aVar.d, aVar.e);
            this.d += aVar.e;
            i2++;
        }
        while (true) {
            wr1[] wr1VarArr2 = this.c;
            if (i >= wr1VarArr2.length) {
                return;
            }
            if (wr1VarArr2[i].c < 0) {
                lz1.c("ERROR attribute not found " + this.c[i].a);
            }
            i++;
        }
    }

    public void a(y31 y31Var, g0<y31, sr1, w31> g0Var, w31 w31Var) {
        y31Var.p(this.b);
        f0<y31, sr1> f0Var = this.f;
        if (f0Var != null) {
            f0Var.a(y31Var, this.b);
        }
        f0<y31, sr1> f0Var2 = this.g;
        if (f0Var2 != null) {
            f0Var2.a(y31Var, this.b);
        }
        if (g0Var != null) {
            g0Var.a(y31Var, this.b, w31Var);
        }
        this.a.b();
        int i = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            wr1[] wr1VarArr = this.c;
            if (i2 >= wr1VarArr.length) {
                return;
            }
            wr1 wr1Var = wr1VarArr[i2];
            int i4 = wr1Var.c;
            if (i4 >= 0) {
                GLES20.glEnableVertexAttribArray(i4);
                int i5 = wr1Var.c;
                int i6 = wr1Var.b;
                int i7 = wr1Var.d;
                GLES20.glVertexAttribPointer(i5, i6, i7, i7 != 5126, i, i3);
                i3 += wr1Var.e;
            }
            i2++;
        }
    }

    public void b(int i, int i2, int i3) {
        this.a.c(i, i2, i3);
    }

    public void c(boolean z, f0<y31, sr1> f0Var) {
        this.h = z;
        this.f = f0Var;
    }

    public void d(y31 y31Var) {
        y31Var.V();
        this.a.a();
        int i = 0;
        while (true) {
            wr1[] wr1VarArr = this.c;
            if (i >= wr1VarArr.length) {
                return;
            }
            GLES20.glDisableVertexAttribArray(wr1VarArr[i].c);
            i++;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof qr1) && this == ((qr1) obj);
    }
}
