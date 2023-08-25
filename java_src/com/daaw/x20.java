package com.daaw;

import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class x20 {

    /* renamed from: a */
    public final String f31752a;

    /* renamed from: b */
    public final String f31753b;

    /* renamed from: c */
    public final String f31754c;

    /* renamed from: d */
    public final List<List<byte[]>> f31755d;

    /* renamed from: e */
    public final int f31756e = 0;

    /* renamed from: f */
    public final String f31757f;

    public x20(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f31752a = (String) ty0.m8699f(str);
        this.f31753b = (String) ty0.m8699f(str2);
        this.f31754c = (String) ty0.m8699f(str3);
        this.f31755d = (List) ty0.m8699f(list);
        this.f31757f = m5615a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m5615a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m5614b() {
        return this.f31755d;
    }

    /* renamed from: c */
    public int m5613c() {
        return this.f31756e;
    }

    /* renamed from: d */
    public String m5612d() {
        return this.f31757f;
    }

    /* renamed from: e */
    public String m5611e() {
        return this.f31752a;
    }

    /* renamed from: f */
    public String m5610f() {
        return this.f31753b;
    }

    /* renamed from: g */
    public String m5609g() {
        return this.f31754c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f31752a + ", mProviderPackage: " + this.f31753b + ", mQuery: " + this.f31754c + ", mCertificates:");
        for (int i = 0; i < this.f31755d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f31755d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f31756e);
        return sb.toString();
    }
}
