package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0049a();

    /* renamed from: p */
    public final IntentSender f126p;

    /* renamed from: q */
    public final Intent f127q;

    /* renamed from: r */
    public final int f128r;

    /* renamed from: s */
    public final int f129s;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    /* loaded from: classes.dex */
    public class C0049a implements Parcelable.Creator<IntentSenderRequest> {
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

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    /* loaded from: classes.dex */
    public static final class C0050b {

        /* renamed from: a */
        public IntentSender f130a;

        /* renamed from: b */
        public Intent f131b;

        /* renamed from: c */
        public int f132c;

        /* renamed from: d */
        public int f133d;

        public C0050b(IntentSender intentSender) {
            this.f130a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest m30353a() {
            return new IntentSenderRequest(this.f130a, this.f131b, this.f132c, this.f133d);
        }

        /* renamed from: b */
        public C0050b m30352b(Intent intent) {
            this.f131b = intent;
            return this;
        }

        /* renamed from: c */
        public C0050b m30351c(int i, int i2) {
            this.f133d = i;
            this.f132c = i2;
            return this;
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f126p = intentSender;
        this.f127q = intent;
        this.f128r = i;
        this.f129s = i2;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f126p = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f127q = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f128r = parcel.readInt();
        this.f129s = parcel.readInt();
    }

    /* renamed from: a */
    public Intent m30359a() {
        return this.f127q;
    }

    /* renamed from: b */
    public int m30358b() {
        return this.f128r;
    }

    /* renamed from: c */
    public int m30357c() {
        return this.f129s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public IntentSender m30356g() {
        return this.f126p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f126p, i);
        parcel.writeParcelable(this.f127q, i);
        parcel.writeInt(this.f128r);
        parcel.writeInt(this.f129s);
    }
}
