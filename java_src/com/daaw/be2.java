package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class be2 implements j09 {
    public static final q09 h = new q09() { // from class: com.daaw.xd2
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = be2.h;
            return new j09[]{new be2()};
        }
    };
    public m09 a;
    public m42 b;
    public zd2 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        return ie2.c(k09Var);
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.a = m09Var;
        this.b = m09Var.n(0, 1);
        m09Var.zzC();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
        if (r1 != 65534) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r19, com.daaw.f42 r20) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.be2.d(com.daaw.k09, com.daaw.f42):int");
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        zd2 zd2Var = this.e;
        if (zd2Var != null) {
            zd2Var.a(j2);
        }
    }
}
