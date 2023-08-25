package com.daaw;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class y46 implements i76 {
    public final g77 a;
    public final ri6 b;
    public final PackageInfo c;
    public final zzg d;

    public y46(g77 g77Var, ri6 ri6Var, PackageInfo packageInfo, zzg zzgVar) {
        this.a = g77Var;
        this.b = ri6Var;
        this.c = packageInfo;
        this.d = zzgVar;
    }

    public static /* synthetic */ z46 a(final y46 y46Var) {
        final ArrayList arrayList = y46Var.b.g;
        return arrayList == null ? new z46() { // from class: com.daaw.u46
            @Override // com.daaw.h76
            public final void b(Object obj) {
                Bundle bundle = (Bundle) obj;
            }
        } : arrayList.isEmpty() ? new z46() { // from class: com.daaw.v46
            @Override // com.daaw.h76
            public final void b(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new z46() { // from class: com.daaw.w46
            @Override // com.daaw.h76
            public final void b(Object obj) {
                y46.this.b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if (r9 == 3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.y46.b(java.util.ArrayList, android.os.Bundle):void");
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 26;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.x46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y46.a(y46.this);
            }
        });
    }
}
