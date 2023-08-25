package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class kb2 implements j09 {

    /* renamed from: d */
    public static final q09 f16109d = new q09() { // from class: com.daaw.jb2
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = kb2.f16109d;
            return new j09[]{new kb2()};
        }
    };

    /* renamed from: a */
    public final lb2 f16110a = new lb2(null);

    /* renamed from: b */
    public final ik5 f16111b = new ik5(2786);

    /* renamed from: c */
    public boolean f16112c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.zzj();
        r5 = r5 + 1;
     */
    @Override // com.daaw.j09
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3957a(k09 k09Var) {
        ik5 ik5Var = new ik5(10);
        int i = 0;
        while (true) {
            rz8 rz8Var = (rz8) k09Var;
            rz8Var.mo5661h(ik5Var.m19714h(), 0, 10, false);
            ik5Var.m19716f(0);
            if (ik5Var.m19701u() != 4801587) {
                break;
            }
            ik5Var.m19715g(3);
            int m19704r = ik5Var.m19704r();
            i += m19704r + 10;
            rz8Var.m10812k(m19704r, false);
        }
        k09Var.zzj();
        rz8 rz8Var2 = (rz8) k09Var;
        rz8Var2.m10812k(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                rz8Var2.mo5661h(ik5Var.m19714h(), 0, 6, false);
                ik5Var.m19716f(0);
                if (ik5Var.m19699w() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int m24853b = cz8.m24853b(ik5Var.m19714h());
                if (m24853b == -1) {
                    return false;
                }
                rz8Var2.m10812k(m24853b - 6, false);
            }
            rz8Var2.m10812k(i2, false);
        }
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f16110a.mo2552b(m09Var, new td2(Integer.MIN_VALUE, 0, 1));
        m09Var.zzC();
        m09Var.mo3297i(new h42(-9223372036854775807L, 0L));
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        int mo1980a = k09Var.mo1980a(this.f16111b.m19714h(), 0, 2786);
        if (mo1980a == -1) {
            return -1;
        }
        this.f16111b.m19716f(0);
        this.f16111b.m19717e(mo1980a);
        if (!this.f16112c) {
            this.f16110a.mo2551c(0L, 4);
            this.f16112c = true;
        }
        this.f16110a.mo2553a(this.f16111b);
        return 0;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        this.f16112c = false;
        this.f16110a.zze();
    }
}
