package com.daaw;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class e61 implements mi1, li1 {
    public static final TreeMap<Integer, e61> x = new TreeMap<>();
    public volatile String p;
    public final long[] q;
    public final double[] r;
    public final String[] s;
    public final byte[][] t;
    public final int[] u;
    public final int v;
    public int w;

    public e61(int i) {
        this.v = i;
        int i2 = i + 1;
        this.u = new int[i2];
        this.q = new long[i2];
        this.r = new double[i2];
        this.s = new String[i2];
        this.t = new byte[i2];
    }

    public static e61 q(String str, int i) {
        TreeMap<Integer, e61> treeMap = x;
        synchronized (treeMap) {
            Map.Entry<Integer, e61> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                e61 e61Var = new e61(i);
                e61Var.u(str, i);
                return e61Var;
            }
            treeMap.remove(ceilingEntry.getKey());
            e61 value = ceilingEntry.getValue();
            value.u(str, i);
            return value;
        }
    }

    public static void w() {
        TreeMap<Integer, e61> treeMap = x;
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

    public void D() {
        TreeMap<Integer, e61> treeMap = x;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.v), this);
            w();
        }
    }

    @Override // com.daaw.li1
    public void F(int i) {
        this.u[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.daaw.mi1
    public void d(li1 li1Var) {
        for (int i = 1; i <= this.w; i++) {
            int i2 = this.u[i];
            if (i2 == 1) {
                li1Var.F(i);
            } else if (i2 == 2) {
                li1Var.r(i, this.q[i]);
            } else if (i2 == 3) {
                li1Var.m(i, this.r[i]);
            } else if (i2 == 4) {
                li1Var.i(i, this.s[i]);
            } else if (i2 == 5) {
                li1Var.x(i, this.t[i]);
            }
        }
    }

    @Override // com.daaw.li1
    public void i(int i, String str) {
        this.u[i] = 4;
        this.s[i] = str;
    }

    @Override // com.daaw.li1
    public void m(int i, double d) {
        this.u[i] = 3;
        this.r[i] = d;
    }

    @Override // com.daaw.mi1
    public String n() {
        return this.p;
    }

    @Override // com.daaw.li1
    public void r(int i, long j) {
        this.u[i] = 2;
        this.q[i] = j;
    }

    public void u(String str, int i) {
        this.p = str;
        this.w = i;
    }

    @Override // com.daaw.li1
    public void x(int i, byte[] bArr) {
        this.u[i] = 5;
        this.t[i] = bArr;
    }
}
