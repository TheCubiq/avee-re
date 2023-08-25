package com.daaw;
/* loaded from: classes.dex */
public final class p52 implements mz8 {
    public final w09 a;
    public final int b;
    public final r09 c = new r09();

    public /* synthetic */ p52(w09 w09Var, int i, o52 o52Var) {
        this.a = w09Var;
        this.b = i;
    }

    @Override // com.daaw.mz8
    public final lz8 a(k09 k09Var, long j) {
        long zzf = k09Var.zzf();
        long b = b(k09Var);
        long zze = k09Var.zze();
        ((rz8) k09Var).k(Math.max(6, this.a.c), false);
        long b2 = b(k09Var);
        return (b > j || b2 <= j) ? b2 <= j ? lz8.f(b2, k09Var.zze()) : lz8.d(b, zzf) : lz8.e(zze);
    }

    public final long b(k09 k09Var) {
        while (k09Var.zze() < k09Var.zzd() - 6) {
            w09 w09Var = this.a;
            int i = this.b;
            r09 r09Var = this.c;
            long zze = k09Var.zze();
            byte[] bArr = new byte[2];
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.h(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                k09Var.zzj();
                rz8Var.k((int) (zze - k09Var.zzf()), false);
            } else {
                ik5 ik5Var = new ik5(16);
                System.arraycopy(bArr, 0, ik5Var.h(), 0, 2);
                ik5Var.e(n09.a(k09Var, ik5Var.h(), 2, 14));
                k09Var.zzj();
                rz8Var.k((int) (zze - k09Var.zzf()), false);
                if (s09.c(ik5Var, w09Var, i, r09Var)) {
                    break;
                }
            }
            rz8Var.k(1, false);
        }
        if (k09Var.zze() >= k09Var.zzd() - 6) {
            ((rz8) k09Var).k((int) (k09Var.zzd() - k09Var.zze()), false);
            return this.a.j;
        }
        return this.c.a;
    }

    @Override // com.daaw.mz8
    public final /* synthetic */ void zzb() {
    }
}
