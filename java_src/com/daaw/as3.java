package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzb;
import java.io.IOException;
/* loaded from: classes.dex */
public final class as3 extends zzb {

    /* renamed from: c */
    public final Context f3525c;

    public as3(Context context) {
        this.f3525c = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f3525c);
        } catch (a80 | IOException | IllegalStateException e) {
            k04.zzh("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        j04.m19190j(z);
        k04.zzj("Update ad debug logging enablement as " + z);
    }
}
