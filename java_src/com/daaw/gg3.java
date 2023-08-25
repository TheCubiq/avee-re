package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class gg3 implements zg3 {
    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        String str;
        a74 a74Var = (a74) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            qw6 m10857j = rw6.m10857j();
            m10857j.mo8768b((String) map.get("appId"));
            m10857j.mo8762h(a74Var.getWidth());
            m10857j.mo8763g(a74Var.mo6418g().getWindowToken());
            m10857j.mo8766d((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            m10857j.mo8765e(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                m10857j.mo8769a((String) map.get("enifd"));
            }
            try {
                zzt.zzj().zzj(a74Var, m10857j.mo8761i());
                return;
            } catch (NullPointerException e) {
                zzt.zzo().m11902u(e, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        zze.zza(str);
    }
}
