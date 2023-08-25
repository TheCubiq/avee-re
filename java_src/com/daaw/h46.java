package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class h46 implements h76 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public h46(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.a.isEmpty()) {
            bundle.putString("inspector_extras", this.a);
        }
        bundle.putInt("test_mode", this.b ? 1 : 0);
        bundle.putInt("linked_device", this.c ? 1 : 0);
    }
}
