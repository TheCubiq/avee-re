package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final int A;
    public Bundle B;
    public final String p;
    public final String q;
    public final boolean r;
    public final int s;
    public final int t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final Bundle y;
    public final boolean z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Parcel parcel) {
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readInt() != 0;
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readString();
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt() != 0;
        this.y = parcel.readBundle();
        this.z = parcel.readInt() != 0;
        this.B = parcel.readBundle();
        this.A = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.p = fragment.getClass().getName();
        this.q = fragment.u;
        this.r = fragment.C;
        this.s = fragment.L;
        this.t = fragment.M;
        this.u = fragment.N;
        this.v = fragment.Q;
        this.w = fragment.B;
        this.x = fragment.P;
        this.y = fragment.v;
        this.z = fragment.O;
        this.A = fragment.g0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.p);
        sb.append(" (");
        sb.append(this.q);
        sb.append(")}:");
        if (this.r) {
            sb.append(" fromLayout");
        }
        if (this.t != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.t));
        }
        String str = this.u;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.u);
        }
        if (this.v) {
            sb.append(" retainInstance");
        }
        if (this.w) {
            sb.append(" removing");
        }
        if (this.x) {
            sb.append(" detached");
        }
        if (this.z) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeBundle(this.y);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeBundle(this.B);
        parcel.writeInt(this.A);
    }
}
