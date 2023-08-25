package android.support.p000v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.session.MediaSessionCompat;
import com.daaw.C1370g6;
import com.daaw.oo0;
/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* loaded from: classes3.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: r */
    public static final C1370g6<String, Integer> f19r;

    /* renamed from: s */
    public static final String[] f20s;

    /* renamed from: t */
    public static final String[] f21t;

    /* renamed from: u */
    public static final String[] f22u;

    /* renamed from: p */
    public final Bundle f23p;

    /* renamed from: q */
    public Object f24q;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes3.dex */
    public static class C0003a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C1370g6<String, Integer> c1370g6 = new C1370g6<>();
        f19r = c1370g6;
        c1370g6.put("android.media.metadata.TITLE", 1);
        c1370g6.put("android.media.metadata.ARTIST", 1);
        c1370g6.put("android.media.metadata.DURATION", 0);
        c1370g6.put("android.media.metadata.ALBUM", 1);
        c1370g6.put("android.media.metadata.AUTHOR", 1);
        c1370g6.put("android.media.metadata.WRITER", 1);
        c1370g6.put("android.media.metadata.COMPOSER", 1);
        c1370g6.put("android.media.metadata.COMPILATION", 1);
        c1370g6.put("android.media.metadata.DATE", 1);
        c1370g6.put("android.media.metadata.YEAR", 0);
        c1370g6.put("android.media.metadata.GENRE", 1);
        c1370g6.put("android.media.metadata.TRACK_NUMBER", 0);
        c1370g6.put("android.media.metadata.NUM_TRACKS", 0);
        c1370g6.put("android.media.metadata.DISC_NUMBER", 0);
        c1370g6.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1370g6.put("android.media.metadata.ART", 2);
        c1370g6.put("android.media.metadata.ART_URI", 1);
        c1370g6.put("android.media.metadata.ALBUM_ART", 2);
        c1370g6.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1370g6.put("android.media.metadata.USER_RATING", 3);
        c1370g6.put("android.media.metadata.RATING", 3);
        c1370g6.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1370g6.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1370g6.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1370g6.put("android.media.metadata.DISPLAY_ICON", 2);
        c1370g6.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1370g6.put("android.media.metadata.MEDIA_ID", 1);
        c1370g6.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1370g6.put("android.media.metadata.MEDIA_URI", 1);
        c1370g6.put("android.media.metadata.ADVERTISEMENT", 0);
        c1370g6.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f20s = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f21t = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f22u = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0003a();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f23p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m30486a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        oo0.m14119a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f24q = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f23p);
    }
}
