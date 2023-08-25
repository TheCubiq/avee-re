package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public final String p;
    public final CharSequence q;
    public final CharSequence r;
    public final CharSequence s;
    public final Bitmap t;
    public final Uri u;
    public final Bundle v;
    public final Uri w;
    public Object x;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public String a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public Bitmap e;
        public Uri f;
        public Bundle g;
        public Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f = uri;
            return this;
        }

        public b f(String str) {
            this.a = str;
            return this;
        }

        public b g(Uri uri) {
            this.h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.p = parcel.readString();
        this.q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.t = (Bitmap) parcel.readParcelable(classLoader);
        this.u = (Uri) parcel.readParcelable(classLoader);
        this.v = parcel.readBundle(classLoader);
        this.w = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.p = str;
        this.q = charSequence;
        this.r = charSequence2;
        this.s = charSequence3;
        this.t = bitmap;
        this.u = uri;
        this.v = bundle;
        this.w = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L7e
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.a.f(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.h(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.g(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.b(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.a.d(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.a.e(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.a.c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4a
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4b
        L4a:
            r5 = r0
        L4b:
            if (r5 == 0) goto L63
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5d
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5d
            goto L64
        L5d:
            r3.remove(r4)
            r3.remove(r6)
        L63:
            r0 = r3
        L64:
            r2.c(r0)
            if (r5 == 0) goto L6d
            r2.g(r5)
            goto L78
        L6d:
            r0 = 23
            if (r1 < r0) goto L78
            android.net.Uri r0 = android.support.v4.media.b.a(r9)
            r2.g(r0)
        L78:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.x = r9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        int i;
        Object obj = this.x;
        if (obj != null || (i = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object b2 = a.C0000a.b();
        a.C0000a.g(b2, this.p);
        a.C0000a.i(b2, this.q);
        a.C0000a.h(b2, this.r);
        a.C0000a.c(b2, this.s);
        a.C0000a.e(b2, this.t);
        a.C0000a.f(b2, this.u);
        Bundle bundle = this.v;
        if (i < 23 && this.w != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.w);
        }
        a.C0000a.d(b2, bundle);
        if (i >= 23) {
            b.a.a(b2, this.w);
        }
        Object a2 = a.C0000a.a(b2);
        this.x = a2;
        return a2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.q) + ", " + ((Object) this.r) + ", " + ((Object) this.s);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            android.support.v4.media.a.i(b(), parcel, i);
            return;
        }
        parcel.writeString(this.p);
        TextUtils.writeToParcel(this.q, parcel, i);
        TextUtils.writeToParcel(this.r, parcel, i);
        TextUtils.writeToParcel(this.s, parcel, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeParcelable(this.u, i);
        parcel.writeBundle(this.v);
        parcel.writeParcelable(this.w, i);
    }
}
