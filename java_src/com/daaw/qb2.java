package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class qb2 implements j09 {
    public static final q09 j = new q09() { // from class: com.daaw.pb2
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = qb2.j;
            return new j09[]{new qb2(0)};
        }
    };
    public final ik5 c;
    public final cj5 d;
    public m09 e;
    public long f;
    public boolean h;
    public boolean i;
    public final rb2 a = new rb2(true, null);
    public final ik5 b = new ik5(2048);
    public long g = -1;

    public qb2(int i) {
        ik5 ik5Var = new ik5(10);
        this.c = ik5Var;
        byte[] h = ik5Var.h();
        this.d = new cj5(h, h.length);
    }

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        int i = 0;
        while (true) {
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.h(this.c.h(), 0, 10, false);
            this.c.f(0);
            if (this.c.u() != 4801587) {
                break;
            }
            this.c.g(3);
            int r = this.c.r();
            i += r + 10;
            rz8Var.k(r, false);
        }
        k09Var.zzj();
        rz8 rz8Var2 = (rz8) k09Var;
        rz8Var2.k(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            rz8Var2.h(this.c.h(), 0, 2, false);
            this.c.f(0);
            if (rb2.d(this.c.w())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                rz8Var2.h(this.c.h(), 0, 4, false);
                this.d.h(14);
                int c = this.d.c(13);
                if (c > 6) {
                    rz8Var2.k(c - 6, false);
                    i4 += c;
                }
            }
            i2++;
            k09Var.zzj();
            rz8Var2.k(i2, false);
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.e = m09Var;
        this.a.b(m09Var, new td2(Integer.MIN_VALUE, 0, 1));
        m09Var.zzC();
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        uo4.b(this.e);
        int a = k09Var.a(this.b.h(), 0, 2048);
        if (!this.i) {
            this.e.i(new h42(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (a == -1) {
            return -1;
        }
        this.b.f(0);
        this.b.e(a);
        if (!this.h) {
            this.a.c(this.f, 4);
            this.h = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override // com.daaw.j09
    public final void f(long j2, long j3) {
        this.h = false;
        this.a.zze();
        this.f = j3;
    }
}
