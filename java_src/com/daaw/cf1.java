package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class cf1 extends jd1 {

    /* renamed from: t */
    public static final Pattern f5778t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: o */
    public final boolean f5779o;

    /* renamed from: p */
    public int f5780p;

    /* renamed from: q */
    public int f5781q;

    /* renamed from: r */
    public int f5782r;

    /* renamed from: s */
    public int f5783s;

    public cf1(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f5779o = false;
            return;
        }
        this.f5779o = true;
        String m10000p = sq1.m10000p(list.get(0));
        C2914s6.m10690a(m10000p.startsWith("Format: "));
        m25399F(m10000p);
        m25398G(new rv0(list.get(1)));
    }

    /* renamed from: H */
    public static long m25397H(String str) {
        Matcher matcher = f5778t.matcher(str);
        if (matcher.matches()) {
            return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public df1 mo5845z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        rl0 rl0Var = new rl0();
        rv0 rv0Var = new rv0(bArr, i);
        if (!this.f5779o) {
            m25398G(rv0Var);
        }
        m25400E(rv0Var, arrayList, rl0Var);
        C2099ln[] c2099lnArr = new C2099ln[arrayList.size()];
        arrayList.toArray(c2099lnArr);
        return new df1(c2099lnArr, rl0Var.m11201d());
    }

    /* renamed from: D */
    public final void m25401D(String str, List<C2099ln> list, rl0 rl0Var) {
        long j;
        StringBuilder sb;
        String str2;
        if (this.f5780p == 0) {
            sb = new StringBuilder();
            str2 = "Skipping dialogue line before complete format: ";
        } else {
            String[] split = str.substring(10).split(",", this.f5780p);
            if (split.length == this.f5780p) {
                long m25397H = m25397H(split[this.f5781q]);
                if (m25397H != -9223372036854775807L) {
                    String str3 = split[this.f5782r];
                    if (str3.trim().isEmpty()) {
                        j = -9223372036854775807L;
                    } else {
                        j = m25397H(str3);
                        if (j == -9223372036854775807L) {
                            sb = new StringBuilder();
                        }
                    }
                    list.add(new C2099ln(split[this.f5783s].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                    rl0Var.m11204a(m25397H);
                    if (j != -9223372036854775807L) {
                        list.add(null);
                        rl0Var.m11204a(j);
                        return;
                    }
                    return;
                }
                sb = new StringBuilder();
                sb.append("Skipping invalid timing: ");
                sb.append(str);
            }
            sb = new StringBuilder();
            str2 = "Skipping dialogue line with fewer columns than format: ";
        }
        sb.append(str2);
        sb.append(str);
    }

    /* renamed from: E */
    public final void m25400E(rv0 rv0Var, List<C2099ln> list, rl0 rl0Var) {
        while (true) {
            String m10909k = rv0Var.m10909k();
            if (m10909k == null) {
                return;
            }
            if (!this.f5779o && m10909k.startsWith("Format: ")) {
                m25399F(m10909k);
            } else if (m10909k.startsWith("Dialogue: ")) {
                m25401D(m10909k, list, rl0Var);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: F */
    public final void m25399F(String str) {
        char c;
        String[] split = TextUtils.split(str.substring(8), ",");
        this.f5780p = split.length;
        this.f5781q = -1;
        this.f5782r = -1;
        this.f5783s = -1;
        for (int i = 0; i < this.f5780p; i++) {
            String m10017a0 = sq1.m10017a0(split[i].trim());
            m10017a0.hashCode();
            switch (m10017a0.hashCode()) {
                case 100571:
                    if (m10017a0.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (m10017a0.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (m10017a0.equals("start")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.f5782r = i;
                    break;
                case 1:
                    this.f5783s = i;
                    break;
                case 2:
                    this.f5781q = i;
                    break;
            }
        }
        if (this.f5781q == -1 || this.f5782r == -1 || this.f5783s == -1) {
            this.f5780p = 0;
        }
    }

    /* renamed from: G */
    public final void m25398G(rv0 rv0Var) {
        String m10909k;
        do {
            m10909k = rv0Var.m10909k();
            if (m10909k == null) {
                return;
            }
        } while (!m10909k.startsWith("[Events]"));
    }
}
