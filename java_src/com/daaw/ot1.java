package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes2.dex */
public class ot1<V extends View> extends CoordinatorLayout.c<V> {
    public pt1 a;
    public int b;
    public int c;

    public ot1() {
        this.b = 0;
        this.c = 0;
    }

    public ot1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }

    public int E() {
        pt1 pt1Var = this.a;
        if (pt1Var != null) {
            return pt1Var.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.I(v, i);
    }

    public boolean G(int i) {
        pt1 pt1Var = this.a;
        if (pt1Var != null) {
            return pt1Var.e(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        F(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new pt1(v);
        }
        this.a.c();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.e(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 != 0) {
            this.a.d(i3);
            this.c = 0;
            return true;
        }
        return true;
    }
}
