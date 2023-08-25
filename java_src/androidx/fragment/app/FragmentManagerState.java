package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0279a();

    /* renamed from: p */
    public ArrayList<FragmentState> f1504p;

    /* renamed from: q */
    public ArrayList<String> f1505q;

    /* renamed from: r */
    public BackStackState[] f1506r;

    /* renamed from: s */
    public int f1507s;

    /* renamed from: t */
    public String f1508t;

    /* renamed from: u */
    public ArrayList<String> f1509u;

    /* renamed from: v */
    public ArrayList<Bundle> f1510v;

    /* renamed from: w */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f1511w;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    /* loaded from: classes.dex */
    public class C0279a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.f1508t = null;
        this.f1509u = new ArrayList<>();
        this.f1510v = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1508t = null;
        this.f1509u = new ArrayList<>();
        this.f1510v = new ArrayList<>();
        this.f1504p = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f1505q = parcel.createStringArrayList();
        this.f1506r = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1507s = parcel.readInt();
        this.f1508t = parcel.readString();
        this.f1509u = parcel.createStringArrayList();
        this.f1510v = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1511w = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1504p);
        parcel.writeStringList(this.f1505q);
        parcel.writeTypedArray(this.f1506r, i);
        parcel.writeInt(this.f1507s);
        parcel.writeString(this.f1508t);
        parcel.writeStringList(this.f1509u);
        parcel.writeTypedList(this.f1510v);
        parcel.writeTypedList(this.f1511w);
    }
}
