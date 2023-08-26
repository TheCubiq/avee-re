.class public final Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;
.super Lcom/google/android/exoplayer2/offline/SegmentDownloader;
.source "DashDownloader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/exoplayer2/offline/SegmentDownloader<",
        "Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;",
        "Lcom/google/android/exoplayer2/source/dash/manifest/RepresentationKey;",
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
            "Lcom/google/android/exoplayer2/source/dash/manifest/RepresentationKey;",
            ">;",
            "Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;",
            ")V"
        }
    .end annotation

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/offline/SegmentDownloader;-><init>(Landroid/net/Uri;Ljava/util/List;Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;)V

    return-void
.end method

.method private static addSegment(JLjava/lang/String;Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;",
            ">;)V"
        }
    .end annotation

    .line 157
    new-instance v7, Lcom/google/android/exoplayer2/upstream/DataSpec;

    .line 158
    invoke-virtual {p3, p2}, Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;->resolveUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-wide v2, p3, Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;->start:J

    iget-wide v4, p3, Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;->length:J

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/upstream/DataSpec;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    .line 159
    new-instance p2, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;

    invoke-direct {p2, p0, p1, v7}, Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;-><init>(JLcom/google/android/exoplayer2/upstream/DataSpec;)V

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static addSegmentsForAdaptationSet(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;JJZLjava/util/ArrayList;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            "Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;",
            "JJZ",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p7

    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 115
    :goto_0
    iget-object v0, v1, Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;->representations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_6

    .line 116
    iget-object v0, v1, Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;->representations:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;

    .line 119
    :try_start_0
    iget v6, v1, Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;->type:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v7, p0

    :try_start_1
    invoke-static {v7, v6, v0}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;->getSegmentIndex(Lcom/google/android/exoplayer2/upstream/DataSource;ILcom/google/android/exoplayer2/source/dash/manifest/Representation;)Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;

    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v6, :cond_3

    move-wide/from16 v8, p4

    .line 133
    invoke-interface {v6, v8, v9}, Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;->getSegmentCount(J)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_2

    .line 138
    iget-object v11, v0, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;->baseUrl:Ljava/lang/String;

    .line 139
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;->getInitializationUri()Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;

    move-result-object v12

    if-eqz v12, :cond_0

    .line 141
    invoke-static {v2, v3, v11, v12, v4}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;->addSegment(JLjava/lang/String;Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;Ljava/util/ArrayList;)V

    .line 143
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;->getIndexUri()Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 145
    invoke-static {v2, v3, v11, v0, v4}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;->addSegment(JLjava/lang/String;Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;Ljava/util/ArrayList;)V

    .line 147
    :cond_1
    invoke-interface {v6}, Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;->getFirstSegmentNum()J

    move-result-wide v12

    int-to-long v14, v10

    add-long/2addr v14, v12

    const-wide/16 v16, 0x1

    sub-long v14, v14, v16

    :goto_1
    cmp-long v0, v12, v14

    if-gtz v0, :cond_4

    .line 150
    invoke-interface {v6, v12, v13}, Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;->getTimeUs(J)J

    move-result-wide v18

    add-long v0, v2, v18

    invoke-interface {v6, v12, v13}, Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;->getSegmentUrl(J)Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;

    move-result-object v10

    invoke-static {v0, v1, v11, v10, v4}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;->addSegment(JLjava/lang/String;Lcom/google/android/exoplayer2/source/dash/manifest/RangedUri;Ljava/util/ArrayList;)V

    add-long v12, v12, v16

    move-object/from16 v1, p1

    goto :goto_1

    .line 135
    :cond_2
    new-instance v0, Lcom/google/android/exoplayer2/offline/DownloadException;

    const-string v1, "Unbounded segment index"

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/offline/DownloadException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-wide/from16 v8, p4

    .line 122
    :try_start_2
    new-instance v0, Lcom/google/android/exoplayer2/offline/DownloadException;

    const-string v1, "Missing segment index"

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/offline/DownloadException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object/from16 v7, p0

    :goto_2
    move-wide/from16 v8, p4

    :goto_3
    if-eqz p6, :cond_5

    :cond_4
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, p1

    goto :goto_0

    .line 126
    :cond_5
    throw v0

    :cond_6
    return-void
.end method

.method private static getSegmentIndex(Lcom/google/android/exoplayer2/upstream/DataSource;ILcom/google/android/exoplayer2/source/dash/manifest/Representation;)Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 165
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;->getIndex()Lcom/google/android/exoplayer2/source/dash/DashSegmentIndex;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 169
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/DashUtil;->loadChunkIndex(Lcom/google/android/exoplayer2/upstream/DataSource;ILcom/google/android/exoplayer2/source/dash/manifest/Representation;)Lcom/google/android/exoplayer2/extractor/ChunkIndex;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    .line 170
    :cond_1
    new-instance p1, Lcom/google/android/exoplayer2/source/dash/DashWrappingSegmentIndex;

    iget-wide v0, p2, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;->presentationTimeOffsetUs:J

    invoke-direct {p1, p0, v0, v1}, Lcom/google/android/exoplayer2/source/dash/DashWrappingSegmentIndex;-><init>(Lcom/google/android/exoplayer2/extractor/ChunkIndex;J)V

    move-object p0, p1

    :goto_0
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

    .line 64
    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;->getManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    move-result-object p1

    return-object p1
.end method

.method protected getManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 81
    invoke-static {p1, p2}, Lcom/google/android/exoplayer2/source/dash/DashUtil;->loadManifest(Lcom/google/android/exoplayer2/upstream/DataSource;Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

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

    .line 64
    check-cast p2, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;->getSegments(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected getSegments(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;Z)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            "Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/offline/SegmentDownloader$Segment;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p2

    .line 88
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 89
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;->getPeriodCount()I

    move-result v1

    if-ge v11, v1, :cond_1

    .line 90
    invoke-virtual {v0, v11}, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;->getPeriod(I)Lcom/google/android/exoplayer2/source/dash/manifest/Period;

    move-result-object v1

    .line 91
    iget-wide v2, v1, Lcom/google/android/exoplayer2/source/dash/manifest/Period;->startMs:J

    invoke-static {v2, v3}, Lcom/google/android/exoplayer2/C;->msToUs(J)J

    move-result-wide v12

    .line 92
    invoke-virtual {v0, v11}, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;->getPeriodDurationUs(I)J

    move-result-wide v14

    .line 93
    iget-object v8, v1, Lcom/google/android/exoplayer2/source/dash/manifest/Period;->adaptationSets:Ljava/util/List;

    const/4 v7, 0x0

    .line 94
    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    if-ge v7, v1, :cond_0

    .line 97
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;

    move-object/from16 v1, p1

    move-wide v3, v12

    move-wide v5, v14

    move/from16 v16, v7

    move/from16 v7, p3

    move-object/from16 v17, v8

    move-object v8, v9

    .line 95
    invoke-static/range {v1 .. v8}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloader;->addSegmentsForAdaptationSet(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;JJZLjava/util/ArrayList;)V

    add-int/lit8 v7, v16, 0x1

    move-object/from16 v8, v17

    goto :goto_1

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_1
    return-object v9
.end method
