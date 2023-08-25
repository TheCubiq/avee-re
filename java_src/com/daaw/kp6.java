package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class kp6 {
    public final vu5 a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final gi6 f;
    public final hi6 g;
    public final ag h;
    public final sl2 i;

    public kp6(vu5 vu5Var, zzchu zzchuVar, String str, String str2, Context context, gi6 gi6Var, hi6 hi6Var, ag agVar, sl2 sl2Var) {
        this.a = vu5Var;
        this.b = zzchuVar.p;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = gi6Var;
        this.g = hi6Var;
        this.h = agVar;
        this.i = sl2Var;
    }

    public static final List f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static String g(String str) {
        return TextUtils.isEmpty(str) ? "" : j04.l() ? "fakeForAdDebugLog" : str;
    }

    public static String h(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List c(fi6 fi6Var, th6 th6Var, List list) {
        return d(fi6Var, th6Var, false, "", "", list);
    }

    public final List d(fi6 fi6Var, th6 th6Var, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String h = h(h(h((String) it.next(), "@gw_adlocid@", fi6Var.a.a.f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.b);
            if (th6Var != null) {
                h = my3.c(h(h(h(h, "@gw_qdata@", th6Var.z), "@gw_adnetid@", th6Var.y), "@gw_allocid@", th6Var.x), this.e, th6Var.X);
            }
            String h2 = h(h(h(h, "@gw_adnetstatus@", this.a.f()), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            boolean z2 = false;
            if (((Boolean) zzba.zzc().b(g93.Z2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(h2);
                }
            }
            if (this.i.f(Uri.parse(h2))) {
                Uri.Builder buildUpon = Uri.parse(h2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                h2 = buildUpon.build().toString();
            }
            arrayList.add(h2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(com.daaw.th6 r10, java.util.List r11, com.daaw.cv3 r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.daaw.ag r1 = r9.h
            long r1 = r1.a()
            java.lang.String r3 = r12.zzc()     // Catch: android.os.RemoteException -> La8
            int r12 = r12.zzb()     // Catch: android.os.RemoteException -> La8
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La8
            com.daaw.y83 r4 = com.daaw.g93.a3
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.daaw.hi6 r4 = r9.g
            if (r4 != 0) goto L32
            com.daaw.oy6 r4 = com.daaw.oy6.c()
            goto L3b
        L32:
            com.daaw.gi6 r4 = r4.a
            goto L37
        L35:
            com.daaw.gi6 r4 = r9.f
        L37:
            com.daaw.oy6 r4 = com.daaw.oy6.d(r4)
        L3b:
            com.daaw.ip6 r5 = new com.daaw.ey6() { // from class: com.daaw.ip6
                static {
                    /*
                        com.daaw.ip6 r0 = new com.daaw.ip6
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.daaw.ip6) com.daaw.ip6.a com.daaw.ip6
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.ip6.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.ip6.<init>():void");
                }

                @Override // com.daaw.ey6
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.daaw.gi6 r1 = (com.daaw.gi6) r1
                        java.lang.String r1 = com.daaw.kp6.a(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.ip6.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.daaw.oy6 r5 = r4.a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.daaw.jp6 r7 = new com.daaw.ey6() { // from class: com.daaw.jp6
                static {
                    /*
                        com.daaw.jp6 r0 = new com.daaw.jp6
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.daaw.jp6) com.daaw.jp6.a com.daaw.jp6
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.jp6.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.jp6.<init>():void");
                }

                @Override // com.daaw.ey6
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.daaw.gi6 r1 = (com.daaw.gi6) r1
                        java.lang.String r1 = com.daaw.kp6.b(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.jp6.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.daaw.oy6 r4 = r4.a(r7)
            java.lang.Object r4 = r4.b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = h(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = h(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = h(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = h(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = h(r6, r7, r12)
            java.lang.String r7 = r9.b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = h(r6, r8, r7)
            android.content.Context r7 = r9.e
            boolean r8 = r10.X
            java.lang.String r6 = com.daaw.my3.c(r6, r7, r8)
            r0.add(r6)
            goto L59
        La7:
            return r0
        La8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.daaw.k04.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kp6.e(com.daaw.th6, java.util.List, com.daaw.cv3):java.util.List");
    }
}
