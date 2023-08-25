package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class js1 extends is1 {

    /* renamed from: d */
    public final SparseIntArray f15364d;

    /* renamed from: e */
    public final Parcel f15365e;

    /* renamed from: f */
    public final int f15366f;

    /* renamed from: g */
    public final int f15367g;

    /* renamed from: h */
    public final String f15368h;

    /* renamed from: i */
    public int f15369i;

    /* renamed from: j */
    public int f15370j;

    /* renamed from: k */
    public int f15371k;

    public js1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1370g6(), new C1370g6(), new C1370g6());
    }

    public js1(Parcel parcel, int i, int i2, String str, C1370g6<String, Method> c1370g6, C1370g6<String, Method> c1370g62, C1370g6<String, Class> c1370g63) {
        super(c1370g6, c1370g62, c1370g63);
        this.f15364d = new SparseIntArray();
        this.f15369i = -1;
        this.f15371k = -1;
        this.f15365e = parcel;
        this.f15366f = i;
        this.f15367g = i2;
        this.f15370j = i;
        this.f15368h = str;
    }

    @Override // com.daaw.is1
    /* renamed from: A */
    public void mo18275A(byte[] bArr) {
        if (bArr == null) {
            this.f15365e.writeInt(-1);
            return;
        }
        this.f15365e.writeInt(bArr.length);
        this.f15365e.writeByteArray(bArr);
    }

    @Override // com.daaw.is1
    /* renamed from: C */
    public void mo18274C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f15365e, 0);
    }

    @Override // com.daaw.is1
    /* renamed from: E */
    public void mo18273E(int i) {
        this.f15365e.writeInt(i);
    }

    @Override // com.daaw.is1
    /* renamed from: G */
    public void mo18272G(Parcelable parcelable) {
        this.f15365e.writeParcelable(parcelable, 0);
    }

    @Override // com.daaw.is1
    /* renamed from: I */
    public void mo18271I(String str) {
        this.f15365e.writeString(str);
    }

    @Override // com.daaw.is1
    /* renamed from: a */
    public void mo18270a() {
        int i = this.f15369i;
        if (i >= 0) {
            int i2 = this.f15364d.get(i);
            int dataPosition = this.f15365e.dataPosition();
            this.f15365e.setDataPosition(i2);
            this.f15365e.writeInt(dataPosition - i2);
            this.f15365e.setDataPosition(dataPosition);
        }
    }

    @Override // com.daaw.is1
    /* renamed from: b */
    public is1 mo18269b() {
        Parcel parcel = this.f15365e;
        int dataPosition = parcel.dataPosition();
        int i = this.f15370j;
        if (i == this.f15366f) {
            i = this.f15367g;
        }
        int i2 = i;
        return new js1(parcel, dataPosition, i2, this.f15368h + "  ", this.f13966a, this.f13967b, this.f13968c);
    }

    @Override // com.daaw.is1
    /* renamed from: g */
    public boolean mo18268g() {
        return this.f15365e.readInt() != 0;
    }

    @Override // com.daaw.is1
    /* renamed from: i */
    public byte[] mo18267i() {
        int readInt = this.f15365e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f15365e.readByteArray(bArr);
        return bArr;
    }

    @Override // com.daaw.is1
    /* renamed from: k */
    public CharSequence mo18266k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f15365e);
    }

    @Override // com.daaw.is1
    /* renamed from: m */
    public boolean mo18265m(int i) {
        while (this.f15370j < this.f15367g) {
            int i2 = this.f15371k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f15365e.setDataPosition(this.f15370j);
            int readInt = this.f15365e.readInt();
            this.f15371k = this.f15365e.readInt();
            this.f15370j += readInt;
        }
        return this.f15371k == i;
    }

    @Override // com.daaw.is1
    /* renamed from: o */
    public int mo18264o() {
        return this.f15365e.readInt();
    }

    @Override // com.daaw.is1
    /* renamed from: q */
    public <T extends Parcelable> T mo18263q() {
        return (T) this.f15365e.readParcelable(getClass().getClassLoader());
    }

    @Override // com.daaw.is1
    /* renamed from: s */
    public String mo18262s() {
        return this.f15365e.readString();
    }

    @Override // com.daaw.is1
    /* renamed from: w */
    public void mo18261w(int i) {
        mo18270a();
        this.f15369i = i;
        this.f15364d.put(i, this.f15365e.dataPosition());
        mo18273E(0);
        mo18273E(i);
    }

    @Override // com.daaw.is1
    /* renamed from: y */
    public void mo18260y(boolean z) {
        this.f15365e.writeInt(z ? 1 : 0);
    }
}
