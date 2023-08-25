package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class r36 implements h76 {
    public final Bundle a;

    public r36(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.a);
    }
}
