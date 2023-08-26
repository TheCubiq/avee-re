package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
/* loaded from: classes2.dex */
public final class zzaza implements zzayz<Cipher> {
    @Override // com.google.android.gms.internal.ads.zzayz
    public final /* synthetic */ Cipher zzb(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
