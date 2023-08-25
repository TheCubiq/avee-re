package com.daaw;

import java.util.ArrayList;
import java.util.IdentityHashMap;
/* loaded from: classes.dex */
public final class zv2 implements wv2, vv2 {
    public final wv2[] p;
    public final IdentityHashMap q = new IdentityHashMap();
    public vv2 r;
    public int s;
    public rw2 t;
    public wv2[] u;
    public kw2 v;

    public zv2(wv2... wv2VarArr) {
        this.p = wv2VarArr;
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    public final boolean a(long j) {
        return this.v.a(j);
    }

    @Override // com.daaw.jw2
    public final /* bridge */ /* synthetic */ void b(kw2 kw2Var) {
        wv2 wv2Var = (wv2) kw2Var;
        if (this.t == null) {
            return;
        }
        this.r.b(this);
    }

    @Override // com.daaw.wv2
    public final void c(long j) {
        for (wv2 wv2Var : this.u) {
            wv2Var.c(j);
        }
    }

    @Override // com.daaw.wv2
    public final long e(long j) {
        long e = this.u[0].e(j);
        int i = 1;
        while (true) {
            wv2[] wv2VarArr = this.u;
            if (i >= wv2VarArr.length) {
                return e;
            }
            if (wv2VarArr[i].e(e) != e) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // com.daaw.wv2
    public final void f(vv2 vv2Var, long j) {
        this.r = vv2Var;
        wv2[] wv2VarArr = this.p;
        this.s = wv2VarArr.length;
        for (wv2 wv2Var : wv2VarArr) {
            wv2Var.f(this, j);
        }
    }

    @Override // com.daaw.wv2
    public final long g(vw2[] vw2VarArr, boolean[] zArr, iw2[] iw2VarArr, boolean[] zArr2, long j) {
        int length;
        iw2[] iw2VarArr2 = iw2VarArr;
        int length2 = vw2VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = vw2VarArr.length;
            if (i >= length) {
                break;
            }
            iw2 iw2Var = iw2VarArr2[i];
            iArr[i] = iw2Var == null ? -1 : ((Integer) this.q.get(iw2Var)).intValue();
            iArr2[i] = -1;
            vw2 vw2Var = vw2VarArr[i];
            if (vw2Var != null) {
                mw2 d = vw2Var.d();
                int i2 = 0;
                while (true) {
                    wv2[] wv2VarArr = this.p;
                    if (i2 >= wv2VarArr.length) {
                        break;
                    } else if (wv2VarArr[i2].zzn().a(d) != -1) {
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
        iw2[] iw2VarArr3 = new iw2[length];
        iw2[] iw2VarArr4 = new iw2[length];
        vw2[] vw2VarArr2 = new vw2[length];
        ArrayList arrayList = new ArrayList(this.p.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.p.length) {
            for (int i4 = 0; i4 < vw2VarArr.length; i4++) {
                vw2 vw2Var2 = null;
                iw2VarArr4[i4] = iArr[i4] == i3 ? iw2VarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    vw2Var2 = vw2VarArr[i4];
                }
                vw2VarArr2[i4] = vw2Var2;
            }
            int i5 = i3;
            vw2[] vw2VarArr3 = vw2VarArr2;
            ArrayList arrayList2 = arrayList;
            long g = this.p[i3].g(vw2VarArr2, zArr, iw2VarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = g;
            } else if (g != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < vw2VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    az2.e(iw2VarArr4[i6] != null);
                    iw2 iw2Var2 = iw2VarArr4[i6];
                    iw2VarArr3[i6] = iw2Var2;
                    this.q.put(iw2Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    az2.e(iw2VarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.p[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            vw2VarArr2 = vw2VarArr3;
            iw2VarArr2 = iw2VarArr;
        }
        iw2[] iw2VarArr5 = iw2VarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(iw2VarArr3, 0, iw2VarArr5, 0, length);
        wv2[] wv2VarArr2 = new wv2[arrayList3.size()];
        this.u = wv2VarArr2;
        arrayList3.toArray(wv2VarArr2);
        this.v = new gv2(this.u);
        return j2;
    }

    @Override // com.daaw.vv2
    public final void h(wv2 wv2Var) {
        int i = this.s - 1;
        this.s = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (wv2 wv2Var2 : this.p) {
            i2 += wv2Var2.zzn().a;
        }
        mw2[] mw2VarArr = new mw2[i2];
        int i3 = 0;
        for (wv2 wv2Var3 : this.p) {
            rw2 zzn = wv2Var3.zzn();
            int i4 = zzn.a;
            int i5 = 0;
            while (i5 < i4) {
                mw2VarArr[i3] = zzn.b(i5);
                i5++;
                i3++;
            }
        }
        this.t = new rw2(mw2VarArr);
        this.r.h(this);
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    public final long zza() {
        return this.v.zza();
    }

    @Override // com.daaw.wv2
    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (wv2 wv2Var : this.u) {
            long zzg = wv2Var.zzg();
            if (zzg != Long.MIN_VALUE) {
                j = Math.min(j, zzg);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.daaw.wv2
    public final long zzh() {
        wv2[] wv2VarArr;
        long zzh = this.p[0].zzh();
        int i = 1;
        while (true) {
            wv2[] wv2VarArr2 = this.p;
            if (i >= wv2VarArr2.length) {
                if (zzh != -9223372036854775807L) {
                    for (wv2 wv2Var : this.u) {
                        if (wv2Var != this.p[0] && wv2Var.e(zzh) != zzh) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (wv2VarArr2[i].zzh() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i++;
            }
        }
    }

    @Override // com.daaw.wv2
    public final rw2 zzn() {
        return this.t;
    }

    @Override // com.daaw.wv2
    public final void zzs() {
        for (wv2 wv2Var : this.p) {
            wv2Var.zzs();
        }
    }
}
