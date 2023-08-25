package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
public final class g implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0097b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0097b c0097b = new DynamiteModule.b.C0097b();
        c0097b.a = aVar.b(context, str);
        int a = aVar.a(context, str, true);
        c0097b.b = a;
        int i = c0097b.a;
        if (i == 0) {
            if (a == 0) {
                c0097b.c = 0;
                return c0097b;
            }
            i = 0;
        }
        if (a >= i) {
            c0097b.c = 1;
        } else {
            c0097b.c = -1;
        }
        return c0097b;
    }
}
