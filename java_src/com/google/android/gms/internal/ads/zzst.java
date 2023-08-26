package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
final class zzst {
    private final List<zzts> zzxo = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zztt zzttVar) {
        Handler handler = zzakk.zzcrm;
        for (zzts zztsVar : this.zzxo) {
            handler.post(new zztr(this, zztsVar, zzttVar));
        }
        this.zzxo.clear();
    }
}
