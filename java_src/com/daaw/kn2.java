package com.daaw;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class kn2 extends no2 {
    public static final oo2 j = new oo2();
    public final Context i;

    public kn2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Context context) {
        super(wm2Var, "ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", hi2Var, i, 29);
        this.i = context;
    }

    @Override // com.daaw.no2
    public final void a() {
        this.e.l0("E");
        AtomicReference a = j.a(this.i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f.invoke(null, this.i));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.e) {
            this.e.l0(uj2.a(str.getBytes(), true));
        }
    }
}
