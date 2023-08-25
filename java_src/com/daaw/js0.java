package com.daaw;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class js0 {

    /* renamed from: a */
    public int f15362a;

    /* renamed from: b */
    public int f15363b;

    public js0(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m18279a() {
        return this.f15362a | this.f15363b;
    }

    /* renamed from: b */
    public void m18278b(View view, View view2, int i) {
        m18277c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m18277c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f15363b = i;
        } else {
            this.f15362a = i;
        }
    }

    /* renamed from: d */
    public void m18276d(View view, int i) {
        if (i == 1) {
            this.f15363b = 0;
        } else {
            this.f15362a = 0;
        }
    }
}
