package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCrypto;
@TargetApi(16)
/* loaded from: classes.dex */
public final class i40 implements nz {
    public final MediaCrypto a;
    public final boolean b;

    public MediaCrypto a() {
        return this.a;
    }

    public boolean b(String str) {
        return !this.b && this.a.requiresSecureDecoderComponent(str);
    }
}
