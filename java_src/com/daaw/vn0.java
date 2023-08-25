package com.daaw;

import android.text.InputFilter;
import android.text.Spanned;
/* loaded from: classes2.dex */
public class vn0 implements InputFilter {

    /* renamed from: a */
    public int f30340a;

    public vn0(int i) {
        this.f30340a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f30340a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
