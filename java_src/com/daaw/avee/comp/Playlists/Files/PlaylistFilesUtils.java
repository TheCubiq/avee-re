package com.daaw.avee.comp.Playlists.Files;

import christophedelory.playlist.Media;
import christophedelory.playlist.Playlist;
import christophedelory.playlist.Sequence;
import christophedelory.playlist.SpecificPlaylist;
import christophedelory.playlist.SpecificPlaylistProvider;
import christophedelory.playlist.m3u.M3U;
import christophedelory.playlist.m3u.M3UProvider;
import christophedelory.playlist.mpcpl.MPCPLProvider;
import christophedelory.playlist.pla.PLAProvider;
import christophedelory.playlist.plp.PLPProvider;
import christophedelory.playlist.pls.PLSProvider;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.Playlists.Files.PlaylistFilesRUtils;
import com.daaw.avee.comp.Playlists.Files.PlaylistFilesWUtils;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mychristophedelory.content.Content;
import mychristophedelory.content.type.ContentType;
import mychristophedelory.logging.LogFactory;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public class PlaylistFilesUtils {
    private static PlaylistFilesUtils instance;
    private final Log logger = LogFactory.getLog(getClass());
    private Iterable<SpecificPlaylistProvider> serviceLoader;

    public PlaylistFilesUtils() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PLAProvider());
        arrayList.add(new PLSProvider());
        arrayList.add(new MPCPLProvider());
        arrayList.add(new PLPProvider());
        arrayList.add(new M3UProvider());
        this.serviceLoader = arrayList;
    }

    public static PlaylistFilesUtils s() {
        if (instance == null) {
            instance = new PlaylistFilesUtils();
        }
        return instance;
    }

    public static String makePlaylistPath(String str, String str2, PlaylistFilesType playlistFilesType) {
        if (str == null || str.length() <= 0) {
            str = "//";
        } else if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        return str + str2 + "." + playlistFilesType.fileExtension;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|14|15|(2:17|18)(2:20|(2:22|23)(1:24))|19) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r8.logger.isTraceEnabled() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        r4 = r8.logger;
        r4.trace("Playlist provider " + r1.getId() + " cannot unmarshal <" + r9 + ">", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r8.logger.isDebugEnabled() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        r4 = r8.logger;
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
    private SpecificPlaylist myReadFrom(URL url) throws IOException {
        Iterator<SpecificPlaylistProvider> it = this.serviceLoader.iterator();
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
            return next.readFrom(inputStream, contentEncoding, this.logger);
        }
        return null;
    }

    private SpecificPlaylistProvider findProviderByExtension(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        SpecificPlaylistProvider specificPlaylistProvider = null;
        for (SpecificPlaylistProvider specificPlaylistProvider2 : this.serviceLoader) {
            ContentType[] contentTypes = specificPlaylistProvider2.getContentTypes();
            int length = contentTypes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (contentTypes[i].matchExtension(lowerCase)) {
                    specificPlaylistProvider = specificPlaylistProvider2;
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

    public List<PlaylistSong> getSongsFromPlaylistFile(String str) {
        URL url;
        File file;
        SpecificPlaylist specificPlaylist;
        ArrayList arrayList = null;
        try {
            url = new URL("file://" + str);
            file = new File(str);
        } catch (MalformedURLException unused) {
        }
        if (PlayerCore.s().getAppContext() == null) {
            return null;
        }
        try {
            specificPlaylist = myReadFrom(url);
        } catch (IOException e) {
            tlog.w(e.getMessage());
            specificPlaylist = null;
        }
        if (specificPlaylist == null) {
            return null;
        }
        arrayList = new ArrayList();
        if (file.exists()) {
            PlaylistFilesRUtils.ReadParameters readParameters = new PlaylistFilesRUtils.ReadParameters();
            try {
                readParameters.playlistPath = file.getCanonicalPath();
            } catch (Exception unused2) {
                readParameters.playlistPath = file.getAbsolutePath();
            }
            PlaylistFilesRUtils.readFromSpecificPlaylist(specificPlaylist, readParameters, arrayList);
        }
        return arrayList;
    }

    public int createPlaylist(StatusMsg statusMsg, String str, PlaylistFilesType playlistFilesType, boolean z) {
        return createPlaylist(statusMsg, str, playlistFilesType, null, z);
    }

    public int createPlaylist(StatusMsg statusMsg, String str, PlaylistFilesType playlistFilesType, List<String> list, boolean z) {
        return addDataSourceToPlaylistFile(statusMsg, str, list, true, z);
    }

    public int addDataSourceToPlaylistFile(StatusMsg statusMsg, String str, List<String> list, boolean z, boolean z2) {
        return addToPlaylistFile(statusMsg, str, PlaylistSong.makeSongListFromDataSourceList(list), z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int addToPlaylistFile(StatusMsg statusMsg, String str, List<PlaylistSong> list, boolean z, boolean z2) {
        URL url;
        SpecificPlaylist specificPlaylist;
        SpecificPlaylistProvider specificPlaylistProvider;
        try {
            if (str.startsWith("file:")) {
                url = new URL(str);
            } else {
                url = new URL("file://" + str);
            }
            File file = new File(str);
            if (file.exists()) {
                try {
                    specificPlaylist = myReadFrom(url);
                    try {
                        specificPlaylistProvider = specificPlaylist.getProvider();
                        try {
                            if (specificPlaylist instanceof M3U) {
                                ((M3U) specificPlaylist).setExtensionM3U(true);
                            }
                            if (z) {
                                try {
                                    specificPlaylist = specificPlaylistProvider.toSpecificPlaylist(new Playlist());
                                } catch (Exception e) {
                                    tlog.w(e.getMessage());
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            tlog.w(e.getMessage());
                            if (specificPlaylist != null) {
                            }
                            if (z) {
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        specificPlaylistProvider = null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    specificPlaylist = null;
                    specificPlaylistProvider = null;
                }
                if (specificPlaylist != null || specificPlaylistProvider == null) {
                    if (z) {
                        return 0;
                    }
                    try {
                        specificPlaylist = findProviderByExtension(str).toSpecificPlaylist(new Playlist());
                    } catch (Exception e5) {
                        tlog.w(e5.getMessage());
                    }
                }
            } else {
                try {
                    specificPlaylist = findProviderByExtension(str).toSpecificPlaylist(new Playlist());
                } catch (Exception e6) {
                    tlog.w(e6.getMessage());
                    specificPlaylist = null;
                }
            }
            if (specificPlaylist == null) {
                tlog.w("error specificPlaylist is null");
                statusMsg.addCriticalError("Error specificPlaylist is null");
                return 0;
            }
            PlaylistFilesWUtils.AppendParameters appendParameters = new PlaylistFilesWUtils.AppendParameters();
            appendParameters.writeRelativePaths = z2;
            try {
                appendParameters.playlistPath = file.getCanonicalPath();
            } catch (Exception unused) {
                appendParameters.playlistPath = file.getAbsolutePath();
            }
            int appendToSpecificPlaylist = PlaylistFilesWUtils.appendToSpecificPlaylist(specificPlaylist, appendParameters, list);
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    specificPlaylist.writeTo(fileOutputStream, null);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e7) {
                    tlog.w("outputSpecificPlaylist.writeTo: " + e7.getMessage());
                    statusMsg.addCriticalErrorException("OutputSpecificPlaylist", e7);
                }
                return appendToSpecificPlaylist;
            } catch (Exception e8) {
                statusMsg.addCriticalErrorException("File Output", e8);
                return 0;
            }
        } catch (MalformedURLException unused2) {
            statusMsg.addCriticalError("MalformedURLException");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void lizzyAddToPlaylistAsFile(Sequence sequence, File file, boolean z, File file2, boolean z2) throws IOException {
        File[] listFiles;
        int i = 0;
        if (file.isDirectory()) {
            if (!z || (listFiles = file.listFiles()) == null) {
                return;
            }
            int length = listFiles.length;
            while (i < length) {
                lizzyAddToPlaylistAsFile(sequence, listFiles[i], z2, file2, z2);
                i++;
            }
        } else if (!file.isFile()) {
        } else {
            String path = file.getPath();
            if (file2 != null) {
                File canonicalFile = file.getCanonicalFile();
                if (!canonicalFile.equals(file2)) {
                    File parentFile = canonicalFile.getParentFile();
                    File parentFile2 = file2.getParentFile();
                    if (parentFile.equals(parentFile2)) {
                        path = file.getName();
                    } else {
                        StringBuilder sb = new StringBuilder(file.getName());
                        File parentFile3 = parentFile.getParentFile();
                        while (true) {
                            File file3 = parentFile;
                            parentFile = parentFile3;
                            if (parentFile == null) {
                                break;
                            }
                            sb.insert(0, '/');
                            String name = file3.getName();
                            if (!"/".equals(name) && !"\\".equals(name)) {
                                sb.insert(0, name);
                            }
                            if (parentFile.equals(parentFile2)) {
                                path = sb.toString();
                                break;
                            }
                            parentFile3 = parentFile.getParentFile();
                        }
                    }
                }
                if (i == 0) {
                    Media media = new Media();
                    media.setSource(new Content(path));
                    sequence.addComponent(media);
                    return;
                }
                return;
            }
            i = 1;
            if (i == 0) {
            }
        }
    }
}
