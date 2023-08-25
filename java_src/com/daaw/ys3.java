package com.daaw;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class ys3 {
    @Nonnull

    /* renamed from: a */
    public View f34000a;

    /* renamed from: b */
    public final Map f34001b = new HashMap();

    /* renamed from: b */
    public final ys3 m3341b(View view) {
        this.f34000a = view;
        return this;
    }

    /* renamed from: c */
    public final ys3 m3340c(Map map) {
        this.f34001b.clear();
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.f34001b.put((String) entry.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
