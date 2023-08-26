.class public final Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;
.super Lcom/google/android/exoplayer2/offline/DownloadHelper;
.source "DashDownloadHelper.java"


# instance fields
.field private manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/MonotonicNonNull;
    .end annotation
.end field

.field private final manifestDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadHelper;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->uri:Landroid/net/Uri;

    .line 49
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifestDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    return-void
.end method

.method private static toRepresentationKeys(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/offline/TrackKey;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/source/dash/manifest/RepresentationKey;",
            ">;"
        }
    .end annotation

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 102
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 103
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/exoplayer2/offline/TrackKey;

    .line 104
    new-instance v3, Lcom/google/android/exoplayer2/source/dash/manifest/RepresentationKey;

    iget v4, v2, Lcom/google/android/exoplayer2/offline/TrackKey;->periodIndex:I

    iget v5, v2, Lcom/google/android/exoplayer2/offline/TrackKey;->groupIndex:I

    iget v2, v2, Lcom/google/android/exoplayer2/offline/TrackKey;->trackIndex:I

    invoke-direct {v3, v4, v5, v2}, Lcom/google/android/exoplayer2/source/dash/manifest/RepresentationKey;-><init>(III)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic getDownloadAction([BLjava/util/List;)Lcom/google/android/exoplayer2/offline/DownloadAction;
    .locals 0

    .line 40
    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->getDownloadAction([BLjava/util/List;)Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;

    move-result-object p1

    return-object p1
.end method

.method public getDownloadAction([BLjava/util/List;)Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/offline/TrackKey;",
            ">;)",
            "Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;"
        }
    .end annotation

    .line 90
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->uri:Landroid/net/Uri;

    .line 91
    invoke-static {p2}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->toRepresentationKeys(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;-><init>(Landroid/net/Uri;Z[BLjava/util/List;)V

    return-object v0
.end method

.method public getManifest()Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    return-object v0
.end method

.method public getPeriodCount()I
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;->getPeriodCount()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getRemoveAction([B)Lcom/google/android/exoplayer2/offline/DownloadAction;
    .locals 0

    .line 40
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->getRemoveAction([B)Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;

    move-result-object p1

    return-object p1
.end method

.method public getRemoveAction([B)Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;
    .locals 4

    .line 96
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->uri:Landroid/net/Uri;

    .line 97
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, p1, v2}, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadAction;-><init>(Landroid/net/Uri;Z[BLjava/util/List;)V

    return-object v0
.end method

.method public getTrackGroups(I)Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 9

    .line 73
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;->getPeriod(I)Lcom/google/android/exoplayer2/source/dash/manifest/Period;

    move-result-object p1

    iget-object p1, p1, Lcom/google/android/exoplayer2/source/dash/manifest/Period;->adaptationSets:Ljava/util/List;

    .line 75
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Lcom/google/android/exoplayer2/source/TrackGroup;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 77
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;

    iget-object v4, v4, Lcom/google/android/exoplayer2/source/dash/manifest/AdaptationSet;->representations:Ljava/util/List;

    .line 78
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lcom/google/android/exoplayer2/Format;

    .line 79
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_0

    .line 81
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;

    iget-object v8, v8, Lcom/google/android/exoplayer2/source/dash/manifest/Representation;->format:Lcom/google/android/exoplayer2/Format;

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 83
    :cond_0
    new-instance v4, Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v4, v5}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 85
    :cond_1
    new-instance p1, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-direct {p1, v1}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    return-object p1
.end method

.method protected prepareInternal()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifestDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 56
    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;->createDataSource()Lcom/google/android/exoplayer2/upstream/DataSource;

    move-result-object v0

    new-instance v1, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifestParser;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifestParser;-><init>()V

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->uri:Landroid/net/Uri;

    .line 55
    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/upstream/ParsingLoadable;->load(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/dash/offline/DashDownloadHelper;->manifest:Lcom/google/android/exoplayer2/source/dash/manifest/DashManifest;

    return-void
.end method
