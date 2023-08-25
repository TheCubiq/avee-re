package com.daaw;
/* loaded from: classes.dex */
public class k61 {

    /* renamed from: a */
    public int f15696a = 0;

    /* renamed from: b */
    public int f15697b = 0;

    /* renamed from: c */
    public int f15698c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f15699d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f15700e = 0;

    /* renamed from: f */
    public int f15701f = 0;

    /* renamed from: g */
    public boolean f15702g = false;

    /* renamed from: h */
    public boolean f15703h = false;

    /* renamed from: a */
    public int m18032a() {
        return this.f15702g ? this.f15696a : this.f15697b;
    }

    /* renamed from: b */
    public int m18031b() {
        return this.f15696a;
    }

    /* renamed from: c */
    public int m18030c() {
        return this.f15697b;
    }

    /* renamed from: d */
    public int m18029d() {
        return this.f15702g ? this.f15697b : this.f15696a;
    }

    /* renamed from: e */
    public void m18028e(int i, int i2) {
        this.f15703h = false;
        if (i != Integer.MIN_VALUE) {
            this.f15700e = i;
            this.f15696a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f15701f = i2;
            this.f15697b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m18027f(boolean z) {
        int i;
        if (z == this.f15702g) {
            return;
        }
        this.f15702g = z;
        if (!this.f15703h) {
            this.f15696a = this.f15700e;
        } else if (z) {
            int i2 = this.f15699d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f15700e;
            }
            this.f15696a = i2;
            i = this.f15698c;
        } else {
            int i3 = this.f15698c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f15700e;
            }
            this.f15696a = i3;
            i = this.f15699d;
        }
        i = this.f15701f;
        this.f15697b = i;
    }

    /* renamed from: g */
    public void m18026g(int i, int i2) {
        this.f15698c = i;
        this.f15699d = i2;
        this.f15703h = true;
        if (this.f15702g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f15696a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f15697b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f15696a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f15697b = i2;
        }
    }
}
