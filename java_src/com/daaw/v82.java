package com.daaw;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbq;
import java.io.EOFException;
import java.util.Map;
/* loaded from: classes.dex */
public final class v82 implements j09 {
    public static final q09 q = new q09() { // from class: com.daaw.t82
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = v82.q;
            return new j09[]{new v82(0)};
        }
    };
    public static final i72 r = new i72() { // from class: com.daaw.u82
    };
    public final ik5 a;
    public final y32 b;
    public final y09 c;
    public final w32 d;
    public final m42 e;
    public m09 f;
    public m42 g;
    public m42 h;
    public int i;
    public zzbq j;
    public long k;
    public long l;
    public long m;
    public int n;
    public x82 o;
    public boolean p;

    public v82() {
        this(0);
    }

    public v82(int i) {
        this.a = new ik5(10);
        this.b = new y32();
        this.c = new y09();
        this.k = -9223372036854775807L;
        this.d = new w32();
        i09 i09Var = new i09();
        this.e = i09Var;
        this.h = i09Var;
    }

    public static boolean i(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        return k(k09Var, true);
    }

    public final void b() {
        this.p = true;
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.f = m09Var;
        m42 n = m09Var.n(0, 1);
        this.g = n;
        this.h = n;
        this.f.zzC();
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        uo4.b(this.g);
        int i = it5.a;
        int e = e(k09Var);
        if (e == -1 && (this.o instanceof r82)) {
            if (this.o.zze() != g(this.l)) {
                r82 r82Var = (r82) this.o;
                throw null;
            }
        }
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(com.daaw.k09 r17) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.v82.e(com.daaw.k09):int");
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.n = 0;
        x82 x82Var = this.o;
        if (x82Var instanceof r82) {
            r82 r82Var = (r82) x82Var;
            throw null;
        }
    }

    public final long g(long j) {
        return this.k + ((j * 1000000) / this.b.d);
    }

    public final x82 h(k09 k09Var, boolean z) {
        ((rz8) k09Var).h(this.a.h(), 0, 4, false);
        this.a.f(0);
        this.b.a(this.a.m());
        return new q82(k09Var.zzd(), k09Var.zzf(), this.b, false);
    }

    public final boolean j(k09 k09Var) {
        x82 x82Var = this.o;
        if (x82Var != null) {
            long zzb = x82Var.zzb();
            if (zzb != -1 && k09Var.zze() > zzb - 4) {
                return true;
            }
        }
        try {
            return !k09Var.h(this.a.h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean k(k09 k09Var, boolean z) {
        int i;
        int i2;
        int b;
        int i3 = true != z ? 131072 : 32768;
        k09Var.zzj();
        if (k09Var.zzf() == 0) {
            zzbq a = this.d.a(k09Var, null);
            this.j = a;
            if (a != null) {
                this.c.b(a);
            }
            i2 = (int) k09Var.zze();
            if (!z) {
                ((rz8) k09Var).l(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!j(k09Var)) {
                this.a.f(0);
                int m = this.a.m();
                if ((i == 0 || i(m, i)) && (b = z32.b(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(m);
                        i = m;
                    }
                    ((rz8) k09Var).k(b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw dl3.a("Searched too many bytes.", null);
                    }
                    if (z) {
                        k09Var.zzj();
                        ((rz8) k09Var).k(i2 + i6, false);
                    } else {
                        ((rz8) k09Var).l(1, false);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((rz8) k09Var).l(i2 + i5, false);
        } else {
            k09Var.zzj();
        }
        this.i = i;
        return true;
    }
}
