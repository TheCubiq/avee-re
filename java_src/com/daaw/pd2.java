package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class pd2 implements j09 {

    /* renamed from: q */
    public static final q09 f22848q = new q09() { // from class: com.daaw.md2
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = pd2.f22848q;
            return new j09[]{new pd2(0)};
        }
    };

    /* renamed from: a */
    public final List f22849a;

    /* renamed from: b */
    public final ik5 f22850b;

    /* renamed from: c */
    public final SparseIntArray f22851c;

    /* renamed from: d */
    public final sd2 f22852d;

    /* renamed from: e */
    public final SparseArray f22853e;

    /* renamed from: f */
    public final SparseBooleanArray f22854f;

    /* renamed from: g */
    public final SparseBooleanArray f22855g;

    /* renamed from: h */
    public final ld2 f22856h;

    /* renamed from: i */
    public kd2 f22857i;

    /* renamed from: j */
    public m09 f22858j;

    /* renamed from: k */
    public int f22859k;

    /* renamed from: l */
    public boolean f22860l;

    /* renamed from: m */
    public boolean f22861m;

    /* renamed from: n */
    public boolean f22862n;

    /* renamed from: o */
    public int f22863o;

    /* renamed from: p */
    public int f22864p;

    public pd2(int i) {
        this(1, 0, 112800);
    }

    public pd2(int i, int i2, int i3) {
        cr5 cr5Var = new cr5(0L);
        this.f22852d = new xb2(0);
        this.f22849a = Collections.singletonList(cr5Var);
        this.f22850b = new ik5(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f22854f = sparseBooleanArray;
        this.f22855g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f22853e = sparseArray;
        this.f22851c = new SparseIntArray();
        this.f22856h = new ld2(112800);
        this.f22858j = m09.f17985o;
        this.f22864p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f22853e.put(sparseArray2.keyAt(i4), (ud2) sparseArray2.valueAt(i4));
        }
        this.f22853e.put(0, new hd2(new nd2(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.daaw.j09
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3957a(k09 k09Var) {
        byte[] m19714h = this.f22850b.m19714h();
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.mo5661h(m19714h, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (m19714h[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            rz8Var.m10811l(i, false);
            return true;
        }
        return false;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f22858j = m09Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x018a, code lost:
        if (r1 == false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        ?? r3;
        long j;
        boolean z;
        long zzd = k09Var.zzd();
        if (this.f22860l) {
            if (zzd != -1) {
                ld2 ld2Var = this.f22856h;
                if (!ld2Var.m17043d()) {
                    return ld2Var.m17046a(k09Var, f42Var, this.f22864p);
                }
            }
            if (this.f22861m) {
                j = 0;
            } else {
                this.f22861m = true;
                ld2 ld2Var2 = this.f22856h;
                if (ld2Var2.m17045b() != -9223372036854775807L) {
                    j = 0;
                    kd2 kd2Var = new kd2(ld2Var2.m17044c(), ld2Var2.m17045b(), zzd, this.f22864p, 112800);
                    this.f22857i = kd2Var;
                    this.f22858j.mo3297i(kd2Var.m14702b());
                } else {
                    j = 0;
                    this.f22858j.mo3297i(new h42(ld2Var2.m17045b(), 0L));
                }
            }
            if (this.f22862n) {
                z = false;
                this.f22862n = false;
                mo3953f(j, j);
                if (k09Var.zzf() != j) {
                    f42Var.f9093a = j;
                    return 1;
                }
            } else {
                z = false;
            }
            kd2 kd2Var2 = this.f22857i;
            r3 = z;
            if (kd2Var2 != null) {
                r3 = z;
                if (kd2Var2.m14699e()) {
                    return kd2Var2.m14703a(k09Var, f42Var);
                }
            }
        } else {
            r3 = 0;
        }
        ik5 ik5Var = this.f22850b;
        byte[] m19714h = ik5Var.m19714h();
        if (9400 - ik5Var.m19711k() < 188) {
            int m19713i = ik5Var.m19713i();
            if (m19713i > 0) {
                System.arraycopy(m19714h, ik5Var.m19711k(), m19714h, r3, m19713i);
            }
            this.f22850b.m19718d(m19714h, m19713i);
        }
        while (true) {
            ik5 ik5Var2 = this.f22850b;
            if (ik5Var2.m19713i() >= 188) {
                int m19711k = ik5Var2.m19711k();
                int m19710l = ik5Var2.m19710l();
                int m7244a = vd2.m7244a(ik5Var2.m19714h(), m19711k, m19710l);
                this.f22850b.m19716f(m7244a);
                int i = m7244a + 188;
                if (i > m19710l) {
                    this.f22863o += m7244a - m19711k;
                } else {
                    this.f22863o = r3;
                }
                ik5 ik5Var3 = this.f22850b;
                int m19710l2 = ik5Var3.m19710l();
                if (i > m19710l2) {
                    return r3;
                }
                int m19709m = ik5Var3.m19709m();
                if ((8388608 & m19709m) == 0) {
                    int i2 = (4194304 & m19709m) != 0 ? 1 : 0;
                    int i3 = (m19709m >> 8) & 8191;
                    int i4 = m19709m & 32;
                    ud2 ud2Var = (m19709m & 16) != 0 ? (ud2) this.f22853e.get(i3) : null;
                    if (ud2Var != null) {
                        int i5 = m19709m & 15;
                        int i6 = this.f22851c.get(i3, i5 - 1);
                        this.f22851c.put(i3, i5);
                        if (i6 != i5) {
                            if (i5 != ((i6 + 1) & 15)) {
                                ud2Var.zzc();
                            }
                            if (i4 != 0) {
                                int m19703s = this.f22850b.m19703s();
                                i2 |= (this.f22850b.m19703s() & 64) != 0 ? 2 : 0;
                                this.f22850b.m19715g(m19703s - 1);
                            }
                            boolean z2 = this.f22860l;
                            if (z2 || !this.f22855g.get(i3, r3)) {
                                this.f22850b.m19717e(i);
                                ud2Var.mo8317a(this.f22850b, i2);
                                this.f22850b.m19717e(m19710l2);
                            }
                            if (this.f22860l && zzd != -1) {
                                this.f22862n = true;
                            }
                        }
                    }
                }
                this.f22850b.m19716f(i);
                return r3;
            }
            int m19710l3 = ik5Var2.m19710l();
            int mo1980a = k09Var.mo1980a(m19714h, m19710l3, 9400 - m19710l3);
            if (mo1980a == -1) {
                return -1;
            }
            this.f22850b.m19717e(m19710l3 + mo1980a);
        }
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        kd2 kd2Var;
        int size = this.f22849a.size();
        for (int i = 0; i < size; i++) {
            cr5 cr5Var = (cr5) this.f22849a.get(i);
            if (cr5Var.m25053e() != -9223372036854775807L) {
                long m25055c = cr5Var.m25055c();
                if (m25055c != -9223372036854775807L) {
                    if (m25055c != 0) {
                        if (m25055c == j2) {
                        }
                    }
                }
            }
            cr5Var.m25052f(j2);
        }
        if (j2 != 0 && (kd2Var = this.f22857i) != null) {
            kd2Var.m14700d(j2);
        }
        this.f22850b.m19719c(0);
        this.f22851c.clear();
        for (int i2 = 0; i2 < this.f22853e.size(); i2++) {
            ((ud2) this.f22853e.valueAt(i2)).zzc();
        }
        this.f22863o = 0;
    }
}
