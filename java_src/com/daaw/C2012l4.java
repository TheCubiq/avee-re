package com.daaw;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* renamed from: com.daaw.l4 */
/* loaded from: classes.dex */
public class C2012l4 extends PopupWindow {

    /* renamed from: b */
    public static final boolean f17024b;

    /* renamed from: a */
    public boolean f17025a;

    static {
        f17024b = Build.VERSION.SDK_INT < 21;
    }

    public C2012l4(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m17165a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void m17165a(Context context, AttributeSet attributeSet, int i, int i2) {
        ul1 m8037v = ul1.m8037v(context, attributeSet, x21.f31876Y1, i, i2);
        int i3 = x21.f31885a2;
        if (m8037v.m8040s(i3)) {
            m17164b(m8037v.m8058a(i3, false));
        }
        setBackgroundDrawable(m8037v.m8052g(x21.f31880Z1));
        m8037v.m8036w();
    }

    /* renamed from: b */
    public final void m17164b(boolean z) {
        if (f17024b) {
            this.f17025a = z;
        } else {
            hy0.m20331a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f17024b && this.f17025a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f17024b && this.f17025a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f17024b && this.f17025a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
