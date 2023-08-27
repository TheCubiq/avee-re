package com.daaw.avee.Common;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class UtilsSerialize {
    public static String replaceCharsInString(char c, char c2, String str) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            } else if (str.charAt(i) == c) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) == c) {
                    sb.append(c2);
                } else {
                    sb.append(str.charAt(i2));
                }
            }
            return sb.toString();
        }
        return str;
    }

    public static String serializeIterable(CharSequence charSequence, Iterable iterable) {
        return TextUtils.join(charSequence, iterable);
    }

    public static String serializeArray(CharSequence charSequence, Object[] objArr) {
        return TextUtils.join(charSequence, objArr);
    }

    public static String[] deserializeIterable(String str, String str2) {
        return str2 == null ? new String[0] : TextUtils.split(str2, str);
    }

    public static List<String> deserializeIterableAsList(String str, String str2) {
        if (str2 == null) {
            return new ArrayList();
        }
        return Arrays.asList(TextUtils.split(str2, str));
    }

    public static String serializeIterableSkipInvalidWithAdd(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : iterable) {
            String obj2 = obj.toString();
            if (!obj2.contains(charSequence)) {
                if (z) {
                    z = false;
                } else {
                    sb.append(charSequence);
                }
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    public static String serializeIterableSkipInvalidWithAdd(CharSequence charSequence, Iterable iterable, Object obj, boolean z) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        return serializeIterableSkipInvalidWithAdd(charSequence, iterable, (Iterable) arrayList, z);
    }

    public static String serializeIterableSkipInvalidWithAdd(CharSequence charSequence, Iterable iterable, Iterable iterable2, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Object obj : iterable) {
            String obj2 = obj.toString();
            if (!obj2.isEmpty() || !z) {
                if (!obj2.contains(charSequence)) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb.append(charSequence);
                    }
                    sb.append(obj2);
                }
            }
        }
        if (iterable2 != null) {
            for (Object obj3 : iterable2) {
                String obj4 = obj3.toString();
                if (!obj4.isEmpty() || !z) {
                    if (!obj4.contains(charSequence)) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(charSequence);
                        }
                        sb.append(obj4);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String serializeIterableSkipInvalidWithExclude(CharSequence charSequence, Iterable iterable, Object obj) {
        return serializeIterableSkipInvalidWithExclude(charSequence, iterable, obj, false);
    }

    public static String serializeIterableSkipInvalidWithExclude(CharSequence charSequence, Iterable iterable, Object obj, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Object obj2 : iterable) {
            if (!obj2.equals(obj)) {
                String obj3 = obj2.toString();
                if (!obj3.isEmpty() || !z) {
                    if (!obj3.contains(charSequence)) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(charSequence);
                        }
                        sb.append(obj3);
                    }
                }
            }
        }
        return sb.toString();
    }
}
