package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzgu {
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
        if (((r6 >= 65382 && r6 <= 65437) || (r6 >= 65441 && r6 <= 65500)) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c4, code lost:
        if (r4 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d1, code lost:
        if (r4 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d3, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d4, code lost:
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] zzb(String str, boolean z) {
        boolean z2;
        String str2;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i = 0;
        boolean z3 = false;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (!(of == Character.UnicodeBlock.BOPOMOFO || of == Character.UnicodeBlock.BOPOMOFO_EXTENDED || of == Character.UnicodeBlock.CJK_COMPATIBILITY || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || of == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || of == Character.UnicodeBlock.HANGUL_JAMO || of == Character.UnicodeBlock.HANGUL_SYLLABLES || of == Character.UnicodeBlock.HIRAGANA || of == Character.UnicodeBlock.KATAKANA || of == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)) {
                }
                z2 = true;
                if (z2) {
                    if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                        if (!z || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                            if (z3) {
                                str2 = new String(charArray, i2, i - i2);
                            }
                        }
                    }
                    i += charCount;
                } else {
                    if (z3) {
                        arrayList.add(new String(charArray, i2, i - i2));
                    }
                    str2 = new String(charArray, i, charCount);
                }
                arrayList.add(str2);
                z3 = false;
                i += charCount;
            }
            z2 = false;
            if (z2) {
            }
            arrayList.add(str2);
            z3 = false;
            i += charCount;
        }
        if (z3) {
            arrayList.add(new String(charArray, i2, i - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int zzz(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }
}
