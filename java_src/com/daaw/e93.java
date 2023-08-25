package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.client.zzba;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e93 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    public Context f8269g;

    /* renamed from: a */
    public final Object f8263a = new Object();

    /* renamed from: b */
    public final ConditionVariable f8264b = new ConditionVariable();

    /* renamed from: c */
    public volatile boolean f8265c = false;

    /* renamed from: d */
    public volatile boolean f8266d = false;

    /* renamed from: e */
    public SharedPreferences f8267e = null;

    /* renamed from: f */
    public Bundle f8268f = new Bundle();

    /* renamed from: h */
    public JSONObject f8270h = new JSONObject();

    /* renamed from: b */
    public final Object m23658b(final y83 y83Var) {
        if (!this.f8264b.block(5000L)) {
            synchronized (this.f8263a) {
                if (!this.f8266d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f8265c || this.f8267e == null) {
            synchronized (this.f8263a) {
                if (this.f8265c && this.f8267e != null) {
                }
                return y83Var.m4003m();
            }
        }
        if (y83Var.m4011e() != 2) {
            return (y83Var.m4011e() == 1 && this.f8270h.has(y83Var.m4002n())) ? y83Var.mo4015a(this.f8270h) : i93.m20011a(new iz6() { // from class: com.daaw.b93
                @Override // com.daaw.iz6
                public final Object zza() {
                    return e93.this.m23657c(y83Var);
                }
            });
        }
        Bundle bundle = this.f8268f;
        return bundle == null ? y83Var.m4003m() : y83Var.mo4014b(bundle);
    }

    /* renamed from: c */
    public final /* synthetic */ Object m23657c(y83 y83Var) {
        return y83Var.mo4013c(this.f8267e);
    }

    /* renamed from: d */
    public final /* synthetic */ String m23656d() {
        return this.f8267e.getString("flag_configuration", "{}");
    }

    /* renamed from: e */
    public final void m23655e(Context context) {
        if (this.f8265c) {
            return;
        }
        synchronized (this.f8263a) {
            if (this.f8265c) {
                return;
            }
            if (!this.f8266d) {
                this.f8266d = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f8269g = applicationContext;
            try {
                this.f8268f = ez1.m22979a(applicationContext).m19344c(this.f8269g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context m25525c = c80.m25525c(context);
            if (m25525c != null || (m25525c = context.getApplicationContext()) != null) {
                context = m25525c;
            }
            if (context == null) {
                this.f8266d = false;
                this.f8264b.open();
                return;
            }
            zzba.zzb();
            SharedPreferences m27553a = a93.m27553a(context);
            this.f8267e = m27553a;
            if (m27553a != null) {
                m27553a.registerOnSharedPreferenceChangeListener(this);
            }
            wb3.m6205c(new d93(this));
            m23654f();
            this.f8265c = true;
            this.f8266d = false;
            this.f8264b.open();
        }
    }

    /* renamed from: f */
    public final void m23654f() {
        if (this.f8267e == null) {
            return;
        }
        try {
            this.f8270h = new JSONObject((String) i93.m20011a(new iz6() { // from class: com.daaw.c93
                @Override // com.daaw.iz6
                public final Object zza() {
                    return e93.this.m23656d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m23654f();
        }
    }
}
