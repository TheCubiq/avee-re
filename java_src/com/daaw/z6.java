package com.daaw;
/* loaded from: classes.dex */
public class z6 implements qc0 {
    public static final v40<le0, Integer, Integer, Integer, Integer, Boolean, qc0> h = new a();
    public static final qc0 i = new b();
    public le0 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    /* loaded from: classes.dex */
    public class a implements v40<le0, Integer, Integer, Integer, Integer, Boolean, qc0> {
    }

    /* loaded from: classes.dex */
    public static class b implements qc0 {
        @Override // com.daaw.qc0
        public void a() {
        }

        @Override // com.daaw.qc0
        public float b(float f) {
            return 1.0f;
        }

        @Override // com.daaw.qc0
        public qc0 c(float f) {
            return this;
        }

        @Override // com.daaw.qc0
        public le0 d() {
            return null;
        }

        @Override // com.daaw.qc0
        public float e(float f) {
            return 1.0f;
        }

        @Override // com.daaw.qc0
        public float f() {
            return 0.0f;
        }

        @Override // com.daaw.qc0
        public boolean g() {
            return false;
        }

        @Override // com.daaw.qc0
        public int getHeight() {
            return 1;
        }

        @Override // com.daaw.qc0
        public int getWidth() {
            return 1;
        }
    }

    public z6(le0 le0Var, int i2, int i3, int i4, int i5, boolean z) {
        this.f = 1;
        this.a = le0Var;
        this.g = z;
        if (le0Var.getHeight() < 1 || le0Var.getWidth() < 1) {
            lz1.c("texture invalid dimensions");
        }
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public z6(le0 le0Var, boolean z) {
        this.f = 1;
        this.a = le0Var;
        this.g = z;
        this.b = 0;
        this.c = 0;
        this.d = le0Var.getWidth();
        this.e = le0Var.getHeight();
        if (this.a.getHeight() < 1 || this.a.getWidth() < 1) {
            lz1.c("texture invalid dimensions");
        }
    }

    @Override // com.daaw.qc0
    public void a() {
        le0 le0Var;
        if (!this.g || (le0Var = this.a) == null) {
            return;
        }
        le0Var.a();
    }

    @Override // com.daaw.qc0
    public float b(float f) {
        return (this.c / this.a.getHeight()) + ((this.e / this.a.getHeight()) * f);
    }

    @Override // com.daaw.qc0
    public qc0 c(float f) {
        return h(this.a, this.b, this.c, this.d, this.e, false);
    }

    @Override // com.daaw.qc0
    public le0 d() {
        return this.a;
    }

    @Override // com.daaw.qc0
    public float e(float f) {
        return (this.b / this.a.getWidth()) + ((this.d / this.a.getWidth()) * f);
    }

    @Override // com.daaw.qc0
    public float f() {
        return 0.0f;
    }

    @Override // com.daaw.qc0
    public boolean g() {
        return false;
    }

    @Override // com.daaw.qc0
    public int getHeight() {
        return this.e;
    }

    @Override // com.daaw.qc0
    public int getWidth() {
        return this.d;
    }

    public qc0 h(le0 le0Var, int i2, int i3, int i4, int i5, boolean z) {
        return new z6(le0Var, i2, i3, i4, i5, z);
    }

    public int i() {
        return this.f;
    }
}
