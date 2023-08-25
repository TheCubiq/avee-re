package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class z71 {
    public static int a(Parcel parcel) {
        return v(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        w(parcel, i);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        x(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            x(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            x(parcel, i, 0);
        }
    }

    public static void e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeBundle(bundle);
        w(parcel, v);
    }

    public static void f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeByteArray(bArr);
        w(parcel, v);
    }

    public static void g(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            x(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            x(parcel, i, 0);
        }
    }

    public static void h(Parcel parcel, int i, float f) {
        x(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void i(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            x(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            x(parcel, i, 0);
        }
    }

    public static void j(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeStrongBinder(iBinder);
        w(parcel, v);
    }

    public static void k(Parcel parcel, int i, int i2) {
        x(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void l(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeIntArray(iArr);
        w(parcel, v);
    }

    public static void m(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        w(parcel, v);
    }

    public static void n(Parcel parcel, int i, long j) {
        x(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void o(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            x(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            x(parcel, i, 0);
        }
    }

    public static void p(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        w(parcel, v);
    }

    public static void q(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeString(str);
        w(parcel, v);
    }

    public static void r(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeStringArray(strArr);
        w(parcel, v);
    }

    public static void s(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeStringList(list);
        w(parcel, v);
    }

    public static <T extends Parcelable> void t(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, t, i2);
            }
        }
        w(parcel, v);
    }

    public static <T extends Parcelable> void u(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                x(parcel, i, 0);
                return;
            }
            return;
        }
        int v = v(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                y(parcel, t, 0);
            }
        }
        w(parcel, v);
    }

    public static int v(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void w(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void x(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void y(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
