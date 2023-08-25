package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public final boolean p = false;
    public final Handler q = null;
    public android.support.v4.os.a r;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.AbstractBinderC0003a {
        public b() {
        }

        @Override // android.support.v4.os.a
        public void d3(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.q;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                resultReceiver.a(i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final int p;
        public final Bundle q;

        public c(int i, Bundle bundle) {
            this.p = i;
            this.q = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.p, this.q);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.r = a.AbstractBinderC0003a.D(parcel.readStrongBinder());
    }

    public void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.r == null) {
                this.r = new b();
            }
            parcel.writeStrongBinder(this.r.asBinder());
        }
    }
}
