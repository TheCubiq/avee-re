package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class f97 {

    /* renamed from: a */
    public static final CopyOnWriteArrayList f9294a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static e97 m22825a(String str) {
        Iterator it = f9294a.iterator();
        while (it.hasNext()) {
            e97 e97Var = (e97) it.next();
            if (e97Var.zza()) {
                return e97Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
