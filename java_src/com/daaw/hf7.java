package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class hf7 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public hf7() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public hf7(nf7 nf7Var) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = nf7Var.a;
        this.a = new HashMap(map);
        map2 = nf7Var.b;
        this.b = new HashMap(map2);
        map3 = nf7Var.c;
        this.c = new HashMap(map3);
        map4 = nf7Var.d;
        this.d = new HashMap(map4);
    }

    public final hf7 a(xd7 xd7Var) {
        jf7 jf7Var = new jf7(xd7Var.d(), xd7Var.c(), null);
        if (this.b.containsKey(jf7Var)) {
            xd7 xd7Var2 = (xd7) this.b.get(jf7Var);
            if (!xd7Var2.equals(xd7Var) || !xd7Var.equals(xd7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(jf7Var.toString()));
            }
        } else {
            this.b.put(jf7Var, xd7Var);
        }
        return this;
    }

    public final hf7 b(be7 be7Var) {
        lf7 lf7Var = new lf7(be7Var.b(), be7Var.c(), null);
        if (this.a.containsKey(lf7Var)) {
            be7 be7Var2 = (be7) this.a.get(lf7Var);
            if (!be7Var2.equals(be7Var) || !be7Var.equals(be7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(lf7Var.toString()));
            }
        } else {
            this.a.put(lf7Var, be7Var);
        }
        return this;
    }

    public final hf7 c(ue7 ue7Var) {
        jf7 jf7Var = new jf7(ue7Var.c(), ue7Var.b(), null);
        if (this.d.containsKey(jf7Var)) {
            ue7 ue7Var2 = (ue7) this.d.get(jf7Var);
            if (!ue7Var2.equals(ue7Var) || !ue7Var.equals(ue7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(jf7Var.toString()));
            }
        } else {
            this.d.put(jf7Var, ue7Var);
        }
        return this;
    }

    public final hf7 d(bf7 bf7Var) {
        lf7 lf7Var = new lf7(bf7Var.b(), bf7Var.c(), null);
        if (this.c.containsKey(lf7Var)) {
            bf7 bf7Var2 = (bf7) this.c.get(lf7Var);
            if (!bf7Var2.equals(bf7Var) || !bf7Var.equals(bf7Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(lf7Var.toString()));
            }
        } else {
            this.c.put(lf7Var, bf7Var);
        }
        return this;
    }
}
