package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzapv {
    private final boolean zzczu;
    private final int zzczv;
    private final int zzczw;
    private final int zzczx;
    private final String zzczy;
    private final int zzczz;
    private final int zzdaa;
    private final int zzdab;
    private final boolean zzdac;

    public zzapv(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zzczu = zza(jSONObject, "aggressive_media_codec_release", zznk.zzavl);
        this.zzczv = zzb(jSONObject, "byte_buffer_precache_limit", zznk.zzauv);
        this.zzczw = zzb(jSONObject, "exo_cache_buffer_size", zznk.zzauz);
        this.zzczx = zzb(jSONObject, "exo_connect_timeout_millis", zznk.zzaur);
        this.zzczy = zzc(jSONObject, "exo_player_version", zznk.zzauq);
        this.zzczz = zzb(jSONObject, "exo_read_timeout_millis", zznk.zzaus);
        this.zzdaa = zzb(jSONObject, "load_check_interval_bytes", zznk.zzaut);
        this.zzdab = zzb(jSONObject, "player_precache_limit", zznk.zzauu);
        this.zzdac = zza(jSONObject, "use_cache_data_source", zznk.zzbdr);
    }

    private static boolean zza(JSONObject jSONObject, String str, zzna<Boolean> zznaVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return ((Boolean) zzkb.zzik().zzd(zznaVar)).booleanValue();
    }

    private static int zzb(JSONObject jSONObject, String str, zzna<Integer> zznaVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzkb.zzik().zzd(zznaVar)).intValue();
    }

    private static String zzc(JSONObject jSONObject, String str, zzna<String> zznaVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) zzkb.zzik().zzd(zznaVar);
    }
}
