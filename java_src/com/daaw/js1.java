package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class js1 extends is1 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public js1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new g6(), new g6(), new g6());
    }

    public js1(Parcel parcel, int i, int i2, String str, g6<String, Method> g6Var, g6<String, Method> g6Var2, g6<String, Class> g6Var3) {
        super(g6Var, g6Var2, g6Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // com.daaw.is1
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
            return;
        }
        this.e.writeInt(bArr.length);
        this.e.writeByteArray(bArr);
    }

    @Override // com.daaw.is1
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // com.daaw.is1
    public void E(int i) {
        this.e.writeInt(i);
    }

    @Override // com.daaw.is1
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // com.daaw.is1
    public void I(String str) {
        this.e.writeString(str);
    }

    @Override // com.daaw.is1
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(dataPosition - i2);
            this.e.setDataPosition(dataPosition);
        }
    }

    @Override // com.daaw.is1
    public is1 b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        return new js1(parcel, dataPosition, i2, this.h + "  ", this.a, this.b, this.c);
    }

    @Override // com.daaw.is1
    public boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // com.daaw.is1
    public byte[] i() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // com.daaw.is1
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // com.daaw.is1
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // com.daaw.is1
    public int o() {
        return this.e.readInt();
    }

    @Override // com.daaw.is1
    public <T extends Parcelable> T q() {
        return (T) this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // com.daaw.is1
    public String s() {
        return this.e.readString();
    }

    @Override // com.daaw.is1
    public void w(int i) {
        a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        E(0);
        E(i);
    }

    @Override // com.daaw.is1
    public void y(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }
}
