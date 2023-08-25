package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class qt8 extends ad2 {

    /* renamed from: r */
    public final Callable f24324r;

    public qt8(String str, Callable callable) {
        super("internal.appMetadata");
        this.f24324r = callable;
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        try {
            return b38.m26495b(this.f24324r.call());
        } catch (Exception unused) {
            return gl2.f11420g;
        }
    }
}
