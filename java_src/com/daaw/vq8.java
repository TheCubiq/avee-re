package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class vq8 {

    /* renamed from: a */
    public final q09 f30483a;

    /* renamed from: b */
    public final Map f30484b = new HashMap();

    /* renamed from: c */
    public final Set f30485c = new HashSet();

    /* renamed from: d */
    public final Map f30486d = new HashMap();

    /* renamed from: e */
    public m36 f30487e;

    public vq8(q09 q09Var) {
        this.f30483a = q09Var;
    }

    /* renamed from: a */
    public final void m6903a(m36 m36Var) {
        if (m36Var != this.f30487e) {
            this.f30487e = m36Var;
            this.f30484b.clear();
            this.f30486d.clear();
        }
    }
}
