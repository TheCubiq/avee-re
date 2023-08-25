package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: p */
    public final Parcelable f1209p;

    /* renamed from: q */
    public static final AbsSavedState f1208q = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0213a();

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    /* loaded from: classes.dex */
    public static class C0213a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f1208q;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    public AbsSavedState() {
        this.f1209p = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1209p = readParcelable == null ? f1208q : readParcelable;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1209p = parcelable == f1208q ? null : parcelable;
    }

    /* renamed from: a */
    public final Parcelable m29657a() {
        return this.f1209p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1209p, i);
    }
}
