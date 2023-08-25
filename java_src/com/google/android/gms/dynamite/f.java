package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0097b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0097b c0097b = new DynamiteModule.b.C0097b();
        int b = aVar.b(context, str);
        c0097b.a = b;
        int i = 0;
        int a = b != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0097b.b = a;
        int i2 = c0097b.a;
        if (i2 != 0) {
            i = i2;
        } else if (a == 0) {
            c0097b.c = 0;
            return c0097b;
        }
        if (i >= a) {
            c0097b.c = -1;
        } else {
            c0097b.c = 1;
        }
        return c0097b;
    }
}
