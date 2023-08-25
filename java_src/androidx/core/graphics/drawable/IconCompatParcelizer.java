package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import com.daaw.is1;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(is1 is1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1169a = is1Var.m19454p(iconCompat.f1169a, 1);
        iconCompat.f1171c = is1Var.m19457j(iconCompat.f1171c, 2);
        iconCompat.f1172d = is1Var.m19453r(iconCompat.f1172d, 3);
        iconCompat.f1173e = is1Var.m19454p(iconCompat.f1173e, 4);
        iconCompat.f1174f = is1Var.m19454p(iconCompat.f1174f, 5);
        iconCompat.f1175g = (ColorStateList) is1Var.m19453r(iconCompat.f1175g, 6);
        iconCompat.f1177i = is1Var.m19452t(iconCompat.f1177i, 7);
        iconCompat.f1178j = is1Var.m19452t(iconCompat.f1178j, 8);
        iconCompat.m29720m();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, is1 is1Var) {
        is1Var.m19449x(true, true);
        iconCompat.m29719n(is1Var.m19459f());
        int i = iconCompat.f1169a;
        if (-1 != i) {
            is1Var.m19469F(i, 1);
        }
        byte[] bArr = iconCompat.f1171c;
        if (bArr != null) {
            is1Var.m19471B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1172d;
        if (parcelable != null) {
            is1Var.m19468H(parcelable, 3);
        }
        int i2 = iconCompat.f1173e;
        if (i2 != 0) {
            is1Var.m19469F(i2, 4);
        }
        int i3 = iconCompat.f1174f;
        if (i3 != 0) {
            is1Var.m19469F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1175g;
        if (colorStateList != null) {
            is1Var.m19468H(colorStateList, 6);
        }
        String str = iconCompat.f1177i;
        if (str != null) {
            is1Var.m19467J(str, 7);
        }
        String str2 = iconCompat.f1178j;
        if (str2 != null) {
            is1Var.m19467J(str2, 8);
        }
    }
}
