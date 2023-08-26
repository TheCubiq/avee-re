package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public final class zzaqd implements com.google.android.gms.ads.internal.gmsg.zzv<zzapw> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzapw zzapwVar, Map map) {
        zzapw zzapwVar2 = zzapwVar;
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbae)).booleanValue()) {
            zzarl zztm = zzapwVar2.zztm();
            if (zztm == null) {
                try {
                    zzarl zzarlVar = new zzarl(zzapwVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    zzapwVar2.zza(zzarlVar);
                    zztm = zzarlVar;
                } catch (NullPointerException e) {
                    e = e;
                    zzakb.zzb("Unable to parse videoMeta message.", e);
                    com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                } catch (NumberFormatException e2) {
                    e = e2;
                    zzakb.zzb("Unable to parse videoMeta message.", e);
                    com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            parseInt = (parseInt < 0 || 3 < parseInt) ? 0 : 0;
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (zzakb.isLoggable(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79);
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str);
                zzakb.zzck(sb.toString());
            }
            zztm.zza(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
