package com.daaw.avee.comp.Shoutcast;

import android.content.Context;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.Func.Func2;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.VAsyncTaskResultConvert;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.IceCast.DownloadTask;
import com.daaw.avee.comp.IceCast.GenreDesc;
import com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ShoutcastUtils {
    public static <J> VAsyncTask<J> parseXmlResponse(final String str, final String str2, final Func2<File, Boolean[], J> func2, int i) {
        final Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return new VAsyncTask<>(new VAsyncTask.TaskListener<J>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.1
                @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
                public J onExecuteInBg(VAsyncTask<J> vAsyncTask) {
                    return null;
                }
            });
        }
        final long j = i * 60 * 1000;
        return new VAsyncTask<>(new VAsyncTask.TaskListener<J>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.2
            @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
            public J onExecuteInBg(final VAsyncTask<J> vAsyncTask) {
                Boolean[] boolArr = {false};
                File file = new File(appContext.getCacheDir(), str2);
                if (file.lastModified() + j > System.currentTimeMillis()) {
                    J j2 = (J) func2.Invoke(file, boolArr);
                    if (boolArr[0].booleanValue()) {
                        tlog.d("returning cached file");
                        return j2;
                    }
                }
                DownloadTask.downloadResponseFile(str, new DownloadTask.CreateFileFactory() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.2.1
                    @Override // com.daaw.avee.comp.IceCast.DownloadTask.CreateFileFactory
                    public FileOutputStream CreateFile() throws IOException {
                        return new FileOutputStream(new File(appContext.getCacheDir(), str2));
                    }
                }, new Func<Boolean>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.2.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.daaw.avee.Common.Func.Func
                    public Boolean onInvoke() {
                        return Boolean.valueOf(vAsyncTask.isCancelled());
                    }
                }, null);
                return (J) func2.Invoke(new File(appContext.getCacheDir(), str2), boolArr);
            }
        });
    }

    public static ShoutcastDirectory<Tuple2<PlaylistSong, ShoutcastStationEntry>, MultiList<PlaylistSong, ShoutcastStationEntry>, GenreDesc, List<GenreDesc>> getShoutcastDirectory() {
        return ShoutcastDirectory.createInstance("shoutcast_com_yp", new ShoutcastYpXmlParser.EntryFactory<GenreDesc>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.EntryFactory
            public GenreDesc createEntry(String str, String str2) {
                return new GenreDesc(str, str2);
            }
        }, new Func1<GenreDesc, List<GenreDesc>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.4
            @Override // com.daaw.avee.Common.Func.Func1
            public List<GenreDesc> onInvoke(GenreDesc genreDesc) {
                if (genreDesc != null) {
                    return genreDesc.getChildren();
                }
                return new ArrayList();
            }
        }, new ShoutcastYpXmlParser.EntryFactoryStation<Tuple2<PlaylistSong, ShoutcastStationEntry>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.comp.Shoutcast.ShoutcastYpXmlParser.EntryFactoryStation
            public Tuple2<PlaylistSong, ShoutcastStationEntry> createEntry(String str, String str2, int i, String str3, String str4, String[] strArr) {
                return new Tuple2<>(null, new ShoutcastStationEntry(str, str2, i, str3, str4, strArr));
            }
        }, new MultiList.Factory());
    }

    public static IVAsyncTask<String> getGenreName(String str, final String str2) {
        return getShoutcastDirectory().getGenreName(str, str2, new Func1<Tuple2<List<GenreDesc>, StatusMsg>, String>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.6
            @Override // com.daaw.avee.Common.Func.Func1
            public String onInvoke(Tuple2<List<GenreDesc>, StatusMsg> tuple2) {
                if (str2 == null || tuple2.obj1 == null) {
                    return null;
                }
                int size = tuple2.obj1.size();
                for (int i = 0; i < size; i++) {
                    GenreDesc genreDesc = tuple2.obj1.get(i);
                    if (str2.equals(genreDesc.id)) {
                        return genreDesc.name;
                    }
                }
                return null;
            }
        });
    }

    public static IVAsyncTask<String> getGenreName2(String str, final String str2) {
        return new VAsyncTaskResultConvert(getShoutcastDirectory().getGenresSecondary("0"), new Func1<Tuple2<List<GenreDesc>, StatusMsg>, String>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.7
            @Override // com.daaw.avee.Common.Func.Func1
            public String onInvoke(Tuple2<List<GenreDesc>, StatusMsg> tuple2) {
                if (str2 == null || tuple2.obj1 == null) {
                    return null;
                }
                GenreDesc findGenreByIdFromAllGenres = ShoutcastUtils.findGenreByIdFromAllGenres(str2, tuple2.obj1);
                return findGenreByIdFromAllGenres != null ? findGenreByIdFromAllGenres.name : ".....";
            }
        });
    }

    public static GenreDesc findGenreByIdFromAllGenres(String str, List<GenreDesc> list) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).id)) {
                    return list.get(i);
                }
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                GenreDesc findGenreByIdFromAllGenres = findGenreByIdFromAllGenres(str, list.get(i2).getChildren());
                if (findGenreByIdFromAllGenres != null) {
                    return findGenreByIdFromAllGenres;
                }
            }
        }
        return null;
    }

    public static List<GenreDesc> findGenreChildren(String str, List<GenreDesc> list) {
        if (list == null) {
            return null;
        }
        if (str != null && str.length() != 0 && !str.equals("0")) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(list.get(i).id)) {
                    return list.get(i).getChildren();
                }
            }
        }
        return list;
    }

    public static IVAsyncTask<Tuple2<List<GenreDesc>, StatusMsg>> getGenreChildren(final String str) {
        return new VAsyncTaskResultConvert(getShoutcastDirectory().getGenresSecondary("0"), new Func1<Tuple2<List<GenreDesc>, StatusMsg>, Tuple2<List<GenreDesc>, StatusMsg>>() { // from class: com.daaw.avee.comp.Shoutcast.ShoutcastUtils.8
            @Override // com.daaw.avee.Common.Func.Func1
            public Tuple2<List<GenreDesc>, StatusMsg> onInvoke(Tuple2<List<GenreDesc>, StatusMsg> tuple2) {
                List findGenreChildren = ShoutcastUtils.findGenreChildren(str, tuple2.obj1);
                if (findGenreChildren == null || findGenreChildren.size() == 0) {
                    findGenreChildren = new ArrayList();
                    GenreDesc findGenreByIdFromAllGenres = ShoutcastUtils.findGenreByIdFromAllGenres(str, tuple2.obj1);
                    if (findGenreByIdFromAllGenres != null) {
                        findGenreChildren.add(findGenreByIdFromAllGenres);
                    }
                }
                return new Tuple2<>(findGenreChildren, tuple2.obj2);
            }
        });
    }

    public static String getdkey() {
        return Crave.decry("zC0wX0Pwb5nJy7o2");
    }
}
