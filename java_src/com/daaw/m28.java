package com.daaw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
@TargetApi(14)
/* loaded from: classes2.dex */
public final class m28 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p */
    public final /* synthetic */ p28 f18410p;

    public /* synthetic */ m28(p28 p28Var, j28 j28Var) {
        this.f18410p = p28Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.f18410p.f25143a.mo3895i().m14156v().m20653a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.f18410p.f25143a.m24045N();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z = false;
                    }
                    this.f18410p.f25143a.mo3882r().m6978z(new g28(this, z, data, str, queryParameter));
                }
            } catch (RuntimeException e) {
                this.f18410p.f25143a.mo3895i().m14160q().m20652b("Throwable caught in onActivityCreated", e);
            }
        } finally {
            this.f18410p.f25143a.m24048K().m11736y(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f18410p.f25143a.m24048K().m11735z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f18410p.f25143a.m24048K().m11753A(activity);
        ca8 m24046M = this.f18410p.f25143a.m24046M();
        m24046M.f25143a.mo3882r().m6978z(new y88(m24046M, m24046M.f25143a.mo3909b().mo15859b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ca8 m24046M = this.f18410p.f25143a.m24046M();
        m24046M.f25143a.mo3882r().m6978z(new v88(m24046M, m24046M.f25143a.mo3909b().mo15859b()));
        this.f18410p.f25143a.m24048K().m11752B(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f18410p.f25143a.m24048K().m11751C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
