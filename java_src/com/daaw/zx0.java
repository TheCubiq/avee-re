package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class zx0 {

    /* renamed from: a */
    public List<C3914a> f35627a = new ArrayList();

    /* renamed from: com.daaw.zx0$a */
    /* loaded from: classes.dex */
    public class C3914a {

        /* renamed from: a */
        public float f35628a;

        /* renamed from: b */
        public float f35629b;

        public C3914a(float f, float f2) {
            this.f35628a = f;
            this.f35629b = f2;
        }
    }

    /* renamed from: a */
    public void m1811a() {
        this.f35627a.clear();
    }

    /* renamed from: b */
    public float m1810b(float f) {
        int i = -1;
        for (int i2 = 0; i2 < this.f35627a.size(); i2++) {
            if (this.f35627a.get(i2).f35628a == f) {
                return this.f35627a.get(i2).f35629b;
            }
            if (this.f35627a.get(i2).f35628a > f) {
                return m1809c(i, i2, f);
            }
            i = i2;
        }
        return m1809c(i, this.f35627a.size(), f);
    }

    /* renamed from: c */
    public float m1809c(int i, int i2, float f) {
        if (this.f35627a.size() == 0) {
            return 0.0f;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= this.f35627a.size()) {
            i2 = this.f35627a.size() - 1;
        }
        if (i == i2) {
            return this.f35627a.get(i2).f35629b;
        }
        float f2 = (f - this.f35627a.get(i).f35628a) / (this.f35627a.get(i2).f35628a - this.f35627a.get(i).f35628a);
        return (this.f35627a.get(i).f35629b * (1.0f - f2)) + (this.f35627a.get(i2).f35629b * f2);
    }

    /* renamed from: d */
    public void m1808d(float f, float f2) {
        for (int i = 0; i < this.f35627a.size(); i++) {
            if (this.f35627a.get(i).f35628a == f) {
                return;
            }
            if (this.f35627a.get(i).f35628a > f) {
                this.f35627a.add(i, new C3914a(f, f2));
                return;
            }
        }
        List<C3914a> list = this.f35627a;
        list.add(list.size(), new C3914a(f, f2));
    }
}
