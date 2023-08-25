package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class y81 {
    /* renamed from: a */
    public static py1 m4017a(Context context, InterfaceC2134ly interfaceC2134ly, s81 s81Var, InterfaceC0951cg interfaceC0951cg) {
        return Build.VERSION.SDK_INT >= 21 ? new ph0(context, interfaceC2134ly, s81Var) : new C3276v1(context, interfaceC2134ly, interfaceC0951cg, s81Var);
    }
}
