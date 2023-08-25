package com.daaw;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class l36 extends ud7 {
    public static final Pair y = new Pair("", 0L);
    public SharedPreferences c;
    public e16 d;
    public final xy5 e;
    public final xy5 f;
    public final i26 g;
    public String h;
    public boolean i;
    public long j;
    public final xy5 k;
    public final qw5 l;
    public final i26 m;
    public final qw5 n;
    public final xy5 o;
    public final xy5 p;
    public boolean q;
    public final qw5 r;
    public final qw5 s;
    public final xy5 t;
    public final i26 u;
    public final i26 v;
    public final xy5 w;
    public final ux5 x;

    public l36(dr6 dr6Var) {
        super(dr6Var);
        this.k = new xy5(this, "session_timeout", 1800000L);
        this.l = new qw5(this, "start_new_session", true);
        this.o = new xy5(this, "last_pause_time", 0L);
        this.p = new xy5(this, "session_id", 0L);
        this.m = new i26(this, "non_personalized_ads", null);
        this.n = new qw5(this, "allow_remote_dynamite", false);
        this.e = new xy5(this, "first_open_time", 0L);
        this.f = new xy5(this, "app_install_time", 0L);
        this.g = new i26(this, "app_instance_id", null);
        this.r = new qw5(this, "app_backgrounded", false);
        this.s = new qw5(this, "deep_link_retrieval_complete", false);
        this.t = new xy5(this, "deep_link_retrieval_attempts", 0L);
        this.u = new i26(this, "firebase_feature_rollouts", null);
        this.v = new i26(this, "deferred_attribution_cache", null);
        this.w = new xy5(this, "deferred_attribution_cache_timestamp", 0L);
        this.x = new ux5(this, "default_event_parameters", null);
    }

    @Override // com.daaw.ud7
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void g() {
        SharedPreferences sharedPreferences = this.a.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.a.z();
        this.d = new e16(this, "health_monitor", Math.max(0L, ((Long) m75.d.a(null)).longValue()), null);
    }

    @Override // com.daaw.ud7
    public final boolean h() {
        return true;
    }

    public final SharedPreferences n() {
        f();
        j();
        ry0.j(this.c);
        return this.c;
    }

    public final Pair o(String str) {
        f();
        long b = this.a.b().b();
        String str2 = this.h;
        if (str2 == null || b >= this.j) {
            this.j = b + this.a.z().q(str, m75.c);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.d());
                this.h = "";
                String id = advertisingIdInfo.getId();
                if (id != null) {
                    this.h = id;
                }
                this.i = advertisingIdInfo.isLimitAdTrackingEnabled();
            } catch (Exception e) {
                this.a.i().p().b("Unable to get advertising id", e);
                this.h = "";
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(this.h, Boolean.valueOf(this.i));
        }
        return new Pair(str2, Boolean.valueOf(this.i));
    }

    public final cd2 p() {
        f();
        return cd2.b(n().getString("consent_settings", "G1"));
    }

    public final Boolean q() {
        f();
        if (n().contains("measurement_enabled")) {
            return Boolean.valueOf(n().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void s(Boolean bool) {
        f();
        SharedPreferences.Editor edit = n().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void t(boolean z) {
        f();
        this.a.i().v().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = n().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean u() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean v(long j) {
        return j - this.k.a() > this.o.a();
    }

    public final boolean w(int i) {
        return cd2.j(i, n().getInt("consent_source", 100));
    }
}
