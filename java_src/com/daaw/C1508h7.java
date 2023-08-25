package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* renamed from: com.daaw.h7 */
/* loaded from: classes.dex */
public final class C1508h7 {

    /* renamed from: a */
    public final Context f12115a;

    /* renamed from: b */
    public final InterfaceC1511c f12116b;

    /* renamed from: c */
    public final BroadcastReceiver f12117c;

    /* renamed from: d */
    public C1372g7 f12118d;

    /* renamed from: com.daaw.h7$b */
    /* loaded from: classes.dex */
    public final class C1510b extends BroadcastReceiver {
        public C1510b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1372g7 m21898b = C1372g7.m21898b(intent);
            if (m21898b.equals(C1508h7.this.f12118d)) {
                return;
            }
            C1508h7 c1508h7 = C1508h7.this;
            c1508h7.f12118d = m21898b;
            c1508h7.f12116b.mo13835a(m21898b);
        }
    }

    /* renamed from: com.daaw.h7$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1511c {
        /* renamed from: a */
        void mo13835a(C1372g7 c1372g7);
    }

    public C1508h7(Context context, InterfaceC1511c interfaceC1511c) {
        this.f12115a = (Context) C2914s6.m10686e(context);
        this.f12116b = (InterfaceC1511c) C2914s6.m10686e(interfaceC1511c);
        this.f12117c = sq1.f26525a >= 21 ? new C1510b() : null;
    }
}
