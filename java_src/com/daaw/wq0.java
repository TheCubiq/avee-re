package com.daaw;

import com.daaw.bx1;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public final class wq0 extends jd1 {
    public static final int q = sq1.v("payl");
    public static final int r = sq1.v("sttg");
    public static final int s = sq1.v("vttc");
    public final rv0 o;
    public final bx1.b p;

    public wq0() {
        super("Mp4WebvttDecoder");
        this.o = new rv0();
        this.p = new bx1.b();
    }

    public static ln D(rv0 rv0Var, bx1.b bVar, int i) {
        bVar.c();
        while (i > 0) {
            if (i < 8) {
                throw new vh1("Incomplete vtt cue box header found.");
            }
            int i2 = rv0Var.i();
            int i3 = rv0Var.i();
            int i4 = i2 - 8;
            String q2 = sq1.q(rv0Var.a, rv0Var.c(), i4);
            rv0Var.K(i4);
            i = (i - 8) - i4;
            if (i3 == r) {
                cx1.j(q2, bVar);
            } else if (i3 == q) {
                cx1.k(null, q2.trim(), bVar, Collections.emptyList());
            }
        }
        return bVar.a();
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public xq0 z(byte[] bArr, int i, boolean z) {
        this.o.H(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.o.a() > 0) {
            if (this.o.a() < 8) {
                throw new vh1("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int i2 = this.o.i();
            if (this.o.i() == s) {
                arrayList.add(D(this.o, this.p, i2 - 8));
            } else {
                this.o.K(i2 - 8);
            }
        }
        return new xq0(arrayList);
    }
}
