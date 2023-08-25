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

    /* renamed from: a */
    public C1203eo f13397a;

    /* renamed from: b */
    public C0875bo f13398b;

    /* renamed from: c */
    public AbstractServiceConnectionC1116do f13399c;

    /* renamed from: d */
    public ga3 f13400d;

    /* renamed from: g */
    public static boolean m20002g(Context context) {
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
                    return resolveActivity.activityInfo.packageName.equals(n08.m15611a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C1203eo m20008a() {
        C0875bo c0875bo = this.f13398b;
        if (c0875bo == null) {
            this.f13397a = null;
        } else if (this.f13397a == null) {
            this.f13397a = c0875bo.m25969c(null);
        }
        return this.f13397a;
    }

    /* renamed from: b */
    public final void m20007b(Activity activity) {
        String m15611a;
        if (this.f13398b == null && (m15611a = n08.m15611a(activity)) != null) {
            o08 o08Var = new o08(this, null);
            this.f13399c = o08Var;
            C0875bo.m25971a(activity, m15611a, o08Var);
        }
    }

    /* renamed from: c */
    public final void m20006c(C0875bo c0875bo) {
        this.f13398b = c0875bo;
        c0875bo.m25967e(0L);
        ga3 ga3Var = this.f13400d;
        if (ga3Var != null) {
            ga3Var.zza();
        }
    }

    /* renamed from: d */
    public final void m20005d() {
        this.f13398b = null;
        this.f13397a = null;
    }

    /* renamed from: e */
    public final void m20004e(ga3 ga3Var) {
        this.f13400d = ga3Var;
    }

    /* renamed from: f */
    public final void m20003f(Activity activity) {
        AbstractServiceConnectionC1116do abstractServiceConnectionC1116do = this.f13399c;
        if (abstractServiceConnectionC1116do == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC1116do);
        this.f13398b = null;
        this.f13397a = null;
        this.f13399c = null;
    }
}
