package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
/* loaded from: classes.dex */
public final class u84 extends MutableContextWrapper {

    /* renamed from: a */
    public Activity f28781a;

    /* renamed from: b */
    public Context f28782b;

    /* renamed from: c */
    public Context f28783c;

    public u84(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity m8435a() {
        return this.f28781a;
    }

    /* renamed from: b */
    public final Context m8434b() {
        return this.f28783c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f28783c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f28782b = applicationContext;
        this.f28781a = context instanceof Activity ? (Activity) context : null;
        this.f28783c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f28781a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f28782b.startActivity(intent);
    }
}
