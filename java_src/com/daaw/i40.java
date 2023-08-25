package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCrypto;
@TargetApi(16)
/* loaded from: classes.dex */
public final class i40 implements InterfaceC2376nz {

    /* renamed from: a */
    public final MediaCrypto f13231a;

    /* renamed from: b */
    public final boolean f13232b;

    /* renamed from: a */
    public MediaCrypto m20145a() {
        return this.f13231a;
    }

    /* renamed from: b */
    public boolean m20144b(String str) {
        return !this.f13232b && this.f13231a.requiresSecureDecoderComponent(str);
    }
}
