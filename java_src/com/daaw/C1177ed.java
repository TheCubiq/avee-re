package com.daaw;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* renamed from: com.daaw.ed */
/* loaded from: classes.dex */
public final class C1177ed implements InterfaceC3380vw {

    /* renamed from: c */
    public static final String f8350c;

    /* renamed from: d */
    public static final String f8351d;

    /* renamed from: e */
    public static final String f8352e;

    /* renamed from: f */
    public static final Set<C0892bx> f8353f;

    /* renamed from: g */
    public static final C1177ed f8354g;

    /* renamed from: h */
    public static final C1177ed f8355h;

    /* renamed from: a */
    public final String f8356a;

    /* renamed from: b */
    public final String f8357b;

    static {
        String m2343a = zg1.m2343a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8350c = m2343a;
        String m2343a2 = zg1.m2343a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f8351d = m2343a2;
        String m2343a3 = zg1.m2343a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8352e = m2343a3;
        f8353f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C0892bx.m25779b("proto"), C0892bx.m25779b("json"))));
        f8354g = new C1177ed(m2343a, null);
        f8355h = new C1177ed(m2343a2, m2343a3);
    }

    public C1177ed(String str, String str2) {
        this.f8356a = str;
        this.f8357b = str2;
    }

    /* renamed from: d */
    public static C1177ed m23572d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (str2.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str3 = split[1];
                if (str3.isEmpty()) {
                    str3 = null;
                }
                return new C1177ed(str2, str3);
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // com.daaw.InterfaceC2115lt
    /* renamed from: a */
    public String mo16572a() {
        return "cct";
    }

    @Override // com.daaw.InterfaceC3380vw
    /* renamed from: b */
    public Set<C0892bx> mo6705b() {
        return f8353f;
    }

    /* renamed from: c */
    public byte[] m23573c() {
        String str = this.f8357b;
        if (str == null && this.f8356a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f8356a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String m23571e() {
        return this.f8357b;
    }

    /* renamed from: f */
    public String m23570f() {
        return this.f8356a;
    }

    @Override // com.daaw.InterfaceC2115lt
    public byte[] getExtras() {
        return m23573c();
    }
}
