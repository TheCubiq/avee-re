package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class y71 {

    /* renamed from: com.daaw.y71$a */
    /* loaded from: classes.dex */
    public static class C3677a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C3677a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + r0 + " size=" + r4);
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
        }
    }

    /* renamed from: A */
    public static void m4059A(Parcel parcel, int i, int i2) {
        int m4036w = m4036w(parcel, i);
        if (m4036w == i2) {
            return;
        }
        String hexString = Integer.toHexString(m4036w);
        throw new C3677a("Expected size " + i2 + " got " + m4036w + " (0x" + hexString + ")", parcel);
    }

    /* renamed from: a */
    public static Bundle m4058a(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m4036w);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m4057b(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m4036w);
        return createByteArray;
    }

    /* renamed from: c */
    public static int[] m4056c(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m4036w);
        return createIntArray;
    }

    /* renamed from: d */
    public static ArrayList<Integer> m4055d(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m4036w);
        return arrayList;
    }

    /* renamed from: e */
    public static <T extends Parcelable> T m4054e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m4036w);
        return createFromParcel;
    }

    /* renamed from: f */
    public static String m4053f(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m4036w);
        return readString;
    }

    /* renamed from: g */
    public static String[] m4052g(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m4036w);
        return createStringArray;
    }

    /* renamed from: h */
    public static ArrayList<String> m4051h(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m4036w);
        return createStringArrayList;
    }

    /* renamed from: i */
    public static <T> T[] m4050i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m4036w);
        return tArr;
    }

    /* renamed from: j */
    public static <T> ArrayList<T> m4049j(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m4036w);
        return createTypedArrayList;
    }

    /* renamed from: k */
    public static void m4048k(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new C3677a("Overread allowed size end=" + i, parcel);
    }

    /* renamed from: l */
    public static int m4047l(int i) {
        return (char) i;
    }

    /* renamed from: m */
    public static boolean m4046m(Parcel parcel, int i) {
        m4059A(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: n */
    public static Boolean m4045n(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        if (m4036w == 0) {
            return null;
        }
        m4033z(parcel, i, m4036w, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: o */
    public static Double m4044o(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        if (m4036w == 0) {
            return null;
        }
        m4033z(parcel, i, m4036w, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static float m4043p(Parcel parcel, int i) {
        m4059A(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: q */
    public static Float m4042q(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        if (m4036w == 0) {
            return null;
        }
        m4033z(parcel, i, m4036w, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: r */
    public static int m4041r(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: s */
    public static IBinder m4040s(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m4036w == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m4036w);
        return readStrongBinder;
    }

    /* renamed from: t */
    public static int m4039t(Parcel parcel, int i) {
        m4059A(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: u */
    public static long m4038u(Parcel parcel, int i) {
        m4059A(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: v */
    public static Long m4037v(Parcel parcel, int i) {
        int m4036w = m4036w(parcel, i);
        if (m4036w == 0) {
            return null;
        }
        m4033z(parcel, i, m4036w, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: w */
    public static int m4036w(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: x */
    public static void m4035x(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m4036w(parcel, i));
    }

    /* renamed from: y */
    public static int m4034y(Parcel parcel) {
        int m4041r = m4041r(parcel);
        int m4036w = m4036w(parcel, m4041r);
        int dataPosition = parcel.dataPosition();
        if (m4047l(m4041r) == 20293) {
            int i = m4036w + dataPosition;
            if (i < dataPosition || i > parcel.dataSize()) {
                throw new C3677a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
            }
            return i;
        }
        throw new C3677a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m4041r))), parcel);
    }

    /* renamed from: z */
    public static void m4033z(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        throw new C3677a("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
    }
}
