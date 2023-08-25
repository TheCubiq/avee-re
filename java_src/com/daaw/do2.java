package com.daaw;

import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public final class do2 extends no2 {
    public List i;
    public final Context j;

    public do2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Context context) {
        super(wm2Var, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", hi2Var, i, 31);
        this.i = null;
        this.j = context;
    }

    @Override // com.daaw.no2
    public final void a() {
        this.e.O(-1L);
        this.e.K(-1L);
        Context context = this.j;
        if (context == null) {
            context = this.b.b();
        }
        if (this.i == null) {
            this.i = (List) this.f.invoke(null, context);
        }
        List list = this.i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.e) {
            this.e.O(((Long) this.i.get(0)).longValue());
            this.e.K(((Long) this.i.get(1)).longValue());
        }
    }
}
