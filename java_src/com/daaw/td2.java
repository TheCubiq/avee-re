package com.daaw;
/* loaded from: classes.dex */
public final class td2 {

    /* renamed from: a */
    public final String f27503a;

    /* renamed from: b */
    public final int f27504b;

    /* renamed from: c */
    public final int f27505c;

    /* renamed from: d */
    public int f27506d;

    /* renamed from: e */
    public String f27507e;

    public td2(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f27503a = str;
        this.f27504b = i2;
        this.f27505c = i3;
        this.f27506d = Integer.MIN_VALUE;
        this.f27507e = "";
    }

    /* renamed from: a */
    public final int m9284a() {
        m9281d();
        return this.f27506d;
    }

    /* renamed from: b */
    public final String m9283b() {
        m9281d();
        return this.f27507e;
    }

    /* renamed from: c */
    public final void m9282c() {
        int i = this.f27506d;
        int i2 = i == Integer.MIN_VALUE ? this.f27504b : i + this.f27505c;
        this.f27506d = i2;
        String str = this.f27503a;
        this.f27507e = str + i2;
    }

    /* renamed from: d */
    public final void m9281d() {
        if (this.f27506d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
