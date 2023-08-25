package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public abstract class r30 {
    @Deprecated
    public Fragment d(Context context, String str, Bundle bundle) {
        return Fragment.Z(context, str, bundle);
    }

    public abstract View f(int i);

    public abstract boolean h();
}
