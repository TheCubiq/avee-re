package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x24 {

    /* renamed from: a */
    public final boolean f32022a;

    /* renamed from: b */
    public final int f32023b;

    /* renamed from: c */
    public final int f32024c;

    /* renamed from: d */
    public final int f32025d;

    /* renamed from: e */
    public final String f32026e;

    /* renamed from: f */
    public final int f32027f;

    /* renamed from: g */
    public final int f32028g;

    /* renamed from: h */
    public final int f32029h;

    /* renamed from: i */
    public final int f32030i;

    /* renamed from: j */
    public final boolean f32031j;

    /* renamed from: k */
    public final int f32032k;

    /* renamed from: l */
    public final boolean f32033l;

    /* renamed from: m */
    public final boolean f32034m;

    /* renamed from: n */
    public final boolean f32035n;

    /* renamed from: o */
    public final boolean f32036o;

    /* renamed from: p */
    public final long f32037p;

    /* renamed from: q */
    public final long f32038q;

    public x24(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f32022a = m5605a(jSONObject, "aggressive_media_codec_release", g93.f10421G);
        this.f32023b = m5604b(jSONObject, "byte_buffer_precache_limit", g93.f10720j);
        this.f32024c = m5604b(jSONObject, "exo_cache_buffer_size", g93.f10841u);
        this.f32025d = m5604b(jSONObject, "exo_connect_timeout_millis", g93.f10676f);
        y83 y83Var = g93.f10665e;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f32026e = string;
            this.f32027f = m5604b(jSONObject, "exo_read_timeout_millis", g93.f10687g);
            this.f32028g = m5604b(jSONObject, "load_check_interval_bytes", g93.f10698h);
            this.f32029h = m5604b(jSONObject, "player_precache_limit", g93.f10709i);
            this.f32030i = m5604b(jSONObject, "socket_receive_buffer_size", g93.f10731k);
            this.f32031j = m5605a(jSONObject, "use_cache_data_source", g93.f10475L3);
            this.f32032k = m5604b(jSONObject, "min_retry_count", g93.f10742l);
            this.f32033l = m5605a(jSONObject, "treat_load_exception_as_non_fatal", g93.f10775o);
            this.f32034m = m5605a(jSONObject, "using_official_simple_exo_player", g93.f10423G1);
            this.f32035n = m5605a(jSONObject, "enable_multiple_video_playback", g93.f10433H1);
            this.f32036o = m5605a(jSONObject, "use_range_http_data_source", g93.f10453J1);
            this.f32037p = m5603c(jSONObject, "range_http_data_source_high_water_mark", g93.f10463K1);
            this.f32038q = m5603c(jSONObject, "range_http_data_source_low_water_mark", g93.f10473L1);
        }
        string = (String) zzba.zzc().m23658b(y83Var);
        this.f32026e = string;
        this.f32027f = m5604b(jSONObject, "exo_read_timeout_millis", g93.f10687g);
        this.f32028g = m5604b(jSONObject, "load_check_interval_bytes", g93.f10698h);
        this.f32029h = m5604b(jSONObject, "player_precache_limit", g93.f10709i);
        this.f32030i = m5604b(jSONObject, "socket_receive_buffer_size", g93.f10731k);
        this.f32031j = m5605a(jSONObject, "use_cache_data_source", g93.f10475L3);
        this.f32032k = m5604b(jSONObject, "min_retry_count", g93.f10742l);
        this.f32033l = m5605a(jSONObject, "treat_load_exception_as_non_fatal", g93.f10775o);
        this.f32034m = m5605a(jSONObject, "using_official_simple_exo_player", g93.f10423G1);
        this.f32035n = m5605a(jSONObject, "enable_multiple_video_playback", g93.f10433H1);
        this.f32036o = m5605a(jSONObject, "use_range_http_data_source", g93.f10453J1);
        this.f32037p = m5603c(jSONObject, "range_http_data_source_high_water_mark", g93.f10463K1);
        this.f32038q = m5603c(jSONObject, "range_http_data_source_low_water_mark", g93.f10473L1);
    }

    /* renamed from: a */
    public static final boolean m5605a(JSONObject jSONObject, String str, y83 y83Var) {
        boolean booleanValue = ((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    /* renamed from: b */
    public static final int m5604b(JSONObject jSONObject, String str, y83 y83Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzba.zzc().m23658b(y83Var)).intValue();
    }

    /* renamed from: c */
    public static final long m5603c(JSONObject jSONObject, String str, y83 y83Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) zzba.zzc().m23658b(y83Var)).longValue();
    }
}
