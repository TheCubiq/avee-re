package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
/* loaded from: classes2.dex */
public final class zzazg implements zzayz<Signature> {
    @Override // com.google.android.gms.internal.ads.zzayz
    public final /* synthetic */ Signature zzb(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
