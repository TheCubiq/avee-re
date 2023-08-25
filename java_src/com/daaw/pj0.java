package com.daaw;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public interface pj0 {
    /* renamed from: b */
    void mo13333b(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: e */
    <T extends LifecycleCallback> T mo13332e(String str, Class<T> cls);

    /* renamed from: f */
    Activity mo13331f();

    void startActivityForResult(Intent intent, int i);
}
