package com.daaw;
/* renamed from: com.daaw.a7 */
/* loaded from: classes.dex */
public class C0605a7 extends C3812z6 {

    /* renamed from: j */
    public qc0[] f2939j;

    /* renamed from: k */
    public le0[] f2940k;

    /* renamed from: l */
    public int f2941l;

    /* renamed from: com.daaw.a7$a */
    /* loaded from: classes.dex */
    public static class C0606a implements qc0 {

        /* renamed from: a */
        public final C0605a7 f2942a;

        /* renamed from: b */
        public final int f2943b;

        public C0606a(C0605a7 c0605a7, int i) {
            this.f2942a = c0605a7;
            this.f2943b = i;
        }

        @Override // com.daaw.qc0
        /* renamed from: a */
        public void mo2801a() {
        }

        @Override // com.daaw.qc0
        /* renamed from: b */
        public float mo2800b(float f) {
            return this.f2942a.mo2800b(f);
        }

        @Override // com.daaw.qc0
        /* renamed from: c */
        public qc0 mo2799c(float f) {
            return this.f2942a.mo2799c(f);
        }

        @Override // com.daaw.qc0
        /* renamed from: d */
        public le0 mo2798d() {
            return this.f2942a.m27592j(this.f2943b);
        }

        @Override // com.daaw.qc0
        /* renamed from: e */
        public float mo2797e(float f) {
            return this.f2942a.mo2797e(f);
        }

        @Override // com.daaw.qc0
        /* renamed from: f */
        public float mo2796f() {
            return this.f2942a.mo2796f();
        }

        @Override // com.daaw.qc0
        /* renamed from: g */
        public boolean mo2795g() {
            return this.f2942a.mo2795g();
        }

        @Override // com.daaw.qc0
        public int getHeight() {
            return this.f2942a.getHeight();
        }

        @Override // com.daaw.qc0
        public int getWidth() {
            return this.f2942a.getWidth();
        }
    }

    public C0605a7(le0[] le0VarArr, boolean z) {
        super(le0VarArr.length > 0 ? le0VarArr[0] : null, z);
        m27590l(le0VarArr);
    }

    @Override // com.daaw.C3812z6, com.daaw.qc0
    /* renamed from: a */
    public void mo2801a() {
        int i = 0;
        if (this.f34491g) {
            int i2 = 0;
            while (true) {
                le0[] le0VarArr = this.f2940k;
                if (i2 >= le0VarArr.length) {
                    break;
                }
                if (le0VarArr[i2] != null) {
                    le0VarArr[i2].mo7096a();
                }
                this.f2940k[i2] = null;
                i2++;
            }
        }
        while (true) {
            qc0[] qc0VarArr = this.f2939j;
            if (i >= qc0VarArr.length) {
                return;
            }
            if (qc0VarArr[i] != null) {
                qc0VarArr[i].mo2801a();
            }
            this.f2939j[i] = null;
            i++;
        }
    }

    @Override // com.daaw.C3812z6, com.daaw.qc0
    /* renamed from: c */
    public qc0 mo2799c(float f) {
        le0[] le0VarArr = this.f2940k;
        int min = Math.min(((int) (le0VarArr.length * f)) % le0VarArr.length, this.f2941l);
        if (min < 0) {
            return null;
        }
        return this.f2939j[min];
    }

    @Override // com.daaw.C3812z6, com.daaw.qc0
    /* renamed from: g */
    public boolean mo2795g() {
        throw null;
    }

    @Override // com.daaw.C3812z6
    /* renamed from: i */
    public int mo2802i() {
        return this.f2940k.length;
    }

    /* renamed from: j */
    public le0 m27592j(int i) {
        return this.f2940k[i];
    }

    /* renamed from: k */
    public void m27591k(int i, le0 le0Var) {
        this.f2940k[i] = le0Var;
        m27589m(i);
    }

    /* renamed from: l */
    public final void m27590l(le0[] le0VarArr) {
        this.f2941l = -1;
        this.f2940k = le0VarArr;
        this.f2939j = new qc0[le0VarArr.length];
        for (int i = 0; i < le0VarArr.length; i++) {
            if (this.f2940k[i] != null) {
                this.f2941l = i;
            }
            this.f2939j[i] = new C0606a(this, i);
        }
    }

    /* renamed from: m */
    public void m27589m(int i) {
        this.f2941l = Math.min(i, this.f2940k.length - 1);
    }
}
