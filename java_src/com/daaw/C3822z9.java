package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.daaw.z9 */
/* loaded from: classes.dex */
public class C3822z9 {
    /* renamed from: a */
    public static boolean m2599a(String str, String str2, String str3) {
        if (str.equals(str3) || str2.equals(str3)) {
            return false;
        }
        int m2592h = m2592h(str, str3);
        int m2593g = m2593g(str2, str3);
        return m2592h > 0 && m2593g > 0 && m2592h + m2593g >= str3.length();
    }

    /* renamed from: b */
    public static void m2598b(Set<String> set, String str, List<String> list) {
        for (Set<String> set2 : m2591i(set)) {
            String str2 = null;
            boolean z = false;
            if (set2.size() == 2) {
                for (String str3 : set2) {
                    if (str2 != null) {
                        if (m2599a(str3, str2, str)) {
                            list.add(str3);
                        } else if (m2599a(str2, str3, str)) {
                            list.add(str2);
                            str2 = str3;
                        }
                        z = true;
                        break;
                    }
                    str2 = str3;
                }
                if (str2 != null && z) {
                    list.add(str2);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m2597c(String[] strArr, List<String> list) {
        m2598b(new HashSet(Arrays.asList(strArr)), strArr[strArr.length - 1], list);
    }

    /* renamed from: d */
    public static List<String> m2596d(String str, String str2, String[]... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String[] strArr2 : strArr) {
            m2597c(strArr2, arrayList);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static List<String> m2595e(List<String> list) {
        String str = list.get(list.size() - 2);
        String str2 = list.get(list.size() - 1);
        StringBuilder sb = new StringBuilder();
        for (String str3 : list) {
            sb.append(str3);
        }
        char charAt = str2.charAt(0);
        list.set(0, str2);
        list.set(1, str2);
        list.set(list.size() - 2, str);
        list.set(list.size() - 1, str);
        list.set(((charAt + list.size()) - 1) % list.size(), sb.toString());
        return list;
    }

    /* renamed from: f */
    public static String m2594f(List<String> list) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (String str : list) {
            if (str.length() > i2) {
                i2 = str.length();
                i = i3;
            }
            i3++;
        }
        return list.get(i);
    }

    /* renamed from: g */
    public static int m2593g(String str, String str2) {
        int length = str2.length() - 1;
        int i = 0;
        for (int i2 = 0; i2 < str.length() && length >= 0 && str.charAt(i2) == str2.charAt(length); i2++) {
            i++;
            length--;
        }
        return i;
    }

    /* renamed from: h */
    public static int m2592h(String str, String str2) {
        int i = 0;
        int i2 = 0;
        for (int length = str.length() - 1; length >= 0 && i2 < str2.length() && str.charAt(length) == str2.charAt(i2); length--) {
            i++;
            i2++;
        }
        return i;
    }

    /* renamed from: i */
    public static <T> Set<Set<T>> m2591i(Set<T> set) {
        HashSet hashSet = new HashSet();
        if (set.isEmpty()) {
            hashSet.add(new HashSet());
            return hashSet;
        }
        ArrayList arrayList = new ArrayList(set);
        Object obj = arrayList.get(0);
        for (Set set2 : m2591i(new HashSet(arrayList.subList(1, arrayList.size())))) {
            HashSet hashSet2 = new HashSet();
            hashSet2.add(obj);
            hashSet2.addAll(set2);
            hashSet.add(hashSet2);
            hashSet.add(set2);
        }
        return hashSet;
    }
}
