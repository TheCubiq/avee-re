package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ia3 {
    public eo a;
    public bo b;
    public Cdo c;
    public ga3 d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(n08.a(context));
                }
            }
        }
        return false;
    }

    public final eo a() {
        bo boVar = this.b;
        if (boVar == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = boVar.c(null);
        }
        return this.a;
    }

    public final void b(Activity activity) {
        String a;
        if (this.b == null && (a = n08.a(activity)) != null) {
            o08 o08Var = new o08(this, null);
            this.c = o08Var;
            bo.a(activity, a, o08Var);
        }
    }

    public final void c(bo boVar) {
        this.b = boVar;
        boVar.e(0L);
        ga3 ga3Var = this.d;
        if (ga3Var != null) {
            ga3Var.zza();
        }
    }

    public final void d() {
        this.b = null;
        this.a = null;
    }

    public final void e(ga3 ga3Var) {
        this.d = ga3Var;
    }

    public final void f(Activity activity) {
        Cdo cdo = this.c;
        if (cdo == null) {
            return;
        }
        activity.unbindService(cdo);
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
