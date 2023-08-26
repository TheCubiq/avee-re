.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;
.super Lcom/google/android/exoplayer2/offline/DownloadHelper;
.source "SsDownloadHelper.java"


# instance fields
.field private manifest:Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/MonotonicNonNull;
    .end annotation
.end field

.field private final manifestDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadHelper;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->uri:Landroid/net/Uri;

    .line 46
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifestDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    return-void
.end method

.method private static toStreamKeys(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/offline/TrackKey;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;",
            ">;"
        }
    .end annotation

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 91
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 92
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/offline/TrackKey;

    .line 93
    new-instance v3, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;

    iget v4, v2, Lcom/google/android/exoplayer2/offline/TrackKey;->groupIndex:I

    iget v2, v2, Lcom/google/android/exoplayer2/offline/TrackKey;->trackIndex:I

    invoke-direct {v3, v4, v2}, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;-><init>(II)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDownloadAction([BLjava/util/List;)Lcom/google/android/exoplayer2/offline/DownloadAction;
    .locals 0

    .line 37
    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->getDownloadAction([BLjava/util/List;)Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;

    move-result-object p1

    return-object p1
.end method

.method public getDownloadAction([BLjava/util/List;)Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/offline/TrackKey;",
            ">;)",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;"
        }
    .end annotation

    .line 80
    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->uri:Landroid/net/Uri;

    invoke-static {p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->toStreamKeys(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;-><init>(Landroid/net/Uri;Z[BLjava/util/List;)V

    return-object v0
.end method

.method public getManifest()Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;

    return-object v0
.end method

.method public getPeriodCount()I
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic getRemoveAction([B)Lcom/google/android/exoplayer2/offline/DownloadAction;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->getRemoveAction([B)Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;

    move-result-object p1

    return-object p1
.end method

.method public getRemoveAction([B)Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;
    .locals 4

    .line 85
    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->uri:Landroid/net/Uri;

    .line 86
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, p1, v2}, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadAction;-><init>(Landroid/net/Uri;Z[BLjava/util/List;)V

    return-object v0
.end method

.method public getTrackGroups(I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 4

    .line 69
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;

    invoke-static {p1}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;

    iget-object p1, p1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;->streamElements:[Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest$StreamElement;

    .line 71
    array-length v0, p1

    new-array v0, v0, [Lcom/google/android/exoplayer2/source/TrackGroup;

    const/4 v1, 0x0

    .line 72
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 73
    new-instance v2, Lcom/google/android/exoplayer2/source/TrackGroup;

    aget-object v3, p1, v1

    iget-object v3, v3, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest$StreamElement;->formats:[Lcom/google/android/exoplayer2/Format;

    invoke-direct {v2, v3}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 75
    :cond_0
    new-instance p1, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-direct {p1, v0}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    return-object p1
.end method

.method protected prepareInternal()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifestDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;->createDataSource()Lcom/google/android/exoplayer2/upstream/DataSource;

    move-result-object v0

    .line 52
    new-instance v1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser;-><init>()V

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->uri:Landroid/net/Uri;

    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/upstream/ParsingLoadable;->load(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/offline/SsDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifest;

    return-void
.end method
