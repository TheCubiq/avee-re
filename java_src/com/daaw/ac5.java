package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccb;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ac5 implements pt4, fs4, oq4, ir4, zza, hw4 {

    /* renamed from: p */
    public final x33 f3075p;
    @GuardedBy("this")

    /* renamed from: q */
    public boolean f3076q = false;

    public ac5(x33 x33Var, @Nullable if6 if6Var) {
        this.f3075p = x33Var;
        x33Var.m5589c(2);
        if (if6Var != null) {
            x33Var.m5589c(1101);
        }
    }

    @Override // com.daaw.hw4
    /* renamed from: A */
    public final void mo5940A(final v43 v43Var) {
        this.f3075p.m5590b(new w33() { // from class: com.daaw.vb5
            @Override // com.daaw.w33
            /* renamed from: a */
            public final void mo2497a(u53 u53Var) {
                u53Var.m8570x(v43.this);
            }
        });
        this.f3075p.m5589c(1102);
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(final fi6 fi6Var) {
        this.f3075p.m5590b(new w33() { // from class: com.daaw.tb5
            @Override // com.daaw.w33
            /* renamed from: a */
            public final void mo2497a(u53 u53Var) {
                fi6 fi6Var2 = fi6.this;
                l43 l43Var = (l43) u53Var.m8575s().m16587k();
                d53 d53Var = (d53) u53Var.m8575s().m16215N().m16587k();
                d53Var.m24641s(fi6Var2.f9624b.f8508b.f31252b);
                l43Var.m17157t(d53Var);
                u53Var.m8571w(l43Var);
            }
        });
    }

    @Override // com.daaw.hw4
    /* renamed from: H */
    public final void mo5939H(final v43 v43Var) {
        this.f3075p.m5590b(new w33() { // from class: com.daaw.zb5
            @Override // com.daaw.w33
            /* renamed from: a */
            public final void mo2497a(u53 u53Var) {
                u53Var.m8570x(v43.this);
            }
        });
        this.f3075p.m5589c(1103);
    }

    @Override // com.daaw.hw4
    /* renamed from: S */
    public final void mo5938S(boolean z) {
        this.f3075p.m5589c(true != z ? 1106 : 1105);
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(zze zzeVar) {
        x33 x33Var;
        int i;
        switch (zzeVar.zza) {
            case 1:
                x33Var = this.f3075p;
                i = p21.f22328T0;
                break;
            case 2:
                x33Var = this.f3075p;
                i = p21.f22334U0;
                break;
            case 3:
                x33Var = this.f3075p;
                i = 5;
                break;
            case 4:
                x33Var = this.f3075p;
                i = p21.f22340V0;
                break;
            case 5:
                x33Var = this.f3075p;
                i = p21.f22346W0;
                break;
            case 6:
                x33Var = this.f3075p;
                i = 105;
                break;
            case 7:
                x33Var = this.f3075p;
                i = p21.f22352X0;
                break;
            default:
                x33Var = this.f3075p;
                i = 4;
                break;
        }
        x33Var.m5589c(i);
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
    }

    @Override // com.daaw.hw4
    /* renamed from: l0 */
    public final void mo5935l0(final v43 v43Var) {
        this.f3075p.m5590b(new w33() { // from class: com.daaw.ub5
            @Override // com.daaw.w33
            /* renamed from: a */
            public final void mo2497a(u53 u53Var) {
                u53Var.m8570x(v43.this);
            }
        });
        this.f3075p.m5589c(1104);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.f3076q) {
            this.f3075p.m5589c(8);
            return;
        }
        this.f3075p.m5589c(7);
        this.f3076q = true;
    }

    @Override // com.daaw.hw4
    public final void zzd() {
        this.f3075p.m5589c(1109);
    }

    @Override // com.daaw.hw4
    public final void zzh(boolean z) {
        this.f3075p.m5589c(true != z ? 1108 : 1107);
    }

    @Override // com.daaw.ir4
    public final synchronized void zzl() {
        this.f3075p.m5589c(6);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        this.f3075p.m5589c(3);
    }
}
