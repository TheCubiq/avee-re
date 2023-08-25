package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class v44 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        y24 y24Var = (y24) obj;
        z74 zzs = y24Var.zzs();
        if (zzs == null) {
            try {
                z74 z74Var = new z74(y24Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                y24Var.u(z74Var);
                zzs = z74Var;
            } catch (NullPointerException e) {
                e = e;
                k04.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().u(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                k04.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().u(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (k04.zzm(3)) {
            k04.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzs.g3(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
