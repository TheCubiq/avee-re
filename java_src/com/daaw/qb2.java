package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class qb2 implements j09 {

    /* renamed from: j */
    public static final q09 f23834j = new q09() { // from class: com.daaw.pb2
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = qb2.f23834j;
            return new j09[]{new qb2(0)};
        }
    };

    /* renamed from: c */
    public final ik5 f23837c;

    /* renamed from: d */
    public final cj5 f23838d;

    /* renamed from: e */
    public m09 f23839e;

    /* renamed from: f */
    public long f23840f;

    /* renamed from: h */
    public boolean f23842h;

    /* renamed from: i */
    public boolean f23843i;

    /* renamed from: a */
    public final rb2 f23835a = new rb2(true, null);

    /* renamed from: b */
    public final ik5 f23836b = new ik5(2048);

    /* renamed from: g */
    public long f23841g = -1;

    public qb2(int i) {
        ik5 ik5Var = new ik5(10);
        this.f23837c = ik5Var;
        byte[] m19714h = ik5Var.m19714h();
        this.f23838d = new cj5(m19714h, m19714h.length);
    }

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        int i = 0;
        while (true) {
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.mo5661h(this.f23837c.m19714h(), 0, 10, false);
            this.f23837c.m19716f(0);
            if (this.f23837c.m19701u() != 4801587) {
                break;
            }
            this.f23837c.m19715g(3);
            int m19704r = this.f23837c.m19704r();
            i += m19704r + 10;
            rz8Var.m10812k(m19704r, false);
        }
        k09Var.zzj();
        rz8 rz8Var2 = (rz8) k09Var;
        rz8Var2.m10812k(i, false);
        if (this.f23841g == -1) {
            this.f23841g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            rz8Var2.mo5661h(this.f23837c.m19714h(), 0, 2, false);
            this.f23837c.m19716f(0);
            if (rb2.m11455d(this.f23837c.m19699w())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                rz8Var2.mo5661h(this.f23837c.m19714h(), 0, 4, false);
                this.f23838d.m25324h(14);
                int m25329c = this.f23838d.m25329c(13);
                if (m25329c > 6) {
                    rz8Var2.m10812k(m25329c - 6, false);
                    i4 += m25329c;
                }
            }
            i2++;
            k09Var.zzj();
            rz8Var2.m10812k(i2, false);
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f23839e = m09Var;
        this.f23835a.mo2552b(m09Var, new td2(Integer.MIN_VALUE, 0, 1));
        m09Var.zzC();
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        uo4.m7876b(this.f23839e);
        int mo1980a = k09Var.mo1980a(this.f23836b.m19714h(), 0, 2048);
        if (!this.f23843i) {
            this.f23839e.mo3297i(new h42(-9223372036854775807L, 0L));
            this.f23843i = true;
        }
        if (mo1980a == -1) {
            return -1;
        }
        this.f23836b.m19716f(0);
        this.f23836b.m19717e(mo1980a);
        if (!this.f23842h) {
            this.f23835a.mo2551c(this.f23840f, 4);
            this.f23842h = true;
        }
        this.f23835a.mo2553a(this.f23836b);
        return 0;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        this.f23842h = false;
        this.f23835a.zze();
        this.f23840f = j2;
    }
}
