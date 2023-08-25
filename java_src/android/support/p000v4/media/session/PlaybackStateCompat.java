package android.support.p000v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.session.C0028e;
import android.text.TextUtils;
import com.daaw.ax0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0015a();

    /* renamed from: A */
    public Object f44A;

    /* renamed from: p */
    public final int f45p;

    /* renamed from: q */
    public final long f46q;

    /* renamed from: r */
    public final long f47r;

    /* renamed from: s */
    public final float f48s;

    /* renamed from: t */
    public final long f49t;

    /* renamed from: u */
    public final int f50u;

    /* renamed from: v */
    public final CharSequence f51v;

    /* renamed from: w */
    public final long f52w;

    /* renamed from: x */
    public List<CustomAction> f53x;

    /* renamed from: y */
    public final long f54y;

    /* renamed from: z */
    public final Bundle f55z;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0014a();

        /* renamed from: p */
        public final String f56p;

        /* renamed from: q */
        public final CharSequence f57q;

        /* renamed from: r */
        public final int f58r;

        /* renamed from: s */
        public final Bundle f59s;

        /* renamed from: t */
        public Object f60t;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        public static class C0014a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f56p = parcel.readString();
            this.f57q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f58r = parcel.readInt();
            this.f59s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f56p = str;
            this.f57q = charSequence;
            this.f58r = i;
            this.f59s = bundle;
        }

        /* renamed from: a */
        public static CustomAction m30445a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0028e.C0029a.m30395a(obj), C0028e.C0029a.m30392d(obj), C0028e.C0029a.m30393c(obj), C0028e.C0029a.m30394b(obj));
            customAction.f60t = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f57q) + ", mIcon=" + this.f58r + ", mExtras=" + this.f59s;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f56p);
            TextUtils.writeToParcel(this.f57q, parcel, i);
            parcel.writeInt(this.f58r);
            parcel.writeBundle(this.f59s);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    public static class C0015a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f45p = i;
        this.f46q = j;
        this.f47r = j2;
        this.f48s = f;
        this.f49t = j3;
        this.f50u = i2;
        this.f51v = charSequence;
        this.f52w = j4;
        this.f53x = new ArrayList(list);
        this.f54y = j5;
        this.f55z = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f45p = parcel.readInt();
        this.f46q = parcel.readLong();
        this.f48s = parcel.readFloat();
        this.f52w = parcel.readLong();
        this.f47r = parcel.readLong();
        this.f49t = parcel.readLong();
        this.f51v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f53x = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f54y = parcel.readLong();
        this.f55z = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f50u = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m30446a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> m30401d = C0028e.m30401d(obj);
        if (m30401d != null) {
            ArrayList arrayList2 = new ArrayList(m30401d.size());
            for (Object obj2 : m30401d) {
                arrayList2.add(CustomAction.m30445a(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0028e.m30396i(obj), C0028e.m30397h(obj), C0028e.m30402c(obj), C0028e.m30398g(obj), C0028e.m30404a(obj), 0, C0028e.m30400e(obj), C0028e.m30399f(obj), arrayList, C0028e.m30403b(obj), Build.VERSION.SDK_INT >= 22 ? ax0.m26626a(obj) : null);
        playbackStateCompat.f44A = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f45p + ", position=" + this.f46q + ", buffered position=" + this.f47r + ", speed=" + this.f48s + ", updated=" + this.f52w + ", actions=" + this.f49t + ", error code=" + this.f50u + ", error message=" + this.f51v + ", custom actions=" + this.f53x + ", active item id=" + this.f54y + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45p);
        parcel.writeLong(this.f46q);
        parcel.writeFloat(this.f48s);
        parcel.writeLong(this.f52w);
        parcel.writeLong(this.f47r);
        parcel.writeLong(this.f49t);
        TextUtils.writeToParcel(this.f51v, parcel, i);
        parcel.writeTypedList(this.f53x);
        parcel.writeLong(this.f54y);
        parcel.writeBundle(this.f55z);
        parcel.writeInt(this.f50u);
    }
}
