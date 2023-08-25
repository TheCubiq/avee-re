package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class c25 implements zg3 {
    public final WeakReference a;

    public /* synthetic */ c25(f25 f25Var, b25 b25Var) {
        this.a = new WeakReference(f25Var);
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        jq4 jq4Var;
        ty4 ty4Var;
        ty4 ty4Var2;
        f25 f25Var = (f25) this.a.get();
        if (f25Var == null) {
            return;
        }
        jq4Var = f25Var.h;
        jq4Var.onAdClicked();
        if (((Boolean) zzba.zzc().b(g93.W8)).booleanValue()) {
            ty4Var = f25Var.i;
            ty4Var.zzq();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            ty4Var2 = f25Var.i;
            ty4Var2.zzr();
        }
    }
}
