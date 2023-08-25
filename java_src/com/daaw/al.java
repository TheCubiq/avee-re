package com.daaw;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
public class al {
    public Activity a;

    public al(Activity activity) {
        this.a = activity;
    }

    public al(View view) {
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.a = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        q6.f(this.a);
    }

    public Activity a() {
        return this.a;
    }

    public Context b() {
        return this.a;
    }

    public FragmentManager c() {
        return this.a.getFragmentManager();
    }

    public LayoutInflater d() {
        return this.a.getLayoutInflater();
    }
}
