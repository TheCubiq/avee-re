package com.daaw;

import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import java.util.Objects;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class a62 implements j09 {
    public m09 b;
    public int c;
    public int d;
    public int e;
    public zzadu g;
    public k09 h;
    public k62 i;
    public ca2 j;
    public final ik5 a = new ik5(6);
    public long f = -1;

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        if (b(k09Var) != 65496) {
            return false;
        }
        int b = b(k09Var);
        this.d = b;
        if (b == 65504) {
            this.a.c(2);
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.h(this.a.h(), 0, 2, false);
            rz8Var.k(this.a.w() - 2, false);
            b = b(k09Var);
            this.d = b;
        }
        if (b == 65505) {
            rz8 rz8Var2 = (rz8) k09Var;
            rz8Var2.k(2, false);
            this.a.c(6);
            rz8Var2.h(this.a.h(), 0, 6, false);
            if (this.a.A() == 1165519206 && this.a.w() == 0) {
                return true;
            }
        }
        return false;
    }

    public final int b(k09 k09Var) {
        this.a.c(2);
        ((rz8) k09Var).h(this.a.h(), 0, 2, false);
        return this.a.w();
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.b = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r24, com.daaw.f42 r25) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.a62.d(com.daaw.k09, com.daaw.f42):int");
    }

    public final void e() {
        g(new zzbp[0]);
        m09 m09Var = this.b;
        Objects.requireNonNull(m09Var);
        m09Var.zzC();
        this.b.i(new h42(-9223372036854775807L, 0L));
        this.c = 6;
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            ca2 ca2Var = this.j;
            Objects.requireNonNull(ca2Var);
            ca2Var.f(j, j2);
        }
    }

    public final void g(zzbp... zzbpVarArr) {
        m09 m09Var = this.b;
        Objects.requireNonNull(m09Var);
        m42 n = m09Var.n(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, 4);
        b72 b72Var = new b72();
        b72Var.h0("image/jpeg");
        b72Var.m(new zzbq(-9223372036854775807L, zzbpVarArr));
        n.f(b72Var.y());
    }
}
