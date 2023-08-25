package com.daaw;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class ys3 {
    @Nonnull
    public View a;
    public final Map b = new HashMap();

    public final ys3 b(View view) {
        this.a = view;
        return this;
    }

    public final ys3 c(Map map) {
        this.b.clear();
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.b.put((String) entry.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
