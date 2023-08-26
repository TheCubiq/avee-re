package com.daaw.avee.comp.playback.Song;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class PlaylistSongMetadataRetriever {
    private static final String TAG = "PlaylistSongMetadataRet";
    private static final ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void AcquireData(Context context, Uri uri, String str, final Handler handler, final Action1<PlaylistSong.Data> action1) {
        final Object[] objArr = {context, uri, str};
        executorService.submit(new Callable() { // from class: com.daaw.avee.comp.playback.Song.-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PlaylistSongMetadataRetriever.lambda$AcquireData$1(objArr, handler, action1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ PlaylistSong.Data lambda$AcquireData$1(Object[] objArr, Handler handler, final Action1 action1) throws Exception {
        final PlaylistSong.Data doInBackground = PlaylistSong.doInBackground(objArr);
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.Song.-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU
                @Override // java.lang.Runnable
                public final void run() {
                    Action1.this.onInvoke(doInBackground);
                }
            });
        } else {
            action1.onInvoke(doInBackground);
        }
        return doInBackground;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PlaylistSong.DataDetails AcquireDataMediaMetadataRetrieverLocal2(Context context, Uri uri, PlaylistSong.Data data) {
        boolean z;
        PlaylistSong.DataDetails dataDetails = new PlaylistSong.DataDetails(data);
        if (uri != null && uri != Uri.EMPTY) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            String str = null;
            if (FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme())) {
                try {
                    mediaMetadataRetriever.setDataSource(context, uri);
                } catch (Exception e) {
                    Log.e(TAG, "Cant'retreive content:\\ metadata", e);
                }
            } else {
                if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
                    String path = uri.getPath();
                    int length = path.length();
                    int lastIndexOf = path.lastIndexOf(".");
                    if (lastIndexOf < 0) {
                        lastIndexOf = length - 1;
                    }
                    int max = Math.max(path.lastIndexOf(47, lastIndexOf), 0) + 1;
                    int indexOf = path.indexOf(47, lastIndexOf);
                    if (indexOf < 0) {
                        indexOf = (length - 1) + 1;
                    }
                    try {
                        String substring = path.substring(max, indexOf);
                        if (substring.length() >= 2) {
                            str = substring;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    try {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } catch (Exception e2) {
                        Log.e(TAG, "Can't retrieve metadata", e2);
                    }
                }
                z = false;
                if (!z) {
                    dataDetails.isStream = false;
                    dataDetails.mimeType = mediaMetadataRetriever.extractMetadata(12);
                    dataDetails.trackName = mediaMetadataRetriever.extractMetadata(7);
                    dataDetails.artistName = mediaMetadataRetriever.extractMetadata(2);
                    dataDetails.albumName = mediaMetadataRetriever.extractMetadata(1);
                    dataDetails.duration = Utils.strToIntSafe(mediaMetadataRetriever.extractMetadata(9));
                    dataDetails.trackNum = Utils.strToIntSafe(mediaMetadataRetriever.extractMetadata(0));
                    dataDetails.cdNum = Utils.strToIntSafe(mediaMetadataRetriever.extractMetadata(14));
                    dataDetails.year = Utils.strToIntSafe(mediaMetadataRetriever.extractMetadata(8));
                    dataDetails.albumArtist = mediaMetadataRetriever.extractMetadata(13);
                    dataDetails.composer = mediaMetadataRetriever.extractMetadata(4);
                    dataDetails.bitRate = Utils.strToIntSafe(mediaMetadataRetriever.extractMetadata(20));
                    dataDetails.width = Utils.strToIntSafe(mediaMetadataRetriever.extractMetadata(18));
                    dataDetails.height = Utils.strToIntSafe(mediaMetadataRetriever.extractMetadata(19));
                } else {
                    dataDetails.isStream = true;
                    if (str == null) {
                        dataDetails.secondName = "";
                    } else {
                        dataDetails.secondName = str;
                    }
                }
                if (dataDetails.mimeType == null) {
                    dataDetails.mimeType = "";
                }
                if (dataDetails.trackName == null) {
                    dataDetails.trackName = "";
                }
                if (dataDetails.albumName == null) {
                    dataDetails.albumName = "";
                }
                if (dataDetails.artistName == null) {
                    dataDetails.artistName = "";
                }
                if (dataDetails.albumArtist == null) {
                    dataDetails.albumArtist = "";
                }
                if (dataDetails.composer == null) {
                    dataDetails.composer = "";
                }
                mediaMetadataRetriever.release();
            }
            z = true;
            if (!z) {
            }
            if (dataDetails.mimeType == null) {
            }
            if (dataDetails.trackName == null) {
            }
            if (dataDetails.albumName == null) {
            }
            if (dataDetails.artistName == null) {
            }
            if (dataDetails.albumArtist == null) {
            }
            if (dataDetails.composer == null) {
            }
            mediaMetadataRetriever.release();
        }
        return dataDetails;
    }
}
