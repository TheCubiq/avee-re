package com.daaw;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class lw5 implements qq5 {

    /* renamed from: a */
    public final sq5 f17868a;

    /* renamed from: b */
    public final xq5 f17869b;

    /* renamed from: c */
    public final en6 f17870c;

    /* renamed from: d */
    public final g77 f17871d;

    public lw5(en6 en6Var, g77 g77Var, sq5 sq5Var, xq5 xq5Var) {
        this.f17870c = en6Var;
        this.f17871d = g77Var;
        this.f17869b = xq5Var;
        this.f17868a = sq5Var;
    }

    /* renamed from: e */
    public static final String m16421e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        return !th6Var.f27716u.isEmpty();
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(final fi6 fi6Var, final th6 th6Var) {
        final tq5 tq5Var;
        Iterator it = th6Var.f27716u.iterator();
        while (true) {
            if (!it.hasNext()) {
                tq5Var = null;
                break;
            }
            try {
                tq5Var = this.f17868a.mo9886a((String) it.next(), th6Var.f27718w);
                break;
            } catch (wi6 unused) {
            }
        }
        if (tq5Var == null) {
            return s67.m10635h(new hu5("Unable to instantiate mediation adapter class."));
        }
        e14 e14Var = new e14();
        tq5Var.f27989c.mo1931I(new kw5(this, tq5Var, e14Var));
        if (th6Var.f27667N) {
            Bundle bundle = fi6Var.f9623a.f5824a.f25344d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        en6 en6Var = this.f17870c;
        return lm6.m16718d(new fm6() { // from class: com.daaw.iw5
            @Override // com.daaw.fm6
            public final void zza() {
                lw5.this.m16422d(fi6Var, th6Var, tq5Var);
            }
        }, this.f17871d, ym6.ADAPTER_LOAD_AD_SYN, en6Var).m7036b(ym6.ADAPTER_LOAD_AD_ACK).m7034d(e14Var).m7036b(ym6.ADAPTER_WRAP_ADAPTER).m7033e(new em6() { // from class: com.daaw.jw5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                return lw5.this.m16423c(fi6Var, th6Var, tq5Var, (Void) obj);
            }
        }).m7037a();
    }

    /* renamed from: c */
    public final /* synthetic */ Object m16423c(fi6 fi6Var, th6 th6Var, tq5 tq5Var, Void r4) {
        return this.f17869b.mo4812b(fi6Var, th6Var, tq5Var);
    }

    /* renamed from: d */
    public final /* synthetic */ void m16422d(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        this.f17869b.mo4813a(fi6Var, th6Var, tq5Var);
    }
}
