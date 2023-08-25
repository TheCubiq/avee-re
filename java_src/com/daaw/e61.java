package com.daaw;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class e61 implements mi1, li1 {

    /* renamed from: x */
    public static final TreeMap<Integer, e61> f8185x = new TreeMap<>();

    /* renamed from: p */
    public volatile String f8186p;

    /* renamed from: q */
    public final long[] f8187q;

    /* renamed from: r */
    public final double[] f8188r;

    /* renamed from: s */
    public final String[] f8189s;

    /* renamed from: t */
    public final byte[][] f8190t;

    /* renamed from: u */
    public final int[] f8191u;

    /* renamed from: v */
    public final int f8192v;

    /* renamed from: w */
    public int f8193w;

    public e61(int i) {
        this.f8192v = i;
        int i2 = i + 1;
        this.f8191u = new int[i2];
        this.f8187q = new long[i2];
        this.f8188r = new double[i2];
        this.f8189s = new String[i2];
        this.f8190t = new byte[i2];
    }

    /* renamed from: q */
    public static e61 m23701q(String str, int i) {
        TreeMap<Integer, e61> treeMap = f8185x;
        synchronized (treeMap) {
            Map.Entry<Integer, e61> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                e61 e61Var = new e61(i);
                e61Var.m23700u(str, i);
                return e61Var;
            }
            treeMap.remove(ceilingEntry.getKey());
            e61 value = ceilingEntry.getValue();
            value.m23700u(str, i);
            return value;
        }
    }

    /* renamed from: w */
    public static void m23699w() {
        TreeMap<Integer, e61> treeMap = f8185x;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    /* renamed from: D */
    public void m23702D() {
        TreeMap<Integer, e61> treeMap = f8185x;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f8192v), this);
            m23699w();
        }
    }

    @Override // com.daaw.li1
    /* renamed from: F */
    public void mo16232F(int i) {
        this.f8191u[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.daaw.mi1
    /* renamed from: d */
    public void mo16024d(li1 li1Var) {
        for (int i = 1; i <= this.f8193w; i++) {
            int i2 = this.f8191u[i];
            if (i2 == 1) {
                li1Var.mo16232F(i);
            } else if (i2 == 2) {
                li1Var.mo16229r(i, this.f8187q[i]);
            } else if (i2 == 3) {
                li1Var.mo16230m(i, this.f8188r[i]);
            } else if (i2 == 4) {
                li1Var.mo16231i(i, this.f8189s[i]);
            } else if (i2 == 5) {
                li1Var.mo16228x(i, this.f8190t[i]);
            }
        }
    }

    @Override // com.daaw.li1
    /* renamed from: i */
    public void mo16231i(int i, String str) {
        this.f8191u[i] = 4;
        this.f8189s[i] = str;
    }

    @Override // com.daaw.li1
    /* renamed from: m */
    public void mo16230m(int i, double d) {
        this.f8191u[i] = 3;
        this.f8188r[i] = d;
    }

    @Override // com.daaw.mi1
    /* renamed from: n */
    public String mo16023n() {
        return this.f8186p;
    }

    @Override // com.daaw.li1
    /* renamed from: r */
    public void mo16229r(int i, long j) {
        this.f8191u[i] = 2;
        this.f8187q[i] = j;
    }

    /* renamed from: u */
    public void m23700u(String str, int i) {
        this.f8186p = str;
        this.f8193w = i;
    }

    @Override // com.daaw.li1
    /* renamed from: x */
    public void mo16228x(int i, byte[] bArr) {
        this.f8191u[i] = 5;
        this.f8190t[i] = bArr;
    }
}
