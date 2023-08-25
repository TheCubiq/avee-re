package com.daaw;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class l36 extends ud7 {

    /* renamed from: y */
    public static final Pair f17000y = new Pair("", 0L);

    /* renamed from: c */
    public SharedPreferences f17001c;

    /* renamed from: d */
    public e16 f17002d;

    /* renamed from: e */
    public final xy5 f17003e;

    /* renamed from: f */
    public final xy5 f17004f;

    /* renamed from: g */
    public final i26 f17005g;

    /* renamed from: h */
    public String f17006h;

    /* renamed from: i */
    public boolean f17007i;

    /* renamed from: j */
    public long f17008j;

    /* renamed from: k */
    public final xy5 f17009k;

    /* renamed from: l */
    public final qw5 f17010l;

    /* renamed from: m */
    public final i26 f17011m;

    /* renamed from: n */
    public final qw5 f17012n;

    /* renamed from: o */
    public final xy5 f17013o;

    /* renamed from: p */
    public final xy5 f17014p;

    /* renamed from: q */
    public boolean f17015q;

    /* renamed from: r */
    public final qw5 f17016r;

    /* renamed from: s */
    public final qw5 f17017s;

    /* renamed from: t */
    public final xy5 f17018t;

    /* renamed from: u */
    public final i26 f17019u;

    /* renamed from: v */
    public final i26 f17020v;

    /* renamed from: w */
    public final xy5 f17021w;

    /* renamed from: x */
    public final ux5 f17022x;

    public l36(dr6 dr6Var) {
        super(dr6Var);
        this.f17009k = new xy5(this, "session_timeout", 1800000L);
        this.f17010l = new qw5(this, "start_new_session", true);
        this.f17013o = new xy5(this, "last_pause_time", 0L);
        this.f17014p = new xy5(this, "session_id", 0L);
        this.f17011m = new i26(this, "non_personalized_ads", null);
        this.f17012n = new qw5(this, "allow_remote_dynamite", false);
        this.f17003e = new xy5(this, "first_open_time", 0L);
        this.f17004f = new xy5(this, "app_install_time", 0L);
        this.f17005g = new i26(this, "app_instance_id", null);
        this.f17016r = new qw5(this, "app_backgrounded", false);
        this.f17017s = new qw5(this, "deep_link_retrieval_complete", false);
        this.f17018t = new xy5(this, "deep_link_retrieval_attempts", 0L);
        this.f17019u = new i26(this, "firebase_feature_rollouts", null);
        this.f17020v = new i26(this, "deferred_attribution_cache", null);
        this.f17021w = new xy5(this, "deferred_attribution_cache_timestamp", 0L);
        this.f17022x = new ux5(this, "default_event_parameters", null);
    }

    @Override // com.daaw.ud7
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: g */
    public final void mo8311g() {
        SharedPreferences sharedPreferences = this.f25143a.mo3905d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f17001c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f17015q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f17001c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f25143a.m24020z();
        this.f17002d = new e16(this, "health_monitor", Math.max(0L, ((Long) m75.f18525d.m18786a(null)).longValue()), null);
    }

    @Override // com.daaw.ud7
    /* renamed from: h */
    public final boolean mo6990h() {
        return true;
    }

    /* renamed from: n */
    public final SharedPreferences m17176n() {
        mo6991f();
        m8310j();
        ry0.m10830j(this.f17001c);
        return this.f17001c;
    }

    /* renamed from: o */
    public final Pair m17175o(String str) {
        mo6991f();
        long mo15859b = this.f25143a.mo3909b().mo15859b();
        String str2 = this.f17006h;
        if (str2 == null || mo15859b >= this.f17008j) {
            this.f17008j = mo15859b + this.f25143a.m24020z().m12660q(str, m75.f18523c);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f25143a.mo3905d());
                this.f17006h = "";
                String id = advertisingIdInfo.getId();
                if (id != null) {
                    this.f17006h = id;
                }
                this.f17007i = advertisingIdInfo.isLimitAdTrackingEnabled();
            } catch (Exception e) {
                this.f25143a.mo3895i().m14161p().m20652b("Unable to get advertising id", e);
                this.f17006h = "";
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(this.f17006h, Boolean.valueOf(this.f17007i));
        }
        return new Pair(str2, Boolean.valueOf(this.f17007i));
    }

    /* renamed from: p */
    public final cd2 m17174p() {
        mo6991f();
        return cd2.m25430b(m17176n().getString("consent_settings", "G1"));
    }

    /* renamed from: q */
    public final Boolean m17173q() {
        mo6991f();
        if (m17176n().contains("measurement_enabled")) {
            return Boolean.valueOf(m17176n().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: s */
    public final void m17172s(Boolean bool) {
        mo6991f();
        SharedPreferences.Editor edit = m17176n().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: t */
    public final void m17171t(boolean z) {
        mo6991f();
        this.f25143a.mo3895i().m14156v().m20652b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m17176n().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: u */
    public final boolean m17170u() {
        SharedPreferences sharedPreferences = this.f17001c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: v */
    public final boolean m17169v(long j) {
        return j - this.f17009k.m4400a() > this.f17013o.m4400a();
    }

    /* renamed from: w */
    public final boolean m17168w(int i) {
        return cd2.m25422j(i, m17176n().getInt("consent_source", 100));
    }
}
