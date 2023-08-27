package christophedelory.playlist;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
import mychristophedelory.content.type.ContentType;
import mychristophedelory.logging.LogFactory;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public final class SpecificPlaylistFactory {
    private static SpecificPlaylistFactory _instance;
    private final Log _logger = LogFactory.getLog(getClass());
    private final ServiceLoader<SpecificPlaylistProvider> _serviceLoader = ServiceLoader.load(SpecificPlaylistProvider.class);

    public static SpecificPlaylistFactory getInstance() {
        synchronized (SpecificPlaylistFactory.class) {
            if (_instance == null) {
                _instance = new SpecificPlaylistFactory();
            }
        }
        return _instance;
    }

    private SpecificPlaylistFactory() {
    }

    public void reloadProviders() {
        this._serviceLoader.reload();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|14|15|(2:17|18)(2:20|(2:22|23)(1:24))|19) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r8._logger.isTraceEnabled() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        r4 = r8._logger;
        r4.trace("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r8._logger.isDebugEnabled() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        r4 = r8._logger;
        r4.debug("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
        r9 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpecificPlaylist readFrom(URL url) throws IOException {
        Iterator<SpecificPlaylistProvider> it = this._serviceLoader.iterator();
        while (it.hasNext()) {
            SpecificPlaylistProvider next = it.next();
            URLConnection openConnection = url.openConnection();
            openConnection.setAllowUserInteraction(false);
            openConnection.setConnectTimeout(10000);
            openConnection.setDoInput(true);
            openConnection.setDoOutput(false);
            openConnection.setReadTimeout(60000);
            openConnection.setUseCaches(true);
            openConnection.connect();
            String contentEncoding = openConnection.getContentEncoding();
            InputStream inputStream = openConnection.getInputStream();
            return next.readFrom(inputStream, contentEncoding, this._logger);
        }
        return null;
    }

    public SpecificPlaylist readFrom(File file) throws IOException {
        return readFrom(file.toURI().toURL());
    }

    public SpecificPlaylistProvider findProviderById(String str) {
        Iterator<SpecificPlaylistProvider> it = this._serviceLoader.iterator();
        while (it.hasNext()) {
            SpecificPlaylistProvider next = it.next();
            if (str.equalsIgnoreCase(next.getId())) {
                return next;
            }
        }
        return null;
    }

    public SpecificPlaylistProvider findProviderByExtension(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        Iterator<SpecificPlaylistProvider> it = this._serviceLoader.iterator();
        SpecificPlaylistProvider specificPlaylistProvider = null;
        while (it.hasNext()) {
            SpecificPlaylistProvider next = it.next();
            ContentType[] contentTypes = next.getContentTypes();
            int length = contentTypes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (contentTypes[i].matchExtension(lowerCase)) {
                    specificPlaylistProvider = next;
                    continue;
                    break;
                } else {
                    i++;
                }
            }
            if (specificPlaylistProvider != null) {
                break;
            }
        }
        return specificPlaylistProvider;
    }

    public List<SpecificPlaylistProvider> getProviders() {
        ArrayList arrayList = new ArrayList();
        Iterator<SpecificPlaylistProvider> it = this._serviceLoader.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
