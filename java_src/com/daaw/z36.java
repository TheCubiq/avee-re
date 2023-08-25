package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class z36 implements h76 {
    public final boolean a;

    public z36(boolean z) {
        this.a = z;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.a);
    }
}
