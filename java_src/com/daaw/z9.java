package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class z9 {
    public static boolean a(String str, String str2, String str3) {
        if (str.equals(str3) || str2.equals(str3)) {
            return false;
        }
        int h = h(str, str3);
        int g = g(str2, str3);
        return h > 0 && g > 0 && h + g >= str3.length();
    }

    public static void b(Set<String> set, String str, List<String> list) {
        for (Set<String> set2 : i(set)) {
            String str2 = null;
            boolean z = false;
            if (set2.size() == 2) {
                for (String str3 : set2) {
                    if (str2 != null) {
                        if (a(str3, str2, str)) {
                            list.add(str3);
                        } else if (a(str2, str3, str)) {
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

    public static void c(String[] strArr, List<String> list) {
        b(new HashSet(Arrays.asList(strArr)), strArr[strArr.length - 1], list);
    }

    public static List<String> d(String str, String str2, String[]... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String[] strArr2 : strArr) {
            c(strArr2, arrayList);
        }
        return arrayList;
    }

    public static List<String> e(List<String> list) {
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

    public static String f(List<String> list) {
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

    public static int g(String str, String str2) {
        int length = str2.length() - 1;
        int i = 0;
        for (int i2 = 0; i2 < str.length() && length >= 0 && str.charAt(i2) == str2.charAt(length); i2++) {
            i++;
            length--;
        }
        return i;
    }

    public static int h(String str, String str2) {
        int i = 0;
        int i2 = 0;
        for (int length = str.length() - 1; length >= 0 && i2 < str2.length() && str.charAt(length) == str2.charAt(i2); length--) {
            i++;
            i2++;
        }
        return i;
    }

    public static <T> Set<Set<T>> i(Set<T> set) {
        HashSet hashSet = new HashSet();
        if (set.isEmpty()) {
            hashSet.add(new HashSet());
            return hashSet;
        }
        ArrayList arrayList = new ArrayList(set);
        Object obj = arrayList.get(0);
        for (Set set2 : i(new HashSet(arrayList.subList(1, arrayList.size())))) {
            HashSet hashSet2 = new HashSet();
            hashSet2.add(obj);
            hashSet2.addAll(set2);
            hashSet.add(hashSet2);
            hashSet.add(set2);
        }
        return hashSet;
    }
}
