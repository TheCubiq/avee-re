package com.daaw;

import com.google.android.gms.internal.ads.zzbye;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class sa5 {
    @GuardedBy("this")
    public final Map a = new HashMap();

    @Nullable
    public final synchronized ra5 a(String str) {
        return (ra5) this.a.get(str);
    }

    @Nullable
    public final ra5 b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ra5 a = a((String) it.next());
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public final String c(String str) {
        zzbye zzbyeVar;
        ra5 a = a(str);
        return (a == null || (zzbyeVar = a.b) == null) ? "" : zzbyeVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(java.lang.String r7, @javax.annotation.Nullable com.daaw.oj6 r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.a     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            com.daaw.ra5 r0 = new com.daaw.ra5     // Catch: java.lang.Throwable -> L44
            r1 = 0
            if (r8 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.zzbye r2 = r8.j()     // Catch: com.daaw.wi6 -> L10 java.lang.Throwable -> L44
        L16:
            if (r8 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzbye r1 = r8.k()     // Catch: com.daaw.wi6 -> L1d java.lang.Throwable -> L44
        L1d:
            com.daaw.y83 r3 = com.daaw.g93.s8     // Catch: java.lang.Throwable -> L44
            com.daaw.e93 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L33
        L31:
            r4 = 1
            goto L3a
        L33:
            if (r8 != 0) goto L36
            goto L3a
        L36:
            r8.c()     // Catch: com.daaw.wi6 -> L3a java.lang.Throwable -> L44
            goto L31
        L3a:
            r0.<init>(r7, r2, r1, r4)     // Catch: java.lang.Throwable -> L44
            java.util.Map r8 = r6.a     // Catch: java.lang.Throwable -> L44
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r6)
            return
        L44:
            r7 = move-exception
            monitor-exit(r6)
            goto L48
        L47:
            throw r7
        L48:
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sa5.d(java.lang.String, com.daaw.oj6):void");
    }

    public final synchronized void e(String str, dp3 dp3Var) {
        if (this.a.containsKey(str)) {
            return;
        }
        try {
            this.a.put(str, new ra5(str, dp3Var.zzf(), dp3Var.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
