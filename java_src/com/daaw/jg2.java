package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class jg2 {

    /* renamed from: a */
    public long f15083a;

    /* renamed from: b */
    public final String f15084b;

    /* renamed from: c */
    public final String f15085c;

    /* renamed from: d */
    public final long f15086d;

    /* renamed from: e */
    public final long f15087e;

    /* renamed from: f */
    public final long f15088f;

    /* renamed from: g */
    public final long f15089g;

    /* renamed from: h */
    public final List f15090h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jg2(String str, ve2 ve2Var) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = ve2Var.f30177b;
        long j = ve2Var.f30178c;
        long j2 = ve2Var.f30179d;
        long j3 = ve2Var.f30180e;
        long j4 = ve2Var.f30181f;
        List list = ve2Var.f30183h;
        if (list == null) {
            Map map = ve2Var.f30182g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new ef2((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public jg2(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f15084b = str;
        this.f15085c = true == "".equals(str2) ? null : str2;
        this.f15086d = j;
        this.f15087e = j2;
        this.f15088f = j3;
        this.f15089g = j4;
        this.f15090h = list;
    }

    /* renamed from: a */
    public static jg2 m18527a(kg2 kg2Var) {
        if (rg2.m11341c(kg2Var) == 538247942) {
            String m11338f = rg2.m11338f(kg2Var);
            String m11338f2 = rg2.m11338f(kg2Var);
            long m11340d = rg2.m11340d(kg2Var);
            long m11340d2 = rg2.m11340d(kg2Var);
            long m11340d3 = rg2.m11340d(kg2Var);
            long m11340d4 = rg2.m11340d(kg2Var);
            int m11341c = rg2.m11341c(kg2Var);
            if (m11341c < 0) {
                throw new IOException("readHeaderList size=" + m11341c);
            }
            List emptyList = m11341c == 0 ? Collections.emptyList() : new ArrayList();
            for (int i = 0; i < m11341c; i++) {
                emptyList.add(new ef2(rg2.m11338f(kg2Var).intern(), rg2.m11338f(kg2Var).intern()));
            }
            return new jg2(m11338f, m11338f2, m11340d, m11340d2, m11340d3, m11340d4, emptyList);
        }
        throw new IOException();
    }
}
