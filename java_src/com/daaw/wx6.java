package com.daaw;
/* loaded from: classes.dex */
public final class wx6 {
    /* renamed from: a */
    public static String m5726a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m5722e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m5722e(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m5725b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m5723d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m5723d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m5724c(CharSequence charSequence, CharSequence charSequence2) {
        int m5721f;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence2.charAt(i);
                if (charAt != charAt2 && ((m5721f = m5721f(charAt)) >= 26 || m5721f != m5721f(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m5723d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: e */
    public static boolean m5722e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: f */
    public static int m5721f(char c) {
        return (char) ((c | ' ') - 97);
    }
}
