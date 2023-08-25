package com.daaw;

import android.content.Context;
import com.daaw.InterfaceC1539hj;
/* renamed from: com.daaw.ij */
/* loaded from: classes.dex */
public class C1712ij {
    /* renamed from: a */
    public InterfaceC1539hj m19759a(Context context, InterfaceC1539hj.InterfaceC1540a interfaceC1540a) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new C2465oq(context, interfaceC1540a) : new ht0();
    }
}
