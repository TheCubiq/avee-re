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
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<FragmentState> p;
    public ArrayList<String> q;
    public BackStackState[] r;
    public int s;
    public String t;
    public ArrayList<String> u;
    public ArrayList<Bundle> v;
    public ArrayList<FragmentManager.LaunchedFragmentInfo> w;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<FragmentManagerState> {
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
        this.t = null;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.t = null;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        this.p = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.q = parcel.createStringArrayList();
        this.r = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.createStringArrayList();
        this.v = parcel.createTypedArrayList(Bundle.CREATOR);
        this.w = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeTypedArray(this.r, i);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeStringList(this.u);
        parcel.writeTypedList(this.v);
        parcel.writeTypedList(this.w);
    }
}
