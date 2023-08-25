package com.daaw;

import android.util.Pair;
import com.daaw.nj1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
/* loaded from: classes.dex */
public final class p7 extends nj1 {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public p7(sm1 sm1Var) {
        super(sm1Var);
    }

    @Override // com.daaw.nj1
    public boolean b(rv0 rv0Var) {
        Format t;
        if (this.b) {
            rv0Var.K(1);
        } else {
            int x = rv0Var.x();
            int i = (x >> 4) & 15;
            this.d = i;
            if (i == 2) {
                t = Format.u(null, "audio/mpeg", null, -1, -1, 1, e[(x >> 2) & 3], null, null, 0, null);
            } else if (i == 7 || i == 8) {
                t = Format.t(null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, (x & 1) == 1 ? 2 : 3, null, null, 0, null);
            } else {
                if (i != 10) {
                    throw new nj1.a("Audio format not supported: " + this.d);
                }
                this.b = true;
            }
            this.a.d(t);
            this.c = true;
            this.b = true;
        }
        return true;
    }

    @Override // com.daaw.nj1
    public void c(rv0 rv0Var, long j) {
        if (this.d == 2) {
            int a = rv0Var.a();
            this.a.c(rv0Var, a);
            this.a.a(j, 1, a, 0, null);
            return;
        }
        int x = rv0Var.x();
        if (x != 0 || this.c) {
            if (this.d != 10 || x == 1) {
                int a2 = rv0Var.a();
                this.a.c(rv0Var, a2);
                this.a.a(j, 1, a2, 0, null);
                return;
            }
            return;
        }
        int a3 = rv0Var.a();
        byte[] bArr = new byte[a3];
        rv0Var.g(bArr, 0, a3);
        Pair<Integer, Integer> i = eg.i(bArr);
        this.a.d(Format.u(null, "audio/mp4a-latm", null, -1, -1, ((Integer) i.second).intValue(), ((Integer) i.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.c = true;
    }
}
