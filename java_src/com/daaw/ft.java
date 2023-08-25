package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ft implements zs {
    public kx1 d;
    public int f;
    public int g;
    public zs a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public pt i = null;
    public boolean j = false;
    public List<zs> k = new ArrayList();
    public List<ft> l = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public ft(kx1 kx1Var) {
        this.d = kx1Var;
    }

    @Override // com.daaw.zs
    public void a(zs zsVar) {
        for (ft ftVar : this.l) {
            if (!ftVar.j) {
                return;
            }
        }
        this.c = true;
        zs zsVar2 = this.a;
        if (zsVar2 != null) {
            zsVar2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        ft ftVar2 = null;
        int i = 0;
        for (ft ftVar3 : this.l) {
            if (!(ftVar3 instanceof pt)) {
                i++;
                ftVar2 = ftVar3;
            }
        }
        if (ftVar2 != null && i == 1 && ftVar2.j) {
            pt ptVar = this.i;
            if (ptVar != null) {
                if (!ptVar.j) {
                    return;
                }
                this.f = this.h * ptVar.g;
            }
            d(ftVar2.g + this.f);
        }
        zs zsVar3 = this.a;
        if (zsVar3 != null) {
            zsVar3.a(this);
        }
    }

    public void b(zs zsVar) {
        this.k.add(zsVar);
        if (this.j) {
            zsVar.a(zsVar);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (zs zsVar : this.k) {
            zsVar.a(zsVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.p());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
