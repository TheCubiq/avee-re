package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class v36 implements h76 {
    public final String a;
    public final boolean b;

    public v36(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.a);
        if (this.b) {
            bundle.putString("de", "1");
        }
    }
}
