package com.daaw;

import android.os.Bundle;
import com.daaw.C1361g5;
import com.daaw.InterfaceC2505p2;
/* loaded from: classes2.dex */
public final class yk4 implements C1361g5.InterfaceC1362a {

    /* renamed from: a */
    public final /* synthetic */ fe5 f33759a;

    public yk4(fe5 fe5Var) {
        this.f33759a = fe5Var;
    }

    @Override // com.daaw.pl7
    /* renamed from: a */
    public final void mo3611a(String str, String str2, Bundle bundle, long j) {
        InterfaceC2505p2.InterfaceC2507b interfaceC2507b;
        if (this.f33759a.f9490a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", yr3.m3381a(str2));
            interfaceC2507b = this.f33759a.f9491b;
            interfaceC2507b.mo3596a(2, bundle2);
        }
    }
}
