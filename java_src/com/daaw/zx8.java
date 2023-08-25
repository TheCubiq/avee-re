package com.daaw;

import android.content.Context;
import android.view.WindowManager;
/* loaded from: classes.dex */
public final class zx8 implements yx8 {

    /* renamed from: a */
    public final WindowManager f35640a;

    public zx8(WindowManager windowManager) {
        this.f35640a = windowManager;
    }

    /* renamed from: b */
    public static yx8 m1795b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zx8(windowManager);
        }
        return null;
    }

    @Override // com.daaw.yx8
    /* renamed from: a */
    public final void mo1796a(wx8 wx8Var) {
        cy8.m24880b(wx8Var.f31647a, this.f35640a.getDefaultDisplay());
    }

    @Override // com.daaw.yx8
    public final void zza() {
    }
}
