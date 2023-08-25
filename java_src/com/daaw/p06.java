package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class p06 implements h76 {
    public final String a;

    public p06(String str) {
        this.a = str;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
