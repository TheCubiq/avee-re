package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class sz2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static gl2 a(String str, z72 z72Var, w07 w07Var, List list) {
        String str2;
        char c;
        String str3;
        double min;
        ad2 ad2Var;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c = 0;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c = 2;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c = 1;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            default:
                str2 = "toString";
                c = 65535;
                break;
        }
        double d = 0.0d;
        switch (c) {
            case 0:
                gl2 zzd = z72Var.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        gl2 b = w07Var.b((gl2) it.next());
                        if (b instanceof oa2) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        z72 z72Var2 = (z72) zzd;
                        int j = z72Var2.j();
                        if (b instanceof z72) {
                            z72 z72Var3 = (z72) b;
                            Iterator n = z72Var3.n();
                            while (n.hasNext()) {
                                Integer num = (Integer) n.next();
                                z72Var2.s(num.intValue() + j, z72Var3.k(num.intValue()));
                            }
                        } else {
                            z72Var2.s(j, b);
                        }
                    }
                }
                return zzd;
            case 1:
                ou7.h("every", 1, list);
                gl2 b2 = w07Var.b((gl2) list.get(0));
                if (b2 instanceof ck2) {
                    return (z72Var.j() == 0 || b(z72Var, w07Var, (ck2) b2, Boolean.FALSE, Boolean.TRUE).j() == z72Var.j()) ? gl2.l : gl2.m;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                ou7.h("filter", 1, list);
                gl2 b3 = w07Var.b((gl2) list.get(0));
                if (b3 instanceof ck2) {
                    if (z72Var.e() == 0) {
                        return new z72();
                    }
                    gl2 zzd2 = z72Var.zzd();
                    z72 b4 = b(z72Var, w07Var, (ck2) b3, null, Boolean.TRUE);
                    z72 z72Var4 = new z72();
                    Iterator n2 = b4.n();
                    while (n2.hasNext()) {
                        z72Var4.s(z72Var4.j(), ((z72) zzd2).k(((Integer) n2.next()).intValue()));
                    }
                    return z72Var4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                ou7.h("forEach", 1, list);
                gl2 b5 = w07Var.b((gl2) list.get(0));
                if (b5 instanceof ck2) {
                    if (z72Var.e() != 0) {
                        b(z72Var, w07Var, (ck2) b5, null, null);
                    }
                    return gl2.g;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                ou7.j("indexOf", 2, list);
                gl2 gl2Var = gl2.g;
                if (!list.isEmpty()) {
                    gl2Var = w07Var.b((gl2) list.get(0));
                }
                if (list.size() > 1) {
                    double a = ou7.a(w07Var.b((gl2) list.get(1)).zzh().doubleValue());
                    if (a >= z72Var.j()) {
                        return new tb2(Double.valueOf(-1.0d));
                    }
                    if (a < 0.0d) {
                        double j2 = z72Var.j();
                        Double.isNaN(j2);
                        d = j2 + a;
                    } else {
                        d = a;
                    }
                }
                Iterator n3 = z72Var.n();
                while (n3.hasNext()) {
                    int intValue = ((Integer) n3.next()).intValue();
                    double d2 = intValue;
                    if (d2 >= d && ou7.l(z72Var.k(intValue), gl2Var)) {
                        return new tb2(Double.valueOf(d2));
                    }
                }
                return new tb2(Double.valueOf(-1.0d));
            case 5:
                ou7.j("join", 1, list);
                if (z72Var.j() == 0) {
                    return gl2.n;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    gl2 b6 = w07Var.b((gl2) list.get(0));
                    str3 = ((b6 instanceof xi2) || (b6 instanceof br2)) ? "" : b6.zzi();
                }
                return new wp2(z72Var.m(str3));
            case 6:
                ou7.j("lastIndexOf", 2, list);
                gl2 gl2Var2 = gl2.g;
                if (!list.isEmpty()) {
                    gl2Var2 = w07Var.b((gl2) list.get(0));
                }
                double j3 = z72Var.j() - 1;
                if (list.size() > 1) {
                    gl2 b7 = w07Var.b((gl2) list.get(1));
                    j3 = Double.isNaN(b7.zzh().doubleValue()) ? z72Var.j() - 1 : ou7.a(b7.zzh().doubleValue());
                    if (j3 < 0.0d) {
                        double j4 = z72Var.j();
                        Double.isNaN(j4);
                        j3 += j4;
                    }
                }
                if (j3 < 0.0d) {
                    return new tb2(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(z72Var.j(), j3); min2 >= 0; min2--) {
                    if (z72Var.t(min2) && ou7.l(z72Var.k(min2), gl2Var2)) {
                        return new tb2(Double.valueOf(min2));
                    }
                }
                return new tb2(Double.valueOf(-1.0d));
            case 7:
                ou7.h("map", 1, list);
                gl2 b8 = w07Var.b((gl2) list.get(0));
                if (b8 instanceof ck2) {
                    return z72Var.j() == 0 ? new z72() : b(z72Var, w07Var, (ck2) b8, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                ou7.h("pop", 0, list);
                int j5 = z72Var.j();
                if (j5 == 0) {
                    return gl2.g;
                }
                int i = j5 - 1;
                gl2 k = z72Var.k(i);
                z72Var.r(i);
                return k;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        z72Var.s(z72Var.j(), w07Var.b((gl2) it2.next()));
                    }
                }
                return new tb2(Double.valueOf(z72Var.j()));
            case '\n':
                return c(z72Var, w07Var, list, true);
            case 11:
                return c(z72Var, w07Var, list, false);
            case '\f':
                ou7.h("reverse", 0, list);
                int j6 = z72Var.j();
                if (j6 != 0) {
                    for (int i2 = 0; i2 < j6 / 2; i2++) {
                        if (z72Var.t(i2)) {
                            gl2 k2 = z72Var.k(i2);
                            z72Var.s(i2, null);
                            int i3 = (j6 - 1) - i2;
                            if (z72Var.t(i3)) {
                                z72Var.s(i2, z72Var.k(i3));
                            }
                            z72Var.s(i3, k2);
                        }
                    }
                }
                return z72Var;
            case '\r':
                ou7.h("shift", 0, list);
                if (z72Var.j() == 0) {
                    return gl2.g;
                }
                gl2 k3 = z72Var.k(0);
                z72Var.r(0);
                return k3;
            case 14:
                ou7.j("slice", 2, list);
                if (list.isEmpty()) {
                    return z72Var.zzd();
                }
                double j7 = z72Var.j();
                double a2 = ou7.a(w07Var.b((gl2) list.get(0)).zzh().doubleValue());
                if (a2 < 0.0d) {
                    Double.isNaN(j7);
                    min = Math.max(a2 + j7, 0.0d);
                } else {
                    min = Math.min(a2, j7);
                }
                if (list.size() == 2) {
                    double a3 = ou7.a(w07Var.b((gl2) list.get(1)).zzh().doubleValue());
                    if (a3 < 0.0d) {
                        Double.isNaN(j7);
                        j7 = Math.max(j7 + a3, 0.0d);
                    } else {
                        j7 = Math.min(j7, a3);
                    }
                }
                z72 z72Var5 = new z72();
                for (int i4 = (int) min; i4 < j7; i4++) {
                    z72Var5.s(z72Var5.j(), z72Var.k(i4));
                }
                return z72Var5;
            case 15:
                ou7.h("some", 1, list);
                gl2 b9 = w07Var.b((gl2) list.get(0));
                if (b9 instanceof ad2) {
                    if (z72Var.j() != 0) {
                        ad2 ad2Var2 = (ad2) b9;
                        Iterator n4 = z72Var.n();
                        while (n4.hasNext()) {
                            int intValue2 = ((Integer) n4.next()).intValue();
                            if (z72Var.t(intValue2) && ad2Var2.a(w07Var, Arrays.asList(z72Var.k(intValue2), new tb2(Double.valueOf(intValue2)), z72Var)).zzg().booleanValue()) {
                                return gl2.l;
                            }
                        }
                    }
                    return gl2.m;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                ou7.j("sort", 1, list);
                if (z72Var.j() >= 2) {
                    List<gl2> o = z72Var.o();
                    if (list.isEmpty()) {
                        ad2Var = null;
                    } else {
                        gl2 b10 = w07Var.b((gl2) list.get(0));
                        if (!(b10 instanceof ad2)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        ad2Var = (ad2) b10;
                    }
                    Collections.sort(o, new oy2(ad2Var, w07Var));
                    z72Var.p();
                    int i5 = 0;
                    for (gl2 gl2Var3 : o) {
                        z72Var.s(i5, gl2Var3);
                        i5++;
                    }
                }
                return z72Var;
            case 17:
                if (list.isEmpty()) {
                    return new z72();
                }
                int a4 = (int) ou7.a(w07Var.b((gl2) list.get(0)).zzh().doubleValue());
                if (a4 < 0) {
                    a4 = Math.max(0, a4 + z72Var.j());
                } else if (a4 > z72Var.j()) {
                    a4 = z72Var.j();
                }
                int j8 = z72Var.j();
                z72 z72Var6 = new z72();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) ou7.a(w07Var.b((gl2) list.get(1)).zzh().doubleValue()));
                    if (max > 0) {
                        for (int i6 = a4; i6 < Math.min(j8, a4 + max); i6++) {
                            z72Var6.s(z72Var6.j(), z72Var.k(a4));
                            z72Var.r(a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i7 = 2; i7 < list.size(); i7++) {
                            gl2 b11 = w07Var.b((gl2) list.get(i7));
                            if (b11 instanceof oa2) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            z72Var.q((a4 + i7) - 2, b11);
                        }
                    }
                } else {
                    while (a4 < j8) {
                        z72Var6.s(z72Var6.j(), z72Var.k(a4));
                        z72Var.s(a4, null);
                        a4++;
                    }
                }
                return z72Var6;
            case 18:
                ou7.h(str2, 0, list);
                return new wp2(z72Var.m(","));
            case 19:
                if (!list.isEmpty()) {
                    z72 z72Var7 = new z72();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        gl2 b12 = w07Var.b((gl2) it3.next());
                        if (b12 instanceof oa2) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        z72Var7.s(z72Var7.j(), b12);
                    }
                    int j9 = z72Var7.j();
                    Iterator n5 = z72Var.n();
                    while (n5.hasNext()) {
                        Integer num2 = (Integer) n5.next();
                        z72Var7.s(num2.intValue() + j9, z72Var.k(num2.intValue()));
                    }
                    z72Var.p();
                    Iterator n6 = z72Var7.n();
                    while (n6.hasNext()) {
                        Integer num3 = (Integer) n6.next();
                        z72Var.s(num3.intValue(), z72Var7.k(num3.intValue()));
                    }
                }
                return new tb2(Double.valueOf(z72Var.j()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public static z72 b(z72 z72Var, w07 w07Var, ad2 ad2Var, Boolean bool, Boolean bool2) {
        z72 z72Var2 = new z72();
        Iterator n = z72Var.n();
        while (n.hasNext()) {
            int intValue = ((Integer) n.next()).intValue();
            if (z72Var.t(intValue)) {
                gl2 a = ad2Var.a(w07Var, Arrays.asList(z72Var.k(intValue), new tb2(Double.valueOf(intValue)), z72Var));
                if (a.zzg().equals(bool)) {
                    return z72Var2;
                }
                if (bool2 == null || a.zzg().equals(bool2)) {
                    z72Var2.s(intValue, a);
                }
            }
        }
        return z72Var2;
    }

    public static gl2 c(z72 z72Var, w07 w07Var, List list, boolean z) {
        gl2 gl2Var;
        ou7.i("reduce", 1, list);
        ou7.j("reduce", 2, list);
        gl2 b = w07Var.b((gl2) list.get(0));
        if (b instanceof ad2) {
            if (list.size() == 2) {
                gl2Var = w07Var.b((gl2) list.get(1));
                if (gl2Var instanceof oa2) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (z72Var.j() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                gl2Var = null;
            }
            ad2 ad2Var = (ad2) b;
            int j = z72Var.j();
            int i = z ? 0 : j - 1;
            int i2 = z ? j - 1 : 0;
            int i3 = true == z ? 1 : -1;
            if (gl2Var == null) {
                gl2Var = z72Var.k(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (z72Var.t(i)) {
                    gl2Var = ad2Var.a(w07Var, Arrays.asList(gl2Var, z72Var.k(i), new tb2(Double.valueOf(i)), z72Var));
                    if (gl2Var instanceof oa2) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return gl2Var;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
