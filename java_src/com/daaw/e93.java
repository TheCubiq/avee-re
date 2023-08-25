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
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    public volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();

    public final Object b(final y83 y83Var) {
        if (!this.b.block(5000L)) {
            synchronized (this.a) {
                if (!this.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.c || this.e == null) {
            synchronized (this.a) {
                if (this.c && this.e != null) {
                }
                return y83Var.m();
            }
        }
        if (y83Var.e() != 2) {
            return (y83Var.e() == 1 && this.h.has(y83Var.n())) ? y83Var.a(this.h) : i93.a(new iz6() { // from class: com.daaw.b93
                @Override // com.daaw.iz6
                public final Object zza() {
                    return e93.this.c(y83Var);
                }
            });
        }
        Bundle bundle = this.f;
        return bundle == null ? y83Var.m() : y83Var.b(bundle);
    }

    public final /* synthetic */ Object c(y83 y83Var) {
        return y83Var.c(this.e);
    }

    public final /* synthetic */ String d() {
        return this.e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            if (!this.d) {
                this.d = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.g = applicationContext;
            try {
                this.f = ez1.a(applicationContext).c(this.g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context c = c80.c(context);
            if (c != null || (c = context.getApplicationContext()) != null) {
                context = c;
            }
            if (context == null) {
                this.d = false;
                this.b.open();
                return;
            }
            zzba.zzb();
            SharedPreferences a = a93.a(context);
            this.e = a;
            if (a != null) {
                a.registerOnSharedPreferenceChangeListener(this);
            }
            wb3.c(new d93(this));
            f();
            this.c = true;
            this.d = false;
            this.b.open();
        }
    }

    public final void f() {
        if (this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) i93.a(new iz6() { // from class: com.daaw.c93
                @Override // com.daaw.iz6
                public final Object zza() {
                    return e93.this.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
