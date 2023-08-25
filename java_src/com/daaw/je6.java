package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes.dex */
public final class je6 implements o67 {
    public je6(le6 le6Var) {
    }

    @Override // com.daaw.o67
    public final /* synthetic */ void a(@NullableDecl Object obj) {
        Void r1 = (Void) obj;
        zze.zza("Notification of cache hit successful.");
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        zze.zza("Notification of cache hit failed.");
    }
}
