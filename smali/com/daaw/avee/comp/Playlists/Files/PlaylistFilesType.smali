.class public Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;
.super Ljava/lang/Object;
.source "PlaylistFilesType.java"


# static fields
.field public static playlistFilesTypes:[Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;


# instance fields
.field public final fileExtension:Ljava/lang/String;

.field public final name:Ljava/lang/String;

.field public final supportSaving:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x6

    new-array v1, v0, [Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    .line 9
    new-instance v2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    const/4 v3, 0x1

    const-string v4, "PLA Playlist"

    const-string v5, "pla"

    invoke-direct {v2, v4, v3, v5, v3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    const/4 v4, 0x0

    aput-object v2, v1, v4

    new-instance v2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    const/4 v4, 0x3

    const-string v5, "PLS Playlist"

    const-string v6, "pls"

    invoke-direct {v2, v5, v4, v6, v3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    const/4 v5, 0x4

    const-string v6, "MPCPL Playlist"

    const-string v7, "mpcpl"

    invoke-direct {v2, v6, v5, v7, v3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    const/4 v6, 0x2

    aput-object v2, v1, v6

    new-instance v2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    const/4 v6, 0x5

    const-string v7, "PLP Playlist"

    const-string v8, "plp"

    invoke-direct {v2, v7, v6, v8, v3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v2, v1, v4

    new-instance v2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    const-string v4, "M3U Playlist"

    const-string v7, "m3u"

    invoke-direct {v2, v4, v0, v7, v3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v2, v1, v5

    new-instance v0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    const-string v2, "M3U8 Playlist"

    const/4 v4, 0x7

    const-string v5, "m3u8"

    invoke-direct {v0, v2, v4, v5, v3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v0, v1, v6

    sput-object v1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->playlistFilesTypes:[Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->name:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->fileExtension:Ljava/lang/String;

    .line 29
    iput-boolean p4, p0, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->supportSaving:Z

    return-void
.end method

.method public static isPlaylistFileExtension(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "pla"

    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "pls"

    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const-string v0, "mpcpl"

    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    const-string v0, "plp"

    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    const-string v0, "m3u"

    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    const-string v0, "m3u8"

    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
    const-string v0, "m4u"

    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    const-string v0, "ram"

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    return v1

    :cond_7
    const/4 p0, 0x0

    return p0
.end method
