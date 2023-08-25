package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import com.daaw.ax0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public Object A;
    public final int p;
    public final long q;
    public final long r;
    public final float s;
    public final long t;
    public final int u;
    public final CharSequence v;
    public final long w;
    public List<CustomAction> x;
    public final long y;
    public final Bundle z;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String p;
        public final CharSequence q;
        public final int r;
        public final Bundle s;
        public Object t;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<CustomAction> {
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
            this.p = parcel.readString();
            this.q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.r = parcel.readInt();
            this.s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.p = str;
            this.q = charSequence;
            this.r = i;
            this.s = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(e.a.a(obj), e.a.d(obj), e.a.c(obj), e.a.b(obj));
            customAction.t = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.q) + ", mIcon=" + this.r + ", mExtras=" + this.s;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.p);
            TextUtils.writeToParcel(this.q, parcel, i);
            parcel.writeInt(this.r);
            parcel.writeBundle(this.s);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
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
        this.p = i;
        this.q = j;
        this.r = j2;
        this.s = f;
        this.t = j3;
        this.u = i2;
        this.v = charSequence;
        this.w = j4;
        this.x = new ArrayList(list);
        this.y = j5;
        this.z = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.p = parcel.readInt();
        this.q = parcel.readLong();
        this.s = parcel.readFloat();
        this.w = parcel.readLong();
        this.r = parcel.readLong();
        this.t = parcel.readLong();
        this.v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.x = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.y = parcel.readLong();
        this.z = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.u = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = e.d(obj);
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(d.size());
            for (Object obj2 : d) {
                arrayList2.add(CustomAction.a(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.i(obj), e.h(obj), e.c(obj), e.g(obj), e.a(obj), 0, e.e(obj), e.f(obj), arrayList, e.b(obj), Build.VERSION.SDK_INT >= 22 ? ax0.a(obj) : null);
        playbackStateCompat.A = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.p + ", position=" + this.q + ", buffered position=" + this.r + ", speed=" + this.s + ", updated=" + this.w + ", actions=" + this.t + ", error code=" + this.u + ", error message=" + this.v + ", custom actions=" + this.x + ", active item id=" + this.y + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        parcel.writeLong(this.q);
        parcel.writeFloat(this.s);
        parcel.writeLong(this.w);
        parcel.writeLong(this.r);
        parcel.writeLong(this.t);
        TextUtils.writeToParcel(this.v, parcel, i);
        parcel.writeTypedList(this.x);
        parcel.writeLong(this.y);
        parcel.writeBundle(this.z);
        parcel.writeInt(this.u);
    }
}
