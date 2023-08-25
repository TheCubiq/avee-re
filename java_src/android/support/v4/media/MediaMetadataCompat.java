package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import com.daaw.g6;
import com.daaw.oo0;
/* loaded from: classes3.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final g6<String, Integer> r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;
    public final Bundle p;
    public Object q;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<MediaMetadataCompat> {
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
        g6<String, Integer> g6Var = new g6<>();
        r = g6Var;
        g6Var.put("android.media.metadata.TITLE", 1);
        g6Var.put("android.media.metadata.ARTIST", 1);
        g6Var.put("android.media.metadata.DURATION", 0);
        g6Var.put("android.media.metadata.ALBUM", 1);
        g6Var.put("android.media.metadata.AUTHOR", 1);
        g6Var.put("android.media.metadata.WRITER", 1);
        g6Var.put("android.media.metadata.COMPOSER", 1);
        g6Var.put("android.media.metadata.COMPILATION", 1);
        g6Var.put("android.media.metadata.DATE", 1);
        g6Var.put("android.media.metadata.YEAR", 0);
        g6Var.put("android.media.metadata.GENRE", 1);
        g6Var.put("android.media.metadata.TRACK_NUMBER", 0);
        g6Var.put("android.media.metadata.NUM_TRACKS", 0);
        g6Var.put("android.media.metadata.DISC_NUMBER", 0);
        g6Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        g6Var.put("android.media.metadata.ART", 2);
        g6Var.put("android.media.metadata.ART_URI", 1);
        g6Var.put("android.media.metadata.ALBUM_ART", 2);
        g6Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        g6Var.put("android.media.metadata.USER_RATING", 3);
        g6Var.put("android.media.metadata.RATING", 3);
        g6Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        g6Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        g6Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        g6Var.put("android.media.metadata.DISPLAY_ICON", 2);
        g6Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        g6Var.put("android.media.metadata.MEDIA_ID", 1);
        g6Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        g6Var.put("android.media.metadata.MEDIA_URI", 1);
        g6Var.put("android.media.metadata.ADVERTISEMENT", 0);
        g6Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        s = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        t = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        u = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        oo0.a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.q = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.p);
    }
}
