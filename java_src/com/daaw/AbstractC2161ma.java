package com.daaw;

import android.view.View;
import com.daaw.avee.R;
/* renamed from: com.daaw.ma */
/* loaded from: classes.dex */
public abstract class AbstractC2161ma extends AbstractC1172eb {

    /* renamed from: t */
    public C2022la f18686t;

    public AbstractC2161ma(View view, int i, boolean z) {
        super(view);
        this.f18686t = new C2022la(i, z ? view.findViewById(R.id.adView) : null);
    }

    @Override // com.daaw.AbstractC1172eb
    /* renamed from: O */
    public void mo4018O(wc0 wc0Var, int i) {
        this.f18686t.m17075d(wc0Var.mo2250a());
    }
}
