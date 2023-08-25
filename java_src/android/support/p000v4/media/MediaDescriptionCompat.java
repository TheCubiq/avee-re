package android.support.p000v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.C0005a;
import android.support.p000v4.media.C0007b;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0001a();

    /* renamed from: p */
    public final String f2p;

    /* renamed from: q */
    public final CharSequence f3q;

    /* renamed from: r */
    public final CharSequence f4r;

    /* renamed from: s */
    public final CharSequence f5s;

    /* renamed from: t */
    public final Bitmap f6t;

    /* renamed from: u */
    public final Uri f7u;

    /* renamed from: v */
    public final Bundle f8v;

    /* renamed from: w */
    public final Uri f9w;

    /* renamed from: x */
    public Object f10x;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes3.dex */
    public static class C0001a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m30499a(C0005a.m30481a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes3.dex */
    public static final class C0002b {

        /* renamed from: a */
        public String f11a;

        /* renamed from: b */
        public CharSequence f12b;

        /* renamed from: c */
        public CharSequence f13c;

        /* renamed from: d */
        public CharSequence f14d;

        /* renamed from: e */
        public Bitmap f15e;

        /* renamed from: f */
        public Uri f16f;

        /* renamed from: g */
        public Bundle f17g;

        /* renamed from: h */
        public Uri f18h;

        /* renamed from: a */
        public MediaDescriptionCompat m30495a() {
            return new MediaDescriptionCompat(this.f11a, this.f12b, this.f13c, this.f14d, this.f15e, this.f16f, this.f17g, this.f18h);
        }

        /* renamed from: b */
        public C0002b m30494b(CharSequence charSequence) {
            this.f14d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0002b m30493c(Bundle bundle) {
            this.f17g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0002b m30492d(Bitmap bitmap) {
            this.f15e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0002b m30491e(Uri uri) {
            this.f16f = uri;
            return this;
        }

        /* renamed from: f */
        public C0002b m30490f(String str) {
            this.f11a = str;
            return this;
        }

        /* renamed from: g */
        public C0002b m30489g(Uri uri) {
            this.f18h = uri;
            return this;
        }

        /* renamed from: h */
        public C0002b m30488h(CharSequence charSequence) {
            this.f13c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0002b m30487i(CharSequence charSequence) {
            this.f12b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f2p = parcel.readString();
        this.f3q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f6t = (Bitmap) parcel.readParcelable(classLoader);
        this.f7u = (Uri) parcel.readParcelable(classLoader);
        this.f8v = parcel.readBundle(classLoader);
        this.f9w = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2p = str;
        this.f3q = charSequence;
        this.f4r = charSequence2;
        this.f5s = charSequence3;
        this.f6t = bitmap;
        this.f7u = uri;
        this.f8v = bundle;
        this.f9w = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat m30499a(Object obj) {
        int i;
        Uri uri;
        Bundle bundle = null;
        if (obj == null || (i = Build.VERSION.SDK_INT) < 21) {
            return null;
        }
        C0002b c0002b = new C0002b();
        c0002b.m30490f(C0005a.m30476f(obj));
        c0002b.m30487i(C0005a.m30474h(obj));
        c0002b.m30488h(C0005a.m30475g(obj));
        c0002b.m30494b(C0005a.m30480b(obj));
        c0002b.m30492d(C0005a.m30478d(obj));
        c0002b.m30491e(C0005a.m30477e(obj));
        Bundle m30479c = C0005a.m30479c(obj);
        if (m30479c != null) {
            MediaSessionCompat.m30460a(m30479c);
            uri = (Uri) m30479c.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!m30479c.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || m30479c.size() != 2) {
                m30479c.remove("android.support.v4.media.description.MEDIA_URI");
                m30479c.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            c0002b.m30493c(bundle);
            if (uri == null) {
                c0002b.m30489g(uri);
            } else if (i >= 23) {
                c0002b.m30489g(C0007b.m30463a(obj));
            }
            MediaDescriptionCompat m30495a = c0002b.m30495a();
            m30495a.f10x = obj;
            return m30495a;
        }
        bundle = m30479c;
        c0002b.m30493c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat m30495a2 = c0002b.m30495a();
        m30495a2.f10x = obj;
        return m30495a2;
    }

    /* renamed from: b */
    public Object m30498b() {
        int i;
        Object obj = this.f10x;
        if (obj != null || (i = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object m30471b = C0005a.C0006a.m30471b();
        C0005a.C0006a.m30466g(m30471b, this.f2p);
        C0005a.C0006a.m30464i(m30471b, this.f3q);
        C0005a.C0006a.m30465h(m30471b, this.f4r);
        C0005a.C0006a.m30470c(m30471b, this.f5s);
        C0005a.C0006a.m30468e(m30471b, this.f6t);
        C0005a.C0006a.m30467f(m30471b, this.f7u);
        Bundle bundle = this.f8v;
        if (i < 23 && this.f9w != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f9w);
        }
        C0005a.C0006a.m30469d(m30471b, bundle);
        if (i >= 23) {
            C0007b.C0008a.m30462a(m30471b, this.f9w);
        }
        Object m30472a = C0005a.C0006a.m30472a(m30471b);
        this.f10x = m30472a;
        return m30472a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f3q) + ", " + ((Object) this.f4r) + ", " + ((Object) this.f5s);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0005a.m30473i(m30498b(), parcel, i);
            return;
        }
        parcel.writeString(this.f2p);
        TextUtils.writeToParcel(this.f3q, parcel, i);
        TextUtils.writeToParcel(this.f4r, parcel, i);
        TextUtils.writeToParcel(this.f5s, parcel, i);
        parcel.writeParcelable(this.f6t, i);
        parcel.writeParcelable(this.f7u, i);
        parcel.writeBundle(this.f8v);
        parcel.writeParcelable(this.f9w, i);
    }
}
