package com.daaw;

import android.os.Bundle;
import com.daaw.InterfaceC2505p2;
import java.util.Locale;
/* renamed from: com.daaw.yl */
/* loaded from: classes2.dex */
public class C3716yl implements InterfaceC2505p2.InterfaceC2507b {

    /* renamed from: a */
    public InterfaceC3394w2 f33768a;

    /* renamed from: b */
    public InterfaceC3394w2 f33769b;

    /* renamed from: b */
    public static void m3595b(InterfaceC3394w2 interfaceC3394w2, String str, Bundle bundle) {
        if (interfaceC3394w2 == null) {
            return;
        }
        interfaceC3394w2.mo6589L(str, bundle);
    }

    @Override // com.daaw.InterfaceC2505p2.InterfaceC2507b
    /* renamed from: a */
    public void mo3596a(int i, Bundle bundle) {
        String string;
        ml0.m15976f().m15973i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        m3594c(string, bundle2);
    }

    /* renamed from: c */
    public final void m3594c(String str, Bundle bundle) {
        m3595b("clx".equals(bundle.getString("_o")) ? this.f33768a : this.f33769b, str, bundle);
    }

    /* renamed from: d */
    public void m3593d(InterfaceC3394w2 interfaceC3394w2) {
        this.f33769b = interfaceC3394w2;
    }

    /* renamed from: e */
    public void m3592e(InterfaceC3394w2 interfaceC3394w2) {
        this.f33768a = interfaceC3394w2;
    }
}
