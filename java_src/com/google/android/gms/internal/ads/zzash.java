package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
@zzadh
/* loaded from: classes2.dex */
public final class zzash extends MutableContextWrapper {
    private Context zzaeo;
    private Activity zzcuj;
    private Context zzdeq;

    public zzash(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.zzdeq.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        this.zzaeo = context.getApplicationContext();
        this.zzcuj = context instanceof Activity ? (Activity) context : null;
        this.zzdeq = context;
        super.setBaseContext(this.zzaeo);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zzcuj;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.zzaeo.startActivity(intent);
    }

    public final Activity zzto() {
        return this.zzcuj;
    }

    public final Context zzua() {
        return this.zzdeq;
    }
}
