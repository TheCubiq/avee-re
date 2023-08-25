package com.daaw;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public interface pj0 {
    void b(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T e(String str, Class<T> cls);

    Activity f();

    void startActivityForResult(Intent intent, int i);
}
