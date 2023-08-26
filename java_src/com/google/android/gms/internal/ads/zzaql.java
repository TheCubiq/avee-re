package com.google.android.gms.internal.ads;

import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public final class zzaql implements com.google.android.gms.ads.internal.gmsg.zzv<zzapw> {
    private static Integer zze(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = map.get(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
                sb.append("Precache invalid numeric parameter '");
                sb.append(str);
                sb.append("': ");
                sb.append(str2);
                zzakb.zzdk(sb.toString());
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zza(zzapw zzapwVar, Map map) {
        String str;
        Integer zze;
        Integer zze2;
        Integer zze3;
        Integer zze4;
        zzapw zzapwVar2 = zzapwVar;
        com.google.android.gms.ads.internal.zzbv.zzff();
        if (map.containsKey("abort")) {
            if (zzaqg.zzb(zzapwVar2)) {
                return;
            }
            zzakb.zzdk("Precache abort but no precache task running.");
            return;
        }
        String str2 = (String) map.get("src");
        if (str2 != null) {
            if (zzaqg.zzc(zzapwVar2) != null) {
                str = "Precache task is already running.";
            } else if (zzapwVar2.zzbi() != null) {
                zzapv zzapvVar = new zzapv((String) map.get("flags"));
                Integer zze5 = zze(map, "player");
                if (zze5 == null) {
                    zze5 = 0;
                }
                new zzaqe(zzapwVar2, zzapwVar2.zzbi().zzwy.zza(zzapwVar2, zze5.intValue(), null, zzapvVar), str2).zznt();
                zze = zze(map, "minBufferMs");
                if (zze != null) {
                    zze.intValue();
                }
                zze2 = zze(map, "maxBufferMs");
                if (zze2 != null) {
                    zze2.intValue();
                }
                zze3 = zze(map, "bufferForPlaybackMs");
                if (zze3 != null) {
                    zze3.intValue();
                }
                zze4 = zze(map, "bufferForPlaybackAfterRebufferMs");
                if (zze4 == null) {
                    zze4.intValue();
                    return;
                }
                return;
            } else {
                str = "Precache requires a dependency provider.";
            }
            zzakb.zzdk(str);
            return;
        }
        if (zzaqg.zzc(zzapwVar2) == null) {
            str = "Precache must specify a source.";
            zzakb.zzdk(str);
            return;
        }
        zze = zze(map, "minBufferMs");
        if (zze != null) {
        }
        zze2 = zze(map, "maxBufferMs");
        if (zze2 != null) {
        }
        zze3 = zze(map, "bufferForPlaybackMs");
        if (zze3 != null) {
        }
        zze4 = zze(map, "bufferForPlaybackAfterRebufferMs");
        if (zze4 == null) {
        }
    }
}
