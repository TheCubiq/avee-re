package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class d46 implements h76 {
    public final Boolean a;

    public d46(Boolean bool) {
        this.a = bool;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
