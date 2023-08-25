package com.daaw;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* renamed from: com.daaw.ix */
/* loaded from: classes.dex */
public class C1766ix implements hi0 {

    /* renamed from: a */
    public final String f14082a;

    /* renamed from: b */
    public final int f14083b;

    /* renamed from: c */
    public final int f14084c;

    /* renamed from: d */
    public final d51 f14085d;

    /* renamed from: e */
    public final d51 f14086e;

    /* renamed from: f */
    public final cn1 f14087f;

    /* renamed from: g */
    public final e51 f14088g;

    /* renamed from: h */
    public final i51 f14089h;

    /* renamed from: i */
    public final InterfaceC3911zw f14090i;

    /* renamed from: j */
    public final hi0 f14091j;

    /* renamed from: k */
    public String f14092k;

    /* renamed from: l */
    public int f14093l;

    /* renamed from: m */
    public hi0 f14094m;

    public C1766ix(String str, hi0 hi0Var, int i, int i2, d51 d51Var, d51 d51Var2, cn1 cn1Var, e51 e51Var, i51 i51Var, InterfaceC3911zw interfaceC3911zw) {
        this.f14082a = str;
        this.f14091j = hi0Var;
        this.f14083b = i;
        this.f14084c = i2;
        this.f14085d = d51Var;
        this.f14086e = d51Var2;
        this.f14087f = cn1Var;
        this.f14088g = e51Var;
        this.f14089h = i51Var;
        this.f14090i = interfaceC3911zw;
    }

    @Override // com.daaw.hi0
    /* renamed from: a */
    public void mo3222a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f14083b).putInt(this.f14084c).array();
        this.f14091j.mo3222a(messageDigest);
        messageDigest.update(this.f14082a.getBytes("UTF-8"));
        messageDigest.update(array);
        d51 d51Var = this.f14085d;
        messageDigest.update((d51Var != null ? d51Var.getId() : "").getBytes("UTF-8"));
        d51 d51Var2 = this.f14086e;
        messageDigest.update((d51Var2 != null ? d51Var2.getId() : "").getBytes("UTF-8"));
        cn1 cn1Var = this.f14087f;
        messageDigest.update((cn1Var != null ? cn1Var.getId() : "").getBytes("UTF-8"));
        e51 e51Var = this.f14088g;
        messageDigest.update((e51Var != null ? e51Var.getId() : "").getBytes("UTF-8"));
        InterfaceC3911zw interfaceC3911zw = this.f14090i;
        messageDigest.update((interfaceC3911zw != null ? interfaceC3911zw.getId() : "").getBytes("UTF-8"));
    }

    /* renamed from: b */
    public hi0 m19302b() {
        if (this.f14094m == null) {
            this.f14094m = new yu0(this.f14082a, this.f14091j);
        }
        return this.f14094m;
    }

    @Override // com.daaw.hi0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1766ix c1766ix = (C1766ix) obj;
        if (this.f14082a.equals(c1766ix.f14082a) && this.f14091j.equals(c1766ix.f14091j) && this.f14084c == c1766ix.f14084c && this.f14083b == c1766ix.f14083b) {
            cn1 cn1Var = this.f14087f;
            if ((cn1Var == null) ^ (c1766ix.f14087f == null)) {
                return false;
            }
            if (cn1Var == null || cn1Var.getId().equals(c1766ix.f14087f.getId())) {
                d51 d51Var = this.f14086e;
                if ((d51Var == null) ^ (c1766ix.f14086e == null)) {
                    return false;
                }
                if (d51Var == null || d51Var.getId().equals(c1766ix.f14086e.getId())) {
                    d51 d51Var2 = this.f14085d;
                    if ((d51Var2 == null) ^ (c1766ix.f14085d == null)) {
                        return false;
                    }
                    if (d51Var2 == null || d51Var2.getId().equals(c1766ix.f14085d.getId())) {
                        e51 e51Var = this.f14088g;
                        if ((e51Var == null) ^ (c1766ix.f14088g == null)) {
                            return false;
                        }
                        if (e51Var == null || e51Var.getId().equals(c1766ix.f14088g.getId())) {
                            i51 i51Var = this.f14089h;
                            if ((i51Var == null) ^ (c1766ix.f14089h == null)) {
                                return false;
                            }
                            if (i51Var == null || i51Var.getId().equals(c1766ix.f14089h.getId())) {
                                InterfaceC3911zw interfaceC3911zw = this.f14090i;
                                if ((interfaceC3911zw == null) ^ (c1766ix.f14090i == null)) {
                                    return false;
                                }
                                return interfaceC3911zw == null || interfaceC3911zw.getId().equals(c1766ix.f14090i.getId());
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
        if (this.f14093l == 0) {
            int hashCode = this.f14082a.hashCode();
            this.f14093l = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f14091j.hashCode()) * 31) + this.f14083b) * 31) + this.f14084c;
            this.f14093l = hashCode2;
            int i = hashCode2 * 31;
            d51 d51Var = this.f14085d;
            int hashCode3 = i + (d51Var != null ? d51Var.getId().hashCode() : 0);
            this.f14093l = hashCode3;
            int i2 = hashCode3 * 31;
            d51 d51Var2 = this.f14086e;
            int hashCode4 = i2 + (d51Var2 != null ? d51Var2.getId().hashCode() : 0);
            this.f14093l = hashCode4;
            int i3 = hashCode4 * 31;
            cn1 cn1Var = this.f14087f;
            int hashCode5 = i3 + (cn1Var != null ? cn1Var.getId().hashCode() : 0);
            this.f14093l = hashCode5;
            int i4 = hashCode5 * 31;
            e51 e51Var = this.f14088g;
            int hashCode6 = i4 + (e51Var != null ? e51Var.getId().hashCode() : 0);
            this.f14093l = hashCode6;
            int i5 = hashCode6 * 31;
            i51 i51Var = this.f14089h;
            int hashCode7 = i5 + (i51Var != null ? i51Var.getId().hashCode() : 0);
            this.f14093l = hashCode7;
            int i6 = hashCode7 * 31;
            InterfaceC3911zw interfaceC3911zw = this.f14090i;
            this.f14093l = i6 + (interfaceC3911zw != null ? interfaceC3911zw.getId().hashCode() : 0);
        }
        return this.f14093l;
    }

    public String toString() {
        if (this.f14092k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EngineKey{");
            sb.append(this.f14082a);
            sb.append('+');
            sb.append(this.f14091j);
            sb.append("+[");
            sb.append(this.f14083b);
            sb.append('x');
            sb.append(this.f14084c);
            sb.append("]+");
            sb.append('\'');
            d51 d51Var = this.f14085d;
            sb.append(d51Var != null ? d51Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            d51 d51Var2 = this.f14086e;
            sb.append(d51Var2 != null ? d51Var2.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            cn1 cn1Var = this.f14087f;
            sb.append(cn1Var != null ? cn1Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            e51 e51Var = this.f14088g;
            sb.append(e51Var != null ? e51Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            i51 i51Var = this.f14089h;
            sb.append(i51Var != null ? i51Var.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            InterfaceC3911zw interfaceC3911zw = this.f14090i;
            sb.append(interfaceC3911zw != null ? interfaceC3911zw.getId() : "");
            sb.append('\'');
            sb.append('}');
            this.f14092k = sb.toString();
        }
        return this.f14092k;
    }
}
