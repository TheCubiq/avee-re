package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class hf7 {

    /* renamed from: a */
    public final Map f12507a;

    /* renamed from: b */
    public final Map f12508b;

    /* renamed from: c */
    public final Map f12509c;

    /* renamed from: d */
    public final Map f12510d;

    public hf7() {
        this.f12507a = new HashMap();
        this.f12508b = new HashMap();
        this.f12509c = new HashMap();
        this.f12510d = new HashMap();
    }

    public hf7(nf7 nf7Var) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = nf7Var.f20092a;
        this.f12507a = new HashMap(map);
        map2 = nf7Var.f20093b;
        this.f12508b = new HashMap(map2);
        map3 = nf7Var.f20094c;
        this.f12509c = new HashMap(map3);
        map4 = nf7Var.f20095d;
        this.f12510d = new HashMap(map4);
    }

    /* renamed from: a */
    public final hf7 m20828a(xd7 xd7Var) {
        jf7 jf7Var = new jf7(xd7Var.m5200d(), xd7Var.m5201c(), null);
        if (this.f12508b.containsKey(jf7Var)) {
            xd7 xd7Var2 = (xd7) this.f12508b.get(jf7Var);
            if (!xd7Var2.equals(xd7Var) || !xd7Var.equals(xd7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(jf7Var.toString()));
            }
        } else {
            this.f12508b.put(jf7Var, xd7Var);
        }
        return this;
    }

    /* renamed from: b */
    public final hf7 m20827b(be7 be7Var) {
        lf7 lf7Var = new lf7(be7Var.m26192b(), be7Var.m26191c(), null);
        if (this.f12507a.containsKey(lf7Var)) {
            be7 be7Var2 = (be7) this.f12507a.get(lf7Var);
            if (!be7Var2.equals(be7Var) || !be7Var.equals(be7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(lf7Var.toString()));
            }
        } else {
            this.f12507a.put(lf7Var, be7Var);
        }
        return this;
    }

    /* renamed from: c */
    public final hf7 m20826c(ue7 ue7Var) {
        jf7 jf7Var = new jf7(ue7Var.m8286c(), ue7Var.m8287b(), null);
        if (this.f12510d.containsKey(jf7Var)) {
            ue7 ue7Var2 = (ue7) this.f12510d.get(jf7Var);
            if (!ue7Var2.equals(ue7Var) || !ue7Var.equals(ue7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(jf7Var.toString()));
            }
        } else {
            this.f12510d.put(jf7Var, ue7Var);
        }
        return this;
    }

    /* renamed from: d */
    public final hf7 m20825d(bf7 bf7Var) {
        lf7 lf7Var = new lf7(bf7Var.m26187b(), bf7Var.m26186c(), null);
        if (this.f12509c.containsKey(lf7Var)) {
            bf7 bf7Var2 = (bf7) this.f12509c.get(lf7Var);
            if (!bf7Var2.equals(bf7Var) || !bf7Var.equals(bf7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(lf7Var.toString()));
            }
        } else {
            this.f12509c.put(lf7Var, bf7Var);
        }
        return this;
    }
}
