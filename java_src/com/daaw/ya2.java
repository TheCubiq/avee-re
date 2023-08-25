package com.daaw;

import android.net.Uri;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class ya2 implements j09 {

    /* renamed from: d */
    public static final q09 f33445d = new q09() { // from class: com.daaw.xa2
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = ya2.f33445d;
            return new j09[]{new ya2()};
        }
    };

    /* renamed from: a */
    public m09 f33446a;

    /* renamed from: b */
    public gb2 f33447b;

    /* renamed from: c */
    public boolean f33448c;

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        try {
            return m3956b(k09Var);
        } catch (dl3 unused) {
            return false;
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = um0.f29183a)
    /* renamed from: b */
    public final boolean m3956b(k09 k09Var) {
        gb2 cb2Var;
        ab2 ab2Var = new ab2();
        if (ab2Var.m27539b(k09Var, true) && (ab2Var.f3040a & 2) == 2) {
            int min = Math.min(ab2Var.f3044e, 8);
            ik5 ik5Var = new ik5(min);
            ((rz8) k09Var).mo5661h(ik5Var.m19714h(), 0, min, false);
            ik5Var.m19716f(0);
            if (ik5Var.m19713i() >= 5 && ik5Var.m19703s() == 127 && ik5Var.m19729A() == 1179402563) {
                cb2Var = new wa2();
            } else {
                ik5Var.m19716f(0);
                try {
                    if (s42.m10716d(1, ik5Var, true)) {
                        cb2Var = new ib2();
                    }
                } catch (dl3 unused) {
                }
                ik5Var.m19716f(0);
                if (cb2.m25454j(ik5Var)) {
                    cb2Var = new cb2();
                }
            }
            this.f33447b = cb2Var;
            return true;
        }
        return false;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f33446a = m09Var;
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        uo4.m7876b(this.f33446a);
        if (this.f33447b == null) {
            if (!m3956b(k09Var)) {
                throw dl3.m24267a("Failed to determine bitstream type", null);
            }
            k09Var.zzj();
        }
        if (!this.f33448c) {
            m42 mo3292n = this.f33446a.mo3292n(0, 1);
            this.f33446a.zzC();
            this.f33447b.m21823g(this.f33446a, mo3292n);
            this.f33448c = true;
        }
        return this.f33447b.m21826d(k09Var, f42Var);
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        gb2 gb2Var = this.f33447b;
        if (gb2Var != null) {
            gb2Var.m21822i(j, j2);
        }
    }
}
