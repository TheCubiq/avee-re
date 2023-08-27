package com.google.android.gms.internal.ads;

import java.security.SecureRandom;
/* loaded from: classes2.dex */
final class zzazm extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        SecureRandom zzaar;
        zzaar = zzazl.zzaar();
        return zzaar;
    }
}
