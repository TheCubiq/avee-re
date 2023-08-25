package com.daaw;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public class l4 extends PopupWindow {
    public static final boolean b;
    public boolean a;

    static {
        b = Build.VERSION.SDK_INT < 21;
    }

    public l4(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        ul1 v = ul1.v(context, attributeSet, x21.Y1, i, i2);
        int i3 = x21.a2;
        if (v.s(i3)) {
            b(v.a(i3, false));
        }
        setBackgroundDrawable(v.g(x21.Z1));
        v.w();
    }

    public final void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            hy0.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
