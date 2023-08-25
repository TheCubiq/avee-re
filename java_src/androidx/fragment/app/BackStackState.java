package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.j;
import androidx.lifecycle.c;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();
    public final ArrayList<String> A;
    public final ArrayList<String> B;
    public final boolean C;
    public final int[] p;
    public final ArrayList<String> q;
    public final int[] r;
    public final int[] s;
    public final int t;
    public final String u;
    public final int v;
    public final int w;
    public final CharSequence x;
    public final int y;
    public final CharSequence z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.p = parcel.createIntArray();
        this.q = parcel.createStringArrayList();
        this.r = parcel.createIntArray();
        this.s = parcel.createIntArray();
        this.t = parcel.readInt();
        this.u = parcel.readString();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.y = parcel.readInt();
        this.z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A = parcel.createStringArrayList();
        this.B = parcel.createStringArrayList();
        this.C = parcel.readInt() != 0;
    }

    public BackStackState(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.p = new int[size * 5];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.q = new ArrayList<>(size);
        this.r = new int[size];
        this.s = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            j.a aVar2 = aVar.c.get(i);
            int i3 = i2 + 1;
            this.p[i2] = aVar2.a;
            ArrayList<String> arrayList = this.q;
            Fragment fragment = aVar2.b;
            arrayList.add(fragment != null ? fragment.u : null);
            int[] iArr = this.p;
            int i4 = i3 + 1;
            iArr[i3] = aVar2.c;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.d;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.e;
            iArr[i6] = aVar2.f;
            this.r[i] = aVar2.g.ordinal();
            this.s[i] = aVar2.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.t = aVar.h;
        this.u = aVar.k;
        this.v = aVar.v;
        this.w = aVar.l;
        this.x = aVar.m;
        this.y = aVar.n;
        this.z = aVar.o;
        this.A = aVar.p;
        this.B = aVar.q;
        this.C = aVar.r;
    }

    public androidx.fragment.app.a a(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.p.length) {
            j.a aVar2 = new j.a();
            int i3 = i + 1;
            aVar2.a = this.p[i];
            if (FragmentManager.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.p[i3]);
            }
            String str = this.q.get(i2);
            aVar2.b = str != null ? fragmentManager.f0(str) : null;
            aVar2.g = c.EnumC0020c.values()[this.r[i2]];
            aVar2.h = c.EnumC0020c.values()[this.s[i2]];
            int[] iArr = this.p;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.e = i9;
            int i10 = iArr[i8];
            aVar2.f = i10;
            aVar.d = i5;
            aVar.e = i7;
            aVar.f = i9;
            aVar.g = i10;
            aVar.e(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.h = this.t;
        aVar.k = this.u;
        aVar.v = this.v;
        aVar.i = true;
        aVar.l = this.w;
        aVar.m = this.x;
        aVar.n = this.y;
        aVar.o = this.z;
        aVar.p = this.A;
        aVar.q = this.B;
        aVar.r = this.C;
        aVar.p(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.p);
        parcel.writeStringList(this.q);
        parcel.writeIntArray(this.r);
        parcel.writeIntArray(this.s);
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        TextUtils.writeToParcel(this.x, parcel, 0);
        parcel.writeInt(this.y);
        TextUtils.writeToParcel(this.z, parcel, 0);
        parcel.writeStringList(this.A);
        parcel.writeStringList(this.B);
        parcel.writeInt(this.C ? 1 : 0);
    }
}
