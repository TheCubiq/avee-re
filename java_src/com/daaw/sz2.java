package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class sz2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static gl2 m9694a(String str, z72 z72Var, w07 w07Var, List list) {
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
                        gl2 m6608b = w07Var.m6608b((gl2) it.next());
                        if (m6608b instanceof oa2) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        z72 z72Var2 = (z72) zzd;
                        int m2704j = z72Var2.m2704j();
                        if (m6608b instanceof z72) {
                            z72 z72Var3 = (z72) m6608b;
                            Iterator m2701n = z72Var3.m2701n();
                            while (m2701n.hasNext()) {
                                Integer num = (Integer) m2701n.next();
                                z72Var2.m2696s(num.intValue() + m2704j, z72Var3.m2703k(num.intValue()));
                            }
                        } else {
                            z72Var2.m2696s(m2704j, m6608b);
                        }
                    }
                }
                return zzd;
            case 1:
                ou7.m13916h("every", 1, list);
                gl2 m6608b2 = w07Var.m6608b((gl2) list.get(0));
                if (m6608b2 instanceof ck2) {
                    return (z72Var.m2704j() == 0 || m9693b(z72Var, w07Var, (ck2) m6608b2, Boolean.FALSE, Boolean.TRUE).m2704j() == z72Var.m2704j()) ? gl2.f11425l : gl2.f11426m;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                ou7.m13916h("filter", 1, list);
                gl2 m6608b3 = w07Var.m6608b((gl2) list.get(0));
                if (m6608b3 instanceof ck2) {
                    if (z72Var.m2707e() == 0) {
                        return new z72();
                    }
                    gl2 zzd2 = z72Var.zzd();
                    z72 m9693b = m9693b(z72Var, w07Var, (ck2) m6608b3, null, Boolean.TRUE);
                    z72 z72Var4 = new z72();
                    Iterator m2701n2 = m9693b.m2701n();
                    while (m2701n2.hasNext()) {
                        z72Var4.m2696s(z72Var4.m2704j(), ((z72) zzd2).m2703k(((Integer) m2701n2.next()).intValue()));
                    }
                    return z72Var4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                ou7.m13916h("forEach", 1, list);
                gl2 m6608b4 = w07Var.m6608b((gl2) list.get(0));
                if (m6608b4 instanceof ck2) {
                    if (z72Var.m2707e() != 0) {
                        m9693b(z72Var, w07Var, (ck2) m6608b4, null, null);
                    }
                    return gl2.f11420g;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                ou7.m13914j("indexOf", 2, list);
                gl2 gl2Var = gl2.f11420g;
                if (!list.isEmpty()) {
                    gl2Var = w07Var.m6608b((gl2) list.get(0));
                }
                if (list.size() > 1) {
                    double m13923a = ou7.m13923a(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue());
                    if (m13923a >= z72Var.m2704j()) {
                        return new tb2(Double.valueOf(-1.0d));
                    }
                    if (m13923a < 0.0d) {
                        double m2704j2 = z72Var.m2704j();
                        Double.isNaN(m2704j2);
                        d = m2704j2 + m13923a;
                    } else {
                        d = m13923a;
                    }
                }
                Iterator m2701n3 = z72Var.m2701n();
                while (m2701n3.hasNext()) {
                    int intValue = ((Integer) m2701n3.next()).intValue();
                    double d2 = intValue;
                    if (d2 >= d && ou7.m13912l(z72Var.m2703k(intValue), gl2Var)) {
                        return new tb2(Double.valueOf(d2));
                    }
                }
                return new tb2(Double.valueOf(-1.0d));
            case 5:
                ou7.m13914j("join", 1, list);
                if (z72Var.m2704j() == 0) {
                    return gl2.f11427n;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    gl2 m6608b5 = w07Var.m6608b((gl2) list.get(0));
                    str3 = ((m6608b5 instanceof xi2) || (m6608b5 instanceof br2)) ? "" : m6608b5.zzi();
                }
                return new wp2(z72Var.m2702m(str3));
            case 6:
                ou7.m13914j("lastIndexOf", 2, list);
                gl2 gl2Var2 = gl2.f11420g;
                if (!list.isEmpty()) {
                    gl2Var2 = w07Var.m6608b((gl2) list.get(0));
                }
                double m2704j3 = z72Var.m2704j() - 1;
                if (list.size() > 1) {
                    gl2 m6608b6 = w07Var.m6608b((gl2) list.get(1));
                    m2704j3 = Double.isNaN(m6608b6.zzh().doubleValue()) ? z72Var.m2704j() - 1 : ou7.m13923a(m6608b6.zzh().doubleValue());
                    if (m2704j3 < 0.0d) {
                        double m2704j4 = z72Var.m2704j();
                        Double.isNaN(m2704j4);
                        m2704j3 += m2704j4;
                    }
                }
                if (m2704j3 < 0.0d) {
                    return new tb2(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(z72Var.m2704j(), m2704j3); min2 >= 0; min2--) {
                    if (z72Var.m2695t(min2) && ou7.m13912l(z72Var.m2703k(min2), gl2Var2)) {
                        return new tb2(Double.valueOf(min2));
                    }
                }
                return new tb2(Double.valueOf(-1.0d));
            case 7:
                ou7.m13916h("map", 1, list);
                gl2 m6608b7 = w07Var.m6608b((gl2) list.get(0));
                if (m6608b7 instanceof ck2) {
                    return z72Var.m2704j() == 0 ? new z72() : m9693b(z72Var, w07Var, (ck2) m6608b7, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                ou7.m13916h("pop", 0, list);
                int m2704j5 = z72Var.m2704j();
                if (m2704j5 == 0) {
                    return gl2.f11420g;
                }
                int i = m2704j5 - 1;
                gl2 m2703k = z72Var.m2703k(i);
                z72Var.m2697r(i);
                return m2703k;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        z72Var.m2696s(z72Var.m2704j(), w07Var.m6608b((gl2) it2.next()));
                    }
                }
                return new tb2(Double.valueOf(z72Var.m2704j()));
            case '\n':
                return m9692c(z72Var, w07Var, list, true);
            case 11:
                return m9692c(z72Var, w07Var, list, false);
            case '\f':
                ou7.m13916h("reverse", 0, list);
                int m2704j6 = z72Var.m2704j();
                if (m2704j6 != 0) {
                    for (int i2 = 0; i2 < m2704j6 / 2; i2++) {
                        if (z72Var.m2695t(i2)) {
                            gl2 m2703k2 = z72Var.m2703k(i2);
                            z72Var.m2696s(i2, null);
                            int i3 = (m2704j6 - 1) - i2;
                            if (z72Var.m2695t(i3)) {
                                z72Var.m2696s(i2, z72Var.m2703k(i3));
                            }
                            z72Var.m2696s(i3, m2703k2);
                        }
                    }
                }
                return z72Var;
            case '\r':
                ou7.m13916h("shift", 0, list);
                if (z72Var.m2704j() == 0) {
                    return gl2.f11420g;
                }
                gl2 m2703k3 = z72Var.m2703k(0);
                z72Var.m2697r(0);
                return m2703k3;
            case 14:
                ou7.m13914j("slice", 2, list);
                if (list.isEmpty()) {
                    return z72Var.zzd();
                }
                double m2704j7 = z72Var.m2704j();
                double m13923a2 = ou7.m13923a(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue());
                if (m13923a2 < 0.0d) {
                    Double.isNaN(m2704j7);
                    min = Math.max(m13923a2 + m2704j7, 0.0d);
                } else {
                    min = Math.min(m13923a2, m2704j7);
                }
                if (list.size() == 2) {
                    double m13923a3 = ou7.m13923a(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue());
                    if (m13923a3 < 0.0d) {
                        Double.isNaN(m2704j7);
                        m2704j7 = Math.max(m2704j7 + m13923a3, 0.0d);
                    } else {
                        m2704j7 = Math.min(m2704j7, m13923a3);
                    }
                }
                z72 z72Var5 = new z72();
                for (int i4 = (int) min; i4 < m2704j7; i4++) {
                    z72Var5.m2696s(z72Var5.m2704j(), z72Var.m2703k(i4));
                }
                return z72Var5;
            case 15:
                ou7.m13916h("some", 1, list);
                gl2 m6608b8 = w07Var.m6608b((gl2) list.get(0));
                if (m6608b8 instanceof ad2) {
                    if (z72Var.m2704j() != 0) {
                        ad2 ad2Var2 = (ad2) m6608b8;
                        Iterator m2701n4 = z72Var.m2701n();
                        while (m2701n4.hasNext()) {
                            int intValue2 = ((Integer) m2701n4.next()).intValue();
                            if (z72Var.m2695t(intValue2) && ad2Var2.mo5780a(w07Var, Arrays.asList(z72Var.m2703k(intValue2), new tb2(Double.valueOf(intValue2)), z72Var)).zzg().booleanValue()) {
                                return gl2.f11425l;
                            }
                        }
                    }
                    return gl2.f11426m;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                ou7.m13914j("sort", 1, list);
                if (z72Var.m2704j() >= 2) {
                    List<gl2> m2700o = z72Var.m2700o();
                    if (list.isEmpty()) {
                        ad2Var = null;
                    } else {
                        gl2 m6608b9 = w07Var.m6608b((gl2) list.get(0));
                        if (!(m6608b9 instanceof ad2)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        ad2Var = (ad2) m6608b9;
                    }
                    Collections.sort(m2700o, new oy2(ad2Var, w07Var));
                    z72Var.m2699p();
                    int i5 = 0;
                    for (gl2 gl2Var3 : m2700o) {
                        z72Var.m2696s(i5, gl2Var3);
                        i5++;
                    }
                }
                return z72Var;
            case 17:
                if (list.isEmpty()) {
                    return new z72();
                }
                int m13923a4 = (int) ou7.m13923a(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue());
                if (m13923a4 < 0) {
                    m13923a4 = Math.max(0, m13923a4 + z72Var.m2704j());
                } else if (m13923a4 > z72Var.m2704j()) {
                    m13923a4 = z72Var.m2704j();
                }
                int m2704j8 = z72Var.m2704j();
                z72 z72Var6 = new z72();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) ou7.m13923a(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()));
                    if (max > 0) {
                        for (int i6 = m13923a4; i6 < Math.min(m2704j8, m13923a4 + max); i6++) {
                            z72Var6.m2696s(z72Var6.m2704j(), z72Var.m2703k(m13923a4));
                            z72Var.m2697r(m13923a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i7 = 2; i7 < list.size(); i7++) {
                            gl2 m6608b10 = w07Var.m6608b((gl2) list.get(i7));
                            if (m6608b10 instanceof oa2) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            z72Var.m2698q((m13923a4 + i7) - 2, m6608b10);
                        }
                    }
                } else {
                    while (m13923a4 < m2704j8) {
                        z72Var6.m2696s(z72Var6.m2704j(), z72Var.m2703k(m13923a4));
                        z72Var.m2696s(m13923a4, null);
                        m13923a4++;
                    }
                }
                return z72Var6;
            case 18:
                ou7.m13916h(str2, 0, list);
                return new wp2(z72Var.m2702m(","));
            case 19:
                if (!list.isEmpty()) {
                    z72 z72Var7 = new z72();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        gl2 m6608b11 = w07Var.m6608b((gl2) it3.next());
                        if (m6608b11 instanceof oa2) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        z72Var7.m2696s(z72Var7.m2704j(), m6608b11);
                    }
                    int m2704j9 = z72Var7.m2704j();
                    Iterator m2701n5 = z72Var.m2701n();
                    while (m2701n5.hasNext()) {
                        Integer num2 = (Integer) m2701n5.next();
                        z72Var7.m2696s(num2.intValue() + m2704j9, z72Var.m2703k(num2.intValue()));
                    }
                    z72Var.m2699p();
                    Iterator m2701n6 = z72Var7.m2701n();
                    while (m2701n6.hasNext()) {
                        Integer num3 = (Integer) m2701n6.next();
                        z72Var.m2696s(num3.intValue(), z72Var7.m2703k(num3.intValue()));
                    }
                }
                return new tb2(Double.valueOf(z72Var.m2704j()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* renamed from: b */
    public static z72 m9693b(z72 z72Var, w07 w07Var, ad2 ad2Var, Boolean bool, Boolean bool2) {
        z72 z72Var2 = new z72();
        Iterator m2701n = z72Var.m2701n();
        while (m2701n.hasNext()) {
            int intValue = ((Integer) m2701n.next()).intValue();
            if (z72Var.m2695t(intValue)) {
                gl2 mo5780a = ad2Var.mo5780a(w07Var, Arrays.asList(z72Var.m2703k(intValue), new tb2(Double.valueOf(intValue)), z72Var));
                if (mo5780a.zzg().equals(bool)) {
                    return z72Var2;
                }
                if (bool2 == null || mo5780a.zzg().equals(bool2)) {
                    z72Var2.m2696s(intValue, mo5780a);
                }
            }
        }
        return z72Var2;
    }

    /* renamed from: c */
    public static gl2 m9692c(z72 z72Var, w07 w07Var, List list, boolean z) {
        gl2 gl2Var;
        ou7.m13915i("reduce", 1, list);
        ou7.m13914j("reduce", 2, list);
        gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
        if (m6608b instanceof ad2) {
            if (list.size() == 2) {
                gl2Var = w07Var.m6608b((gl2) list.get(1));
                if (gl2Var instanceof oa2) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (z72Var.m2704j() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                gl2Var = null;
            }
            ad2 ad2Var = (ad2) m6608b;
            int m2704j = z72Var.m2704j();
            int i = z ? 0 : m2704j - 1;
            int i2 = z ? m2704j - 1 : 0;
            int i3 = true == z ? 1 : -1;
            if (gl2Var == null) {
                gl2Var = z72Var.m2703k(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (z72Var.m2695t(i)) {
                    gl2Var = ad2Var.mo5780a(w07Var, Arrays.asList(gl2Var, z72Var.m2703k(i), new tb2(Double.valueOf(i)), z72Var));
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
