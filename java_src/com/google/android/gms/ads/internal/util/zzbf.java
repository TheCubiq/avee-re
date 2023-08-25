package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbf {

    /* renamed from: a */
    public final String[] f36269a;

    /* renamed from: b */
    public final double[] f36270b;

    /* renamed from: c */
    public final double[] f36271c;

    /* renamed from: d */
    public final int[] f36272d;

    /* renamed from: e */
    public int f36273e;

    public /* synthetic */ zzbf(zzbd zzbdVar, zzbe zzbeVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbdVar.f36267b;
        int size = list.size();
        list2 = zzbdVar.f36266a;
        this.f36269a = (String[]) list2.toArray(new String[size]);
        list3 = zzbdVar.f36267b;
        this.f36270b = m1349a(list3);
        list4 = zzbdVar.f36268c;
        this.f36271c = m1349a(list4);
        this.f36272d = new int[size];
        this.f36273e = 0;
    }

    /* renamed from: a */
    public static final double[] m1349a(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.f36269a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f36269a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f36271c[i];
            double d2 = this.f36270b[i];
            int i2 = this.f36272d[i];
            double d3 = i2;
            double d4 = this.f36273e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzbc(str, d, d2, d3 / d4, i2));
            i++;
        }
    }

    public final void zzb(double d) {
        this.f36273e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f36271c;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.f36270b[i]) {
                int[] iArr = this.f36272d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            }
            i++;
        }
    }
}
