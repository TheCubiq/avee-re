package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;
/* loaded from: classes2.dex */
public final class zzaze implements zzayz<Mac> {
    @Override // com.google.android.gms.internal.ads.zzayz
    public final /* synthetic */ Mac zzb(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
