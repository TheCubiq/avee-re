package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* renamed from: com.google.android.gms.dynamite.d */
/* loaded from: classes.dex */
public final class C3999d implements DynamiteModule.InterfaceC3993b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3993b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC3993b.C3995b mo1137a(Context context, String str, DynamiteModule.InterfaceC3993b.InterfaceC3994a interfaceC3994a) {
        DynamiteModule.InterfaceC3993b.C3995b c3995b = new DynamiteModule.InterfaceC3993b.C3995b();
        int mo1136a = interfaceC3994a.mo1136a(context, str, false);
        c3995b.f36697b = mo1136a;
        if (mo1136a == 0) {
            c3995b.f36698c = 0;
        } else {
            c3995b.f36698c = 1;
        }
        return c3995b;
    }
}
