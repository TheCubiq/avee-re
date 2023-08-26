package com.daaw.avee.comp.IceCast;

import android.content.Context;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Func.Func2;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.IceCast.DownloadTask;
import com.daaw.avee.comp.IceCast.XiphYpXmlParser;
import com.daaw.avee.comp.Shoutcast.ShoutcastUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class IceCastDirectory<T, V extends List<T>> {
    private static final int cachedMaxFileAgeMinutes = 720;
    private static long lastTimeRefresh;
    String directoryUrl;
    Func<V> listFactory;
    final String tempFilePrefix;
    XiphYpXmlParser<T, V> xmlParser;

    /* loaded from: classes.dex */
    public interface GenresReceivedListener {
        void onStationsReceived(List<GenreDesc> list, Object obj);
    }

    /* loaded from: classes.dex */
    public interface StationsReceivedListener {
        void onStationsReceived(List<StationDesc> list, Object obj);
    }

    public IceCastDirectory(String str, String str2, XiphYpXmlParser.EntryFactory<T> entryFactory, Func<V> func) {
        this.xmlParser = new XiphYpXmlParser<>(entryFactory, func);
        this.listFactory = func;
        this.directoryUrl = str;
        this.tempFilePrefix = str2;
    }

    public VAsyncTask<Tuple2<V, StatusMsg>> getStations() {
        return ShoutcastUtils.parseXmlResponse(this.directoryUrl, this.tempFilePrefix, new Func2<File, Boolean[], Tuple2<V, StatusMsg>>() { // from class: com.daaw.avee.comp.IceCast.IceCastDirectory.1
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
                    v = IceCastDirectory.this.xmlParser.parse(fileInputStream, statusMsg);
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

    public void Refresh(final Action1<String> action1, long j) {
        final Context appContext;
        if (Utils.tickCount() - lastTimeRefresh >= j && (appContext = PlayerCore.s().getAppContext()) != null) {
            new DownloadTask(appContext, new DownloadTask.CreateFileFactory() { // from class: com.daaw.avee.comp.IceCast.IceCastDirectory.2
                @Override // com.daaw.avee.comp.IceCast.DownloadTask.CreateFileFactory
                public FileOutputStream CreateFile() throws IOException {
                    return new FileOutputStream(new File(appContext.getCacheDir(), IceCastDirectory.this.tempFilePrefix));
                }
            }, new DownloadTask.OnPostExecute() { // from class: com.daaw.avee.comp.IceCast.IceCastDirectory.3
                @Override // com.daaw.avee.comp.IceCast.DownloadTask.OnPostExecute
                public void onPostExecute(String str) {
                    if (!(str != null && str.length() > 0)) {
                        long unused = IceCastDirectory.lastTimeRefresh = Utils.tickCount();
                    }
                    Action1 action12 = action1;
                    if (action12 != null) {
                        action12.onInvoke(str);
                    }
                }
            }).execute(this.directoryUrl);
        }
    }

    public VAsyncTask<V> getCachedEntries() {
        final Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return new VAsyncTask<>(new VAsyncTask.TaskListener<V>() { // from class: com.daaw.avee.comp.IceCast.IceCastDirectory.4
                @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
                public V onExecuteInBg(VAsyncTask<V> vAsyncTask) {
                    return null;
                }

                @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
                public /* bridge */ /* synthetic */ Object onExecuteInBg(VAsyncTask vAsyncTask) {
                    return onExecuteInBg((VAsyncTask<List>) vAsyncTask);
                }
            });
        }
        return new VAsyncTask<>(new VAsyncTask.TaskListener<V>() { // from class: com.daaw.avee.comp.IceCast.IceCastDirectory.5
            @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
            public /* bridge */ /* synthetic */ Object onExecuteInBg(VAsyncTask vAsyncTask) {
                return onExecuteInBg((VAsyncTask<List>) vAsyncTask);
            }

            @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
            public V onExecuteInBg(VAsyncTask<V> vAsyncTask) {
                return (V) IceCastDirectory.this.loadDataFromFile(new File(appContext.getCacheDir(), IceCastDirectory.this.tempFilePrefix));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V loadDataFromFile(File file) {
        try {
            return this.xmlParser.parse(new FileInputStream(file), null);
        } catch (IOException | XmlPullParserException unused) {
            return this.listFactory.onInvoke();
        }
    }
}
