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
    public static final q09 q = new q09() { // from class: com.daaw.md2
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = pd2.q;
            return new j09[]{new pd2(0)};
        }
    };
    public final List a;
    public final ik5 b;
    public final SparseIntArray c;
    public final sd2 d;
    public final SparseArray e;
    public final SparseBooleanArray f;
    public final SparseBooleanArray g;
    public final ld2 h;
    public kd2 i;
    public m09 j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;

    public pd2(int i) {
        this(1, 0, 112800);
    }

    public pd2(int i, int i2, int i3) {
        cr5 cr5Var = new cr5(0L);
        this.d = new xb2(0);
        this.a = Collections.singletonList(cr5Var);
        this.b = new ik5(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f = sparseBooleanArray;
        this.g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.e = sparseArray;
        this.c = new SparseIntArray();
        this.h = new ld2(112800);
        this.j = m09.o;
        this.p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.e.put(sparseArray2.keyAt(i4), (ud2) sparseArray2.valueAt(i4));
        }
        this.e.put(0, new hd2(new nd2(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.daaw.k09 r7) {
        /*
            r6 = this;
            com.daaw.ik5 r0 = r6.b
            byte[] r0 = r0.h()
            com.daaw.rz8 r7 = (com.daaw.rz8) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.h(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.l(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.pd2.a(com.daaw.k09):boolean");
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.j = m09Var;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r19, com.daaw.f42 r20) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.pd2.d(com.daaw.k09, com.daaw.f42):int");
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        kd2 kd2Var;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            cr5 cr5Var = (cr5) this.a.get(i);
            if (cr5Var.e() != -9223372036854775807L) {
                long c = cr5Var.c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            cr5Var.f(j2);
        }
        if (j2 != 0 && (kd2Var = this.i) != null) {
            kd2Var.d(j2);
        }
        this.b.c(0);
        this.c.clear();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((ud2) this.e.valueAt(i2)).zzc();
        }
        this.o = 0;
    }
}
