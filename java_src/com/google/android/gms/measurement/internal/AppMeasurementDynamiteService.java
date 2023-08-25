package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.daaw.C1370g6;
import com.daaw.b34;
import com.daaw.c18;
import com.daaw.d28;
import com.daaw.d38;
import com.daaw.dd8;
import com.daaw.dr6;
import com.daaw.ek8;
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

    /* renamed from: p */
    public dr6 f37054p = null;

    /* renamed from: q */
    public final Map f37055q = new C1370g6();

    /* renamed from: I */
    public final void m1080I(ox3 ox3Var, String str) {
        zzb();
        this.f37054p.m24045N().m24505J(ox3Var, str);
    }

    @Override // com.daaw.ju3
    public void beginAdUnitExposure(String str, long j) {
        zzb();
        this.f37054p.m24021y().m7082k(str, j);
    }

    @Override // com.daaw.ju3
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.f37054p.m24050I().m13689n(str, str2, bundle);
    }

    @Override // com.daaw.ju3
    public void clearMeasurementEnabled(long j) {
        zzb();
        this.f37054p.m24050I().m13713I(null);
    }

    @Override // com.daaw.ju3
    public void endAdUnitExposure(String str, long j) {
        zzb();
        this.f37054p.m24021y().m7081l(str, j);
    }

    @Override // com.daaw.ju3
    public void generateEventId(ox3 ox3Var) {
        zzb();
        long m24467r0 = this.f37054p.m24045N().m24467r0();
        zzb();
        this.f37054p.m24045N().m24506I(ox3Var, m24467r0);
    }

    @Override // com.daaw.ju3
    public void getAppInstanceId(ox3 ox3Var) {
        zzb();
        this.f37054p.mo3882r().m6978z(new d38(this, ox3Var));
    }

    @Override // com.daaw.ju3
    public void getCachedAppInstanceId(ox3 ox3Var) {
        zzb();
        m1080I(ox3Var, this.f37054p.m24050I().m13700V());
    }

    @Override // com.daaw.ju3
    public void getConditionalUserProperties(String str, String str2, ox3 ox3Var) {
        zzb();
        this.f37054p.mo3882r().m6978z(new kf8(this, ox3Var, str, str2));
    }

    @Override // com.daaw.ju3
    public void getCurrentScreenClass(ox3 ox3Var) {
        zzb();
        m1080I(ox3Var, this.f37054p.m24050I().m13699W());
    }

    @Override // com.daaw.ju3
    public void getCurrentScreenName(ox3 ox3Var) {
        zzb();
        m1080I(ox3Var, this.f37054p.m24050I().m13698X());
    }

    @Override // com.daaw.ju3
    public void getGmpAppId(ox3 ox3Var) {
        String str;
        zzb();
        p28 m24050I = this.f37054p.m24050I();
        if (m24050I.f25143a.m24044O() != null) {
            str = m24050I.f25143a.m24044O();
        } else {
            try {
                str = q38.m12789b(m24050I.f25143a.mo3905d(), "google_app_id", m24050I.f25143a.m24041R());
            } catch (IllegalStateException e) {
                m24050I.f25143a.mo3895i().m14160q().m20652b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m1080I(ox3Var, str);
    }

    @Override // com.daaw.ju3
    public void getMaxUserProperties(String str, ox3 ox3Var) {
        zzb();
        this.f37054p.m24050I().m13705Q(str);
        zzb();
        this.f37054p.m24045N().m24507H(ox3Var, 25);
    }

    @Override // com.daaw.ju3
    public void getSessionId(ox3 ox3Var) {
        zzb();
        p28 m24050I = this.f37054p.m24050I();
        m24050I.f25143a.mo3882r().m6978z(new c18(m24050I, ox3Var));
    }

    @Override // com.daaw.ju3
    public void getTestFlag(ox3 ox3Var, int i) {
        zzb();
        if (i == 0) {
            this.f37054p.m24045N().m24505J(ox3Var, this.f37054p.m24050I().m13697Y());
        } else if (i == 1) {
            this.f37054p.m24045N().m24506I(ox3Var, this.f37054p.m24050I().m13701U().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.f37054p.m24045N().m24507H(ox3Var, this.f37054p.m24050I().m13702T().intValue());
            } else if (i != 4) {
            } else {
                this.f37054p.m24045N().m24511D(ox3Var, this.f37054p.m24050I().m13704R().booleanValue());
            }
        } else {
            dd8 m24045N = this.f37054p.m24045N();
            double doubleValue = this.f37054p.m24050I().m13703S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                ox3Var.mo13884T0(bundle);
            } catch (RemoteException e) {
                m24045N.f25143a.mo3895i().m14155w().m20652b("Error returning double value to wrapper", e);
            }
        }
    }

    @Override // com.daaw.ju3
    public void getUserProperties(String str, String str2, boolean z, ox3 ox3Var) {
        zzb();
        this.f37054p.mo3882r().m6978z(new s98(this, ox3Var, str, str2, z));
    }

    @Override // com.daaw.ju3
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.daaw.ju3
    public void initialize(yd0 yd0Var, zzcl zzclVar, long j) {
        dr6 dr6Var = this.f37054p;
        if (dr6Var == null) {
            this.f37054p = dr6.m24051H((Context) ry0.m10830j((Context) nt0.m14831M(yd0Var)), zzclVar, Long.valueOf(j));
        } else {
            dr6Var.mo3895i().m14155w().m20653a("Attempting to initialize multiple times");
        }
    }

    @Override // com.daaw.ju3
    public void isDataCollectionEnabled(ox3 ox3Var) {
        zzb();
        this.f37054p.mo3882r().m6978z(new mh8(this, ox3Var));
    }

    @Override // com.daaw.ju3
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzb();
        this.f37054p.m24050I().m13685s(str, str2, bundle, z, z2, j);
    }

    @Override // com.daaw.ju3
    public void logEventAndBundle(String str, String str2, Bundle bundle, ox3 ox3Var, long j) {
        zzb();
        ry0.m10834f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f37054p.mo3882r().m6978z(new j68(this, ox3Var, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    @Override // com.daaw.ju3
    public void logHealthData(int i, String str, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        zzb();
        this.f37054p.mo3895i().m14165F(i, true, false, str, yd0Var == null ? null : nt0.m14831M(yd0Var), yd0Var2 == null ? null : nt0.m14831M(yd0Var2), yd0Var3 != null ? nt0.m14831M(yd0Var3) : null);
    }

    @Override // com.daaw.ju3
    public void onActivityCreated(yd0 yd0Var, Bundle bundle, long j) {
        zzb();
        m28 m28Var = this.f37054p.m24050I().f22544c;
        if (m28Var != null) {
            this.f37054p.m24050I().m13688o();
            m28Var.onActivityCreated((Activity) nt0.m14831M(yd0Var), bundle);
        }
    }

    @Override // com.daaw.ju3
    public void onActivityDestroyed(yd0 yd0Var, long j) {
        zzb();
        m28 m28Var = this.f37054p.m24050I().f22544c;
        if (m28Var != null) {
            this.f37054p.m24050I().m13688o();
            m28Var.onActivityDestroyed((Activity) nt0.m14831M(yd0Var));
        }
    }

    @Override // com.daaw.ju3
    public void onActivityPaused(yd0 yd0Var, long j) {
        zzb();
        m28 m28Var = this.f37054p.m24050I().f22544c;
        if (m28Var != null) {
            this.f37054p.m24050I().m13688o();
            m28Var.onActivityPaused((Activity) nt0.m14831M(yd0Var));
        }
    }

    @Override // com.daaw.ju3
    public void onActivityResumed(yd0 yd0Var, long j) {
        zzb();
        m28 m28Var = this.f37054p.m24050I().f22544c;
        if (m28Var != null) {
            this.f37054p.m24050I().m13688o();
            m28Var.onActivityResumed((Activity) nt0.m14831M(yd0Var));
        }
    }

    @Override // com.daaw.ju3
    public void onActivitySaveInstanceState(yd0 yd0Var, ox3 ox3Var, long j) {
        zzb();
        m28 m28Var = this.f37054p.m24050I().f22544c;
        Bundle bundle = new Bundle();
        if (m28Var != null) {
            this.f37054p.m24050I().m13688o();
            m28Var.onActivitySaveInstanceState((Activity) nt0.m14831M(yd0Var), bundle);
        }
        try {
            ox3Var.mo13884T0(bundle);
        } catch (RemoteException e) {
            this.f37054p.mo3895i().m14155w().m20652b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.daaw.ju3
    public void onActivityStarted(yd0 yd0Var, long j) {
        zzb();
        if (this.f37054p.m24050I().f22544c != null) {
            this.f37054p.m24050I().m13688o();
            Activity activity = (Activity) nt0.m14831M(yd0Var);
        }
    }

    @Override // com.daaw.ju3
    public void onActivityStopped(yd0 yd0Var, long j) {
        zzb();
        if (this.f37054p.m24050I().f22544c != null) {
            this.f37054p.m24050I().m13688o();
            Activity activity = (Activity) nt0.m14831M(yd0Var);
        }
    }

    @Override // com.daaw.ju3
    public void performAction(Bundle bundle, ox3 ox3Var, long j) {
        zzb();
        ox3Var.mo13884T0(null);
    }

    @Override // com.daaw.ju3
    public void registerOnMeasurementEventListener(v04 v04Var) {
        pl7 pl7Var;
        zzb();
        synchronized (this.f37055q) {
            pl7Var = (pl7) this.f37055q.get(Integer.valueOf(v04Var.zzd()));
            if (pl7Var == null) {
                pl7Var = new hm8(this, v04Var);
                this.f37055q.put(Integer.valueOf(v04Var.zzd()), pl7Var);
            }
        }
        this.f37054p.m24050I().m13680x(pl7Var);
    }

    @Override // com.daaw.ju3
    public void resetAnalyticsData(long j) {
        zzb();
        this.f37054p.m24050I().m13679y(j);
    }

    @Override // com.daaw.ju3
    public void setConditionalUserProperty(Bundle bundle, long j) {
        zzb();
        if (bundle == null) {
            this.f37054p.mo3895i().m14160q().m20653a("Conditional user property must not be null");
        } else {
            this.f37054p.m24050I().m13717E(bundle, j);
        }
    }

    @Override // com.daaw.ju3
    public void setConsent(final Bundle bundle, final long j) {
        zzb();
        final p28 m24050I = this.f37054p.m24050I();
        m24050I.f25143a.mo3882r().m6996A(new Runnable() { // from class: com.daaw.yo7
            @Override // java.lang.Runnable
            public final void run() {
                p28 p28Var = p28.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(p28Var.f25143a.m24057B().m5300t())) {
                    p28Var.m13716F(bundle2, 0, j2);
                } else {
                    p28Var.f25143a.mo3895i().m14154x().m20653a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.daaw.ju3
    public void setConsentThirdParty(Bundle bundle, long j) {
        zzb();
        this.f37054p.m24050I().m13716F(bundle, -20, j);
    }

    @Override // com.daaw.ju3
    public void setCurrentScreen(yd0 yd0Var, String str, String str2, long j) {
        zzb();
        this.f37054p.m24048K().m11750D((Activity) nt0.m14831M(yd0Var), str, str2);
    }

    @Override // com.daaw.ju3
    public void setDataCollectionEnabled(boolean z) {
        zzb();
        p28 m24050I = this.f37054p.m24050I();
        m24050I.m25515g();
        m24050I.f25143a.mo3882r().m6978z(new d28(m24050I, z));
    }

    @Override // com.daaw.ju3
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final p28 m24050I = this.f37054p.m24050I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        m24050I.f25143a.mo3882r().m6978z(new Runnable() { // from class: com.daaw.bq7
            @Override // java.lang.Runnable
            public final void run() {
                p28.this.m13687p(bundle2);
            }
        });
    }

    @Override // com.daaw.ju3
    public void setEventInterceptor(v04 v04Var) {
        zzb();
        ek8 ek8Var = new ek8(this, v04Var);
        if (this.f37054p.mo3882r().m6994C()) {
            this.f37054p.m24050I().m13714H(ek8Var);
        } else {
            this.f37054p.mo3882r().m6978z(new wc8(this, ek8Var));
        }
    }

    @Override // com.daaw.ju3
    public void setInstanceIdProvider(b34 b34Var) {
        zzb();
    }

    @Override // com.daaw.ju3
    public void setMeasurementEnabled(boolean z, long j) {
        zzb();
        this.f37054p.m24050I().m13713I(Boolean.valueOf(z));
    }

    @Override // com.daaw.ju3
    public void setMinimumSessionDuration(long j) {
        zzb();
    }

    @Override // com.daaw.ju3
    public void setSessionTimeoutDuration(long j) {
        zzb();
        p28 m24050I = this.f37054p.m24050I();
        m24050I.f25143a.mo3882r().m6978z(new uu7(m24050I, j));
    }

    @Override // com.daaw.ju3
    public void setUserId(final String str, long j) {
        zzb();
        final p28 m24050I = this.f37054p.m24050I();
        if (str != null && TextUtils.isEmpty(str)) {
            m24050I.f25143a.mo3895i().m14155w().m20653a("User ID must be non-empty or null");
            return;
        }
        m24050I.f25143a.mo3882r().m6978z(new Runnable() { // from class: com.daaw.er7
            @Override // java.lang.Runnable
            public final void run() {
                p28 p28Var = p28.this;
                if (p28Var.f25143a.m24057B().m5297w(str)) {
                    p28Var.f25143a.m24057B().m5298v();
                }
            }
        });
        m24050I.m13710L(null, "_id", str, true, j);
    }

    @Override // com.daaw.ju3
    public void setUserProperty(String str, String str2, yd0 yd0Var, boolean z, long j) {
        zzb();
        this.f37054p.m24050I().m13710L(str, str2, nt0.m14831M(yd0Var), z, j);
    }

    @Override // com.daaw.ju3
    public void unregisterOnMeasurementEventListener(v04 v04Var) {
        pl7 pl7Var;
        zzb();
        synchronized (this.f37055q) {
            pl7Var = (pl7) this.f37055q.remove(Integer.valueOf(v04Var.zzd()));
        }
        if (pl7Var == null) {
            pl7Var = new hm8(this, v04Var);
        }
        this.f37054p.m24050I().m13708N(pl7Var);
    }

    @EnsuresNonNull({"scion"})
    public final void zzb() {
        if (this.f37054p == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
