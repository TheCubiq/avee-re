package com.daaw;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
/* renamed from: com.daaw.al */
/* loaded from: classes.dex */
public class C0645al {

    /* renamed from: a */
    public Activity f3286a;

    public C0645al(Activity activity) {
        this.f3286a = activity;
    }

    public C0645al(View view) {
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f3286a = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C2691q6.m12752f(this.f3286a);
    }

    /* renamed from: a */
    public Activity m27378a() {
        return this.f3286a;
    }

    /* renamed from: b */
    public Context m27377b() {
        return this.f3286a;
    }

    /* renamed from: c */
    public FragmentManager m27376c() {
        return this.f3286a.getFragmentManager();
    }

    /* renamed from: d */
    public LayoutInflater m27375d() {
        return this.f3286a.getLayoutInflater();
    }
}
