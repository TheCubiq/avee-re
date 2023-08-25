package com.daaw;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* loaded from: classes.dex */
public final class x0 extends v0<Intent, ActivityResult> {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    @Override // com.daaw.v0
    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        ug0.f(context, "context");
        ug0.f(intent, "input");
        return intent;
    }

    @Override // com.daaw.v0
    /* renamed from: e */
    public ActivityResult c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
