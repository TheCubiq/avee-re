package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class zx0 {
    public List<a> a = new ArrayList();

    /* loaded from: classes.dex */
    public class a {
        public float a;
        public float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }

    public void a() {
        this.a.clear();
    }

    public float b(float f) {
        int i = -1;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (this.a.get(i2).a == f) {
                return this.a.get(i2).b;
            }
            if (this.a.get(i2).a > f) {
                return c(i, i2, f);
            }
            i = i2;
        }
        return c(i, this.a.size(), f);
    }

    public float c(int i, int i2, float f) {
        if (this.a.size() == 0) {
            return 0.0f;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= this.a.size()) {
            i2 = this.a.size() - 1;
        }
        if (i == i2) {
            return this.a.get(i2).b;
        }
        float f2 = (f - this.a.get(i).a) / (this.a.get(i2).a - this.a.get(i).a);
        return (this.a.get(i).b * (1.0f - f2)) + (this.a.get(i2).b * f2);
    }

    public void d(float f, float f2) {
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).a == f) {
                return;
            }
            if (this.a.get(i).a > f) {
                this.a.add(i, new a(f, f2));
                return;
            }
        }
        List<a> list = this.a;
        list.add(list.size(), new a(f, f2));
    }
}
