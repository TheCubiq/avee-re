package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public final class zzauj {
    private static final CopyOnWriteArrayList<zzaui> zzdhj = new CopyOnWriteArrayList<>();

    public static zzaui zzdx(String str) throws GeneralSecurityException {
        Iterator<zzaui> it = zzdhj.iterator();
        while (it.hasNext()) {
            zzaui next = it.next();
            if (next.zzdv(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
