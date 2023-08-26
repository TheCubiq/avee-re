package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes2.dex */
final class zzew extends ContentObserver {
    private final /* synthetic */ zzet zzafk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzet zzetVar, Handler handler) {
        super(handler);
        this.zzafk = zzetVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.zzafk.zzgb();
    }
}
