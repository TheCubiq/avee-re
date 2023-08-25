package com.daaw;

import java.util.ArrayList;
import java.util.IdentityHashMap;
/* loaded from: classes.dex */
public final class zv2 implements wv2, vv2 {

    /* renamed from: p */
    public final wv2[] f35585p;

    /* renamed from: q */
    public final IdentityHashMap f35586q = new IdentityHashMap();

    /* renamed from: r */
    public vv2 f35587r;

    /* renamed from: s */
    public int f35588s;

    /* renamed from: t */
    public rw2 f35589t;

    /* renamed from: u */
    public wv2[] f35590u;

    /* renamed from: v */
    public kw2 f35591v;

    public zv2(wv2... wv2VarArr) {
        this.f35585p = wv2VarArr;
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    /* renamed from: a */
    public final boolean mo1848a(long j) {
        return this.f35591v.mo1848a(j);
    }

    @Override // com.daaw.jw2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1847b(kw2 kw2Var) {
        wv2 wv2Var = (wv2) kw2Var;
        if (this.f35589t == null) {
            return;
        }
        this.f35587r.mo1847b(this);
    }

    @Override // com.daaw.wv2
    /* renamed from: c */
    public final void mo1846c(long j) {
        for (wv2 wv2Var : this.f35590u) {
            wv2Var.mo1846c(j);
        }
    }

    @Override // com.daaw.wv2
    /* renamed from: e */
    public final long mo1845e(long j) {
        long mo1845e = this.f35590u[0].mo1845e(j);
        int i = 1;
        while (true) {
            wv2[] wv2VarArr = this.f35590u;
            if (i >= wv2VarArr.length) {
                return mo1845e;
            }
            if (wv2VarArr[i].mo1845e(mo1845e) != mo1845e) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // com.daaw.wv2
    /* renamed from: f */
    public final void mo1844f(vv2 vv2Var, long j) {
        this.f35587r = vv2Var;
        wv2[] wv2VarArr = this.f35585p;
        this.f35588s = wv2VarArr.length;
        for (wv2 wv2Var : wv2VarArr) {
            wv2Var.mo1844f(this, j);
        }
    }

    @Override // com.daaw.wv2
    /* renamed from: g */
    public final long mo1843g(vw2[] vw2VarArr, boolean[] zArr, iw2[] iw2VarArr, boolean[] zArr2, long j) {
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
            iArr[i] = iw2Var == null ? -1 : ((Integer) this.f35586q.get(iw2Var)).intValue();
            iArr2[i] = -1;
            vw2 vw2Var = vw2VarArr[i];
            if (vw2Var != null) {
                mw2 m6687d = vw2Var.m6687d();
                int i2 = 0;
                while (true) {
                    wv2[] wv2VarArr = this.f35585p;
                    if (i2 >= wv2VarArr.length) {
                        break;
                    } else if (wv2VarArr[i2].zzn().m10859a(m6687d) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.f35586q.clear();
        iw2[] iw2VarArr3 = new iw2[length];
        iw2[] iw2VarArr4 = new iw2[length];
        vw2[] vw2VarArr2 = new vw2[length];
        ArrayList arrayList = new ArrayList(this.f35585p.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f35585p.length) {
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
            long mo1843g = this.f35585p[i3].mo1843g(vw2VarArr2, zArr, iw2VarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = mo1843g;
            } else if (mo1843g != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < vw2VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    az2.m26583e(iw2VarArr4[i6] != null);
                    iw2 iw2Var2 = iw2VarArr4[i6];
                    iw2VarArr3[i6] = iw2Var2;
                    this.f35586q.put(iw2Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    az2.m26583e(iw2VarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f35585p[i5]);
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
        this.f35590u = wv2VarArr2;
        arrayList3.toArray(wv2VarArr2);
        this.f35591v = new gv2(this.f35590u);
        return j2;
    }

    @Override // com.daaw.vv2
    /* renamed from: h */
    public final void mo1842h(wv2 wv2Var) {
        int i = this.f35588s - 1;
        this.f35588s = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (wv2 wv2Var2 : this.f35585p) {
            i2 += wv2Var2.zzn().f25666a;
        }
        mw2[] mw2VarArr = new mw2[i2];
        int i3 = 0;
        for (wv2 wv2Var3 : this.f35585p) {
            rw2 zzn = wv2Var3.zzn();
            int i4 = zzn.f25666a;
            int i5 = 0;
            while (i5 < i4) {
                mw2VarArr[i3] = zzn.m10858b(i5);
                i5++;
                i3++;
            }
        }
        this.f35589t = new rw2(mw2VarArr);
        this.f35587r.mo1842h(this);
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    public final long zza() {
        return this.f35591v.zza();
    }

    @Override // com.daaw.wv2
    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (wv2 wv2Var : this.f35590u) {
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
        long zzh = this.f35585p[0].zzh();
        int i = 1;
        while (true) {
            wv2[] wv2VarArr2 = this.f35585p;
            if (i >= wv2VarArr2.length) {
                if (zzh != -9223372036854775807L) {
                    for (wv2 wv2Var : this.f35590u) {
                        if (wv2Var != this.f35585p[0] && wv2Var.mo1845e(zzh) != zzh) {
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
        return this.f35589t;
    }

    @Override // com.daaw.wv2
    public final void zzs() {
        for (wv2 wv2Var : this.f35585p) {
            wv2Var.zzs();
        }
    }
}
