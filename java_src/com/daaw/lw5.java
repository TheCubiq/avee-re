package com.daaw;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class lw5 implements qq5 {
    public final sq5 a;
    public final xq5 b;
    public final en6 c;
    public final g77 d;

    public lw5(en6 en6Var, g77 g77Var, sq5 sq5Var, xq5 xq5Var) {
        this.c = en6Var;
        this.d = g77Var;
        this.b = xq5Var;
        this.a = sq5Var;
    }

    public static final String e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        return !th6Var.u.isEmpty();
    }

    @Override // com.daaw.qq5
    public final f77 b(final fi6 fi6Var, final th6 th6Var) {
        final tq5 tq5Var;
        Iterator it = th6Var.u.iterator();
        while (true) {
            if (!it.hasNext()) {
                tq5Var = null;
                break;
            }
            try {
                tq5Var = this.a.a((String) it.next(), th6Var.w);
                break;
            } catch (wi6 unused) {
            }
        }
        if (tq5Var == null) {
            return s67.h(new hu5("Unable to instantiate mediation adapter class."));
        }
        e14 e14Var = new e14();
        tq5Var.c.I(new kw5(this, tq5Var, e14Var));
        if (th6Var.N) {
            Bundle bundle = fi6Var.a.a.d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        en6 en6Var = this.c;
        return lm6.d(new fm6() { // from class: com.daaw.iw5
            @Override // com.daaw.fm6
            public final void zza() {
                lw5.this.d(fi6Var, th6Var, tq5Var);
            }
        }, this.d, ym6.ADAPTER_LOAD_AD_SYN, en6Var).b(ym6.ADAPTER_LOAD_AD_ACK).d(e14Var).b(ym6.ADAPTER_WRAP_ADAPTER).e(new em6() { // from class: com.daaw.jw5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                return lw5.this.c(fi6Var, th6Var, tq5Var, (Void) obj);
            }
        }).a();
    }

    public final /* synthetic */ Object c(fi6 fi6Var, th6 th6Var, tq5 tq5Var, Void r4) {
        return this.b.b(fi6Var, th6Var, tq5Var);
    }

    public final /* synthetic */ void d(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        this.b.a(fi6Var, th6Var, tq5Var);
    }
}
