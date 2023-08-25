package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class z71 {
    /* renamed from: a */
    public static int m2733a(Parcel parcel) {
        return m2712v(parcel, 20293);
    }

    /* renamed from: b */
    public static void m2732b(Parcel parcel, int i) {
        m2711w(parcel, i);
    }

    /* renamed from: c */
    public static void m2731c(Parcel parcel, int i, boolean z) {
        m2710x(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m2730d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m2710x(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m2710x(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m2729e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeBundle(bundle);
        m2711w(parcel, m2712v);
    }

    /* renamed from: f */
    public static void m2728f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeByteArray(bArr);
        m2711w(parcel, m2712v);
    }

    /* renamed from: g */
    public static void m2727g(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m2710x(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m2710x(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m2726h(Parcel parcel, int i, float f) {
        m2710x(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: i */
    public static void m2725i(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m2710x(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m2710x(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m2724j(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m2711w(parcel, m2712v);
    }

    /* renamed from: k */
    public static void m2723k(Parcel parcel, int i, int i2) {
        m2710x(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: l */
    public static void m2722l(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeIntArray(iArr);
        m2711w(parcel, m2712v);
    }

    /* renamed from: m */
    public static void m2721m(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        m2711w(parcel, m2712v);
    }

    /* renamed from: n */
    public static void m2720n(Parcel parcel, int i, long j) {
        m2710x(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: o */
    public static void m2719o(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m2710x(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m2710x(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m2718p(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m2711w(parcel, m2712v);
    }

    /* renamed from: q */
    public static void m2717q(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeString(str);
        m2711w(parcel, m2712v);
    }

    /* renamed from: r */
    public static void m2716r(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeStringArray(strArr);
        m2711w(parcel, m2712v);
    }

    /* renamed from: s */
    public static void m2715s(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeStringList(list);
        m2711w(parcel, m2712v);
    }

    /* renamed from: t */
    public static <T extends Parcelable> void m2714t(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m2709y(parcel, t, i2);
            }
        }
        m2711w(parcel, m2712v);
    }

    /* renamed from: u */
    public static <T extends Parcelable> void m2713u(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m2710x(parcel, i, 0);
                return;
            }
            return;
        }
        int m2712v = m2712v(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m2709y(parcel, t, 0);
            }
        }
        m2711w(parcel, m2712v);
    }

    /* renamed from: v */
    public static int m2712v(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: w */
    public static void m2711w(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: x */
    public static void m2710x(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: y */
    public static void m2709y(Parcel parcel, Parcelable parcelable, int i) {
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
