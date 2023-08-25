package com.daaw;
/* loaded from: classes.dex */
public final class p52 implements mz8 {

    /* renamed from: a */
    public final w09 f22618a;

    /* renamed from: b */
    public final int f22619b;

    /* renamed from: c */
    public final r09 f22620c = new r09();

    public /* synthetic */ p52(w09 w09Var, int i, o52 o52Var) {
        this.f22618a = w09Var;
        this.f22619b = i;
    }

    @Override // com.daaw.mz8
    /* renamed from: a */
    public final lz8 mo9320a(k09 k09Var, long j) {
        long zzf = k09Var.zzf();
        long m13627b = m13627b(k09Var);
        long zze = k09Var.zze();
        ((rz8) k09Var).m10812k(Math.max(6, this.f22618a.f30774c), false);
        long m13627b2 = m13627b(k09Var);
        return (m13627b > j || m13627b2 <= j) ? m13627b2 <= j ? lz8.m16346f(m13627b2, k09Var.zze()) : lz8.m16348d(m13627b, zzf) : lz8.m16347e(zze);
    }

    /* renamed from: b */
    public final long m13627b(k09 k09Var) {
        while (k09Var.zze() < k09Var.zzd() - 6) {
            w09 w09Var = this.f22618a;
            int i = this.f22619b;
            r09 r09Var = this.f22620c;
            long zze = k09Var.zze();
            byte[] bArr = new byte[2];
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.mo5661h(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                k09Var.zzj();
                rz8Var.m10812k((int) (zze - k09Var.zzf()), false);
            } else {
                ik5 ik5Var = new ik5(16);
                System.arraycopy(bArr, 0, ik5Var.m19714h(), 0, 2);
                ik5Var.m19717e(n09.m15610a(k09Var, ik5Var.m19714h(), 2, 14));
                k09Var.zzj();
                rz8Var.m10812k((int) (zze - k09Var.zzf()), false);
                if (s09.m10797c(ik5Var, w09Var, i, r09Var)) {
                    break;
                }
            }
            rz8Var.m10812k(1, false);
        }
        if (k09Var.zze() >= k09Var.zzd() - 6) {
            ((rz8) k09Var).m10812k((int) (k09Var.zzd() - k09Var.zze()), false);
            return this.f22618a.f30781j;
        }
        return this.f22620c.f24713a;
    }

    @Override // com.daaw.mz8
    public final /* synthetic */ void zzb() {
    }
}
