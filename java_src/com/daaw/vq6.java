package com.daaw;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class vq6 implements tq6 {

    /* renamed from: a */
    public final tq6 f30476a;

    public vq6(tq6 tq6Var) {
        this.f30476a = tq6Var;
    }

    @Override // com.daaw.tq6
    /* renamed from: a */
    public final void mo5843a(View view, JSONObject jSONObject, sq6 sq6Var, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        lq6 m16667a = lq6.m16667a();
        if (m16667a != null) {
            Collection<xp6> m16666b = m16667a.m16666b();
            int size = m16666b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (xp6 xp6Var : m16666b) {
                View m4832f = xp6Var.m4832f();
                if (m4832f != null && m4832f.isAttachedToWindow() && m4832f.isShown()) {
                    View view2 = m4832f;
                    while (true) {
                        if (view2 == null) {
                            View rootView = m4832f.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float m21306a = gr6.m21306a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (gr6.m21306a((View) arrayList.get(i)) <= m21306a) {
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
            sq6Var.mo9989a((View) arrayList.get(i2), this.f30476a, jSONObject, z2);
        }
    }

    @Override // com.daaw.tq6
    public final JSONObject zza(View view) {
        throw null;
    }
}
