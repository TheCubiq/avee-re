package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class d46 implements h76 {

    /* renamed from: a */
    public final Boolean f6528a;

    public d46(Boolean bool) {
        this.f6528a = bool;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f6528a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
