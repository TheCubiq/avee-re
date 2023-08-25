package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class qt8 extends ad2 {
    public final Callable r;

    public qt8(String str, Callable callable) {
        super("internal.appMetadata");
        this.r = callable;
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        try {
            return b38.b(this.r.call());
        } catch (Exception unused) {
            return gl2.g;
        }
    }
}
