package com.daaw;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;
/* loaded from: classes.dex */
public final class io1 {
    /* renamed from: a */
    public static void m19555a(SpannableStringBuilder spannableStringBuilder, int i, int i2, jo1 jo1Var) {
        Object absoluteSizeSpan;
        if (jo1Var.m18369h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(jo1Var.m18369h()), i, i2, 33);
        }
        if (jo1Var.m18364m()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (jo1Var.m18363n()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (jo1Var.m18366k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(jo1Var.m18374c()), i, i2, 33);
        }
        if (jo1Var.m18367j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(jo1Var.m18375b()), i, i2, 33);
        }
        if (jo1Var.m18373d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(jo1Var.m18373d()), i, i2, 33);
        }
        if (jo1Var.m18368i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(jo1Var.m18368i()), i, i2, 33);
        }
        int m18371f = jo1Var.m18371f();
        if (m18371f == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) jo1Var.m18372e(), true);
        } else if (m18371f == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(jo1Var.m18372e());
        } else if (m18371f != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(jo1Var.m18372e() / 100.0f);
        }
        spannableStringBuilder.setSpan(absoluteSizeSpan, i, i2, 33);
    }

    /* renamed from: b */
    public static String m19554b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    public static void m19553c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: d */
    public static jo1 m19552d(jo1 jo1Var, String[] strArr, Map<String, jo1> map) {
        if (jo1Var == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (jo1Var == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (jo1Var == null && strArr.length > 1) {
            jo1 jo1Var2 = new jo1();
            int length = strArr.length;
            while (i < length) {
                jo1Var2.m18376a(map.get(strArr[i]));
                i++;
            }
            return jo1Var2;
        } else if (jo1Var == null || strArr == null || strArr.length != 1) {
            if (jo1Var != null && strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    jo1Var.m18376a(map.get(strArr[i]));
                    i++;
                }
            }
            return jo1Var;
        } else {
            return jo1Var.m18376a(map.get(strArr[0]));
        }
    }
}
