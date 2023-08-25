package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class h46 implements h76 {

    /* renamed from: a */
    public final String f12056a;

    /* renamed from: b */
    public final boolean f12057b;

    /* renamed from: c */
    public final boolean f12058c;

    public h46(String str, boolean z, boolean z2) {
        this.f12056a = str;
        this.f12057b = z;
        this.f12058c = z2;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f12056a.isEmpty()) {
            bundle.putString("inspector_extras", this.f12056a);
        }
        bundle.putInt("test_mode", this.f12057b ? 1 : 0);
        bundle.putInt("linked_device", this.f12058c ? 1 : 0);
    }
}
