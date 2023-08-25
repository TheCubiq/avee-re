package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.daaw.b34;
import com.daaw.c18;
import com.daaw.d28;
import com.daaw.d38;
import com.daaw.dd8;
import com.daaw.dr6;
import com.daaw.ek8;
import com.daaw.g6;
import com.daaw.hm8;
import com.daaw.j68;
import com.daaw.kf8;
import com.daaw.lt3;
import com.daaw.m28;
import com.daaw.mh8;
import com.daaw.nt0;
import com.daaw.ox3;
import com.daaw.p28;
import com.daaw.pl7;
import com.daaw.q38;
import com.daaw.ry0;
import com.daaw.s98;
import com.daaw.uu7;
import com.daaw.v04;
import com.daaw.wc8;
import com.daaw.yd0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends lt3 {
    public dr6 p = null;
    public final Map q = new g6();

    public final void I(ox3 ox3Var, String str) {
        zzb();
        this.p.N().J(ox3Var, str);
    }

    @Override // com.daaw.ju3
    public void beginAdUnitExposure(String str, long j) {
        zzb();
        this.p.y().k(str, j);
    }

    @Override // com.daaw.ju3
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.p.I().n(str, str2, bundle);
    }

    @Override // com.daaw.ju3
    public void clearMeasurementEnabled(long j) {
        zzb();
        this.p.I().I(null);
    }

    @Override // com.daaw.ju3
    public void endAdUnitExposure(String str, long j) {
        zzb();
        this.p.y().l(str, j);
    }

    @Override // com.daaw.ju3
    public void generateEventId(ox3 ox3Var) {
        zzb();
        long r0 = this.p.N().r0();
        zzb();
        this.p.N().I(ox3Var, r0);
    }

    @Override // com.daaw.ju3
    public void getAppInstanceId(ox3 ox3Var) {
        zzb();
        this.p.r().z(new d38(this, ox3Var));
    }

    @Override // com.daaw.ju3
    public void getCachedAppInstanceId(ox3 ox3Var) {
        zzb();
        I(ox3Var, this.p.I().V());
    }

    @Override // com.daaw.ju3
    public void getConditionalUserProperties(String str, String str2, ox3 ox3Var) {
        zzb();
        this.p.r().z(new kf8(this, ox3Var, str, str2));
    }

    @Override // com.daaw.ju3
    public void getCurrentScreenClass(ox3 ox3Var) {
        zzb();
        I(ox3Var, this.p.I().W());
    }

    @Override // com.daaw.ju3
    public void getCurrentScreenName(ox3 ox3Var) {
        zzb();
        I(ox3Var, this.p.I().X());
    }

    @Override // com.daaw.ju3
    public void getGmpAppId(ox3 ox3Var) {
        String str;
        zzb();
        p28 I = this.p.I();
        if (I.a.O() != null) {
            str = I.a.O();
        } else {
            try {
                str = q38.b(I.a.d(), "google_app_id", I.a.R());
            } catch (IllegalStateException e) {
                I.a.i().q().b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        I(ox3Var, str);
    }

    @Override // com.daaw.ju3
    public void getMaxUserProperties(String str, ox3 ox3Var) {
        zzb();
        this.p.I().Q(str);
        zzb();
        this.p.N().H(ox3Var, 25);
    }

    @Override // com.daaw.ju3
    public void getSessionId(ox3 ox3Var) {
        zzb();
        p28 I = this.p.I();
        I.a.r().z(new c18(I, ox3Var));
    }

    @Override // com.daaw.ju3
    public void getTestFlag(ox3 ox3Var, int i) {
        zzb();
        if (i == 0) {
            this.p.N().J(ox3Var, this.p.I().Y());
        } else if (i == 1) {
            this.p.N().I(ox3Var, this.p.I().U().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.p.N().H(ox3Var, this.p.I().T().intValue());
            } else if (i != 4) {
            } else {
                this.p.N().D(ox3Var, this.p.I().R().booleanValue());
            }
        } else {
            dd8 N = this.p.N();
            double doubleValue = this.p.I().S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                ox3Var.T0(bundle);
            } catch (RemoteException e) {
                N.a.i().w().b("Error returning double value to wrapper", e);
            }
        }
    }

    @Override // com.daaw.ju3
    public void getUserProperties(String str, String str2, boolean z, ox3 ox3Var) {
        zzb();
        this.p.r().z(new s98(this, ox3Var, str, str2, z));
    }

    @Override // com.daaw.ju3
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.daaw.ju3
    public void initialize(yd0 yd0Var, zzcl zzclVar, long j) {
        dr6 dr6Var = this.p;
        if (dr6Var == null) {
            this.p = dr6.H((Context) ry0.j((Context) nt0.M(yd0Var)), zzclVar, Long.valueOf(j));
        } else {
            dr6Var.i().w().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.daaw.ju3
    public void isDataCollectionEnabled(ox3 ox3Var) {
        zzb();
        this.p.r().z(new mh8(this, ox3Var));
    }

    @Override // com.daaw.ju3
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzb();
        this.p.I().s(str, str2, bundle, z, z2, j);
    }

    @Override // com.daaw.ju3
    public void logEventAndBundle(String str, String str2, Bundle bundle, ox3 ox3Var, long j) {
        zzb();
        ry0.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.p.r().z(new j68(this, ox3Var, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    @Override // com.daaw.ju3
    public void logHealthData(int i, String str, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        zzb();
        this.p.i().F(i, true, false, str, yd0Var == null ? null : nt0.M(yd0Var), yd0Var2 == null ? null : nt0.M(yd0Var2), yd0Var3 != null ? nt0.M(yd0Var3) : null);
    }

    @Override // com.daaw.ju3
    public void onActivityCreated(yd0 yd0Var, Bundle bundle, long j) {
        zzb();
        m28 m28Var = this.p.I().c;
        if (m28Var != null) {
            this.p.I().o();
            m28Var.onActivityCreated((Activity) nt0.M(yd0Var), bundle);
        }
    }

    @Override // com.daaw.ju3
    public void onActivityDestroyed(yd0 yd0Var, long j) {
        zzb();
        m28 m28Var = this.p.I().c;
        if (m28Var != null) {
            this.p.I().o();
            m28Var.onActivityDestroyed((Activity) nt0.M(yd0Var));
        }
    }

    @Override // com.daaw.ju3
    public void onActivityPaused(yd0 yd0Var, long j) {
        zzb();
        m28 m28Var = this.p.I().c;
        if (m28Var != null) {
            this.p.I().o();
            m28Var.onActivityPaused((Activity) nt0.M(yd0Var));
        }
    }

    @Override // com.daaw.ju3
    public void onActivityResumed(yd0 yd0Var, long j) {
        zzb();
        m28 m28Var = this.p.I().c;
        if (m28Var != null) {
            this.p.I().o();
            m28Var.onActivityResumed((Activity) nt0.M(yd0Var));
        }
    }

    @Override // com.daaw.ju3
    public void onActivitySaveInstanceState(yd0 yd0Var, ox3 ox3Var, long j) {
        zzb();
        m28 m28Var = this.p.I().c;
        Bundle bundle = new Bundle();
        if (m28Var != null) {
            this.p.I().o();
            m28Var.onActivitySaveInstanceState((Activity) nt0.M(yd0Var), bundle);
        }
        try {
            ox3Var.T0(bundle);
        } catch (RemoteException e) {
            this.p.i().w().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.daaw.ju3
    public void onActivityStarted(yd0 yd0Var, long j) {
        zzb();
        if (this.p.I().c != null) {
            this.p.I().o();
            Activity activity = (Activity) nt0.M(yd0Var);
        }
    }

    @Override // com.daaw.ju3
    public void onActivityStopped(yd0 yd0Var, long j) {
        zzb();
        if (this.p.I().c != null) {
            this.p.I().o();
            Activity activity = (Activity) nt0.M(yd0Var);
        }
    }

    @Override // com.daaw.ju3
    public void performAction(Bundle bundle, ox3 ox3Var, long j) {
        zzb();
        ox3Var.T0(null);
    }

    @Override // com.daaw.ju3
    public void registerOnMeasurementEventListener(v04 v04Var) {
        pl7 pl7Var;
        zzb();
        synchronized (this.q) {
            pl7Var = (pl7) this.q.get(Integer.valueOf(v04Var.zzd()));
            if (pl7Var == null) {
                pl7Var = new hm8(this, v04Var);
                this.q.put(Integer.valueOf(v04Var.zzd()), pl7Var);
            }
        }
        this.p.I().x(pl7Var);
    }

    @Override // com.daaw.ju3
    public void resetAnalyticsData(long j) {
        zzb();
        this.p.I().y(j);
    }

    @Override // com.daaw.ju3
    public void setConditionalUserProperty(Bundle bundle, long j) {
        zzb();
        if (bundle == null) {
            this.p.i().q().a("Conditional user property must not be null");
        } else {
            this.p.I().E(bundle, j);
        }
    }

    @Override // com.daaw.ju3
    public void setConsent(final Bundle bundle, final long j) {
        zzb();
        final p28 I = this.p.I();
        I.a.r().A(new Runnable() { // from class: com.daaw.yo7
            @Override // java.lang.Runnable
            public final void run() {
                p28 p28Var = p28.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(p28Var.a.B().t())) {
                    p28Var.F(bundle2, 0, j2);
                } else {
                    p28Var.a.i().x().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.daaw.ju3
    public void setConsentThirdParty(Bundle bundle, long j) {
        zzb();
        this.p.I().F(bundle, -20, j);
    }

    @Override // com.daaw.ju3
    public void setCurrentScreen(yd0 yd0Var, String str, String str2, long j) {
        zzb();
        this.p.K().D((Activity) nt0.M(yd0Var), str, str2);
    }

    @Override // com.daaw.ju3
    public void setDataCollectionEnabled(boolean z) {
        zzb();
        p28 I = this.p.I();
        I.g();
        I.a.r().z(new d28(I, z));
    }

    @Override // com.daaw.ju3
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final p28 I = this.p.I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        I.a.r().z(new Runnable() { // from class: com.daaw.bq7
            @Override // java.lang.Runnable
            public final void run() {
                p28.this.p(bundle2);
            }
        });
    }

    @Override // com.daaw.ju3
    public void setEventInterceptor(v04 v04Var) {
        zzb();
        ek8 ek8Var = new ek8(this, v04Var);
        if (this.p.r().C()) {
            this.p.I().H(ek8Var);
        } else {
            this.p.r().z(new wc8(this, ek8Var));
        }
    }

    @Override // com.daaw.ju3
    public void setInstanceIdProvider(b34 b34Var) {
        zzb();
    }

    @Override // com.daaw.ju3
    public void setMeasurementEnabled(boolean z, long j) {
        zzb();
        this.p.I().I(Boolean.valueOf(z));
    }

    @Override // com.daaw.ju3
    public void setMinimumSessionDuration(long j) {
        zzb();
    }

    @Override // com.daaw.ju3
    public void setSessionTimeoutDuration(long j) {
        zzb();
        p28 I = this.p.I();
        I.a.r().z(new uu7(I, j));
    }

    @Override // com.daaw.ju3
    public void setUserId(final String str, long j) {
        zzb();
        final p28 I = this.p.I();
        if (str != null && TextUtils.isEmpty(str)) {
            I.a.i().w().a("User ID must be non-empty or null");
            return;
        }
        I.a.r().z(new Runnable() { // from class: com.daaw.er7
            @Override // java.lang.Runnable
            public final void run() {
                p28 p28Var = p28.this;
                if (p28Var.a.B().w(str)) {
                    p28Var.a.B().v();
                }
            }
        });
        I.L(null, "_id", str, true, j);
    }

    @Override // com.daaw.ju3
    public void setUserProperty(String str, String str2, yd0 yd0Var, boolean z, long j) {
        zzb();
        this.p.I().L(str, str2, nt0.M(yd0Var), z, j);
    }

    @Override // com.daaw.ju3
    public void unregisterOnMeasurementEventListener(v04 v04Var) {
        pl7 pl7Var;
        zzb();
        synchronized (this.q) {
            pl7Var = (pl7) this.q.remove(Integer.valueOf(v04Var.zzd()));
        }
        if (pl7Var == null) {
            pl7Var = new hm8(this, v04Var);
        }
        this.p.I().N(pl7Var);
    }

    @EnsuresNonNull({"scion"})
    public final void zzb() {
        if (this.p == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
