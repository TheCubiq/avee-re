package com.daaw;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
public final class i12 extends u12 {

    /* renamed from: p */
    public final /* synthetic */ Intent f13154p;

    /* renamed from: q */
    public final /* synthetic */ Activity f13155q;

    /* renamed from: r */
    public final /* synthetic */ int f13156r;

    public i12(Intent intent, Activity activity, int i) {
        this.f13154p = intent;
        this.f13155q = activity;
        this.f13156r = i;
    }

    @Override // com.daaw.u12
    /* renamed from: a */
    public final void mo8639a() {
        Intent intent = this.f13154p;
        if (intent != null) {
            this.f13155q.startActivityForResult(intent, this.f13156r);
        }
    }
}
