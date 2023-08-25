package com.daaw;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class vq6 implements tq6 {
    public final tq6 a;

    public vq6(tq6 tq6Var) {
        this.a = tq6Var;
    }

    @Override // com.daaw.tq6
    public final void a(View view, JSONObject jSONObject, sq6 sq6Var, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        lq6 a = lq6.a();
        if (a != null) {
            Collection<xp6> b = a.b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (xp6 xp6Var : b) {
                View f = xp6Var.f();
                if (f != null && f.isAttachedToWindow() && f.isShown()) {
                    View view2 = f;
                    while (true) {
                        if (view2 == null) {
                            View rootView = f.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float a2 = gr6.a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (gr6.a((View) arrayList.get(i)) <= a2) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            sq6Var.a((View) arrayList.get(i2), this.a, jSONObject, z2);
        }
    }

    @Override // com.daaw.tq6
    public final JSONObject zza(View view) {
        throw null;
    }
}
