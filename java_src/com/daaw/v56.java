package com.daaw;
/* loaded from: classes.dex */
public final class v56 implements h76 {
    public hv6 a;
    public hv6 b;
    public boolean c;
    public boolean d;
    public final boolean e = false;
    public final boolean f;

    public v56(hv6 hv6Var, hv6 hv6Var2, boolean z, boolean z2, boolean z3) {
        this.a = hv6Var;
        this.b = hv6Var2;
        this.c = z;
        this.d = z2;
        this.f = z3;
    }

    public v56(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.z2)).booleanValue() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r5.a.c() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        r1.putString("paidv1_id_android", r5.a.b());
        r1.putLong("paidv1_creation_time_android", r5.a.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.y2)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.A2)).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r5.b.c() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        r1.putString("paidv2_id_android", r5.b.b());
        r1.putLong("paidv2_creation_time_android", r5.b.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r1.putBoolean("paidv2_pub_option_android", r5.c);
        r1.putBoolean("paidv2_user_option_android", r5.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.x2)).booleanValue() == false) goto L28;
     */
    @Override // com.daaw.h76
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r6) {
        /*
            r5 = this;
            android.os.Bundle r6 = (android.os.Bundle) r6
            boolean r0 = r5.e
            if (r0 == 0) goto L8
            goto Lb9
        L8:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.daaw.cj6.a(r6, r0)
            boolean r2 = r5.f
            if (r2 != 0) goto L24
            com.daaw.y83 r2 = com.daaw.g93.x2
            com.daaw.e93 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L3a
        L24:
            boolean r2 = r5.f
            if (r2 == 0) goto L58
            com.daaw.y83 r2 = com.daaw.g93.z2
            com.daaw.e93 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L58
        L3a:
            com.daaw.hv6 r2 = r5.a
            boolean r2 = r2.c()
            if (r2 == 0) goto L58
            com.daaw.hv6 r2 = r5.a
            java.lang.String r2 = r2.b()
            java.lang.String r3 = "paidv1_id_android"
            r1.putString(r3, r2)
            com.daaw.hv6 r2 = r5.a
            long r2 = r2.a()
            java.lang.String r4 = "paidv1_creation_time_android"
            r1.putLong(r4, r2)
        L58:
            boolean r2 = r5.f
            if (r2 != 0) goto L6e
            com.daaw.y83 r2 = com.daaw.g93.y2
            com.daaw.e93 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L84
        L6e:
            boolean r2 = r5.f
            if (r2 == 0) goto Lb0
            com.daaw.y83 r2 = com.daaw.g93.A2
            com.daaw.e93 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb0
        L84:
            com.daaw.hv6 r2 = r5.b
            boolean r2 = r2.c()
            if (r2 == 0) goto La2
            com.daaw.hv6 r2 = r5.b
            java.lang.String r2 = r2.b()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.daaw.hv6 r2 = r5.b
            long r2 = r2.a()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        La2:
            boolean r2 = r5.c
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r5.d
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lb0:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb9
            r6.putBundle(r0, r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.v56.b(java.lang.Object):void");
    }
}
