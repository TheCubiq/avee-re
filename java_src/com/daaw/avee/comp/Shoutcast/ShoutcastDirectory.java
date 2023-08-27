package com.daaw.avee.comp.Shoutcast;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Action2;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.Func.Func2;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.TaskLimiter;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.VAsyncTaskResultConvert;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.IceCast.DownloadTask;
import com.daaw.avee.comp.IceCast.GenreDesc;
import com.daaw.avee.comp.IceCast.StationDesc;
import com.daaw.avee.comp.Playlists.Files.PlaylistFilesUtils;
import com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class ShoutcastDirectory<T, V extends List<T>, G, GList extends List<G>> {
    private static final int cachedMaxFileAgeMinutes = 720;
    private static final Object createInstanceLock = new Object();
    private static volatile WeakReference<ShoutcastDirectory> instanceWeak = new WeakReference<>(null);
    private static long lastTimeRefresh = 0;
    final String tempFilePrefix;
    final ShoutcastYpXmlParser<G, GList, T, V> xmlGenresPriParser;
    TaskLimiter downloadTaskLimiter = new TaskLimiter();
    Func<V> listFactory = this.listFactory;
    Func<V> listFactory = this.listFactory;
    String directoryUrl = "";

    /* loaded from: classes.dex */
    public interface GenresReceivedListener {
        void onStationsReceived(List<GenreDesc> list, Object obj);
    }

    /* loaded from: classes.dex */
    public interface StationsReceivedListener {
        void onStationsReceived(List<StationDesc> list, Object obj);
    }

    public static <T, V extends List<T>, G, GList extends List<G>> ShoutcastDirectory<T, V, G, GList> createInstance(String str, ShoutcastYpXmlParser.EntryFactory<G> entryFactory, Func1<G, GList> func1, ShoutcastYpXmlParser.EntryFactoryStation<T> entryFactoryStation, Func<V> func) {
        ShoutcastDirectory<T, V, G, GList> shoutcastDirectory;
        ShoutcastDirectory<T, V, G, GList> shoutcastDirectory2 = instanceWeak.get();
        if (shoutcastDirectory2 != null) {
            return shoutcastDirectory2;
        }
        synchronized (createInstanceLock) {
            shoutcastDirectory = instanceWeak.get();
            if (shoutcastDirectory == null) {
                shoutcastDirectory = new ShoutcastDirectory<>(str, entryFactory, func1, entryFactoryStation, func);
                instanceWeak = new WeakReference<>(shoutcastDirectory);
            }
        }
        return shoutcastDirectory;
    }

    public ShoutcastDirectory(String str, ShoutcastYpXmlParser.EntryFactory<G> entryFactory, Func1<G, GList> func1, ShoutcastYpXmlParser.EntryFactoryStation<T> entryFactoryStation, Func<V> func) {
        this.xmlGenresPriParser = new ShoutcastYpXmlParser<>(entryFactory, func1, entryFactoryStation, func);
        this.tempFilePrefix = str;
    }

    public VAsyncTask<List<PlaylistSong>> tuneInStation(String str, String str2) {
        return ShoutcastUtils.parseXmlResponse("http://yp.shoutcast.com/" + str + "?id=" + str2, this.tempFilePrefix + "_station_" + str2, new Func2<File, Boolean[], List<PlaylistSong>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.1
            @Override // com.daaw.avee.Common.Func.Func2
            public List<PlaylistSong> Invoke(File file, Boolean[] boolArr) {
                List<PlaylistSong> songsFromPlaylistFile = PlaylistFilesUtils.s().getSongsFromPlaylistFile(file.getAbsolutePath());
                boolArr[0] = Boolean.valueOf(songsFromPlaylistFile != null && songsFromPlaylistFile.size() > 0);
                return songsFromPlaylistFile;
            }
        }, cachedMaxFileAgeMinutes);
    }

    public IVAsyncTask<String> getGenreName(String str, String str2, Func1<Tuple2<List<G>, StatusMsg>, String> func1) {
        VAsyncTask<Tuple2<List<G>, StatusMsg>> genresPrimary;
        if (str.length() == 0 || str.equals("-1")) {
            genresPrimary = getGenresPrimary();
        } else {
            genresPrimary = getGenresSecondary(str);
        }
        return new VAsyncTaskResultConvert(genresPrimary, func1);
    }

    public VAsyncTask<Tuple2<List<G>, StatusMsg>> getGenresPrimary() {
        return ShoutcastUtils.parseXmlResponse("http://api.shoutcast.com/genre/primary?k=" + ShoutcastUtils.getdkey() + "&f=xml", this.tempFilePrefix + "_genres_pri", new Func2<File, Boolean[], Tuple2<List<G>, StatusMsg>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.2
            @Override // com.daaw.avee.Common.Func.Func2
            public Tuple2<List<G>, StatusMsg> Invoke(File file, Boolean[] boolArr) {
                FileInputStream fileInputStream;
                GList glist = null;
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException unused) {
                    fileInputStream = null;
                }
                StatusMsg statusMsg = new StatusMsg();
                if (fileInputStream == null) {
                    statusMsg.addCriticalError("Network error");
                    return new Tuple2<>(null, statusMsg);
                }
                try {
                    glist = ShoutcastDirectory.this.xmlGenresPriParser.parsePrimary(fileInputStream, statusMsg);
                } catch (IOException e) {
                    statusMsg.addCriticalErrorException("io", e);
                } catch (XmlPullParserException e2) {
                    statusMsg.addCriticalErrorException("xml parser", e2);
                }
                boolArr[0] = Boolean.valueOf(glist != null && glist.size() > 0);
                return new Tuple2<>(glist, statusMsg);
            }
        }, cachedMaxFileAgeMinutes);
    }

    public VAsyncTask<Tuple2<List<G>, StatusMsg>> getGenres(String str) {
        return ShoutcastUtils.parseXmlResponse("http://api.shoutcast.com/genre/secondary?parentid=0&k=" + ShoutcastUtils.getdkey() + "&f=xml", this.tempFilePrefix + "_genres_sec_0", new Func2<File, Boolean[], Tuple2<List<G>, StatusMsg>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.3
            @Override // com.daaw.avee.Common.Func.Func2
            public Tuple2<List<G>, StatusMsg> Invoke(File file, Boolean[] boolArr) {
                FileInputStream fileInputStream;
                GList glist = null;
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException unused) {
                    fileInputStream = null;
                }
                StatusMsg statusMsg = new StatusMsg();
                if (fileInputStream == null) {
                    statusMsg.addCriticalError("Network error");
                    return new Tuple2<>(null, statusMsg);
                }
                try {
                    glist = ShoutcastDirectory.this.xmlGenresPriParser.parseSecondary(fileInputStream, statusMsg);
                } catch (IOException e) {
                    statusMsg.addCriticalErrorException("io", e);
                } catch (XmlPullParserException e2) {
                    statusMsg.addCriticalErrorException("xml parser", e2);
                }
                boolArr[0] = Boolean.valueOf(glist != null && glist.size() > 0);
                return new Tuple2<>(glist, statusMsg);
            }
        }, cachedMaxFileAgeMinutes);
    }

    public VAsyncTask<Tuple2<List<G>, StatusMsg>> getGenresSecondary(String str) {
        return ShoutcastUtils.parseXmlResponse("http://api.shoutcast.com/genre/secondary?parentid=" + str + "&k=" + ShoutcastUtils.getdkey() + "&f=xml", this.tempFilePrefix + "_genres_sec_" + str, new Func2<File, Boolean[], Tuple2<List<G>, StatusMsg>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.4
            @Override // com.daaw.avee.Common.Func.Func2
            public Tuple2<List<G>, StatusMsg> Invoke(File file, Boolean[] boolArr) {
                FileInputStream fileInputStream;
                GList glist = null;
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException unused) {
                    fileInputStream = null;
                }
                StatusMsg statusMsg = new StatusMsg();
                if (fileInputStream == null) {
                    statusMsg.addCriticalError("Network error");
                    return new Tuple2<>(null, statusMsg);
                }
                try {
                    glist = ShoutcastDirectory.this.xmlGenresPriParser.parseSecondary(fileInputStream, statusMsg);
                } catch (IOException e) {
                    statusMsg.addCriticalErrorException("io", e);
                } catch (XmlPullParserException e2) {
                    statusMsg.addCriticalErrorException("xml parser", e2);
                }
                boolArr[0] = Boolean.valueOf(glist != null && glist.size() > 0);
                return new Tuple2<>(glist, statusMsg);
            }
        }, cachedMaxFileAgeMinutes);
    }

    public VAsyncTask<Tuple2<V, StatusMsg>> getStations(String str) {
        return ShoutcastUtils.parseXmlResponse("http://api.shoutcast.com/station/advancedsearch?genre_id=" + str + "&limit=" + ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION + "&f=xml&k=" + ShoutcastUtils.getdkey(), this.tempFilePrefix + "_stations_" + str, new Func2<File, Boolean[], Tuple2<V, StatusMsg>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.5
            @Override // com.daaw.avee.Common.Func.Func2
            public Tuple2<V, StatusMsg> Invoke(File file, Boolean[] boolArr) {
                FileInputStream fileInputStream;
                V v = null;
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (IOException unused) {
                    fileInputStream = null;
                }
                StatusMsg statusMsg = new StatusMsg();
                if (fileInputStream == null) {
                    statusMsg.addCriticalError("Network error");
                    return new Tuple2<>(null, statusMsg);
                }
                try {
                    v = ShoutcastDirectory.this.xmlGenresPriParser.parseStations(fileInputStream, statusMsg);
                } catch (IOException e) {
                    statusMsg.addCriticalErrorException("io", e);
                } catch (XmlPullParserException e2) {
                    statusMsg.addCriticalErrorException("xml parser", e2);
                }
                boolArr[0] = Boolean.valueOf(v != null && v.size() > 0);
                return new Tuple2<>(v, statusMsg);
            }
        }, cachedMaxFileAgeMinutes);
    }

    private void downloadResponseToFile(TaskLimiter taskLimiter, String str, final String str2, final Action2<String, Boolean> action2) {
        final Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return;
        }
        new DownloadTask(appContext, new DownloadTask.CreateFileFactory() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.6
            @Override // com.daaw.avee.comp.IceCast.DownloadTask.CreateFileFactory
            public FileOutputStream CreateFile() throws IOException {
                return new FileOutputStream(new File(appContext.getCacheDir(), str2));
            }
        }, new DownloadTask.OnPostExecute() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.7
            @Override // com.daaw.avee.comp.IceCast.DownloadTask.OnPostExecute
            public void onPostExecute(String str3) {
                boolean z = str3 != null && str3.length() > 0;
                Action2 action22 = action2;
                if (action22 != null) {
                    action22.onInvoke(str3, Boolean.valueOf(z));
                }
            }
        }).execute(str);
    }

    public void Refresh(final Action1<String> action1, long j) {
        final Context appContext;
        if (Utils.tickCount() - lastTimeRefresh >= j && (appContext = PlayerCore.s().getAppContext()) != null) {
            new DownloadTask(appContext, new DownloadTask.CreateFileFactory() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.8
                @Override // com.daaw.avee.comp.IceCast.DownloadTask.CreateFileFactory
                public FileOutputStream CreateFile() throws IOException {
                    return new FileOutputStream(new File(appContext.getCacheDir(), ShoutcastDirectory.this.tempFilePrefix));
                }
            }, new DownloadTask.OnPostExecute() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastDirectory.9
                @Override // com.daaw.avee.comp.IceCast.DownloadTask.OnPostExecute
                public void onPostExecute(String str) {
                    if (!(str != null && str.length() > 0)) {
                        long unused = ShoutcastDirectory.lastTimeRefresh = Utils.tickCount();
                    }
                    Action1 action12 = action1;
                    if (action12 != null) {
                        action12.onInvoke(str);
                    }
                }
            }).execute(this.directoryUrl);
        }
    }
}
