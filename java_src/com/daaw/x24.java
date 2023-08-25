package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x24 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final long p;
    public final long q;

    public x24(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", g93.G);
        this.b = b(jSONObject, "byte_buffer_precache_limit", g93.j);
        this.c = b(jSONObject, "exo_cache_buffer_size", g93.u);
        this.d = b(jSONObject, "exo_connect_timeout_millis", g93.f);
        y83 y83Var = g93.e;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.e = string;
            this.f = b(jSONObject, "exo_read_timeout_millis", g93.g);
            this.g = b(jSONObject, "load_check_interval_bytes", g93.h);
            this.h = b(jSONObject, "player_precache_limit", g93.i);
            this.i = b(jSONObject, "socket_receive_buffer_size", g93.k);
            this.j = a(jSONObject, "use_cache_data_source", g93.L3);
            this.k = b(jSONObject, "min_retry_count", g93.l);
            this.l = a(jSONObject, "treat_load_exception_as_non_fatal", g93.o);
            this.m = a(jSONObject, "using_official_simple_exo_player", g93.G1);
            this.n = a(jSONObject, "enable_multiple_video_playback", g93.H1);
            this.o = a(jSONObject, "use_range_http_data_source", g93.J1);
            this.p = c(jSONObject, "range_http_data_source_high_water_mark", g93.K1);
            this.q = c(jSONObject, "range_http_data_source_low_water_mark", g93.L1);
        }
        string = (String) zzba.zzc().b(y83Var);
        this.e = string;
        this.f = b(jSONObject, "exo_read_timeout_millis", g93.g);
        this.g = b(jSONObject, "load_check_interval_bytes", g93.h);
        this.h = b(jSONObject, "player_precache_limit", g93.i);
        this.i = b(jSONObject, "socket_receive_buffer_size", g93.k);
        this.j = a(jSONObject, "use_cache_data_source", g93.L3);
        this.k = b(jSONObject, "min_retry_count", g93.l);
        this.l = a(jSONObject, "treat_load_exception_as_non_fatal", g93.o);
        this.m = a(jSONObject, "using_official_simple_exo_player", g93.G1);
        this.n = a(jSONObject, "enable_multiple_video_playback", g93.H1);
        this.o = a(jSONObject, "use_range_http_data_source", g93.J1);
        this.p = c(jSONObject, "range_http_data_source_high_water_mark", g93.K1);
        this.q = c(jSONObject, "range_http_data_source_low_water_mark", g93.L1);
    }

    public static final boolean a(JSONObject jSONObject, String str, y83 y83Var) {
        boolean booleanValue = ((Boolean) zzba.zzc().b(y83Var)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, y83 y83Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzba.zzc().b(y83Var)).intValue();
    }

    public static final long c(JSONObject jSONObject, String str, y83 y83Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) zzba.zzc().b(y83Var)).longValue();
    }
}
