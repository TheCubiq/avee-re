package com.daaw;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public abstract class qw0<S> extends Fragment {
    public final LinkedHashSet<ju0<S>> q0 = new LinkedHashSet<>();

    public boolean G1(ju0<S> ju0Var) {
        return this.q0.add(ju0Var);
    }

    public void H1() {
        this.q0.clear();
    }
}
