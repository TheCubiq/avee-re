package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbf {
    public final String[] a;
    public final double[] b;
    public final double[] c;
    public final int[] d;
    public int e;

    public /* synthetic */ zzbf(zzbd zzbdVar, zzbe zzbeVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbdVar.b;
        int size = list.size();
        list2 = zzbdVar.a;
        this.a = (String[]) list2.toArray(new String[size]);
        list3 = zzbdVar.b;
        this.b = a(list3);
        list4 = zzbdVar.c;
        this.c = a(list4);
        this.d = new int[size];
        this.e = 0;
    }

    public static final double[] a(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.c[i];
            double d2 = this.b[i];
            int i2 = this.d[i];
            double d3 = i2;
            double d4 = this.e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzbc(str, d, d2, d3 / d4, i2));
            i++;
        }
    }

    public final void zzb(double d) {
        this.e++;
        int i = 0;
        while (true) {
            double[] dArr = this.c;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.b[i]) {
                int[] iArr = this.d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            }
            i++;
        }
    }
}
