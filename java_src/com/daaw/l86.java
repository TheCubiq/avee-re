package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class l86 implements i76 {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final hz3 g;

    public l86(hz3 hz3Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2, byte[] bArr) {
        this.g = hz3Var;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = executor;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        r1 = com.daaw.kv6.k(r7.a);
        r8.getClass();
        r2 = r8.getId();
        r2.getClass();
        r0 = r1.j(r2, r7.a.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.I2)).longValue(), r7.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().u(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.daaw.hv6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.E2)).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.F2)).booleanValue() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.daaw.m86 a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.daaw.hv6 r0 = new com.daaw.hv6
            r0.<init>()
            boolean r1 = r7.e
            if (r1 != 0) goto L1b
            com.daaw.y83 r1 = com.daaw.g93.E2
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.e
            if (r1 == 0) goto L6f
            com.daaw.y83 r1 = com.daaw.g93.F2
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.kv6 r1 = com.daaw.kv6.k(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r8.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.y83 r0 = com.daaw.g93.I2     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.e93 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.hv6 r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            com.daaw.qz3 r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.u(r0, r2)
            com.daaw.hv6 r0 = new com.daaw.hv6
            r0.<init>()
        L6f:
            com.daaw.m86 r1 = new com.daaw.m86
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.l86.a(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.daaw.m86");
    }

    public final /* synthetic */ m86 b(Throwable th) {
        zzay.zzb();
        ContentResolver contentResolver = this.a.getContentResolver();
        return new m86(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new hv6());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 40;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (((Boolean) zzba.zzc().b(g93.O0)).booleanValue()) {
            return s67.f((j67) s67.o(s67.m(j67.D(this.g.a(this.a, this.d)), new ey6() { // from class: com.daaw.v76
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    return l86.this.a((AdvertisingIdClient.Info) obj);
                }
            }, this.c), ((Long) zzba.zzc().b(g93.P0)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new ey6() { // from class: com.daaw.k86
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    return l86.this.b((Throwable) obj);
                }
            }, this.c);
        }
        return s67.h(new Exception("Did not ad Ad ID into query param."));
    }
}
