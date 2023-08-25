package com.daaw;

import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public final class do2 extends no2 {

    /* renamed from: i */
    public List f7573i;

    /* renamed from: j */
    public final Context f7574j;

    public do2(wm2 wm2Var, String str, String str2, hi2 hi2Var, int i, int i2, Context context) {
        super(wm2Var, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", hi2Var, i, 31);
        this.f7573i = null;
        this.f7574j = context;
    }

    @Override // com.daaw.no2
    /* renamed from: a */
    public final void mo2099a() {
        this.f20528e.m20777O(-1L);
        this.f20528e.m20781K(-1L);
        Context context = this.f7574j;
        if (context == null) {
            context = this.f20525b.m6004b();
        }
        if (this.f7573i == null) {
            this.f7573i = (List) this.f20529f.invoke(null, context);
        }
        List list = this.f7573i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f20528e) {
            this.f20528e.m20777O(((Long) this.f7573i.get(0)).longValue());
            this.f20528e.m20781K(((Long) this.f7573i.get(1)).longValue());
        }
    }
}
