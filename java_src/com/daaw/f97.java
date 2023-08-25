package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class f97 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static e97 a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            e97 e97Var = (e97) it.next();
            if (e97Var.zza()) {
                return e97Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
