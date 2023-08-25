package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0280a();

    /* renamed from: A */
    public final int f1512A;

    /* renamed from: B */
    public Bundle f1513B;

    /* renamed from: p */
    public final String f1514p;

    /* renamed from: q */
    public final String f1515q;

    /* renamed from: r */
    public final boolean f1516r;

    /* renamed from: s */
    public final int f1517s;

    /* renamed from: t */
    public final int f1518t;

    /* renamed from: u */
    public final String f1519u;

    /* renamed from: v */
    public final boolean f1520v;

    /* renamed from: w */
    public final boolean f1521w;

    /* renamed from: x */
    public final boolean f1522x;

    /* renamed from: y */
    public final Bundle f1523y;

    /* renamed from: z */
    public final boolean f1524z;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    /* loaded from: classes.dex */
    public class C0280a implements Parcelable.Creator<FragmentState> {
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
        this.f1514p = parcel.readString();
        this.f1515q = parcel.readString();
        this.f1516r = parcel.readInt() != 0;
        this.f1517s = parcel.readInt();
        this.f1518t = parcel.readInt();
        this.f1519u = parcel.readString();
        this.f1520v = parcel.readInt() != 0;
        this.f1521w = parcel.readInt() != 0;
        this.f1522x = parcel.readInt() != 0;
        this.f1523y = parcel.readBundle();
        this.f1524z = parcel.readInt() != 0;
        this.f1513B = parcel.readBundle();
        this.f1512A = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.f1514p = fragment.getClass().getName();
        this.f1515q = fragment.f1400u;
        this.f1516r = fragment.f1356C;
        this.f1517s = fragment.f1365L;
        this.f1518t = fragment.f1366M;
        this.f1519u = fragment.f1367N;
        this.f1520v = fragment.f1370Q;
        this.f1521w = fragment.f1355B;
        this.f1522x = fragment.f1369P;
        this.f1523y = fragment.f1401v;
        this.f1524z = fragment.f1368O;
        this.f1512A = fragment.f1386g0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1514p);
        sb.append(" (");
        sb.append(this.f1515q);
        sb.append(")}:");
        if (this.f1516r) {
            sb.append(" fromLayout");
        }
        if (this.f1518t != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1518t));
        }
        String str = this.f1519u;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1519u);
        }
        if (this.f1520v) {
            sb.append(" retainInstance");
        }
        if (this.f1521w) {
            sb.append(" removing");
        }
        if (this.f1522x) {
            sb.append(" detached");
        }
        if (this.f1524z) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1514p);
        parcel.writeString(this.f1515q);
        parcel.writeInt(this.f1516r ? 1 : 0);
        parcel.writeInt(this.f1517s);
        parcel.writeInt(this.f1518t);
        parcel.writeString(this.f1519u);
        parcel.writeInt(this.f1520v ? 1 : 0);
        parcel.writeInt(this.f1521w ? 1 : 0);
        parcel.writeInt(this.f1522x ? 1 : 0);
        parcel.writeBundle(this.f1523y);
        parcel.writeInt(this.f1524z ? 1 : 0);
        parcel.writeBundle(this.f1513B);
        parcel.writeInt(this.f1512A);
    }
}
