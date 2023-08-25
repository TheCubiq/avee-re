package com.daaw;

import com.daaw.bx1;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public final class wq0 extends jd1 {

    /* renamed from: q */
    public static final int f31453q = sq1.m9994v("payl");

    /* renamed from: r */
    public static final int f31454r = sq1.m9994v("sttg");

    /* renamed from: s */
    public static final int f31455s = sq1.m9994v("vttc");

    /* renamed from: o */
    public final rv0 f31456o;

    /* renamed from: p */
    public final bx1.C0895b f31457p;

    public wq0() {
        super("Mp4WebvttDecoder");
        this.f31456o = new rv0();
        this.f31457p = new bx1.C0895b();
    }

    /* renamed from: D */
    public static C2099ln m5846D(rv0 rv0Var, bx1.C0895b c0895b, int i) {
        c0895b.m25775c();
        while (i > 0) {
            if (i < 8) {
                throw new vh1("Incomplete vtt cue box header found.");
            }
            int m10911i = rv0Var.m10911i();
            int m10911i2 = rv0Var.m10911i();
            int i2 = m10911i - 8;
            String m9999q = sq1.m9999q(rv0Var.f25637a, rv0Var.m10917c(), i2);
            rv0Var.m10920K(i2);
            i = (i - 8) - i2;
            if (m10911i2 == f31454r) {
                cx1.m24922j(m9999q, c0895b);
            } else if (m10911i2 == f31453q) {
                cx1.m24921k(null, m9999q.trim(), c0895b, Collections.emptyList());
            }
        }
        return c0895b.m25777a();
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public xq0 mo5845z(byte[] bArr, int i, boolean z) {
        this.f31456o.m10923H(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f31456o.m10919a() > 0) {
            if (this.f31456o.m10919a() < 8) {
                throw new vh1("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m10911i = this.f31456o.m10911i();
            if (this.f31456o.m10911i() == f31455s) {
                arrayList.add(m5846D(this.f31456o, this.f31457p, m10911i - 8));
            } else {
                this.f31456o.m10920K(m10911i - 8);
            }
        }
        return new xq0(arrayList);
    }
}
