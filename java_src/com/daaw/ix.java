package com.daaw;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class ix implements hi0 {
    public final String a;
    public final int b;
    public final int c;
    public final d51 d;
    public final d51 e;
    public final cn1 f;
    public final e51 g;
    public final i51 h;
    public final zw i;
    public final hi0 j;
    public String k;
    public int l;
    public hi0 m;

    public ix(String str, hi0 hi0Var, int i, int i2, d51 d51Var, d51 d51Var2, cn1 cn1Var, e51 e51Var, i51 i51Var, zw zwVar) {
        this.a = str;
        this.j = hi0Var;
        this.b = i;
        this.c = i2;
        this.d = d51Var;
        this.e = d51Var2;
        this.f = cn1Var;
        this.g = e51Var;
        this.h = i51Var;
        this.i = zwVar;
    }

    @Override // com.daaw.hi0
    public void a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.b).putInt(this.c).array();
        this.j.a(messageDigest);
        messageDigest.update(this.a.getBytes("UTF-8"));
        messageDigest.update(array);
        d51 d51Var = this.d;
        messageDigest.update((d51Var != null ? d51Var.getId() : "").getBytes("UTF-8"));
        d51 d51Var2 = this.e;
        messageDigest.update((d51Var2 != null ? d51Var2.getId() : "").getBytes("UTF-8"));
        cn1 cn1Var = this.f;
        messageDigest.update((cn1Var != null ? cn1Var.getId() : "").getBytes("UTF-8"));
        e51 e51Var = this.g;
        messageDigest.update((e51Var != null ? e51Var.getId() : "").getBytes("UTF-8"));
        zw zwVar = this.i;
        messageDigest.update((zwVar != null ? zwVar.getId() : "").getBytes("UTF-8"));
    }

    public hi0 b() {
        if (this.m == null) {
            this.m = new yu0(this.a, this.j);
        }
        return this.m;
    }

    @Override // com.daaw.hi0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ix ixVar = (ix) obj;
        if (this.a.equals(ixVar.a) && this.j.equals(ixVar.j) && this.c == ixVar.c && this.b == ixVar.b) {
            cn1 cn1Var = this.f;
            if ((cn1Var == null) ^ (ixVar.f == null)) {
                return false;
            }
            if (cn1Var == null || cn1Var.getId().equals(ixVar.f.getId())) {
                d51 d51Var = this.e;
                if ((d51Var == null) ^ (ixVar.e == null)) {
                    return false;
                }
                if (d51Var == null || d51Var.getId().equals(ixVar.e.getId())) {
                    d51 d51Var2 = this.d;
                    if ((d51Var2 == null) ^ (ixVar.d == null)) {
                        return false;
                    }
                    if (d51Var2 == null || d51Var2.getId().equals(ixVar.d.getId())) {
                        e51 e51Var = this.g;
                        if ((e51Var == null) ^ (ixVar.g == null)) {
                            return false;
                        }
                        if (e51Var == null || e51Var.getId().equals(ixVar.g.getId())) {
                            i51 i51Var = this.h;
                            if ((i51Var == null) ^ (ixVar.h == null)) {
                                return false;
                            }
                            if (i51Var == null || i51Var.getId().equals(ixVar.h.getId())) {
                                zw zwVar = this.i;
                                if ((zwVar == null) ^ (ixVar.i == null)) {
                                    return false;
                                }
                                return zwVar == null || zwVar.getId().equals(ixVar.i.getId());
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.hi0
    public int hashCode() {
        if (this.l == 0) {
            int hashCode = this.a.hashCode();
            this.l = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.j.hashCode()) * 31) + this.b) * 31) + this.c;
            this.l = hashCode2;
            int i = hashCode2 * 31;
            d51 d51Var = this.d;
            int hashCode3 = i + (d51Var != null ? d51Var.getId().hashCode() : 0);
            this.l = hashCode3;
            int i2 = hashCode3 * 31;
            d51 d51Var2 = this.e;
            int hashCode4 = i2 + (d51Var2 != null ? d51Var2.getId().hashCode() : 0);
            this.l = hashCode4;
            int i3 = hashCode4 * 31;
            cn1 cn1Var = this.f;
            int hashCode5 = i3 + (cn1Var != null ? cn1Var.getId().hashCode() : 0);
            this.l = hashCode5;
            int i4 = hashCode5 * 31;
            e51 e51Var = this.g;
            int hashCode6 = i4 + (e51Var != null ? e51Var.getId().hashCode() : 0);
            this.l = hashCode6;
            int i5 = hashCode6 * 31;
            i51 i51Var = this.h;
            int hashCode7 = i5 + (i51Var != null ? i51Var.getId().hashCode() : 0);
            this.l = hashCode7;
            int i6 = hashCode7 * 31;
            zw zwVar = this.i;
            this.l = i6 + (zwVar != null ? zwVar.getId().hashCode() : 0);
        }
        return this.l;
    }

    public String toString() {
        if (this.k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EngineKey{");
            sb.append(this.a);
            sb.append('+');
            sb.append(this.j);
            sb.append("+[");
            sb.append(this.b);
            sb.append('x');
            sb.append(this.c);
            sb.append("]+");
            sb.append('\'');
            d51 d51Var = this.d;
            sb.append(d51Var != null ? d51Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            d51 d51Var2 = this.e;
            sb.append(d51Var2 != null ? d51Var2.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            cn1 cn1Var = this.f;
            sb.append(cn1Var != null ? cn1Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            e51 e51Var = this.g;
            sb.append(e51Var != null ? e51Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            i51 i51Var = this.h;
            sb.append(i51Var != null ? i51Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            zw zwVar = this.i;
            sb.append(zwVar != null ? zwVar.getId() : "");
            sb.append('\'');
            sb.append('}');
            this.k = sb.toString();
        }
        return this.k;
    }
}
