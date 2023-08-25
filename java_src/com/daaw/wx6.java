package com.daaw;
/* loaded from: classes.dex */
public final class wx6 {
    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (e(c)) {
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

    public static String b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (d(c)) {
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

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        int f;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence2.charAt(i);
                if (charAt != charAt2 && ((f = f(charAt)) >= 26 || f != f(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static int f(char c) {
        return (char) ((c | ' ') - 97);
    }
}
