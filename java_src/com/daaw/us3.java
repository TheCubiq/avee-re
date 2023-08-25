package com.daaw;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;
/* loaded from: classes.dex */
public final class us3 extends qs3 {
    public final /* synthetic */ UpdateImpressionUrlsCallback p;

    public us3(zs3 zs3Var, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.p = updateImpressionUrlsCallback;
    }

    @Override // com.daaw.rs3
    public final void a(String str) {
        this.p.onFailure(str);
    }

    @Override // com.daaw.rs3
    public final void x0(List list) {
        this.p.onSuccess(list);
    }
}
