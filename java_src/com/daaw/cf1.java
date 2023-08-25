package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class cf1 extends jd1 {
    public static final Pattern t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    public final boolean o;
    public int p;
    public int q;
    public int r;
    public int s;

    public cf1(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.o = false;
            return;
        }
        this.o = true;
        String p = sq1.p(list.get(0));
        s6.a(p.startsWith("Format: "));
        F(p);
        G(new rv0(list.get(1)));
    }

    public static long H(String str) {
        Matcher matcher = t.matcher(str);
        if (matcher.matches()) {
            return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public df1 z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        rl0 rl0Var = new rl0();
        rv0 rv0Var = new rv0(bArr, i);
        if (!this.o) {
            G(rv0Var);
        }
        E(rv0Var, arrayList, rl0Var);
        ln[] lnVarArr = new ln[arrayList.size()];
        arrayList.toArray(lnVarArr);
        return new df1(lnVarArr, rl0Var.d());
    }

    public final void D(String str, List<ln> list, rl0 rl0Var) {
        long j;
        StringBuilder sb;
        String str2;
        if (this.p == 0) {
            sb = new StringBuilder();
            str2 = "Skipping dialogue line before complete format: ";
        } else {
            String[] split = str.substring(10).split(",", this.p);
            if (split.length == this.p) {
                long H = H(split[this.q]);
                if (H != -9223372036854775807L) {
                    String str3 = split[this.r];
                    if (str3.trim().isEmpty()) {
                        j = -9223372036854775807L;
                    } else {
                        j = H(str3);
                        if (j == -9223372036854775807L) {
                            sb = new StringBuilder();
                        }
                    }
                    list.add(new ln(split[this.s].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                    rl0Var.a(H);
                    if (j != -9223372036854775807L) {
                        list.add(null);
                        rl0Var.a(j);
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

    public final void E(rv0 rv0Var, List<ln> list, rl0 rl0Var) {
        while (true) {
            String k = rv0Var.k();
            if (k == null) {
                return;
            }
            if (!this.o && k.startsWith("Format: ")) {
                F(k);
            } else if (k.startsWith("Dialogue: ")) {
                D(k, list, rl0Var);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void F(String str) {
        char c;
        String[] split = TextUtils.split(str.substring(8), ",");
        this.p = split.length;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        for (int i = 0; i < this.p; i++) {
            String a0 = sq1.a0(split[i].trim());
            a0.hashCode();
            switch (a0.hashCode()) {
                case 100571:
                    if (a0.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (a0.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (a0.equals("start")) {
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
                    this.r = i;
                    break;
                case 1:
                    this.s = i;
                    break;
                case 2:
                    this.q = i;
                    break;
            }
        }
        if (this.q == -1 || this.r == -1 || this.s == -1) {
            this.p = 0;
        }
    }

    public final void G(rv0 rv0Var) {
        String k;
        do {
            k = rv0Var.k();
            if (k == null) {
                return;
            }
        } while (!k.startsWith("[Events]"));
    }
}
