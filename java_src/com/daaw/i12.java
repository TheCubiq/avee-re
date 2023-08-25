package com.daaw;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
public final class i12 extends u12 {
    public final /* synthetic */ Intent p;
    public final /* synthetic */ Activity q;
    public final /* synthetic */ int r;

    public i12(Intent intent, Activity activity, int i) {
        this.p = intent;
        this.q = activity;
        this.r = i;
    }

    @Override // com.daaw.u12
    public final void a() {
        Intent intent = this.p;
        if (intent != null) {
            this.q.startActivityForResult(intent, this.r);
        }
    }
}
