package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class a25 implements zg3 {

    /* renamed from: a */
    public final WeakReference f2710a;

    public /* synthetic */ a25(f25 f25Var, x15 x15Var) {
        this.f2710a = new WeakReference(f25Var);
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        jq4 jq4Var;
        ty4 ty4Var;
        ty4 ty4Var2;
        f25 f25Var = (f25) this.f2710a.get();
        if (f25Var != null && "_ac".equals((String) map.get("eventName"))) {
            jq4Var = f25Var.f9028h;
            jq4Var.onAdClicked();
            if (((Boolean) zzba.zzc().m23658b(g93.f10590W8)).booleanValue()) {
                ty4Var = f25Var.f9029i;
                ty4Var.zzq();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                ty4Var2 = f25Var.f9029i;
                ty4Var2.zzr();
            }
        }
    }
}
