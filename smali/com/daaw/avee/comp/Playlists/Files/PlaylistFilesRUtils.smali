.class public Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;
.super Ljava/lang/Object;
.source "PlaylistFilesRUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static makePlaylistSong(JLjava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 1

    .line 117
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iget-object p3, p3, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;->playlistPath:Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(JLjava/lang/String;)V

    return-object v0
.end method

.method static makePlaylistSong(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 7

    .line 121
    new-instance v6, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iget-object p5, p5, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;->playlistPath:Ljava/lang/String;

    invoke-static {p2, p5}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v0, v6

    move-wide v1, p0

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method static makeSongPath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "/"

    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPathAbsolute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "\\"

    .line 128
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPathAbsolute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, ".."

    .line 131
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 132
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPathRelative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 133
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPathAbsolute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0

    :cond_3
    const-string v0, ":"

    .line 137
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 138
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPathAbsolute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 141
    :cond_4
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPathRelative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    .line 142
    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makeSongPathAbsolute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v0
.end method

.method static makeSongPathAbsolute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method static makeSongPathRelative(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 147
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_0

    .line 149
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    .line 154
    :cond_0
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 156
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 158
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 160
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method static readFromSpecificPlaylist(Lchristophedelory/playlist/SpecificPlaylist;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/SpecificPlaylist;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 23
    :cond_0
    instance-of v1, p0, Lchristophedelory/playlist/pla/PLA;

    if-eqz v1, :cond_1

    .line 24
    check-cast p0, Lchristophedelory/playlist/pla/PLA;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->readFromSpecificPlaylist(Lchristophedelory/playlist/pla/PLA;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 27
    :cond_1
    instance-of v1, p0, Lchristophedelory/playlist/kpl/Xml;

    if-eqz v1, :cond_2

    .line 28
    check-cast p0, Lchristophedelory/playlist/kpl/Xml;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->readFromSpecificPlaylist(Lchristophedelory/playlist/kpl/Xml;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 31
    :cond_2
    instance-of v1, p0, Lchristophedelory/playlist/pls/PLS;

    if-eqz v1, :cond_3

    .line 32
    check-cast p0, Lchristophedelory/playlist/pls/PLS;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->readFromSpecificPlaylist(Lchristophedelory/playlist/pls/PLS;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 35
    :cond_3
    instance-of v1, p0, Lchristophedelory/playlist/mpcpl/MPCPL;

    if-eqz v1, :cond_4

    .line 36
    check-cast p0, Lchristophedelory/playlist/mpcpl/MPCPL;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->readFromSpecificPlaylist(Lchristophedelory/playlist/mpcpl/MPCPL;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 39
    :cond_4
    instance-of v1, p0, Lchristophedelory/playlist/plp/PLP;

    if-eqz v1, :cond_5

    .line 40
    check-cast p0, Lchristophedelory/playlist/plp/PLP;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->readFromSpecificPlaylist(Lchristophedelory/playlist/plp/PLP;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I

    move-result p0

    return p0

    .line 43
    :cond_5
    instance-of v1, p0, Lchristophedelory/playlist/m3u/M3U;

    if-eqz v1, :cond_6

    .line 44
    check-cast p0, Lchristophedelory/playlist/m3u/M3U;

    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->readFromSpecificPlaylist(Lchristophedelory/playlist/m3u/M3U;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I

    move-result p0

    return p0

    :cond_6
    return v0
.end method

.method static readFromSpecificPlaylist(Lchristophedelory/playlist/kpl/Xml;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/kpl/Xml;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 65
    invoke-virtual {p0}, Lchristophedelory/playlist/kpl/Xml;->getEntries()Ljava/util/List;

    move-result-object p0

    .line 67
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/kpl/Entry;

    const-wide/16 v2, -0x1

    .line 68
    invoke-virtual {v1}, Lchristophedelory/playlist/kpl/Entry;->getFilename()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makePlaylistSong(JLjava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 71
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static readFromSpecificPlaylist(Lchristophedelory/playlist/m3u/M3U;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/m3u/M3U;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x1

    .line 105
    invoke-virtual {p0, v0}, Lchristophedelory/playlist/m3u/M3U;->setExtensionM3U(Z)V

    .line 107
    invoke-virtual {p0}, Lchristophedelory/playlist/m3u/M3U;->getResources()Ljava/util/List;

    move-result-object p0

    .line 109
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/m3u/Resource;

    const-wide/16 v2, -0x1

    .line 110
    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makePlaylistSong(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 113
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static readFromSpecificPlaylist(Lchristophedelory/playlist/mpcpl/MPCPL;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/mpcpl/MPCPL;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 85
    invoke-virtual {p0}, Lchristophedelory/playlist/mpcpl/MPCPL;->getResources()Ljava/util/List;

    move-result-object p0

    .line 87
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/mpcpl/Resource;

    const-wide/16 v2, -0x1

    .line 88
    invoke-virtual {v1}, Lchristophedelory/playlist/mpcpl/Resource;->getFilename()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1}, Lchristophedelory/playlist/mpcpl/Resource;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makePlaylistSong(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 91
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static readFromSpecificPlaylist(Lchristophedelory/playlist/pla/PLA;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/pla/PLA;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 52
    invoke-virtual {p0}, Lchristophedelory/playlist/pla/PLA;->getFilenames()Ljava/util/List;

    move-result-object p0

    .line 54
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 56
    invoke-static {v1}, Lcom/daaw/avee/Common/Utils;->fixIncludedNullTerminatorString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, -0x1

    .line 57
    invoke-static {v2, v3, v1, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makePlaylistSong(JLjava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 60
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static readFromSpecificPlaylist(Lchristophedelory/playlist/plp/PLP;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/plp/PLP;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 95
    invoke-virtual {p0}, Lchristophedelory/playlist/plp/PLP;->getFilenames()Ljava/util/List;

    move-result-object p0

    .line 97
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-wide/16 v2, -0x1

    .line 98
    invoke-static {v2, v3, v1, p1}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makePlaylistSong(JLjava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 101
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static readFromSpecificPlaylist(Lchristophedelory/playlist/pls/PLS;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lchristophedelory/playlist/pls/PLS;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)I"
        }
    .end annotation

    .line 75
    invoke-virtual {p0}, Lchristophedelory/playlist/pls/PLS;->getResources()Ljava/util/List;

    move-result-object p0

    .line 77
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lchristophedelory/playlist/m3u/Resource;

    const-wide/16 v2, -0x1

    .line 78
    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getLocation()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lchristophedelory/playlist/m3u/Resource;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils;->makePlaylistSong(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesRUtils$ReadParameters;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method
