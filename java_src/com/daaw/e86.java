package com.daaw;

import android.os.Bundle;
import com.daaw.C1361g5;
import com.daaw.InterfaceC2505p2;
/* loaded from: classes2.dex */
public final class e86 implements C1361g5.InterfaceC1362a {

    /* renamed from: a */
    public final /* synthetic */ z07 f8256a;

    public e86(z07 z07Var) {
        this.f8256a = z07Var;
    }

    @Override // com.daaw.pl7
    /* renamed from: a */
    public final void mo3611a(String str, String str2, Bundle bundle, long j) {
        InterfaceC2505p2.InterfaceC2507b interfaceC2507b;
        if (str == null || !yr3.m3377e(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        interfaceC2507b = this.f8256a.f34312a;
        interfaceC2507b.mo3596a(3, bundle2);
    }
}
