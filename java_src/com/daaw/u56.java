package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class u56 implements i76 {

    /* renamed from: a */
    public final Context f28577a;

    /* renamed from: b */
    public final g77 f28578b;

    /* renamed from: c */
    public final ri6 f28579c;

    public u56(Context context, g77 g77Var, ri6 ri6Var) {
        this.f28577a = context;
        this.f28578b = g77Var;
        this.f28579c = ri6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10899z2)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        r1 = com.daaw.kv6.m17404k(r0).m17406i(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10444I2)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().m11915h().zzP());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10888y2)).booleanValue() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10362A2)).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        r0 = com.daaw.lv6.m16482j(r0);
        r2 = r0.m16483i(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10454J2)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().m11915h().zzP());
        r3 = r0.m16476p();
        r6 = r0.m16475q();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10877x2)).booleanValue() == false) goto L23;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ v56 m8563a() {
        try {
            Context context = this.f28577a;
            boolean m11285b = this.f28579c.m11285b();
            hv6 hv6Var = new hv6();
            hv6 hv6Var2 = new hv6();
            if (m11285b) {
                if (!((Boolean) zzba.zzc().m23658b(g93.f10373B2)).booleanValue()) {
                    return new v56(true);
                }
            }
            if (!m11285b) {
            }
            if (m11285b) {
            }
            if (!m11285b) {
            }
            if (m11285b) {
            }
            hv6 hv6Var3 = hv6Var2;
            boolean z = true;
            boolean z2 = true;
            return new v56(hv6Var, hv6Var3, z, z2, m11285b);
        } catch (IOException e) {
            zzt.zzo().m11902u(e, "PerAppIdSignal");
            return new v56(this.f28579c.m11285b());
        }
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 53;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f28578b.mo20112M(new Callable() { // from class: com.daaw.t56
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u56.this.m8563a();
            }
        });
    }
}
