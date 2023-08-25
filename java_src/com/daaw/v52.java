package com.daaw;

import android.net.Uri;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class v52 implements j09 {
    public static final q09 q = new q09() { // from class: com.daaw.u52
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = v52.q;
            return new j09[]{new v52()};
        }
    };
    public m09 f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public t52 o;
    public z52 p;
    public final ik5 a = new ik5(4);
    public final ik5 b = new ik5(9);
    public final ik5 c = new ik5(11);
    public final ik5 d = new ik5();
    public final w52 e = new w52();
    public int g = 1;

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.h(this.a.h(), 0, 3, false);
        this.a.f(0);
        if (this.a.u() != 4607062) {
            return false;
        }
        rz8Var.h(this.a.h(), 0, 2, false);
        this.a.f(0);
        if ((this.a.w() & 250) != 0) {
            return false;
        }
        rz8Var.h(this.a.h(), 0, 4, false);
        this.a.f(0);
        int m = this.a.m();
        k09Var.zzj();
        rz8 rz8Var2 = (rz8) k09Var;
        rz8Var2.k(m, false);
        rz8Var2.h(this.a.h(), 0, 4, false);
        this.a.f(0);
        return this.a.m() == 0;
    }

    public final ik5 b(k09 k09Var) {
        if (this.l > this.d.j()) {
            ik5 ik5Var = this.d;
            int j = ik5Var.j();
            ik5Var.d(new byte[Math.max(j + j, this.l)], 0);
        } else {
            this.d.f(0);
        }
        this.d.e(this.l);
        ((rz8) k09Var).e(this.d.h(), 0, this.l, false);
        return this.d;
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.f = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0009 A[SYNTHETIC] */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r17, com.daaw.f42 r18) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.v52.d(com.daaw.k09, com.daaw.f42):int");
    }

    @RequiresNonNull({"extractorOutput"})
    public final void e() {
        if (this.n) {
            return;
        }
        this.f.i(new h42(-9223372036854775807L, 0L));
        this.n = true;
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }
}
