package com.daaw;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* renamed from: com.daaw.x0 */
/* loaded from: classes.dex */
public final class C3489x0 extends AbstractC3274v0<Intent, ActivityResult> {

    /* renamed from: a */
    public static final C3490a f31699a = new C3490a(null);

    /* renamed from: com.daaw.x0$a */
    /* loaded from: classes.dex */
    public static final class C3490a {
        public C3490a() {
        }

        public /* synthetic */ C3490a(C2575pq c2575pq) {
            this();
        }
    }

    @Override // com.daaw.AbstractC3274v0
    /* renamed from: d */
    public Intent mo5672a(Context context, Intent intent) {
        ug0.m8268f(context, "context");
        ug0.m8268f(intent, "input");
        return intent;
    }

    @Override // com.daaw.AbstractC3274v0
    /* renamed from: e */
    public ActivityResult mo5671c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
