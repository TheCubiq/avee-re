package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0097b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0097b c0097b = new DynamiteModule.b.C0097b();
        int b = aVar.b(context, str);
        c0097b.a = b;
        if (b != 0) {
            c0097b.c = -1;
        } else {
            int a = aVar.a(context, str, true);
            c0097b.b = a;
            if (a != 0) {
                c0097b.c = 1;
            }
        }
        return c0097b;
    }
}
