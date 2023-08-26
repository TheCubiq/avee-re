.class public final Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;
.super Ljava/lang/Object;
.source "DownloaderConstructorHelper.java"


# instance fields
.field private final cache:Lcom/google/android/exoplayer2/upstream/cache/Cache;

.field private final cacheReadDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private final cacheWriteDataSinkFactory:Lcom/google/android/exoplayer2/upstream/DataSink$Factory;

.field private final priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

.field private final upstreamDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 46
    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;-><init>(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSink$Factory;Lcom/google/android/exoplayer2/util/PriorityTaskManager;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSink$Factory;Lcom/google/android/exoplayer2/util/PriorityTaskManager;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-static {p2}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    iput-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cache:Lcom/google/android/exoplayer2/upstream/cache/Cache;

    .line 68
    iput-object p2, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->upstreamDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 69
    iput-object p3, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cacheReadDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 70
    iput-object p4, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cacheWriteDataSinkFactory:Lcom/google/android/exoplayer2/upstream/DataSink$Factory;

    .line 71
    iput-object p5, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

    return-void
.end method


# virtual methods
.method public buildCacheDataSource(Z)Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;
    .locals 8

    .line 91
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cacheReadDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    if-eqz v0, :cond_0

    .line 92
    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;->createDataSource()Lcom/google/android/exoplayer2/upstream/DataSource;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/exoplayer2/upstream/FileDataSource;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/FileDataSource;-><init>()V

    :goto_0
    move-object v4, v0

    if-eqz p1, :cond_1

    .line 94
    new-instance p1, Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;

    iget-object v2, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cache:Lcom/google/android/exoplayer2/upstream/cache/Cache;

    sget-object v3, Lcom/google/android/exoplayer2/upstream/DummyDataSource;->INSTANCE:Lcom/google/android/exoplayer2/upstream/DummyDataSource;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;-><init>(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSink;ILcom/google/android/exoplayer2/upstream/cache/CacheDataSource$EventListener;)V

    return-object p1

    .line 97
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cacheWriteDataSinkFactory:Lcom/google/android/exoplayer2/upstream/DataSink$Factory;

    if-eqz p1, :cond_2

    .line 98
    invoke-interface {p1}, Lcom/google/android/exoplayer2/upstream/DataSink$Factory;->createDataSink()Lcom/google/android/exoplayer2/upstream/DataSink;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/google/android/exoplayer2/upstream/cache/CacheDataSink;

    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cache:Lcom/google/android/exoplayer2/upstream/cache/Cache;

    const-wide/32 v1, 0x200000

    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/exoplayer2/upstream/cache/CacheDataSink;-><init>(Lcom/google/android/exoplayer2/upstream/cache/Cache;J)V

    :goto_1
    move-object v5, p1

    .line 100
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->upstreamDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-interface {p1}, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;->createDataSource()Lcom/google/android/exoplayer2/upstream/DataSource;

    move-result-object p1

    .line 101
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

    if-nez v0, :cond_3

    move-object v3, p1

    goto :goto_2

    :cond_3
    new-instance v1, Lcom/google/android/exoplayer2/upstream/PriorityDataSource;

    const/16 v2, -0x3e8

    invoke-direct {v1, p1, v0, v2}, Lcom/google/android/exoplayer2/upstream/PriorityDataSource;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/util/PriorityTaskManager;I)V

    move-object v3, v1

    .line 103
    :goto_2
    new-instance p1, Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;

    iget-object v2, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cache:Lcom/google/android/exoplayer2/upstream/cache/Cache;

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource;-><init>(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSink;ILcom/google/android/exoplayer2/upstream/cache/CacheDataSource$EventListener;)V

    return-object p1
.end method

.method public getCache()Lcom/google/android/exoplayer2/upstream/cache/Cache;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->cache:Lcom/google/android/exoplayer2/upstream/cache/Cache;

    return-object v0
.end method

.method public getPriorityTaskManager()Lcom/google/android/exoplayer2/util/PriorityTaskManager;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;->priorityTaskManager:Lcom/google/android/exoplayer2/util/PriorityTaskManager;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/exoplayer2/util/PriorityTaskManager;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/util/PriorityTaskManager;-><init>()V

    :goto_0
    return-object v0
.end method
