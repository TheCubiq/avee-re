package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes2.dex */
public class ot1<V extends View> extends CoordinatorLayout.AbstractC0194c<V> {

    /* renamed from: a */
    public pt1 f21952a;

    /* renamed from: b */
    public int f21953b;

    /* renamed from: c */
    public int f21954c;

    public ot1() {
        this.f21953b = 0;
        this.f21954c = 0;
    }

    public ot1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21953b = 0;
        this.f21954c = 0;
    }

    /* renamed from: E */
    public int mo1020E() {
        pt1 pt1Var = this.f21952a;
        if (pt1Var != null) {
            return pt1Var.m13153b();
        }
        return 0;
    }

    /* renamed from: F */
    public void mo5427F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m29816I(v, i);
    }

    /* renamed from: G */
    public boolean mo1019G(int i) {
        pt1 pt1Var = this.f21952a;
        if (pt1Var != null) {
            return pt1Var.m13150e(i);
        }
        this.f21953b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: l */
    public boolean mo126l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo5427F(coordinatorLayout, v, i);
        if (this.f21952a == null) {
            this.f21952a = new pt1(v);
        }
        this.f21952a.m13152c();
        this.f21952a.m13154a();
        int i2 = this.f21953b;
        if (i2 != 0) {
            this.f21952a.m13150e(i2);
            this.f21953b = 0;
        }
        int i3 = this.f21954c;
        if (i3 != 0) {
            this.f21952a.m13151d(i3);
            this.f21954c = 0;
            return true;
        }
        return true;
    }
}
