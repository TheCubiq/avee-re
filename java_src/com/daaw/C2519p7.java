package com.daaw;

import android.util.Pair;
import com.daaw.nj1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
/* renamed from: com.daaw.p7 */
/* loaded from: classes.dex */
public final class C2519p7 extends nj1 {

    /* renamed from: e */
    public static final int[] f22648e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f22649b;

    /* renamed from: c */
    public boolean f22650c;

    /* renamed from: d */
    public int f22651d;

    public C2519p7(sm1 sm1Var) {
        super(sm1Var);
    }

    @Override // com.daaw.nj1
    /* renamed from: b */
    public boolean mo9922b(rv0 rv0Var) {
        Format m1723t;
        if (this.f22649b) {
            rv0Var.m10920K(1);
        } else {
            int m10896x = rv0Var.m10896x();
            int i = (m10896x >> 4) & 15;
            this.f22651d = i;
            if (i == 2) {
                m1723t = Format.m1722u(null, "audio/mpeg", null, -1, -1, 1, f22648e[(m10896x >> 2) & 3], null, null, 0, null);
            } else if (i == 7 || i == 8) {
                m1723t = Format.m1723t(null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, (m10896x & 1) == 1 ? 2 : 3, null, null, 0, null);
            } else {
                if (i != 10) {
                    throw new nj1.C2297a("Audio format not supported: " + this.f22651d);
                }
                this.f22649b = true;
            }
            this.f20158a.mo10156d(m1723t);
            this.f22650c = true;
            this.f22649b = true;
        }
        return true;
    }

    @Override // com.daaw.nj1
    /* renamed from: c */
    public void mo9921c(rv0 rv0Var, long j) {
        if (this.f22651d == 2) {
            int m10919a = rv0Var.m10919a();
            this.f20158a.mo10157c(rv0Var, m10919a);
            this.f20158a.mo10159a(j, 1, m10919a, 0, null);
            return;
        }
        int m10896x = rv0Var.m10896x();
        if (m10896x != 0 || this.f22650c) {
            if (this.f22651d != 10 || m10896x == 1) {
                int m10919a2 = rv0Var.m10919a();
                this.f20158a.mo10157c(rv0Var, m10919a2);
                this.f20158a.mo10159a(j, 1, m10919a2, 0, null);
                return;
            }
            return;
        }
        int m10919a3 = rv0Var.m10919a();
        byte[] bArr = new byte[m10919a3];
        rv0Var.m10913g(bArr, 0, m10919a3);
        Pair<Integer, Integer> m23485i = C1183eg.m23485i(bArr);
        this.f20158a.mo10156d(Format.m1722u(null, "audio/mp4a-latm", null, -1, -1, ((Integer) m23485i.second).intValue(), ((Integer) m23485i.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.f22650c = true;
    }
}
