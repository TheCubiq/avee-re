package com.daaw;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class ed implements vw {
    public static final String c;
    public static final String d;
    public static final String e;
    public static final Set<bx> f;
    public static final ed g;
    public static final ed h;
    public final String a;
    public final String b;

    static {
        String a = zg1.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a;
        String a2 = zg1.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        d = a2;
        String a3 = zg1.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = a3;
        f = Collections.unmodifiableSet(new HashSet(Arrays.asList(bx.b("proto"), bx.b("json"))));
        g = new ed(a, null);
        h = new ed(a2, a3);
    }

    public ed(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static ed d(byte[] bArr) {
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
                return new ed(str2, str3);
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // com.daaw.lt
    public String a() {
        return "cct";
    }

    @Override // com.daaw.vw
    public Set<bx> b() {
        return f;
    }

    public byte[] c() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.a;
    }

    @Override // com.daaw.lt
    public byte[] getExtras() {
        return c();
    }
}
