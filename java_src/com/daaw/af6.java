package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class af6 implements zp8 {
    public final /* synthetic */ gh6 a;

    public af6(gh6 gh6Var) {
        this.a = gh6Var;
    }

    @Override // com.daaw.zp8
    public final void a(int i, String str, List list, boolean z, boolean z2) {
        hk5 p;
        int i2 = i - 1;
        if (i2 == 0) {
            p = this.a.a.i().p();
        } else if (i2 == 1) {
            om5 i3 = this.a.a.i();
            p = z ? i3.t() : !z2 ? i3.s() : i3.q();
        } else if (i2 == 3) {
            p = this.a.a.i().v();
        } else if (i2 != 4) {
            p = this.a.a.i().u();
        } else {
            om5 i4 = this.a.a.i();
            p = z ? i4.y() : !z2 ? i4.x() : i4.w();
        }
        int size = list.size();
        if (size == 1) {
            p.b(str, list.get(0));
        } else if (size == 2) {
            p.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            p.a(str);
        } else {
            p.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
