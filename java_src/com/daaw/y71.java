package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class y71 {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.y71.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static void A(Parcel parcel, int i, int i2) {
        int w = w(parcel, i);
        if (w == i2) {
            return;
        }
        String hexString = Integer.toHexString(w);
        throw new a("Expected size " + i2 + " got " + w + " (0x" + hexString + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + w);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + w);
        return createIntArray;
    }

    public static ArrayList<Integer> d(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + w);
        return arrayList;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w);
        return createFromParcel;
    }

    public static String f(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w);
        return readString;
    }

    public static String[] g(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + w);
        return createStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w);
        return createStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w);
        return tArr;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new a("Overread allowed size end=" + i, parcel);
    }

    public static int l(int i) {
        return (char) i;
    }

    public static boolean m(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i) {
        int w = w(parcel, i);
        if (w == 0) {
            return null;
        }
        z(parcel, i, w, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double o(Parcel parcel, int i) {
        int w = w(parcel, i);
        if (w == 0) {
            return null;
        }
        z(parcel, i, w, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float q(Parcel parcel, int i) {
        int w = w(parcel, i);
        if (w == 0) {
            return null;
        }
        z(parcel, i, w, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w);
        return readStrongBinder;
    }

    public static int t(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readInt();
    }

    public static long u(Parcel parcel, int i) {
        A(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long v(Parcel parcel, int i) {
        int w = w(parcel, i);
        if (w == 0) {
            return null;
        }
        z(parcel, i, w, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void x(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i));
    }

    public static int y(Parcel parcel) {
        int r = r(parcel);
        int w = w(parcel, r);
        int dataPosition = parcel.dataPosition();
        if (l(r) == 20293) {
            int i = w + dataPosition;
            if (i < dataPosition || i > parcel.dataSize()) {
                throw new a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
            }
            return i;
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(r))), parcel);
    }

    public static void z(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        throw new a("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
    }
}
