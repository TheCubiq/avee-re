package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class af6 implements zp8 {

    /* renamed from: a */
    public final /* synthetic */ gh6 f3169a;

    public af6(gh6 gh6Var) {
        this.f3169a = gh6Var;
    }

    @Override // com.daaw.zp8
    /* renamed from: a */
    public final void mo1996a(int i, String str, List list, boolean z, boolean z2) {
        hk5 m14161p;
        int i2 = i - 1;
        if (i2 == 0) {
            m14161p = this.f3169a.f25143a.mo3895i().m14161p();
        } else if (i2 == 1) {
            om5 mo3895i = this.f3169a.f25143a.mo3895i();
            m14161p = z ? mo3895i.m14158t() : !z2 ? mo3895i.m14159s() : mo3895i.m14160q();
        } else if (i2 == 3) {
            m14161p = this.f3169a.f25143a.mo3895i().m14156v();
        } else if (i2 != 4) {
            m14161p = this.f3169a.f25143a.mo3895i().m14157u();
        } else {
            om5 mo3895i2 = this.f3169a.f25143a.mo3895i();
            m14161p = z ? mo3895i2.m14153y() : !z2 ? mo3895i2.m14154x() : mo3895i2.m14155w();
        }
        int size = list.size();
        if (size == 1) {
            m14161p.m20652b(str, list.get(0));
        } else if (size == 2) {
            m14161p.m20651c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            m14161p.m20653a(str);
        } else {
            m14161p.m20650d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
