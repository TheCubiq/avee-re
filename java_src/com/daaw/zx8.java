package com.daaw;

import android.content.Context;
import android.view.WindowManager;
/* loaded from: classes.dex */
public final class zx8 implements yx8 {
    public final WindowManager a;

    public zx8(WindowManager windowManager) {
        this.a = windowManager;
    }

    public static yx8 b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zx8(windowManager);
        }
        return null;
    }

    @Override // com.daaw.yx8
    public final void a(wx8 wx8Var) {
        cy8.b(wx8Var.a, this.a.getDefaultDisplay());
    }

    @Override // com.daaw.yx8
    public final void zza() {
    }
}
