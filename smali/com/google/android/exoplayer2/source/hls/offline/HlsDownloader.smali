.class public final Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;
.super Lcom/google/android/exoplayer2/offline/SegmentDownloader;
.source "HlsDownloader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/exoplayer2/offline/SegmentDownloader<",
        "Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;",
        "Lcom/google/android/exoplayer2/source/hls/playlist/RenditionKey;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/util/List;Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/playlist/RenditionKey;",
            ">;",
            "Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;",
            ")V"
        }
    .end annotation

    .line 72
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/offline/SegmentDownloader;-><init>(Landroid/net/Uri;Ljava/util/List;Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;)V

    return-void
.end method

.method private static addResolvedUris(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist$HlsUrl;",
            ">;",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 148
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 149
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist$HlsUrl;

    iget-object v1, v1, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist$HlsUrl;->url:Ljava/lang/String;

    invoke-static {p0, v1}, Lcom/google/android/exoplayer2/util/UriUtil;->resolveToUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static addSegment(Ljava/util/ArrayList;Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;Ljava/util/HashSet;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;",
            ">;",
            "Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;",
            "Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;",
            "Ljava/util/HashSet<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    .line 134
    iget-wide v0, p1, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;->startTimeUs:J

    iget-wide v2, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;->relativeStartTimeUs:J

    add-long/2addr v0, v2

    .line 135
    iget-object v2, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;->fullSegmentEncryptionKeyUri:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 136
    iget-object v2, p1, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;->baseUri:Ljava/lang/String;

    iget-object v3, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;->fullSegmentEncryptionKeyUri:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/exoplayer2/util/UriUtil;->resolveToUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 138
    invoke-virtual {p3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 139
    new-instance p3, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;

    new-instance v3, Lcom/google/android/exoplayer2/upstream/DataSpec;

    invoke-direct {v3, v2}, Lcom/google/android/exoplayer2/upstream/DataSpec;-><init>(Landroid/net/Uri;)V

    invoke-direct {p3, v0, v1, v3}, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;-><init>(JLcom/google/android/exoplayer2/upstream/DataSpec;)V

    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    :cond_0
    iget-object p1, p1, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;->baseUri:Ljava/lang/String;

    iget-object p3, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;->url:Ljava/lang/String;

    invoke-static {p1, p3}, Lcom/google/android/exoplayer2/util/UriUtil;->resolveToUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 143
    new-instance p1, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;

    new-instance p3, Lcom/google/android/exoplayer2/upstream/DataSpec;

    iget-wide v4, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;->byterangeOffset:J

    iget-wide v6, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;->byterangeLength:J

    const/4 v8, 0x0

    move-object v2, p3

    invoke-direct/range {v2 .. v8}, Lcom/google/android/exoplayer2/upstream/DataSpec;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    invoke-direct {p1, v0, v1, p3}, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;-><init>(JLcom/google/android/exoplayer2/upstream/DataSpec;)V

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static loadManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 123
    new-instance v0, Lcom/google/android/exoplayer2/upstream/ParsingLoadable;

    new-instance v1, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser;-><init>()V

    const/4 v2, 0x4

    invoke-direct {v0, p0, p1, v2, v1}, Lcom/google/android/exoplayer2/upstream/ParsingLoadable;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;ILcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;)V

    .line 125
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/ParsingLoadable;->load()V

    .line 126
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/upstream/ParsingLoadable;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;

    return-object p0
.end method


# virtual methods
.method protected bridge synthetic getManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/offline/FilterableManifest;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->getManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;

    move-result-object p1

    return-object p1
.end method

.method protected getManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 77
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->loadManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic getSegments(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/offline/FilterableManifest;Z)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    check-cast p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->getSegments(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getSegments(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            "Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    instance-of v1, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;

    if-eqz v1, :cond_0

    .line 85
    check-cast p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;

    .line 86
    iget-object v1, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;->baseUri:Ljava/lang/String;

    iget-object v2, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;->variants:Ljava/util/List;

    invoke-static {v1, v2, v0}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->addResolvedUris(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 87
    iget-object v1, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;->baseUri:Ljava/lang/String;

    iget-object v2, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;->audios:Ljava/util/List;

    invoke-static {v1, v2, v0}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->addResolvedUris(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 88
    iget-object v1, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;->baseUri:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMasterPlaylist;->subtitles:Ljava/util/List;

    invoke-static {v1, p2, v0}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->addResolvedUris(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    .line 90
    :cond_0
    iget-object p2, p2, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;->baseUri:Ljava/lang/String;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    :goto_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 94
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    .line 98
    :try_start_0
    invoke-static {p1, v2}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->loadManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylist;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;

    .line 99
    new-instance v4, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;

    iget-wide v5, v3, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;->startTimeUs:J

    new-instance v7, Lcom/google/android/exoplayer2/upstream/DataSpec;

    invoke-direct {v7, v2}, Lcom/google/android/exoplayer2/upstream/DataSpec;-><init>(Landroid/net/Uri;)V

    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;-><init>(JLcom/google/android/exoplayer2/upstream/DataSpec;)V

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    .line 108
    iget-object v4, v3, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;->segments:Ljava/util/List;

    const/4 v5, 0x0

    .line 109
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 110
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;

    .line 111
    iget-object v7, v6, Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;->initializationSegment:Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;

    if-eqz v7, :cond_2

    if-eq v7, v2, :cond_2

    .line 114
    invoke-static {p2, v3, v7, v1}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->addSegment(Ljava/util/ArrayList;Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;Ljava/util/HashSet;)V

    move-object v2, v7

    .line 116
    :cond_2
    invoke-static {p2, v3, v6, v1}, Lcom/google/android/exoplayer2/source/hls/offline/HlsDownloader;->addSegment(Ljava/util/ArrayList;Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist;Lcom/google/android/exoplayer2/source/hls/playlist/HlsMediaPlaylist$Segment;Ljava/util/HashSet;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :catch_0
    move-exception v3

    if-eqz p3, :cond_3

    .line 104
    new-instance v3, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;

    const-wide/16 v4, 0x0

    new-instance v6, Lcom/google/android/exoplayer2/upstream/DataSpec;

    invoke-direct {v6, v2}, Lcom/google/android/exoplayer2/upstream/DataSpec;-><init>(Landroid/net/Uri;)V

    invoke-direct {v3, v4, v5, v6}, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;-><init>(JLcom/google/android/exoplayer2/upstream/DataSpec;)V

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 102
    :cond_3
    throw v3

    :cond_4
    return-object p2
.end method
