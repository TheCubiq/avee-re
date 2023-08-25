package com.daaw;

import java.util.Map;
/* loaded from: classes2.dex */
public final class ya8 implements vo5 {
    public final /* synthetic */ String a;
    public final /* synthetic */ yb8 b;

    public ya8(yb8 yb8Var, String str) {
        this.b = yb8Var;
        this.a = str;
    }

    @Override // com.daaw.vo5
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.b.o(i, th, bArr, this.a);
    }
}
