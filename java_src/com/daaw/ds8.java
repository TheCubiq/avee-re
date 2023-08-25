package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ds8 implements nr8, mr8 {

    /* renamed from: p */
    public final nr8[] f7712p;

    /* renamed from: t */
    public mr8 f7716t;

    /* renamed from: u */
    public au8 f7717u;

    /* renamed from: x */
    public final uq8 f7720x;

    /* renamed from: r */
    public final ArrayList f7714r = new ArrayList();

    /* renamed from: s */
    public final HashMap f7715s = new HashMap();

    /* renamed from: w */
    public vt8 f7719w = new tq8(new vt8[0]);

    /* renamed from: q */
    public final IdentityHashMap f7713q = new IdentityHashMap();

    /* renamed from: v */
    public nr8[] f7718v = new nr8[0];

    public ds8(uq8 uq8Var, long[] jArr, nr8[] nr8VarArr, byte... bArr) {
        this.f7720x = uq8Var;
        this.f7712p = nr8VarArr;
        for (int i = 0; i < nr8VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f7712p[i] = new bs8(nr8VarArr[i], j);
            }
        }
    }

    @Override // com.daaw.nt8
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8518a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.f7716t;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8518a(this);
    }

    @Override // com.daaw.nr8
    /* renamed from: b */
    public final long mo3304b(long j) {
        long mo3304b = this.f7718v[0].mo3304b(j);
        int i = 1;
        while (true) {
            nr8[] nr8VarArr = this.f7718v;
            if (i >= nr8VarArr.length) {
                return mo3304b;
            }
            if (nr8VarArr[i].mo3304b(mo3304b) != mo3304b) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: c */
    public final boolean mo3303c(long j) {
        if (this.f7714r.isEmpty()) {
            return this.f7719w.mo3303c(j);
        }
        int size = this.f7714r.size();
        for (int i = 0; i < size; i++) {
            ((nr8) this.f7714r.get(i)).mo3303c(j);
        }
        return false;
    }

    @Override // com.daaw.mr8
    /* renamed from: d */
    public final void mo8512d(nr8 nr8Var) {
        this.f7714r.remove(nr8Var);
        if (!this.f7714r.isEmpty()) {
            return;
        }
        int i = 0;
        for (nr8 nr8Var2 : this.f7712p) {
            i += nr8Var2.zzh().f3668a;
        }
        r84[] r84VarArr = new r84[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            nr8[] nr8VarArr = this.f7712p;
            if (i2 >= nr8VarArr.length) {
                this.f7717u = new au8(r84VarArr);
                mr8 mr8Var = this.f7716t;
                Objects.requireNonNull(mr8Var);
                mr8Var.mo8512d(this);
                return;
            }
            au8 zzh = nr8VarArr[i2].zzh();
            int i4 = zzh.f3668a;
            int i5 = 0;
            while (i5 < i4) {
                r84 m26965b = zzh.m26965b(i5);
                r84 m11589c = m26965b.m11589c(i2 + ":" + m26965b.f24961b);
                this.f7715s.put(m11589c, m26965b);
                r84VarArr[i3] = m11589c;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.daaw.nr8
    /* renamed from: e */
    public final void mo3301e(long j, boolean z) {
        for (nr8 nr8Var : this.f7718v) {
            nr8Var.mo3301e(j, false);
        }
    }

    /* renamed from: f */
    public final nr8 m23992f(int i) {
        nr8 nr8Var;
        nr8 nr8Var2 = this.f7712p[i];
        if (nr8Var2 instanceof bs8) {
            nr8Var = ((bs8) nr8Var2).f5163p;
            return nr8Var;
        }
        return nr8Var2;
    }

    @Override // com.daaw.nr8
    /* renamed from: g */
    public final void mo3299g(mr8 mr8Var, long j) {
        this.f7716t = mr8Var;
        Collections.addAll(this.f7714r, this.f7712p);
        for (nr8 nr8Var : this.f7712p) {
            nr8Var.mo3299g(this, j);
        }
    }

    @Override // com.daaw.nr8
    /* renamed from: h */
    public final long mo3298h(long j, aa8 aa8Var) {
        nr8[] nr8VarArr = this.f7718v;
        return (nr8VarArr.length > 0 ? nr8VarArr[0] : this.f7712p[0]).mo3298h(j, aa8Var);
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: j */
    public final void mo3296j(long j) {
        this.f7719w.mo3296j(j);
    }

    @Override // com.daaw.nr8
    /* renamed from: k */
    public final long mo3295k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
        int length;
        tv8 tv8Var;
        int length2 = tv8VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = tv8VarArr.length;
            tv8Var = null;
            if (i >= length) {
                break;
            }
            mt8 mt8Var = mt8VarArr[i];
            Integer num = mt8Var != null ? (Integer) this.f7713q.get(mt8Var) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            tv8 tv8Var2 = tv8VarArr[i];
            if (tv8Var2 != null) {
                r84 r84Var = (r84) this.f7715s.get(tv8Var2.zze());
                Objects.requireNonNull(r84Var);
                int i2 = 0;
                while (true) {
                    nr8[] nr8VarArr = this.f7712p;
                    if (i2 >= nr8VarArr.length) {
                        break;
                    } else if (nr8VarArr[i2].zzh().m26966a(r84Var) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.f7713q.clear();
        mt8[] mt8VarArr2 = new mt8[length];
        mt8[] mt8VarArr3 = new mt8[length];
        tv8[] tv8VarArr2 = new tv8[length];
        ArrayList arrayList = new ArrayList(this.f7712p.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f7712p.length) {
            for (int i4 = 0; i4 < tv8VarArr.length; i4++) {
                mt8VarArr3[i4] = iArr[i4] == i3 ? mt8VarArr[i4] : tv8Var;
                if (iArr2[i4] == i3) {
                    tv8 tv8Var3 = tv8VarArr[i4];
                    Objects.requireNonNull(tv8Var3);
                    r84 r84Var2 = (r84) this.f7715s.get(tv8Var3.zze());
                    Objects.requireNonNull(r84Var2);
                    tv8VarArr2[i4] = new as8(tv8Var3, r84Var2);
                } else {
                    tv8VarArr2[i4] = tv8Var;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            mt8[] mt8VarArr4 = mt8VarArr3;
            tv8[] tv8VarArr3 = tv8VarArr2;
            long mo3295k = this.f7712p[i3].mo3295k(tv8VarArr2, zArr, mt8VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = mo3295k;
            } else if (mo3295k != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < tv8VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    mt8 mt8Var2 = mt8VarArr4[i6];
                    Objects.requireNonNull(mt8Var2);
                    mt8VarArr2[i6] = mt8Var2;
                    this.f7713q.put(mt8Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    uo4.m7872f(mt8VarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f7712p[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            mt8VarArr3 = mt8VarArr4;
            tv8VarArr2 = tv8VarArr3;
            tv8Var = null;
        }
        System.arraycopy(mt8VarArr2, 0, mt8VarArr, 0, length);
        nr8[] nr8VarArr2 = (nr8[]) arrayList.toArray(new nr8[0]);
        this.f7718v = nr8VarArr2;
        this.f7719w = new tq8(nr8VarArr2);
        return j2;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        return this.f7719w.zzb();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        return this.f7719w.zzc();
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        nr8[] nr8VarArr;
        nr8[] nr8VarArr2;
        long j = -9223372036854775807L;
        for (nr8 nr8Var : this.f7718v) {
            long zzd = nr8Var.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (nr8 nr8Var2 : this.f7718v) {
                        if (nr8Var2 == nr8Var) {
                            break;
                        } else if (nr8Var2.mo3304b(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && nr8Var.mo3304b(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        au8 au8Var = this.f7717u;
        Objects.requireNonNull(au8Var);
        return au8Var;
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        for (nr8 nr8Var : this.f7712p) {
            nr8Var.zzk();
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.f7719w.zzp();
    }
}
