package com.daaw;

import android.content.Context;
import android.view.SubMenu;
/* loaded from: classes2.dex */
public class bs0 extends androidx.appcompat.view.menu.e {
    public bs0(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) a(i, i2, i3, charSequence);
        ds0 ds0Var = new ds0(w(), this, gVar);
        gVar.x(ds0Var);
        return ds0Var;
    }
}
