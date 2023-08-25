package com.daaw;

import android.view.View;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public abstract class ma extends eb {
    public la t;

    public ma(View view, int i, boolean z) {
        super(view);
        this.t = new la(i, z ? view.findViewById(R.id.adView) : null);
    }

    @Override // com.daaw.eb
    public void O(wc0 wc0Var, int i) {
        this.t.d(wc0Var.a());
    }
}
