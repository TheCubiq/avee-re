package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class vq8 {
    public final q09 a;
    public final Map b = new HashMap();
    public final Set c = new HashSet();
    public final Map d = new HashMap();
    public m36 e;

    public vq8(q09 q09Var) {
        this.a = q09Var;
    }

    public final void a(m36 m36Var) {
        if (m36Var != this.e) {
            this.e = m36Var;
            this.b.clear();
            this.d.clear();
        }
    }
}
