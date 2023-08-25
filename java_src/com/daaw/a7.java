package com.daaw;
/* loaded from: classes.dex */
public class a7 extends z6 {
    public qc0[] j;
    public le0[] k;
    public int l;

    /* loaded from: classes.dex */
    public static class a implements qc0 {
        public final a7 a;
        public final int b;

        public a(a7 a7Var, int i) {
            this.a = a7Var;
            this.b = i;
        }

        @Override // com.daaw.qc0
        public void a() {
        }

        @Override // com.daaw.qc0
        public float b(float f) {
            return this.a.b(f);
        }

        @Override // com.daaw.qc0
        public qc0 c(float f) {
            return this.a.c(f);
        }

        @Override // com.daaw.qc0
        public le0 d() {
            return this.a.j(this.b);
        }

        @Override // com.daaw.qc0
        public float e(float f) {
            return this.a.e(f);
        }

        @Override // com.daaw.qc0
        public float f() {
            return this.a.f();
        }

        @Override // com.daaw.qc0
        public boolean g() {
            return this.a.g();
        }

        @Override // com.daaw.qc0
        public int getHeight() {
            return this.a.getHeight();
        }

        @Override // com.daaw.qc0
        public int getWidth() {
            return this.a.getWidth();
        }
    }

    public a7(le0[] le0VarArr, boolean z) {
        super(le0VarArr.length > 0 ? le0VarArr[0] : null, z);
        l(le0VarArr);
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public void a() {
        int i = 0;
        if (this.g) {
            int i2 = 0;
            while (true) {
                le0[] le0VarArr = this.k;
                if (i2 >= le0VarArr.length) {
                    break;
                }
                if (le0VarArr[i2] != null) {
                    le0VarArr[i2].a();
                }
                this.k[i2] = null;
                i2++;
            }
        }
        while (true) {
            qc0[] qc0VarArr = this.j;
            if (i >= qc0VarArr.length) {
                return;
            }
            if (qc0VarArr[i] != null) {
                qc0VarArr[i].a();
            }
            this.j[i] = null;
            i++;
        }
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public qc0 c(float f) {
        le0[] le0VarArr = this.k;
        int min = Math.min(((int) (le0VarArr.length * f)) % le0VarArr.length, this.l);
        if (min < 0) {
            return null;
        }
        return this.j[min];
    }

    @Override // com.daaw.z6, com.daaw.qc0
    public boolean g() {
        throw null;
    }

    @Override // com.daaw.z6
    public int i() {
        return this.k.length;
    }

    public le0 j(int i) {
        return this.k[i];
    }

    public void k(int i, le0 le0Var) {
        this.k[i] = le0Var;
        m(i);
    }

    public final void l(le0[] le0VarArr) {
        this.l = -1;
        this.k = le0VarArr;
        this.j = new qc0[le0VarArr.length];
        for (int i = 0; i < le0VarArr.length; i++) {
            if (this.k[i] != null) {
                this.l = i;
            }
            this.j[i] = new a(this, i);
        }
    }

    public void m(int i) {
        this.l = Math.min(i, this.k.length - 1);
    }
}
