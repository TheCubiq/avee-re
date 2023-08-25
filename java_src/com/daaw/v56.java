package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class v56 implements h76 {

    /* renamed from: a */
    public hv6 f29925a;

    /* renamed from: b */
    public hv6 f29926b;

    /* renamed from: c */
    public boolean f29927c;

    /* renamed from: d */
    public boolean f29928d;

    /* renamed from: e */
    public final boolean f29929e = false;

    /* renamed from: f */
    public final boolean f29930f;

    public v56(hv6 hv6Var, hv6 hv6Var2, boolean z, boolean z2, boolean z3) {
        this.f29925a = hv6Var;
        this.f29926b = hv6Var2;
        this.f29927c = z;
        this.f29928d = z2;
        this.f29930f = z3;
    }

    public v56(boolean z) {
        this.f29930f = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10899z2)).booleanValue() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r5.f29925a.m20385c() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        r1.putString("paidv1_id_android", r5.f29925a.m20386b());
        r1.putLong("paidv1_creation_time_android", r5.f29925a.m20387a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10888y2)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10362A2)).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r5.f29926b.m20385c() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        r1.putString("paidv2_id_android", r5.f29926b.m20386b());
        r1.putLong("paidv2_creation_time_android", r5.f29926b.m20387a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r1.putBoolean("paidv2_pub_option_android", r5.f29927c);
        r1.putBoolean("paidv2_user_option_android", r5.f29928d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10877x2)).booleanValue() == false) goto L28;
     */
    @Override // com.daaw.h76
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f29929e) {
            return;
        }
        Bundle m25318a = cj6.m25318a(bundle, "pii");
        if (!this.f29930f) {
        }
        if (this.f29930f) {
        }
        if (!this.f29930f) {
        }
        if (this.f29930f) {
        }
        if (m25318a.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", m25318a);
    }
}
