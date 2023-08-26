package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzbed extends RuntimeException {
    private final List<String> zzdyw;

    public zzbed(zzbcu zzbcuVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zzdyw = null;
    }

    public final zzbbu zzaga() {
        return new zzbbu(getMessage());
    }
}
