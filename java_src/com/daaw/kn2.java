package com.daaw;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class kn2 extends no2 {

    /* renamed from: j */
    public static final oo2 f16471j = new oo2();

    /* renamed from: i */
    public final Context f16472i;

    public kn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Context context) {
        super(wm2Var, "ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", hi2Var, i, 29);
        this.f16472i = context;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        this.f20528e.m20754l0("E");
        AtomicReference m14116a = f16471j.m14116a(this.f16472i.getPackageName());
        if (m14116a.get() == null) {
            synchronized (m14116a) {
                if (m14116a.get() == null) {
                    m14116a.set((String) this.f20529f.invoke(null, this.f16472i));
                }
            }
        }
        String str = (String) m14116a.get();
        synchronized (this.f20528e) {
            this.f20528e.m20754l0(uj2.m8102a(str.getBytes(), true));
        }
    }
}
