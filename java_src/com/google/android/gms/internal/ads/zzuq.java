package com.google.android.gms.internal.ads;

import android.content.Context;
@zzadh
/* loaded from: classes2.dex */
public final class zzuq {
    private Context mContext;

    public final void initialize(Context context) {
        if (this.mContext != null) {
            return;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.mContext = context;
    }
}
