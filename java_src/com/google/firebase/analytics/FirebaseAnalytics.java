package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.daaw.d20;
import com.daaw.dk1;
import com.daaw.gk5;
import com.daaw.ry0;
import com.daaw.s28;
import com.daaw.xk4;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f37905b;

    /* renamed from: a */
    public final gk5 f37906a;

    public FirebaseAnalytics(gk5 gk5Var) {
        ry0.m10830j(gk5Var);
        this.f37906a = gk5Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f37905b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f37905b == null) {
                    f37905b = new FirebaseAnalytics(gk5.m21515u(context, null, null, null, null));
                }
            }
        }
        return f37905b;
    }

    @Keep
    public static s28 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        gk5 m21515u = gk5.m21515u(context, null, null, null, bundle);
        if (m21515u == null) {
            return null;
        }
        return new xk4(m21515u);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) dk1.m24307b(d20.m24782m().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f37906a.m21531e(activity, str, str2);
    }
}
