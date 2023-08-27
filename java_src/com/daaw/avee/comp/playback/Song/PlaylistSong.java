package com.daaw.avee.comp.playback.Song;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtCore;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class PlaylistSong {
    private static final String TAG = "PlaylistSong";
    private String providedTitle;
    private volatile Data songData;
    public static final Data emptyData = new Data(Uri.EMPTY);
    private static final Data notsetData = new Data(Uri.EMPTY);
    private static final Data loadingData = new Data(Uri.EMPTY);
    public static final PlaylistSong EmptySong = new PlaylistSong(emptyData);
    private static final String[] mCursorCols = {"_id", "artist", "album", "title", "mime_type", "album_id", "artist_id", "duration"};
    private static String unknown_artist_name = null;
    private static String unknown_album_name = null;
    private Uri idPath = Uri.EMPTY;
    private volatile AsyncLoadingData asyncLoadingData = null;

    /* loaded from: classes.dex */
    public interface OnDataReadyListener {
        void onDataReady(Data data, Object obj, Object obj2);
    }

    private PlaylistSong(Data data) {
        this.songData = data;
    }

    public PlaylistSong(Uri uri) {
        init(uri, null);
    }

    public PlaylistSong(String str) {
        init(str == null ? Uri.EMPTY : Uri.parse(str), null);
    }

    public PlaylistSong(long j, Uri uri) {
        init(uri, null);
    }

    public PlaylistSong(File file) {
        init(Uri.fromFile(file), null);
    }

    public PlaylistSong(long j, String str) {
        init(str == null ? Uri.EMPTY : Uri.parse(str), null);
    }

    public PlaylistSong(long j, String str, String str2, String str3) {
        init(str == null ? Uri.EMPTY : Uri.parse(str), str2);
    }

    public static List<PlaylistSong> makeSongListFromDataSourceList(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(new PlaylistSong(-1L, str));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b A[Catch: Exception -> 0x01d1, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b A[Catch: Exception -> 0x01d1, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b A[Catch: Exception -> 0x01d1, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c A[Catch: Exception -> 0x01d1, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018a A[Catch: Exception -> 0x01d1, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b A[Catch: Exception -> 0x01d1, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b5 A[Catch: Exception -> 0x01d1, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5 A[Catch: Exception -> 0x01d1, TRY_LEAVE, TryCatch #3 {Exception -> 0x01d1, blocks: (B:66:0x0139, B:68:0x0141, B:70:0x014b, B:72:0x0151, B:74:0x015b, B:76:0x0161, B:78:0x016b, B:80:0x0172, B:82:0x017c, B:83:0x0180, B:85:0x018a, B:87:0x0191, B:89:0x019b, B:91:0x01a1, B:93:0x01b5, B:94:0x01bd, B:96:0x01c5), top: B:136:0x0139 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Data AcquireDataMediaStore(Context context, Uri uri, String str) {
        ContentResolver contentResolver;
        int i;
        Cursor cursor;
        String str2;
        String str3;
        ContentResolver contentResolver2;
        boolean z;
        int columnIndex;
        long j;
        Cursor querySafe;
        String str4;
        try {
            if (unknown_album_name == null) {
                unknown_artist_name = context.getResources().getString(R.string.unknown_artist_name);
                unknown_album_name = context.getResources().getString(R.string.unknown_album_name);
            }
        } catch (Exception unused) {
            unknown_artist_name = "Unknown artist";
            unknown_album_name = "Unknown album";
        }
        Data data = new Data(uri);
        if (uri != null && uri != Uri.EMPTY) {
            data.isStream = Data.isUrlStream(uri);
            ContentResolver contentResolver3 = context != null ? context.getContentResolver() : null;
            if (contentResolver3 != null) {
                if (FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme())) {
                    cursor = MediaStoreUtils.querySafe(contentResolver3, uri, mCursorCols, null, null, null);
                    Log.i(TAG, "Cursor is " + cursor);
                    str2 = null;
                    str3 = null;
                    contentResolver = contentResolver3;
                    i = 0;
                } else if (data.isStream) {
                    String tryExtractPrettyNameFromUri = str != null ? str : Utils.tryExtractPrettyNameFromUri(uri);
                    str3 = uri.toString();
                    contentResolver = contentResolver3;
                    i = 0;
                    str2 = tryExtractPrettyNameFromUri;
                    cursor = null;
                } else {
                    String path = uri.getPath();
                    if (path != null) {
                        Uri uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        String[] strArr = {path};
                        i = 0;
                        contentResolver = contentResolver3;
                        Cursor querySafe2 = MediaStoreUtils.querySafe(contentResolver3, uri2, mCursorCols, "_data=?", strArr, null);
                        if (querySafe2 == null || querySafe2.getCount() <= 0) {
                            if (querySafe2 != null) {
                                querySafe2.close();
                            }
                            querySafe = MediaStoreUtils.querySafe(contentResolver, uri2, mCursorCols, "_data=? COLLATE NOCASE", strArr, null);
                        } else {
                            querySafe = querySafe2;
                        }
                        if ((querySafe == null || querySafe.getCount() <= 0) && ("file".equals(uri.getScheme()) || uri.getScheme() == null)) {
                            try {
                                str4 = new File(path).getCanonicalPath();
                            } catch (IOException unused2) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                if (querySafe != null) {
                                    querySafe.close();
                                }
                                cursor = MediaStoreUtils.querySafe(contentResolver, uri2, mCursorCols, "_data=?", new String[]{str4}, null);
                                str2 = null;
                                str3 = str2;
                            }
                        }
                        cursor = querySafe;
                        str2 = null;
                        str3 = str2;
                    }
                }
                if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
                    try {
                        columnIndex = cursor.getColumnIndex("_id");
                        contentResolver2 = contentResolver;
                        if (columnIndex < 0) {
                            try {
                                j = cursor.getLong(columnIndex);
                            } catch (Exception unused3) {
                            }
                        } else {
                            j = 0;
                        }
                        data.audioId = j;
                        int columnIndex2 = cursor.getColumnIndex("title");
                        data.trackName = columnIndex2 < 0 ? cursor.getString(columnIndex2) : null;
                        int columnIndex3 = cursor.getColumnIndex("album");
                        data.albumName = columnIndex3 < 0 ? cursor.getString(columnIndex3) : null;
                        int columnIndex4 = cursor.getColumnIndex("album_id");
                        data.albumId = columnIndex4 < 0 ? cursor.getLong(columnIndex4) : -1L;
                        int columnIndex5 = cursor.getColumnIndex("artist");
                        data.artistName = columnIndex5 >= 0 ? cursor.getString(columnIndex5) : null;
                        int columnIndex6 = cursor.getColumnIndex("artist_id");
                        data.artistId = columnIndex6 < 0 ? cursor.getLong(columnIndex6) : -1L;
                        int columnIndex7 = cursor.getColumnIndex("duration");
                        data.duration = columnIndex7 < 0 ? cursor.getInt(columnIndex7) : 0;
                        data.trackNum = i;
                        data.cdNum = i;
                        data.year = i;
                        data.sizeInBytes = 0L;
                        data.albumArt = "";
                        if ("<unknown>".equals(data.artistName)) {
                            data.artistName = unknown_artist_name;
                            data.artistId = -1L;
                        }
                        if ("<unknown>".equals(data.albumName)) {
                            data.albumName = unknown_album_name;
                            data.albumId = -1L;
                        }
                        z = false;
                    } catch (Exception unused4) {
                    }
                    if (z && !applyDetailsFromMeta(data, context, uri)) {
                        if (str2 == null) {
                            str2 = uri.getLastPathSegment();
                        }
                        if (str2 == null) {
                            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
                        }
                        data.audioId = -1L;
                        data.trackName = str2;
                        data.albumName = unknown_album_name;
                        data.albumId = -1L;
                        if (str3 != null) {
                            data.artistName = unknown_artist_name;
                            data.artistId = -1L;
                        } else {
                            data.artistName = str3;
                            data.artistId = -2L;
                        }
                    }
                    if (data.filePath == null) {
                        data.filePath = "";
                    }
                    if (data.trackName == null) {
                        data.trackName = EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    if (data.albumName == null) {
                        data.albumName = unknown_album_name;
                    }
                    if (data.artistName == null) {
                        data.artistName = unknown_artist_name;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    data.finish(contentResolver2);
                }
                contentResolver2 = contentResolver;
                z = true;
                if (z) {
                    if (str2 == null) {
                    }
                    if (str2 == null) {
                    }
                    data.audioId = -1L;
                    data.trackName = str2;
                    data.albumName = unknown_album_name;
                    data.albumId = -1L;
                    if (str3 != null) {
                    }
                }
                if (data.filePath == null) {
                }
                if (data.trackName == null) {
                }
                if (data.albumName == null) {
                }
                if (data.artistName == null) {
                }
                if (cursor != null) {
                }
                data.finish(contentResolver2);
            }
            contentResolver = contentResolver3;
            i = 0;
            cursor = null;
            str2 = null;
            str3 = str2;
            if (cursor != null) {
                columnIndex = cursor.getColumnIndex("_id");
                contentResolver2 = contentResolver;
                if (columnIndex < 0) {
                }
                data.audioId = j;
                int columnIndex22 = cursor.getColumnIndex("title");
                data.trackName = columnIndex22 < 0 ? cursor.getString(columnIndex22) : null;
                int columnIndex32 = cursor.getColumnIndex("album");
                data.albumName = columnIndex32 < 0 ? cursor.getString(columnIndex32) : null;
                int columnIndex42 = cursor.getColumnIndex("album_id");
                data.albumId = columnIndex42 < 0 ? cursor.getLong(columnIndex42) : -1L;
                int columnIndex52 = cursor.getColumnIndex("artist");
                data.artistName = columnIndex52 >= 0 ? cursor.getString(columnIndex52) : null;
                int columnIndex62 = cursor.getColumnIndex("artist_id");
                data.artistId = columnIndex62 < 0 ? cursor.getLong(columnIndex62) : -1L;
                int columnIndex72 = cursor.getColumnIndex("duration");
                data.duration = columnIndex72 < 0 ? cursor.getInt(columnIndex72) : 0;
                data.trackNum = i;
                data.cdNum = i;
                data.year = i;
                data.sizeInBytes = 0L;
                data.albumArt = "";
                if ("<unknown>".equals(data.artistName)) {
                }
                if ("<unknown>".equals(data.albumName)) {
                }
                z = false;
                if (z) {
                }
                if (data.filePath == null) {
                }
                if (data.trackName == null) {
                }
                if (data.albumName == null) {
                }
                if (data.artistName == null) {
                }
                if (cursor != null) {
                }
                data.finish(contentResolver2);
            }
            contentResolver2 = contentResolver;
            z = true;
            if (z) {
            }
            if (data.filePath == null) {
            }
            if (data.trackName == null) {
            }
            if (data.albumName == null) {
            }
            if (data.artistName == null) {
            }
            if (cursor != null) {
            }
            data.finish(contentResolver2);
        }
        return data;
    }

    private static boolean applyDetailsFromMeta(Data data, Context context, Uri uri) {
        DataDetails AcquireDataMediaMetadataRetrieverLocal2 = PlaylistSongMetadataRetriever.AcquireDataMediaMetadataRetrieverLocal2(context, uri, null);
        if (AcquireDataMediaMetadataRetrieverLocal2.trackName.isEmpty()) {
            return false;
        }
        data.isStream = AcquireDataMediaMetadataRetrieverLocal2.isStream;
        data.trackName = AcquireDataMediaMetadataRetrieverLocal2.trackName;
        data.albumName = AcquireDataMediaMetadataRetrieverLocal2.albumArtist.isEmpty() ? unknown_album_name : AcquireDataMediaMetadataRetrieverLocal2.albumName;
        data.artistName = AcquireDataMediaMetadataRetrieverLocal2.artistName.isEmpty() ? unknown_artist_name : AcquireDataMediaMetadataRetrieverLocal2.artistName;
        data.duration = AcquireDataMediaMetadataRetrieverLocal2.duration;
        data.trackNum = AcquireDataMediaMetadataRetrieverLocal2.trackNum;
        data.cdNum = AcquireDataMediaMetadataRetrieverLocal2.cdNum;
        data.year = AcquireDataMediaMetadataRetrieverLocal2.year;
        return true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof PlaylistSong) && compare((PlaylistSong) obj);
    }

    public int hashCode() {
        return this.idPath.hashCode();
    }

    public void init(Uri uri, String str) {
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        this.idPath = uri;
        this.providedTitle = str;
        this.songData = notsetData;
    }

    private void startAcquireData(Handler handler) {
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return;
        }
        this.songData = loadingData;
        PlaylistSongMetadataRetriever.AcquireData(appContext, this.idPath, this.providedTitle, handler, new Action1() { // from class: com.daaw.avee.comp.playback.Song.-$$Lambda$PlaylistSong$Ffs6td9hDBCCAOAhDu21sOhsxss
            @Override // com.daaw.avee.Common.Action1
            public final void onInvoke(Object obj) {
                PlaylistSong.this.lambda$startAcquireData$0$PlaylistSong((PlaylistSong.Data) obj);
            }
        });
    }

    public boolean compare(PlaylistSong playlistSong) {
        return playlistSong != null && playlistSong.idPath.equals(this.idPath);
    }

    public String getDataSourceForPlaylist() {
        return Uri.decode(this.idPath.toString());
    }

    public long getDataSourceForNativePlaylist() {
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return 0L;
        }
        Data dataBlocking = getDataBlocking(appContext);
        if (dataBlocking.audioId > 0) {
            return dataBlocking.audioId;
        }
        return 0L;
    }

    public String getConstrucPath() {
        return Uri.decode(this.idPath.toString());
    }

    public IMediaDataSource getMediaDataSource() {
        return new MediaDataSourceOther(this.idPath);
    }

    public boolean isStream() {
        return Data.isUrlStream(this.idPath);
    }

    public Data getData(Handler handler, OnDataReadyListener onDataReadyListener, Object obj, Object obj2) {
        Data data = this.songData;
        if (data == notsetData) {
            this.asyncLoadingData = new AsyncLoadingData(onDataReadyListener, obj, obj2);
            startAcquireData(handler);
            return emptyData;
        } else if (data == loadingData) {
            this.asyncLoadingData = new AsyncLoadingData(onDataReadyListener, obj, obj2);
            return emptyData;
        } else {
            this.asyncLoadingData = null;
            return data;
        }
    }

    public Data getData() {
        Data data = this.songData;
        if (data == notsetData) {
            this.asyncLoadingData = null;
            startAcquireData(null);
            return emptyData;
        } else if (data == loadingData) {
            this.asyncLoadingData = null;
            return emptyData;
        } else {
            this.asyncLoadingData = null;
            return data;
        }
    }

    public Data getDataBlocking(Context context) {
        Data data = this.songData;
        return (data == emptyData || data == loadingData || data == notsetData) ? acquireData(context, this.idPath, this.providedTitle) : data;
    }

    public DataDetails getDataDetailsBlocking(Context context) {
        return PlaylistSongMetadataRetriever.AcquireDataMediaMetadataRetrieverLocal2(context, this.idPath, getDataBlocking(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Data doInBackground(Object... objArr) {
        return acquireData((Context) objArr[0], (Uri) objArr[1], (String) objArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onPostExecute */
    public void lambda$startAcquireData$0$PlaylistSong(Data data) {
        AsyncLoadingData asyncLoadingData = this.asyncLoadingData;
        this.asyncLoadingData = null;
        this.songData = data;
        if (asyncLoadingData != null) {
            asyncLoadingData.listener.onDataReady(this.songData, asyncLoadingData.userData1, asyncLoadingData.userData2);
        }
    }

    private static Data acquireData(Context context, Uri uri, String str) {
        return AcquireDataMediaStore(context, uri, str);
    }

    /* loaded from: classes.dex */
    private static class PlaylistSongOwnSerialExecutor implements Executor {
        Runnable active;
        final ArrayDeque<Runnable> tasks = new ArrayDeque<>();

        private PlaylistSongOwnSerialExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.tasks.offer(new Runnable() { // from class: com.daaw.avee.comp.playback.Song.PlaylistSong.PlaylistSongOwnSerialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        PlaylistSongOwnSerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
        }

        protected synchronized void scheduleNext() {
            Runnable poll = this.tasks.poll();
            this.active = poll;
            if (poll != null) {
                VAsyncTask.THREAD_POOL_EXECUTOR_2.execute(this.active);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Data {
        private static final Uri sArtworkUri = Uri.parse("content://media/external/audio/albumart");
        public final Uri dataSource;
        public String filePath;
        public boolean isStream = false;
        public long audioId = 0;
        public String trackName = "";
        public String albumName = "";
        public long albumId = 0;
        public String artistName = "";
        public long artistId = -1;
        public int duration = 0;
        public int width = 0;
        public int height = 0;
        public int trackNum = 0;
        public int cdNum = 0;
        public int year = 0;
        public long sizeInBytes = 0;
        public String albumArt = "";

        static boolean isUrlStream(Uri uri) {
            return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
        }

        Data(Uri uri) {
            this.dataSource = uri;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Data) {
                return this.dataSource.equals(((Data) obj).dataSource);
            }
            return false;
        }

        public boolean isArtistKnown() {
            return this.artistId > 0;
        }

        public boolean isAlbumKnown() {
            return this.artistId > 0;
        }

        public boolean isArtistKnownOrSecondName() {
            long j = this.artistId;
            return j > 0 || j == -2;
        }

        public String getAlbumArtPath0Str() {
            String albumArtPath1Str = getAlbumArtPath1Str();
            return (albumArtPath1Str == null || albumArtPath1Str.length() <= 0) ? getAlbumArtPath00Str() : albumArtPath1Str;
        }

        public String getAlbumArtPath00Str() {
            if (this.audioId <= 0) {
                return null;
            }
            return "content://media/external/audio/media/" + this.audioId + "/albumart";
        }

        public String getAlbumArtPath1Str() {
            return this.albumArt;
        }

        public String getAlbumArtGenerateStr() {
            if (!isArtistKnown() || this.artistName.length() <= 1) {
                int indexOf = this.trackName.indexOf(45);
                if (indexOf < 3) {
                    indexOf = this.trackName.indexOf("_-_");
                }
                if (indexOf < 3) {
                    if (this.trackName.indexOf(32) >= 0) {
                        indexOf = this.trackName.indexOf(95);
                    } else {
                        indexOf = this.trackName.indexOf("__");
                    }
                }
                if (indexOf < 3) {
                    return this.trackName;
                }
                if (this.trackName.charAt(indexOf - 1) == ' ') {
                    indexOf--;
                }
                return this.trackName.substring(0, indexOf);
            }
            return this.artistName;
        }

        public int getDurationSeconds() {
            return this.duration / 1000;
        }

        public void finish(ContentResolver contentResolver) {
            this.albumArt = "";
            if (contentResolver == null || !AlbumArtCore.THUMB_FROM_RESOLVER) {
                return;
            }
            Cursor querySafe = MediaStoreUtils.querySafe(contentResolver, MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_art"}, "_id=?", new String[]{String.valueOf(this.albumId)}, null);
            if (querySafe != null && querySafe.moveToFirst()) {
                this.albumArt = querySafe.getString(querySafe.getColumnIndex("album_art"));
            }
            if (querySafe != null) {
                querySafe.close();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class DataDetails {
        public String albumArtist;
        public String albumName;
        public String artistName;
        public int bitRate;
        public int cdNum;
        public String composer;
        public final Data data;
        public int duration;
        public int height;
        public boolean isStream = false;
        public String mimeType;
        public String secondName;
        public String trackName;
        public int trackNum;
        public int width;
        public int year;

        public DataDetails(Data data) {
            this.data = data;
        }

        public int getDuration() {
            return this.data.duration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class AsyncLoadingData {
        public final OnDataReadyListener listener;
        public final Object userData1;
        public final Object userData2;

        public AsyncLoadingData(OnDataReadyListener onDataReadyListener, Object obj, Object obj2) {
            this.listener = onDataReadyListener;
            this.userData1 = obj;
            this.userData2 = obj2;
        }
    }
}
