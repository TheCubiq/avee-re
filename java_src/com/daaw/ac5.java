package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccb;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ac5 implements pt4, fs4, oq4, ir4, zza, hw4 {
    public final x33 p;
    @GuardedBy("this")
    public boolean q = false;

    public ac5(x33 x33Var, @Nullable if6 if6Var) {
        this.p = x33Var;
        x33Var.c(2);
        if (if6Var != null) {
            x33Var.c(1101);
        }
    }

    @Override // com.daaw.hw4
    public final void A(final v43 v43Var) {
        this.p.b(new w33() { // from class: com.daaw.vb5
            @Override // com.daaw.w33
            public final void a(u53 u53Var) {
                u53Var.x(v43.this);
            }
        });
        this.p.c(1102);
    }

    @Override // com.daaw.pt4
    public final void F(final fi6 fi6Var) {
        this.p.b(new w33() { // from class: com.daaw.tb5
            @Override // com.daaw.w33
            public final void a(u53 u53Var) {
                fi6 fi6Var2 = fi6.this;
                l43 l43Var = (l43) u53Var.s().k();
                d53 d53Var = (d53) u53Var.s().N().k();
                d53Var.s(fi6Var2.b.b.b);
                l43Var.t(d53Var);
                u53Var.w(l43Var);
            }
        });
    }

    @Override // com.daaw.hw4
    public final void H(final v43 v43Var) {
        this.p.b(new w33() { // from class: com.daaw.zb5
            @Override // com.daaw.w33
            public final void a(u53 u53Var) {
                u53Var.x(v43.this);
            }
        });
        this.p.c(1103);
    }

    @Override // com.daaw.hw4
    public final void S(boolean z) {
        this.p.c(true != z ? 1106 : 1105);
    }

    @Override // com.daaw.oq4
    public final void b(zze zzeVar) {
        x33 x33Var;
        int i;
        switch (zzeVar.zza) {
            case 1:
                x33Var = this.p;
                i = p21.T0;
                break;
            case 2:
                x33Var = this.p;
                i = p21.U0;
                break;
            case 3:
                x33Var = this.p;
                i = 5;
                break;
            case 4:
                x33Var = this.p;
                i = p21.V0;
                break;
            case 5:
                x33Var = this.p;
                i = p21.W0;
                break;
            case 6:
                x33Var = this.p;
                i = 105;
                break;
            case 7:
                x33Var = this.p;
                i = p21.X0;
                break;
            default:
                x33Var = this.p;
                i = 4;
                break;
        }
        x33Var.c(i);
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
    }

    @Override // com.daaw.hw4
    public final void l0(final v43 v43Var) {
        this.p.b(new w33() { // from class: com.daaw.ub5
            @Override // com.daaw.w33
            public final void a(u53 u53Var) {
                u53Var.x(v43.this);
            }
        });
        this.p.c(1104);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.q) {
            this.p.c(8);
            return;
        }
        this.p.c(7);
        this.q = true;
    }

    @Override // com.daaw.hw4
    public final void zzd() {
        this.p.c(1109);
    }

    @Override // com.daaw.hw4
    public final void zzh(boolean z) {
        this.p.c(true != z ? 1108 : 1107);
    }

    @Override // com.daaw.ir4
    public final synchronized void zzl() {
        this.p.c(6);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        this.p.c(3);
    }
}
