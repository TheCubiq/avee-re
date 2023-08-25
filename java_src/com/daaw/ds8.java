package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ds8 implements nr8, mr8 {
    public final nr8[] p;
    public mr8 t;
    public au8 u;
    public final uq8 x;
    public final ArrayList r = new ArrayList();
    public final HashMap s = new HashMap();
    public vt8 w = new tq8(new vt8[0]);
    public final IdentityHashMap q = new IdentityHashMap();
    public nr8[] v = new nr8[0];

    public ds8(uq8 uq8Var, long[] jArr, nr8[] nr8VarArr, byte... bArr) {
        this.x = uq8Var;
        this.p = nr8VarArr;
        for (int i = 0; i < nr8VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.p[i] = new bs8(nr8VarArr[i], j);
            }
        }
    }

    @Override // com.daaw.nt8
    public final /* bridge */ /* synthetic */ void a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.t;
        Objects.requireNonNull(mr8Var);
        mr8Var.a(this);
    }

    @Override // com.daaw.nr8
    public final long b(long j) {
        long b = this.v[0].b(j);
        int i = 1;
        while (true) {
            nr8[] nr8VarArr = this.v;
            if (i >= nr8VarArr.length) {
                return b;
            }
            if (nr8VarArr[i].b(b) != b) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean c(long j) {
        if (this.r.isEmpty()) {
            return this.w.c(j);
        }
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((nr8) this.r.get(i)).c(j);
        }
        return false;
    }

    @Override // com.daaw.mr8
    public final void d(nr8 nr8Var) {
        this.r.remove(nr8Var);
        if (!this.r.isEmpty()) {
            return;
        }
        int i = 0;
        for (nr8 nr8Var2 : this.p) {
            i += nr8Var2.zzh().a;
        }
        r84[] r84VarArr = new r84[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            nr8[] nr8VarArr = this.p;
            if (i2 >= nr8VarArr.length) {
                this.u = new au8(r84VarArr);
                mr8 mr8Var = this.t;
                Objects.requireNonNull(mr8Var);
                mr8Var.d(this);
                return;
            }
            au8 zzh = nr8VarArr[i2].zzh();
            int i4 = zzh.a;
            int i5 = 0;
            while (i5 < i4) {
                r84 b = zzh.b(i5);
                r84 c = b.c(i2 + ":" + b.b);
                this.s.put(c, b);
                r84VarArr[i3] = c;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.daaw.nr8
    public final void e(long j, boolean z) {
        for (nr8 nr8Var : this.v) {
            nr8Var.e(j, false);
        }
    }

    public final nr8 f(int i) {
        nr8 nr8Var;
        nr8 nr8Var2 = this.p[i];
        if (nr8Var2 instanceof bs8) {
            nr8Var = ((bs8) nr8Var2).p;
            return nr8Var;
        }
        return nr8Var2;
    }

    @Override // com.daaw.nr8
    public final void g(mr8 mr8Var, long j) {
        this.t = mr8Var;
        Collections.addAll(this.r, this.p);
        for (nr8 nr8Var : this.p) {
            nr8Var.g(this, j);
        }
    }

    @Override // com.daaw.nr8
    public final long h(long j, aa8 aa8Var) {
        nr8[] nr8VarArr = this.v;
        return (nr8VarArr.length > 0 ? nr8VarArr[0] : this.p[0]).h(j, aa8Var);
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final void j(long j) {
        this.w.j(j);
    }

    @Override // com.daaw.nr8
    public final long k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
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
            Integer num = mt8Var != null ? (Integer) this.q.get(mt8Var) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            tv8 tv8Var2 = tv8VarArr[i];
            if (tv8Var2 != null) {
                r84 r84Var = (r84) this.s.get(tv8Var2.zze());
                Objects.requireNonNull(r84Var);
                int i2 = 0;
                while (true) {
                    nr8[] nr8VarArr = this.p;
                    if (i2 >= nr8VarArr.length) {
                        break;
                    } else if (nr8VarArr[i2].zzh().a(r84Var) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.q.clear();
        mt8[] mt8VarArr2 = new mt8[length];
        mt8[] mt8VarArr3 = new mt8[length];
        tv8[] tv8VarArr2 = new tv8[length];
        ArrayList arrayList = new ArrayList(this.p.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.p.length) {
            for (int i4 = 0; i4 < tv8VarArr.length; i4++) {
                mt8VarArr3[i4] = iArr[i4] == i3 ? mt8VarArr[i4] : tv8Var;
                if (iArr2[i4] == i3) {
                    tv8 tv8Var3 = tv8VarArr[i4];
                    Objects.requireNonNull(tv8Var3);
                    r84 r84Var2 = (r84) this.s.get(tv8Var3.zze());
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
            long k = this.p[i3].k(tv8VarArr2, zArr, mt8VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = k;
            } else if (k != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < tv8VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    mt8 mt8Var2 = mt8VarArr4[i6];
                    Objects.requireNonNull(mt8Var2);
                    mt8VarArr2[i6] = mt8Var2;
                    this.q.put(mt8Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    uo4.f(mt8VarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.p[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            mt8VarArr3 = mt8VarArr4;
            tv8VarArr2 = tv8VarArr3;
            tv8Var = null;
        }
        System.arraycopy(mt8VarArr2, 0, mt8VarArr, 0, length);
        nr8[] nr8VarArr2 = (nr8[]) arrayList.toArray(new nr8[0]);
        this.v = nr8VarArr2;
        this.w = new tq8(nr8VarArr2);
        return j2;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        return this.w.zzb();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        return this.w.zzc();
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        nr8[] nr8VarArr;
        nr8[] nr8VarArr2;
        long j = -9223372036854775807L;
        for (nr8 nr8Var : this.v) {
            long zzd = nr8Var.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (nr8 nr8Var2 : this.v) {
                        if (nr8Var2 == nr8Var) {
                            break;
                        } else if (nr8Var2.b(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && nr8Var.b(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        au8 au8Var = this.u;
        Objects.requireNonNull(au8Var);
        return au8Var;
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        for (nr8 nr8Var : this.p) {
            nr8Var.zzk();
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.w.zzp();
    }
}
