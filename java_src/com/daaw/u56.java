package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class u56 implements i76 {
    public final Context a;
    public final g77 b;
    public final ri6 c;

    public u56(Context context, g77 g77Var, ri6 ri6Var) {
        this.a = context;
        this.b = g77Var;
        this.c = ri6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.z2)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        r1 = com.daaw.kv6.k(r0).i(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.I2)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().h().zzP());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.y2)).booleanValue() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.A2)).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        r0 = com.daaw.lv6.j(r0);
        r2 = r0.i(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.J2)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().h().zzP());
        r3 = r0.p();
        r6 = r0.q();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.x2)).booleanValue() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.daaw.v56 a() {
        /*
            r8 = this;
            android.content.Context r0 = r8.a     // Catch: java.io.IOException -> Ldd
            com.daaw.ri6 r1 = r8.c     // Catch: java.io.IOException -> Ldd
            boolean r7 = r1.b()     // Catch: java.io.IOException -> Ldd
            com.daaw.hv6 r1 = new com.daaw.hv6     // Catch: java.io.IOException -> Ldd
            r1.<init>()     // Catch: java.io.IOException -> Ldd
            com.daaw.hv6 r2 = new com.daaw.hv6     // Catch: java.io.IOException -> Ldd
            r2.<init>()     // Catch: java.io.IOException -> Ldd
            r3 = 1
            if (r7 == 0) goto L2e
            com.daaw.y83 r4 = com.daaw.g93.B2     // Catch: java.io.IOException -> Ldd
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto L2e
            com.daaw.v56 r0 = new com.daaw.v56     // Catch: java.io.IOException -> Ldd
            r0.<init>(r3)     // Catch: java.io.IOException -> Ldd
            goto Ldc
        L2e:
            if (r7 != 0) goto L42
            com.daaw.y83 r4 = com.daaw.g93.x2     // Catch: java.io.IOException -> Ldd
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto L56
        L42:
            if (r7 == 0) goto L7a
            com.daaw.y83 r4 = com.daaw.g93.z2     // Catch: java.io.IOException -> Ldd
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 == 0) goto L7a
        L56:
            com.daaw.kv6 r1 = com.daaw.kv6.k(r0)     // Catch: java.io.IOException -> Ldd
            com.daaw.y83 r4 = com.daaw.g93.I2     // Catch: java.io.IOException -> Ldd
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.io.IOException -> Ldd
            long r4 = r4.longValue()     // Catch: java.io.IOException -> Ldd
            com.daaw.qz3 r6 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.ads.internal.util.zzg r6 = r6.h()     // Catch: java.io.IOException -> Ldd
            boolean r6 = r6.zzP()     // Catch: java.io.IOException -> Ldd
            com.daaw.hv6 r1 = r1.i(r4, r6)     // Catch: java.io.IOException -> Ldd
        L7a:
            if (r7 != 0) goto L8e
            com.daaw.y83 r4 = com.daaw.g93.y2     // Catch: java.io.IOException -> Ldd
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto La2
        L8e:
            if (r7 == 0) goto Ld2
            com.daaw.y83 r4 = com.daaw.g93.A2     // Catch: java.io.IOException -> Ldd
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 == 0) goto Ld2
        La2:
            com.daaw.lv6 r0 = com.daaw.lv6.j(r0)     // Catch: java.io.IOException -> Ldd
            com.daaw.y83 r2 = com.daaw.g93.J2     // Catch: java.io.IOException -> Ldd
            com.daaw.e93 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r2 = r3.b(r2)     // Catch: java.io.IOException -> Ldd
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.io.IOException -> Ldd
            long r2 = r2.longValue()     // Catch: java.io.IOException -> Ldd
            com.daaw.qz3 r4 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.ads.internal.util.zzg r4 = r4.h()     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.zzP()     // Catch: java.io.IOException -> Ldd
            com.daaw.hv6 r2 = r0.i(r2, r4)     // Catch: java.io.IOException -> Ldd
            boolean r3 = r0.p()     // Catch: java.io.IOException -> Ldd
            boolean r0 = r0.q()     // Catch: java.io.IOException -> Ldd
            r6 = r0
            r4 = r2
            r5 = r3
            goto Ld5
        Ld2:
            r4 = r2
            r5 = 1
            r6 = 1
        Ld5:
            com.daaw.v56 r0 = new com.daaw.v56     // Catch: java.io.IOException -> Ldd
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> Ldd
        Ldc:
            return r0
        Ldd:
            r0 = move-exception
            com.daaw.qz3 r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r2 = "PerAppIdSignal"
            r1.u(r0, r2)
            com.daaw.v56 r0 = new com.daaw.v56
            com.daaw.ri6 r1 = r8.c
            boolean r1 = r1.b()
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.u56.a():com.daaw.v56");
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 53;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.b.M(new Callable() { // from class: com.daaw.t56
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u56.this.a();
            }
        });
    }
}
