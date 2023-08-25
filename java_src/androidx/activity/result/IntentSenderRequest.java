package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();
    public final IntentSender p;
    public final Intent q;
    public final int r;
    public final int s;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public b(IntentSender intentSender) {
            this.a = intentSender;
        }

        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        public b b(Intent intent) {
            this.b = intent;
            return this;
        }

        public b c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.p = intentSender;
        this.q = intent;
        this.r = i;
        this.s = i2;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.p = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.q = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
    }

    public Intent a() {
        return this.q;
    }

    public int b() {
        return this.r;
    }

    public int c() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSender g() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.p, i);
        parcel.writeParcelable(this.q, i);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
    }
}
