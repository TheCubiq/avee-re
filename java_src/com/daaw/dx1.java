package com.daaw;

import android.text.TextUtils;
import com.daaw.bx1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class dx1 extends jd1 {
    public final cx1 o;
    public final rv0 p;
    public final bx1.b q;
    public final kn r;
    public final List<ax1> s;

    public dx1() {
        super("WebvttDecoder");
        this.o = new cx1();
        this.p = new rv0();
        this.q = new bx1.b();
        this.r = new kn();
        this.s = new ArrayList();
    }

    public static int D(rv0 rv0Var) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = rv0Var.c();
            String k = rv0Var.k();
            i = k == null ? 0 : "STYLE".equals(k) ? 2 : "NOTE".startsWith(k) ? 1 : 3;
        }
        rv0Var.J(i2);
        return i;
    }

    public static void E(rv0 rv0Var) {
        do {
        } while (!TextUtils.isEmpty(rv0Var.k()));
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public gx1 z(byte[] bArr, int i, boolean z) {
        this.p.H(bArr, i);
        this.q.c();
        this.s.clear();
        fx1.d(this.p);
        do {
        } while (!TextUtils.isEmpty(this.p.k()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int D = D(this.p);
            if (D == 0) {
                return new gx1(arrayList);
            }
            if (D == 1) {
                E(this.p);
            } else if (D == 2) {
                if (!arrayList.isEmpty()) {
                    throw new vh1("A style block was found after the first cue.");
                }
                this.p.k();
                ax1 d = this.r.d(this.p);
                if (d != null) {
                    this.s.add(d);
                }
            } else if (D == 3 && this.o.h(this.p, this.q, this.s)) {
                arrayList.add(this.q.a());
                this.q.c();
            }
        }
    }
}
