package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import com.daaw.is1;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(is1 is1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = is1Var.p(iconCompat.a, 1);
        iconCompat.c = is1Var.j(iconCompat.c, 2);
        iconCompat.d = is1Var.r(iconCompat.d, 3);
        iconCompat.e = is1Var.p(iconCompat.e, 4);
        iconCompat.f = is1Var.p(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) is1Var.r(iconCompat.g, 6);
        iconCompat.i = is1Var.t(iconCompat.i, 7);
        iconCompat.j = is1Var.t(iconCompat.j, 8);
        iconCompat.m();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, is1 is1Var) {
        is1Var.x(true, true);
        iconCompat.n(is1Var.f());
        int i = iconCompat.a;
        if (-1 != i) {
            is1Var.F(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            is1Var.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            is1Var.H(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            is1Var.F(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            is1Var.F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            is1Var.H(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            is1Var.J(str, 7);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            is1Var.J(str2, 8);
        }
    }
}
