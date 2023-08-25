package com.daaw;
/* renamed from: com.daaw.z6 */
/* loaded from: classes.dex */
public class C3812z6 implements qc0 {

    /* renamed from: h */
    public static final v40<le0, Integer, Integer, Integer, Integer, Boolean, qc0> f34483h = new C3813a();

    /* renamed from: i */
    public static final qc0 f34484i = new C3814b();

    /* renamed from: a */
    public le0 f34485a;

    /* renamed from: b */
    public int f34486b;

    /* renamed from: c */
    public int f34487c;

    /* renamed from: d */
    public int f34488d;

    /* renamed from: e */
    public int f34489e;

    /* renamed from: f */
    public int f34490f;

    /* renamed from: g */
    public boolean f34491g;

    /* renamed from: com.daaw.z6$a */
    /* loaded from: classes.dex */
    public class C3813a implements v40<le0, Integer, Integer, Integer, Integer, Boolean, qc0> {
    }

    /* renamed from: com.daaw.z6$b */
    /* loaded from: classes.dex */
    public static class C3814b implements qc0 {
        @Override // com.daaw.qc0
        /* renamed from: a */
        public void mo2801a() {
        }

        @Override // com.daaw.qc0
        /* renamed from: b */
        public float mo2800b(float f) {
            return 1.0f;
        }

        @Override // com.daaw.qc0
        /* renamed from: c */
        public qc0 mo2799c(float f) {
            return this;
        }

        @Override // com.daaw.qc0
        /* renamed from: d */
        public le0 mo2798d() {
            return null;
        }

        @Override // com.daaw.qc0
        /* renamed from: e */
        public float mo2797e(float f) {
            return 1.0f;
        }

        @Override // com.daaw.qc0
        /* renamed from: f */
        public float mo2796f() {
            return 0.0f;
        }

        @Override // com.daaw.qc0
        /* renamed from: g */
        public boolean mo2795g() {
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

    public C3812z6(le0 le0Var, int i, int i2, int i3, int i4, boolean z) {
        this.f34490f = 1;
        this.f34485a = le0Var;
        this.f34491g = z;
        if (le0Var.getHeight() < 1 || le0Var.getWidth() < 1) {
            lz1.m16363c("texture invalid dimensions");
        }
        this.f34486b = i;
        this.f34487c = i2;
        this.f34488d = i3;
        this.f34489e = i4;
    }

    public C3812z6(le0 le0Var, boolean z) {
        this.f34490f = 1;
        this.f34485a = le0Var;
        this.f34491g = z;
        this.f34486b = 0;
        this.f34487c = 0;
        this.f34488d = le0Var.getWidth();
        this.f34489e = le0Var.getHeight();
        if (this.f34485a.getHeight() < 1 || this.f34485a.getWidth() < 1) {
            lz1.m16363c("texture invalid dimensions");
        }
    }

    @Override // com.daaw.qc0
    /* renamed from: a */
    public void mo2801a() {
        le0 le0Var;
        if (!this.f34491g || (le0Var = this.f34485a) == null) {
            return;
        }
        le0Var.mo7096a();
    }

    @Override // com.daaw.qc0
    /* renamed from: b */
    public float mo2800b(float f) {
        return (this.f34487c / this.f34485a.getHeight()) + ((this.f34489e / this.f34485a.getHeight()) * f);
    }

    @Override // com.daaw.qc0
    /* renamed from: c */
    public qc0 mo2799c(float f) {
        return mo2803h(this.f34485a, this.f34486b, this.f34487c, this.f34488d, this.f34489e, false);
    }

    @Override // com.daaw.qc0
    /* renamed from: d */
    public le0 mo2798d() {
        return this.f34485a;
    }

    @Override // com.daaw.qc0
    /* renamed from: e */
    public float mo2797e(float f) {
        return (this.f34486b / this.f34485a.getWidth()) + ((this.f34488d / this.f34485a.getWidth()) * f);
    }

    @Override // com.daaw.qc0
    /* renamed from: f */
    public float mo2796f() {
        return 0.0f;
    }

    @Override // com.daaw.qc0
    /* renamed from: g */
    public boolean mo2795g() {
        return false;
    }

    @Override // com.daaw.qc0
    public int getHeight() {
        return this.f34489e;
    }

    @Override // com.daaw.qc0
    public int getWidth() {
        return this.f34488d;
    }

    /* renamed from: h */
    public qc0 mo2803h(le0 le0Var, int i, int i2, int i3, int i4, boolean z) {
        return new C3812z6(le0Var, i, i2, i3, i4, z);
    }

    /* renamed from: i */
    public int mo2802i() {
        return this.f34490f;
    }
}
