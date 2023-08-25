package com.daaw;

import android.net.Uri;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class ya2 implements j09 {
    public static final q09 d = new q09() { // from class: com.daaw.xa2
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = ya2.d;
            return new j09[]{new ya2()};
        }
    };
    public m09 a;
    public gb2 b;
    public boolean c;

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        try {
            return b(k09Var);
        } catch (dl3 unused) {
            return false;
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = um0.a)
    public final boolean b(k09 k09Var) {
        gb2 cb2Var;
        ab2 ab2Var = new ab2();
        if (ab2Var.b(k09Var, true) && (ab2Var.a & 2) == 2) {
            int min = Math.min(ab2Var.e, 8);
            ik5 ik5Var = new ik5(min);
            ((rz8) k09Var).h(ik5Var.h(), 0, min, false);
            ik5Var.f(0);
            if (ik5Var.i() >= 5 && ik5Var.s() == 127 && ik5Var.A() == 1179402563) {
                cb2Var = new wa2();
            } else {
                ik5Var.f(0);
                try {
                    if (s42.d(1, ik5Var, true)) {
                        cb2Var = new ib2();
                    }
                } catch (dl3 unused) {
                }
                ik5Var.f(0);
                if (cb2.j(ik5Var)) {
                    cb2Var = new cb2();
                }
            }
            this.b = cb2Var;
            return true;
        }
        return false;
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.a = m09Var;
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        uo4.b(this.a);
        if (this.b == null) {
            if (!b(k09Var)) {
                throw dl3.a("Failed to determine bitstream type", null);
            }
            k09Var.zzj();
        }
        if (!this.c) {
            m42 n = this.a.n(0, 1);
            this.a.zzC();
            this.b.g(this.a, n);
            this.c = true;
        }
        return this.b.d(k09Var, f42Var);
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        gb2 gb2Var = this.b;
        if (gb2Var != null) {
            gb2Var.i(j, j2);
        }
    }
}
