package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* renamed from: com.google.android.gms.dynamite.e */
/* loaded from: classes.dex */
public final class C4000e implements DynamiteModule.InterfaceC3993b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC3993b
    /* renamed from: a */
    public final DynamiteModule.InterfaceC3993b.C3995b mo1137a(Context context, String str, DynamiteModule.InterfaceC3993b.InterfaceC3994a interfaceC3994a) {
        DynamiteModule.InterfaceC3993b.C3995b c3995b = new DynamiteModule.InterfaceC3993b.C3995b();
        c3995b.f36696a = interfaceC3994a.mo1135b(context, str);
        int mo1136a = interfaceC3994a.mo1136a(context, str, true);
        c3995b.f36697b = mo1136a;
        int i = c3995b.f36696a;
        if (i == 0) {
            if (mo1136a == 0) {
                c3995b.f36698c = 0;
                return c3995b;
            }
            i = 0;
        }
        if (i >= mo1136a) {
            c3995b.f36698c = -1;
        } else {
            c3995b.f36698c = 1;
        }
        return c3995b;
    }
}
