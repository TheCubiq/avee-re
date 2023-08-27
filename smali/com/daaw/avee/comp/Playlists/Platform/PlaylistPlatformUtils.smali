.class public Lcom/daaw/avee/comp/Playlists/Platform/PlaylistPlatformUtils;
.super Ljava/lang/Object;
.source "PlaylistPlatformUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addToPlaylist(Landroid/content/Context;J[JZ)I
    .locals 8

    .line 113
    array-length v0, p3

    .line 114
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const/4 v1, 0x1

    new-array v3, v1, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v7, 0x0

    aput-object v1, v3, v7

    const-string v1, "external"

    .line 120
    invoke-static {v1, p1, p2}, Landroid/provider/MediaStore$Audio$Playlists$Members;->getContentUri(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p4, :cond_0

    .line 123
    invoke-virtual {p0, p1, p2, p2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 125
    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p4

    if-eqz p4, :cond_2

    .line 128
    invoke-interface {p4}, Landroid/database/Cursor;->getCount()I

    move-result p4

    const/4 v1, 0x0

    :goto_0
    if-ge v7, v0, :cond_1

    const/16 v2, 0x3e8

    .line 133
    invoke-static {p2, p3, v7, v2, p4}, Lcom/daaw/avee/comp/Playlists/Platform/PlaylistPlatformUtils;->makeInsertItems([Landroid/content/ContentValues;[JIII)[Landroid/content/ContentValues;

    move-result-object p2

    .line 134
    invoke-virtual {p0, p1, p2}, Landroid/content/ContentResolver;->bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit16 v7, v7, 0x3e8

    goto :goto_0

    :cond_1
    move v7, v1

    :cond_2
    return v7
.end method

.method public static createPlaylist(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 25
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/comp/Playlists/Platform/PlaylistPlatformUtils;->createPlaylist(Landroid/content/Context;Ljava/lang/String;[J)I

    move-result p0

    return p0
.end method

.method public static createPlaylist(Landroid/content/Context;Ljava/lang/String;[J)I
    .locals 5

    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 31
    invoke-static {p0, p1}, Lcom/daaw/avee/Common/UtilsMusic;->playlistIdForPlaylist(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 37
    :cond_0
    new-instance p0, Landroid/content/ContentValues;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Landroid/content/ContentValues;-><init>(I)V

    const-string v1, "name"

    .line 38
    invoke-virtual {p0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 40
    :try_start_0
    sget-object v1, Landroid/provider/MediaStore$Audio$Playlists;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0, v1, p0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "failed to create playlist: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    move-object p0, p1

    :goto_0
    const/4 v1, 0x0

    if-nez p0, :cond_1

    return v1

    :cond_1
    if-eqz p2, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 51
    :goto_1
    array-length v4, p2

    if-ge v2, v4, :cond_2

    const/16 v4, 0x3e8

    .line 52
    invoke-static {p1, p2, v2, v4, v1}, Lcom/daaw/avee/comp/Playlists/Platform/PlaylistPlatformUtils;->makeInsertItems([Landroid/content/ContentValues;[JIII)[Landroid/content/ContentValues;

    move-result-object p1

    .line 53
    invoke-virtual {v0, p0, p1}, Landroid/content/ContentResolver;->bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit16 v2, v2, 0x3e8

    goto :goto_1

    :cond_2
    move v1, v3

    :cond_3
    return v1
.end method

.method public static deletePlaylist(Landroid/content/Context;J)I
    .locals 1

    .line 61
    sget-object v0, Landroid/provider/MediaStore$Audio$Playlists;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v0, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    .line 63
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static makeInsertItems([Landroid/content/ContentValues;[JIII)[Landroid/content/ContentValues;
    .locals 7

    add-int v0, p2, p3

    .line 85
    array-length v1, p1

    if-le v0, v1, :cond_0

    .line 86
    array-length p3, p1

    sub-int/2addr p3, p2

    .line 89
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_2

    add-int v2, p2, v1

    .line 92
    aget-wide v2, p1, v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    goto :goto_1

    .line 95
    :cond_1
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    add-int v5, p4, p2

    add-int/2addr v5, v1

    .line 96
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "play_order"

    invoke-virtual {v4, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 97
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "audio_id"

    invoke-virtual {v4, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 98
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz p0, :cond_3

    .line 102
    array-length p1, p0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    if-eq p1, p2, :cond_4

    .line 103
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Landroid/content/ContentValues;

    .line 106
    :cond_4
    invoke-interface {v0, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroid/content/ContentValues;

    return-object p0
.end method

.method public static renamePlaylist(Landroid/content/Context;JLjava/lang/String;)V
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lcom/daaw/avee/comp/Playlists/Platform/PlaylistPlatformUtils;->renamePlaylist(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static renamePlaylist(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 74
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    .line 75
    new-instance v0, Landroid/content/ContentValues;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    const-string v2, "name"

    .line 76
    invoke-virtual {v0, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    sget-object p2, Landroid/provider/MediaStore$Audio$Playlists;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "_id=?"

    invoke-virtual {p0, p2, v0, p1, v1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method
