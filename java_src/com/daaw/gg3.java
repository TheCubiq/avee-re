package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class gg3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str;
        a74 a74Var = (a74) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            qw6 j = rw6.j();
            j.b((String) map.get("appId"));
            j.h(a74Var.getWidth());
            j.g(a74Var.g().getWindowToken());
            j.d((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            j.e(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                j.a((String) map.get("enifd"));
            }
            try {
                zzt.zzj().zzj(a74Var, j.i());
                return;
            } catch (NullPointerException e) {
                zzt.zzo().u(e, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        zze.zza(str);
    }
}
