package com.daaw;

import android.text.TextUtils;
import com.daaw.bx1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class dx1 extends jd1 {

    /* renamed from: o */
    public final cx1 f7958o;

    /* renamed from: p */
    public final rv0 f7959p;

    /* renamed from: q */
    public final bx1.C0895b f7960q;

    /* renamed from: r */
    public final C1959kn f7961r;

    /* renamed from: s */
    public final List<ax1> f7962s;

    public dx1() {
        super("WebvttDecoder");
        this.f7958o = new cx1();
        this.f7959p = new rv0();
        this.f7960q = new bx1.C0895b();
        this.f7961r = new C1959kn();
        this.f7962s = new ArrayList();
    }

    /* renamed from: D */
    public static int m23832D(rv0 rv0Var) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = rv0Var.m10917c();
            String m10909k = rv0Var.m10909k();
            i = m10909k == null ? 0 : "STYLE".equals(m10909k) ? 2 : "NOTE".startsWith(m10909k) ? 1 : 3;
        }
        rv0Var.m10921J(i2);
        return i;
    }

    /* renamed from: E */
    public static void m23831E(rv0 rv0Var) {
        do {
        } while (!TextUtils.isEmpty(rv0Var.m10909k()));
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public gx1 mo5845z(byte[] bArr, int i, boolean z) {
        this.f7959p.m10923H(bArr, i);
        this.f7960q.m25775c();
        this.f7962s.clear();
        fx1.m22151d(this.f7959p);
        do {
        } while (!TextUtils.isEmpty(this.f7959p.m10909k()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int m23832D = m23832D(this.f7959p);
            if (m23832D == 0) {
                return new gx1(arrayList);
            }
            if (m23832D == 1) {
                m23831E(this.f7959p);
            } else if (m23832D == 2) {
                if (!arrayList.isEmpty()) {
                    throw new vh1("A style block was found after the first cue.");
                }
                this.f7959p.m10909k();
                ax1 m17657d = this.f7961r.m17657d(this.f7959p);
                if (m17657d != null) {
                    this.f7962s.add(m17657d);
                }
            } else if (m23832D == 3 && this.f7958o.m24924h(this.f7959p, this.f7960q, this.f7962s)) {
                arrayList.add(this.f7960q.m25777a());
                this.f7960q.m25775c();
            }
        }
    }
}
