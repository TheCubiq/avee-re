package android.support.p000v4.p001os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.p001os.InterfaceC0033a;
@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0030a();

    /* renamed from: p */
    public final boolean f67p = false;

    /* renamed from: q */
    public final Handler f68q = null;

    /* renamed from: r */
    public InterfaceC0033a f69r;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    public class C0030a implements Parcelable.Creator<ResultReceiver> {
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

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    public class BinderC0031b extends InterfaceC0033a.AbstractBinderC0034a {
        public BinderC0031b() {
        }

        @Override // android.support.p000v4.p001os.InterfaceC0033a
        /* renamed from: d3 */
        public void mo30388d3(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f68q;
            if (handler != null) {
                handler.post(new RunnableC0032c(i, bundle));
            } else {
                resultReceiver.mo30391a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    public class RunnableC0032c implements Runnable {

        /* renamed from: p */
        public final int f71p;

        /* renamed from: q */
        public final Bundle f72q;

        public RunnableC0032c(int i, Bundle bundle) {
            this.f71p = i;
            this.f72q = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo30391a(this.f71p, this.f72q);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f69r = InterfaceC0033a.AbstractBinderC0034a.m30387D(parcel.readStrongBinder());
    }

    /* renamed from: a */
    public void mo30391a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f69r == null) {
                this.f69r = new BinderC0031b();
            }
            parcel.writeStrongBinder(this.f69r.asBinder());
        }
    }
}
