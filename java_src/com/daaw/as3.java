package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzb;
import java.io.IOException;
/* loaded from: classes.dex */
public final class as3 extends zzb {
    public final Context c;

    public as3(Context context) {
        this.c = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.c);
        } catch (a80 | IOException | IllegalStateException e) {
            k04.zzh("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        j04.j(z);
        k04.zzj("Update ad debug logging enablement as " + z);
    }
}
