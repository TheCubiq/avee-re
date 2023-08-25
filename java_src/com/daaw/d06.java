package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class d06 implements h76 {
    public final boolean a;

    public d06(boolean z) {
        this.a = z;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.a ? "0" : "1");
    }
}
