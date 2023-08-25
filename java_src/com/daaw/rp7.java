package com.daaw;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class rp7 extends ThreadLocal {
    public final /* synthetic */ sp7 a;

    public rp7(sp7 sp7Var) {
        this.a = sp7Var;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            ep7 ep7Var = ep7.f;
            str = this.a.b;
            Mac mac = (Mac) ep7Var.a(str);
            key = this.a.c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
