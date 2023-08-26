package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;
/* loaded from: classes2.dex */
public final class zzazb implements zzayz<KeyAgreement> {
    @Override // com.google.android.gms.internal.ads.zzayz
    public final /* synthetic */ KeyAgreement zzb(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
