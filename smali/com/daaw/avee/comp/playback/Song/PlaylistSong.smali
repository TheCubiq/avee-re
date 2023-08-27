.class public Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
.super Ljava/lang/Object;
.source "PlaylistSong.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;,
        Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;,
        Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;,
        Lcom/daaw/avee/comp/playback/Song/PlaylistSong$PlaylistSongOwnSerialExecutor;,
        Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;
    }
.end annotation


# static fields
.field public static final EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field private static final TAG:Ljava/lang/String; = "PlaylistSong"

.field public static final emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

.field private static final loadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

.field private static final mCursorCols:[Ljava/lang/String;

.field private static final notsetData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

.field private static unknown_album_name:Ljava/lang/String;

.field private static unknown_artist_name:Ljava/lang/String;


# instance fields
.field private volatile asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

.field private idPath:Landroid/net/Uri;

.field private providedTitle:Ljava/lang/String;

.field private volatile songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 35
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;-><init>(Landroid/net/Uri;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 36
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;-><init>(Landroid/net/Uri;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->notsetData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 37
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;-><init>(Landroid/net/Uri;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->loadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 38
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "artist"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "album"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "title"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "mime_type"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "album_id"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "artist_id"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "duration"

    aput-object v2, v0, v1

    .line 40
    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->mCursorCols:[Ljava/lang/String;

    const/4 v0, 0x0

    .line 51
    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_artist_name:Ljava/lang/String;

    .line 52
    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLandroid/net/Uri;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 72
    invoke-virtual {p0, p3, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->init(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    if-nez p3, :cond_0

    .line 80
    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 81
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->init(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    if-nez p3, :cond_0

    .line 85
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 86
    :goto_0
    invoke-virtual {p0, p1, p4}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->init(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 63
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->init(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 59
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 76
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->init(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    if-nez p1, :cond_0

    .line 67
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 68
    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->init(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method private static AcquireDataMediaStore(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v8, "<unknown>"

    .line 105
    :try_start_0
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 106
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f10018c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_artist_name:Ljava/lang/String;

    .line 107
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f10018b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "Unknown artist"

    .line 110
    sput-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_artist_name:Ljava/lang/String;

    const-string v1, "Unknown album"

    .line 111
    sput-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;

    .line 114
    :cond_0
    :goto_0
    new-instance v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-direct {v9, v7}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;-><init>(Landroid/net/Uri;)V

    if-eqz v7, :cond_21

    .line 116
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    if-ne v7, v1, :cond_1

    goto/16 :goto_11

    .line 120
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isUrlStream(Landroid/net/Uri;)Z

    move-result v1

    iput-boolean v1, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isStream:Z

    const/4 v10, 0x0

    if-eqz v0, :cond_2

    .line 122
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    move-object v15, v1

    goto :goto_1

    :cond_2
    move-object v15, v10

    :goto_1
    const/4 v14, 0x1

    const/4 v13, 0x0

    if-eqz v15, :cond_d

    .line 134
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "content"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 136
    sget-object v3, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->mCursorCols:[Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v15

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v6}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cursor is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "PlaylistSong"

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-object v2, v10

    move-object v3, v2

    move-object v5, v15

    const/4 v4, 0x1

    const/4 v6, 0x0

    goto/16 :goto_8

    .line 138
    :cond_3
    iget-boolean v1, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isStream:Z

    if-eqz v1, :cond_5

    if-eqz p2, :cond_4

    move-object/from16 v1, p2

    goto :goto_2

    .line 139
    :cond_4
    invoke-static/range {p1 .. p1}, Lcom/daaw/avee/Common/Utils;->tryExtractPrettyNameFromUri(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    .line 140
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    move-object v5, v15

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v2, v1

    move-object v1, v10

    goto/16 :goto_8

    .line 143
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 145
    sget-object v2, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    new-array v3, v14, [Ljava/lang/String;

    aput-object v1, v3, v13

    .line 148
    sget-object v4, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->mCursorCols:[Ljava/lang/String;

    const/16 v16, 0x0

    const-string v5, "_data=?"

    move-object v11, v15

    move-object v12, v2

    const/4 v6, 0x0

    move-object v13, v4

    const/4 v4, 0x1

    move-object v14, v5

    move-object v5, v15

    move-object v15, v3

    invoke-static/range {v11 .. v16}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    if-eqz v11, :cond_7

    .line 150
    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    move-result v12

    if-gtz v12, :cond_6

    goto :goto_3

    :cond_6
    move-object v3, v11

    goto :goto_4

    :cond_7
    :goto_3
    if-eqz v11, :cond_8

    .line 152
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 158
    :cond_8
    sget-object v13, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->mCursorCols:[Ljava/lang/String;

    const/16 v16, 0x0

    const-string v14, "_data=? COLLATE NOCASE"

    move-object v11, v5

    move-object v12, v2

    move-object v15, v3

    invoke-static/range {v11 .. v16}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    :goto_4
    if-eqz v3, :cond_9

    .line 161
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v11

    if-gtz v11, :cond_c

    .line 163
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v11

    const-string v12, "file"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    .line 164
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_c

    .line 169
    :cond_a
    :try_start_1
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v11}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move-object v1, v10

    :goto_5
    if-eqz v1, :cond_c

    if-eqz v3, :cond_b

    .line 177
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_b
    new-array v15, v4, [Ljava/lang/String;

    aput-object v1, v15, v6

    .line 183
    sget-object v13, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->mCursorCols:[Ljava/lang/String;

    const/16 v16, 0x0

    const-string v14, "_data=?"

    move-object v11, v5

    move-object v12, v2

    invoke-static/range {v11 .. v16}, Lcom/daaw/avee/Common/MediaStoreUtils;->querySafe(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    goto :goto_6

    :cond_c
    move-object v1, v3

    :goto_6
    move-object v2, v10

    goto :goto_7

    :cond_d
    move-object v5, v15

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v1, v10

    move-object v2, v1

    :goto_7
    move-object v3, v2

    :goto_8
    const-string v11, ""

    if-eqz v1, :cond_17

    .line 193
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v14

    if-lez v14, :cond_17

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v14

    if-eqz v14, :cond_17

    :try_start_2
    const-string v14, "_id"

    .line 199
    invoke-interface {v1, v14}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 p2, v5

    const-wide/16 v4, 0x0

    if-ltz v14, :cond_e

    .line 200
    :try_start_3
    invoke-interface {v1, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v16

    move-wide/from16 v12, v16

    goto :goto_9

    :cond_e
    move-wide v12, v4

    :goto_9
    iput-wide v12, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    const-string v12, "title"

    .line 202
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    if-ltz v12, :cond_f

    .line 203
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_a

    :cond_f
    move-object v12, v10

    :goto_a
    iput-object v12, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    const-string v12, "album"

    .line 205
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    if-ltz v12, :cond_10

    .line 206
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_b

    :cond_10
    move-object v12, v10

    :goto_b
    iput-object v12, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    const-string v12, "album_id"

    .line 208
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    if-ltz v12, :cond_11

    .line 209
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    goto :goto_c

    :cond_11
    const-wide/16 v12, -0x1

    :goto_c
    iput-wide v12, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumId:J

    const-string v12, "artist"

    .line 211
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    if-ltz v12, :cond_12

    .line 212
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    :cond_12
    iput-object v10, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    const-string v10, "artist_id"

    .line 214
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_13

    .line 215
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    goto :goto_d

    :cond_13
    const-wide/16 v12, -0x1

    :goto_d
    iput-wide v12, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    const-string v10, "duration"

    .line 217
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_14

    .line 218
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    goto :goto_e

    :cond_14
    const/4 v13, 0x0

    :goto_e
    iput v13, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    .line 220
    iput v6, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackNum:I

    .line 221
    iput v6, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->cdNum:I

    .line 222
    iput v6, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->year:I

    .line 223
    iput-wide v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->sizeInBytes:J

    .line 224
    iput-object v11, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumArt:Ljava/lang/String;

    .line 226
    iget-object v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_15

    .line 227
    sget-object v4, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_artist_name:Ljava/lang/String;

    iput-object v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    const-wide/16 v4, -0x1

    .line 228
    iput-wide v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    .line 231
    :cond_15
    iget-object v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    .line 232
    sget-object v4, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;

    iput-object v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    const-wide/16 v4, -0x1

    .line 233
    iput-wide v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumId:J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :cond_16
    const/4 v14, 0x0

    goto :goto_f

    :catch_2
    :cond_17
    move-object/from16 p2, v5

    :catch_3
    const/4 v14, 0x1

    :goto_f
    const-string v4, "unknown"

    if-eqz v14, :cond_1b

    .line 246
    invoke-static {v9, v0, v7}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->applyDetailsFromMeta(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1b

    if-nez v2, :cond_18

    .line 250
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v2

    :cond_18
    if-nez v2, :cond_19

    move-object v2, v4

    :cond_19
    const-wide/16 v5, -0x1

    .line 254
    iput-wide v5, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    .line 255
    iput-object v2, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    .line 257
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    .line 258
    iput-wide v5, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumId:J

    if-nez v3, :cond_1a

    .line 261
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_artist_name:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    .line 262
    iput-wide v5, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    goto :goto_10

    .line 264
    :cond_1a
    iput-object v3, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    const-wide/16 v2, -0x2

    .line 265
    iput-wide v2, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistId:J

    .line 269
    :cond_1b
    :goto_10
    iget-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->filePath:Ljava/lang/String;

    if-nez v0, :cond_1c

    .line 270
    iput-object v11, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->filePath:Ljava/lang/String;

    .line 272
    :cond_1c
    iget-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    if-nez v0, :cond_1d

    .line 273
    iput-object v4, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    .line 275
    :cond_1d
    iget-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    if-nez v0, :cond_1e

    .line 276
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    .line 278
    :cond_1e
    iget-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    if-nez v0, :cond_1f

    .line 279
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_artist_name:Ljava/lang/String;

    iput-object v0, v9, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    :cond_1f
    if-eqz v1, :cond_20

    .line 282
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_20
    move-object/from16 v1, p2

    .line 284
    invoke-virtual {v9, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->finish(Landroid/content/ContentResolver;)V

    :cond_21
    :goto_11
    return-object v9
.end method

.method private static acquireData(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 0

    .line 441
    invoke-static {p0, p1, p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->AcquireDataMediaStore(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object p0

    return-object p0
.end method

.method private static applyDetailsFromMeta(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 1

    const/4 v0, 0x0

    .line 290
    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;->AcquireDataMediaMetadataRetrieverLocal2(Landroid/content/Context;Landroid/net/Uri;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;

    move-result-object p1

    .line 291
    iget-object p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackName:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    return p0

    .line 293
    :cond_0
    iget-boolean p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->isStream:Z

    iput-boolean p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isStream:Z

    .line 294
    iget-object p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackName:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    .line 295
    iget-object p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumArtist:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_album_name:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumName:Ljava/lang/String;

    :goto_0
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    .line 296
    iget-object p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->artistName:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->unknown_artist_name:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iget-object p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->artistName:Ljava/lang/String;

    :goto_1
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    .line 297
    iget p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->duration:I

    iput p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    .line 298
    iget p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackNum:I

    iput p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackNum:I

    .line 299
    iget p2, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->cdNum:I

    iput p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->cdNum:I

    .line 300
    iget p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->year:I

    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->year:I

    const/4 p0, 0x1

    return p0
.end method

.method protected static varargs doInBackground([Ljava/lang/Object;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 3

    const/4 v0, 0x0

    .line 422
    aget-object v0, p0, v0

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x1

    .line 423
    aget-object v1, p0, v1

    check-cast v1, Landroid/net/Uri;

    const/4 v2, 0x2

    .line 424
    aget-object p0, p0, v2

    check-cast p0, Ljava/lang/String;

    .line 425
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->acquireData(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object p0

    return-object p0
.end method

.method public static makeSongListFromDataSourceList(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 93
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 96
    new-instance v2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const-wide/16 v3, -0x1

    invoke-direct {v2, v3, v4, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(JLjava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private startAcquireData(Landroid/os/Handler;)V
    .locals 4

    .line 326
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 331
    :cond_0
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->loadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 334
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->providedTitle:Ljava/lang/String;

    new-instance v3, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSong$Ffs6td9hDBCCAOAhDu21sOhsxss;

    invoke-direct {v3, p0}, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSong$Ffs6td9hDBCCAOAhDu21sOhsxss;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    invoke-static {v0, v1, v2, p1, v3}, Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;->AcquireData(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Handler;Lcom/daaw/avee/Common/Action1;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 340
    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 308
    instance-of v0, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->compare(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getConstrucPath()Ljava/lang/String;
    .locals 1

    .line 361
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getData()Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 3

    .line 391
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 393
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->notsetData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 394
    iput-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 395
    invoke-direct {p0, v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->startAcquireData(Landroid/os/Handler;)V

    .line 396
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-object v0

    .line 397
    :cond_0
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->loadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-ne v0, v1, :cond_1

    .line 398
    iput-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 399
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-object v0

    .line 401
    :cond_1
    iput-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    return-object v0
.end method

.method public getData(Landroid/os/Handler;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 2

    .line 375
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 377
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->notsetData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-ne v0, v1, :cond_0

    .line 378
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 379
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->startAcquireData(Landroid/os/Handler;)V

    .line 380
    sget-object p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-object p1

    .line 381
    :cond_0
    sget-object p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->loadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-ne v0, p1, :cond_1

    .line 382
    new-instance p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    invoke-direct {p1, p0, p2, p3, p4}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 383
    sget-object p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    .line 385
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    return-object v0
.end method

.method public getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 2

    .line 407
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 408
    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->loadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->notsetData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 409
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->providedTitle:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->acquireData(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object p1

    return-object p1
.end method

.method public getDataDetailsBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;
    .locals 2

    .line 416
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    .line 417
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    invoke-static {p1, v1, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;->AcquireDataMediaMetadataRetrieverLocal2(Landroid/content/Context;Landroid/net/Uri;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;

    move-result-object p1

    return-object p1
.end method

.method public getDataSourceForNativePlaylist()J
    .locals 6

    .line 349
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    .line 352
    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object v0

    .line 354
    iget-wide v3, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    cmp-long v5, v3, v1

    if-lez v5, :cond_1

    iget-wide v0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->audioId:J

    return-wide v0

    :cond_1
    return-wide v1
.end method

.method public getDataSourceForPlaylist()Ljava/lang/String;
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMediaDataSource()Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;
    .locals 2

    .line 366
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    return v0
.end method

.method public init(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    .line 318
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    :cond_0
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    .line 319
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->providedTitle:Ljava/lang/String;

    .line 321
    sget-object p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->notsetData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-void
.end method

.method public isStream()Z
    .locals 1

    .line 371
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->idPath:Landroid/net/Uri;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isUrlStream(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.method public synthetic lambda$startAcquireData$0$PlaylistSong(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 0

    .line 335
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->onPostExecute(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    return-void
.end method

.method protected onPostExecute(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 3

    .line 430
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    const/4 v1, 0x0

    .line 431
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->asyncLoadingData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;

    .line 432
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    if-eqz v0, :cond_0

    .line 435
    iget-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;->listener:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->songData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object v2, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;->userData1:Ljava/lang/Object;

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$AsyncLoadingData;->userData2:Ljava/lang/Object;

    invoke-interface {p1, v1, v2, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;->onDataReady(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
