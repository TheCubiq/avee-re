package com.daaw;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
/* loaded from: classes2.dex */
public class bs0 extends C0082e {
    public bs0(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0082e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0086g c0086g = (C0086g) m30247a(i, i2, i3, charSequence);
        ds0 ds0Var = new ds0(m30221w(), this, c0086g);
        c0086g.m30192x(ds0Var);
        return ds0Var;
    }
}
