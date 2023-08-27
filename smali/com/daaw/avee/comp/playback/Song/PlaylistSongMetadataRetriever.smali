.class public Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;
.super Ljava/lang/Object;
.source "PlaylistSongMetadataRetriever.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "PlaylistSongMetadataRet"

.field private static final executorService:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;->executorService:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AcquireData(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Handler;Lcom/daaw/avee/Common/Action1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            "Lcom/daaw/avee/Common/Action1<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    .line 35
    sget-object p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSongMetadataRetriever;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;

    invoke-direct {p1, v0, p3, p4}, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$F0nPwAbhx8ik7kwYIheopIY4SjE;-><init>([Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/avee/Common/Action1;)V

    invoke-interface {p0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public static AcquireDataMediaMetadataRetrieverLocal2(Landroid/content/Context;Landroid/net/Uri;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;
    .locals 8

    .line 54
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;

    invoke-direct {v0, p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    if-eqz p1, :cond_f

    .line 56
    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    if-ne p1, p2, :cond_0

    goto/16 :goto_5

    .line 60
    :cond_0
    new-instance p2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {p2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 64
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "content"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    const-string v3, "PlaylistSongMetadataRet"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_1

    .line 66
    :try_start_0
    invoke-virtual {p2, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 p0, 0x1

    goto :goto_3

    :catch_0
    move-exception p0

    const-string p1, "Cant\'retreive content:\\ metadata"

    .line 69
    invoke-static {v3, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v7, "http"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v7, "https"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    .line 93
    :cond_2
    :try_start_1
    invoke-virtual {p2, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p0

    const-string p1, "Can\'t retrieve metadata"

    .line 96
    invoke-static {v3, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :catch_2
    :goto_1
    const/4 p0, 0x0

    goto :goto_3

    .line 73
    :cond_3
    :goto_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const-string v1, "."

    .line 76
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_4

    add-int/lit8 v1, p1, -0x1

    :cond_4
    const/16 v3, 0x2f

    .line 78
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v7

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v7

    add-int/2addr v7, v6

    .line 79
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    if-gez v1, :cond_5

    sub-int/2addr p1, v6

    add-int/lit8 v1, p1, 0x1

    .line 83
    :cond_5
    :try_start_2
    invoke-virtual {p0, v7, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-ge p1, v2, :cond_6

    goto :goto_1

    :cond_6
    move-object v4, p0

    goto :goto_1

    :goto_3
    const-string p1, ""

    if-eqz p0, :cond_7

    .line 101
    iput-boolean v5, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->isStream:Z

    const/16 p0, 0xc

    .line 102
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->mimeType:Ljava/lang/String;

    const/4 p0, 0x7

    .line 104
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackName:Ljava/lang/String;

    .line 105
    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->artistName:Ljava/lang/String;

    .line 107
    invoke-virtual {p2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumName:Ljava/lang/String;

    const/16 p0, 0x9

    .line 109
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->duration:I

    .line 110
    invoke-virtual {p2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackNum:I

    const/16 p0, 0xe

    .line 111
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->cdNum:I

    const/16 p0, 0x8

    .line 112
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->year:I

    const/16 p0, 0xd

    .line 113
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumArtist:Ljava/lang/String;

    const/4 p0, 0x4

    .line 115
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->composer:Ljava/lang/String;

    const/16 p0, 0x14

    .line 117
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->bitRate:I

    const/16 p0, 0x12

    .line 118
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->width:I

    const/16 p0, 0x13

    .line 119
    invoke-virtual {p2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->height:I

    goto :goto_4

    .line 121
    :cond_7
    iput-boolean v6, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->isStream:Z

    if-nez v4, :cond_8

    .line 124
    iput-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->secondName:Ljava/lang/String;

    goto :goto_4

    .line 126
    :cond_8
    iput-object v4, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->secondName:Ljava/lang/String;

    .line 130
    :goto_4
    iget-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->mimeType:Ljava/lang/String;

    if-nez p0, :cond_9

    iput-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->mimeType:Ljava/lang/String;

    .line 131
    :cond_9
    iget-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackName:Ljava/lang/String;

    if-nez p0, :cond_a

    iput-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackName:Ljava/lang/String;

    .line 132
    :cond_a
    iget-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumName:Ljava/lang/String;

    if-nez p0, :cond_b

    iput-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumName:Ljava/lang/String;

    .line 133
    :cond_b
    iget-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->artistName:Ljava/lang/String;

    if-nez p0, :cond_c

    iput-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->artistName:Ljava/lang/String;

    .line 134
    :cond_c
    iget-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumArtist:Ljava/lang/String;

    if-nez p0, :cond_d

    iput-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumArtist:Ljava/lang/String;

    .line 135
    :cond_d
    iget-object p0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->composer:Ljava/lang/String;

    if-nez p0, :cond_e

    iput-object p1, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->composer:Ljava/lang/String;

    .line 137
    :cond_e
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    :cond_f
    :goto_5
    return-object v0
.end method

.method static synthetic lambda$AcquireData$1([Ljava/lang/Object;Landroid/os/Handler;Lcom/daaw/avee/Common/Action1;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 37
    invoke-static {p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->doInBackground([Ljava/lang/Object;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object p0

    if-eqz p1, :cond_0

    .line 40
    new-instance v0, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU;

    invoke-direct {v0, p2, p0}, Lcom/daaw/avee/comp/playback/Song/-$$Lambda$PlaylistSongMetadataRetriever$wqIELjU0bTfXnxQ33C59AppMuyU;-><init>(Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 45
    :cond_0
    invoke-interface {p2, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method static synthetic lambda$null$0(Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;)V
    .locals 0

    .line 42
    invoke-interface {p0, p1}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    return-void
.end method
