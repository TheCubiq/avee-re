package com.daaw;

import android.util.Base64;
import com.daaw.cp0;
import com.daaw.gb1;
import com.daaw.qo0;
import com.daaw.we1;
import com.daaw.xe1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ze1 implements qo0, gb1.a<Cif<we1>> {
    public gb1 A;
    public boolean B;
    public final we1.a p;
    public final lk0 q;
    public final int r;
    public final cp0.a s;
    public final l2 t;
    public final TrackGroupArray u;
    public final pm1[] v;
    public final wi w;
    public qo0.a x;
    public xe1 y;
    public Cif<we1>[] z;

    public ze1(xe1 xe1Var, we1.a aVar, wi wiVar, int i, cp0.a aVar2, lk0 lk0Var, l2 l2Var) {
        this.p = aVar;
        this.q = lk0Var;
        this.r = i;
        this.s = aVar2;
        this.t = l2Var;
        this.w = wiVar;
        this.u = h(xe1Var);
        xe1.a aVar3 = xe1Var.e;
        if (aVar3 != null) {
            this.v = new pm1[]{new pm1(true, null, 8, o(aVar3.b), 0, 0, null)};
        } else {
            this.v = null;
        }
        this.y = xe1Var;
        Cif<we1>[] r = r(0);
        this.z = r;
        this.A = wiVar.a(r);
        aVar2.q();
    }

    public static TrackGroupArray h(xe1 xe1Var) {
        TrackGroup[] trackGroupArr = new TrackGroup[xe1Var.f.length];
        for (int i = 0; i < xe1Var.f.length; i++) {
            trackGroupArr[i] = new TrackGroup(xe1Var.f[i].j);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    public static byte[] o(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        w(decode, 0, 3);
        w(decode, 1, 2);
        w(decode, 4, 5);
        w(decode, 6, 7);
        return decode;
    }

    public static Cif<we1>[] r(int i) {
        return new Cif[i];
    }

    public static void w(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long b() {
        return this.A.b();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public boolean c(long j) {
        return this.A.c(j);
    }

    public final Cif<we1> d(com.google.android.exoplayer2.trackselection.c cVar, long j) {
        int b = this.u.b(cVar.a());
        return new Cif<>(this.y.f[b].a, null, null, this.p.a(this.q, this.y, b, cVar, this.v), this, this.t, j, this.r, this.s);
    }

    @Override // com.daaw.qo0
    public long e(long j, ea1 ea1Var) {
        Cif<we1>[] cifArr;
        for (Cif<we1> cif : this.z) {
            if (cif.p == 2) {
                return cif.e(j, ea1Var);
            }
        }
        return j;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long f() {
        return this.A.f();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public void g(long j) {
        this.A.g(j);
    }

    @Override // com.daaw.qo0
    public long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarArr.length; i++) {
            if (d81VarArr[i] != null) {
                Cif cif = (Cif) d81VarArr[i];
                if (cVarArr[i] == null || !zArr[i]) {
                    cif.M();
                    d81VarArr[i] = null;
                } else {
                    arrayList.add(cif);
                }
            }
            if (d81VarArr[i] == null && cVarArr[i] != null) {
                Cif<we1> d = d(cVarArr[i], j);
                arrayList.add(d);
                d81VarArr[i] = d;
                zArr2[i] = true;
            }
        }
        Cif<we1>[] r = r(arrayList.size());
        this.z = r;
        arrayList.toArray(r);
        this.A = this.w.a(this.z);
        return j;
    }

    @Override // com.daaw.qo0
    public void l() {
        this.q.a();
    }

    @Override // com.daaw.qo0
    public long m(long j) {
        for (Cif<we1> cif : this.z) {
            cif.O(j);
        }
        return j;
    }

    @Override // com.daaw.qo0
    public void p(qo0.a aVar, long j) {
        this.x = aVar;
        aVar.j(this);
    }

    @Override // com.daaw.qo0
    public long q() {
        if (this.B) {
            return -9223372036854775807L;
        }
        this.s.t();
        this.B = true;
        return -9223372036854775807L;
    }

    @Override // com.daaw.qo0
    public TrackGroupArray s() {
        return this.u;
    }

    @Override // com.daaw.qo0
    public void t(long j, boolean z) {
        for (Cif<we1> cif : this.z) {
            cif.t(j, z);
        }
    }

    @Override // com.daaw.gb1.a
    /* renamed from: u */
    public void n(Cif<we1> cif) {
        this.x.n(this);
    }

    public void v() {
        for (Cif<we1> cif : this.z) {
            cif.M();
        }
        this.x = null;
        this.s.r();
    }

    public void x(xe1 xe1Var) {
        this.y = xe1Var;
        for (Cif<we1> cif : this.z) {
            cif.B().b(xe1Var);
        }
        this.x.n(this);
    }
}
