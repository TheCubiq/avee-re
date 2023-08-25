package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class nb2 implements j09 {

    /* renamed from: d */
    public static final q09 f19777d = new q09() { // from class: com.daaw.mb2
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = nb2.f19777d;
            return new j09[]{new nb2()};
        }
    };

    /* renamed from: a */
    public final ob2 f19778a = new ob2(null);

    /* renamed from: b */
    public final ik5 f19779b = new ik5(16384);

    /* renamed from: c */
    public boolean f19780c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r16.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        return false;
     */
    @Override // com.daaw.j09
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3957a(k09 k09Var) {
        int i;
        ik5 ik5Var = new ik5(10);
        int i2 = 0;
        while (true) {
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.mo5661h(ik5Var.m19714h(), 0, 10, false);
            ik5Var.m19716f(0);
            if (ik5Var.m19701u() != 4801587) {
                break;
            }
            ik5Var.m19715g(3);
            int m19704r = ik5Var.m19704r();
            i2 += m19704r + 10;
            rz8Var.m10812k(m19704r, false);
        }
        k09Var.zzj();
        rz8 rz8Var2 = (rz8) k09Var;
        rz8Var2.m10812k(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                rz8Var2.mo5661h(ik5Var.m19714h(), 0, 7, false);
                ik5Var.m19716f(0);
                int m19699w = ik5Var.m19699w();
                if (m19699w != 44096 && m19699w != 44097) {
                    break;
                }
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] m19714h = ik5Var.m19714h();
                int i6 = fz8.f10118b;
                if (m19714h.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((m19714h[2] & 255) << 8) | (m19714h[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((m19714h[4] & 255) << 16) | ((m19714h[5] & 255) << 8) | (m19714h[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (m19699w == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                rz8Var2.m10812k(i - 7, false);
            }
            rz8Var2.m10812k(i3, false);
        }
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f19778a.mo2552b(m09Var, new td2(Integer.MIN_VALUE, 0, 1));
        m09Var.zzC();
        m09Var.mo3297i(new h42(-9223372036854775807L, 0L));
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        int mo1980a = k09Var.mo1980a(this.f19779b.m19714h(), 0, 16384);
        if (mo1980a == -1) {
            return -1;
        }
        this.f19779b.m19716f(0);
        this.f19779b.m19717e(mo1980a);
        if (!this.f19780c) {
            this.f19778a.mo2551c(0L, 4);
            this.f19780c = true;
        }
        this.f19778a.mo2553a(this.f19779b);
        return 0;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        this.f19780c = false;
        this.f19778a.zze();
    }
}
