package com.daaw;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class rp7 extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ sp7 f25498a;

    public rp7(sp7 sp7Var) {
        this.f25498a = sp7Var;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            ep7 ep7Var = ep7.f8659f;
            str = this.f25498a.f26511b;
            Mac mac = (Mac) ep7Var.m23314a(str);
            key = this.f25498a.f26512c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
