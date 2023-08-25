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

    /* renamed from: a */
    public final Context f17135a;

    /* renamed from: b */
    public final ScheduledExecutorService f17136b;

    /* renamed from: c */
    public final Executor f17137c;

    /* renamed from: d */
    public final int f17138d;

    /* renamed from: e */
    public final boolean f17139e;

    /* renamed from: f */
    public final boolean f17140f;

    /* renamed from: g */
    public final hz3 f17141g;

    public l86(hz3 hz3Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2, byte[] bArr) {
        this.f17141g = hz3Var;
        this.f17135a = context;
        this.f17136b = scheduledExecutorService;
        this.f17137c = executor;
        this.f17138d = i;
        this.f17139e = z;
        this.f17140f = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        r1 = com.daaw.kv6.m17404k(r7.f17135a);
        r8.getClass();
        r2 = r8.getId();
        r2.getClass();
        r0 = r1.m17405j(r2, r7.f17135a.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10444I2)).longValue(), r7.f17140f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().m11902u(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.daaw.hv6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10404E2)).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10414F2)).booleanValue() != false) goto L5;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ m86 m17101a(AdvertisingIdClient.Info info) {
        hv6 hv6Var = new hv6();
        if (!this.f17139e) {
        }
        if (this.f17139e) {
        }
        return new m86(info, null, hv6Var);
    }

    /* renamed from: b */
    public final /* synthetic */ m86 m17100b(Throwable th) {
        zzay.zzb();
        ContentResolver contentResolver = this.f17135a.getContentResolver();
        return new m86(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new hv6());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 40;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10502O0)).booleanValue()) {
            return s67.m10637f((j67) s67.m10628o(s67.m10630m(j67.m18784D(this.f17141g.m20319a(this.f17135a, this.f17138d)), new ey6() { // from class: com.daaw.v76
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    return l86.this.m17101a((AdvertisingIdClient.Info) obj);
                }
            }, this.f17137c), ((Long) zzba.zzc().m23658b(g93.f10512P0)).longValue(), TimeUnit.MILLISECONDS, this.f17136b), Throwable.class, new ey6() { // from class: com.daaw.k86
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    return l86.this.m17100b((Throwable) obj);
                }
            }, this.f17137c);
        }
        return s67.m10635h(new Exception("Did not ad Ad ID into query param."));
    }
}
