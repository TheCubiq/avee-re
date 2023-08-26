package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzcq extends ContentObserver {
    private final /* synthetic */ zzco zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(zzco zzcoVar, Handler handler) {
        super(null);
        this.zza = zzcoVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzb();
    }
}
