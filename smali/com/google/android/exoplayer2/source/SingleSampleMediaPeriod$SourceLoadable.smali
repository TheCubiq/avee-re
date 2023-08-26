.class final Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;
.super Ljava/lang/Object;
.source "SingleSampleMediaPeriod.java"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/Loader$Loadable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "SourceLoadable"
.end annotation


# instance fields
.field private final dataSource:Lcom/google/android/exoplayer2/upstream/DataSource;

.field public final dataSpec:Lcom/google/android/exoplayer2/upstream/DataSpec;

.field private sampleData:[B

.field private sampleSize:I


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/DataSpec;Lcom/google/android/exoplayer2/upstream/DataSource;)V
    .locals 0

    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->dataSpec:Lcom/google/android/exoplayer2/upstream/DataSpec;

    .line 343
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lcom/google/android/exoplayer2/upstream/DataSource;

    return-void
.end method

.method static synthetic access$100(Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;)I
    .locals 0

    .line 332
    iget p0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleSize:I

    return p0
.end method

.method static synthetic access$200(Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;)[B
    .locals 0

    .line 332
    iget-object p0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    return-object p0
.end method


# virtual methods
.method public cancelLoad()V
    .locals 0

    return-void
.end method

.method public load()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 354
    iput v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleSize:I

    .line 357
    :try_start_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lcom/google/android/exoplayer2/upstream/DataSource;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->dataSpec:Lcom/google/android/exoplayer2/upstream/DataSpec;

    invoke-interface {v1, v2}, Lcom/google/android/exoplayer2/upstream/DataSource;->open(Lcom/google/android/exoplayer2/upstream/DataSpec;)J

    :goto_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 361
    iget v1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleSize:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleSize:I

    .line 362
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    if-nez v0, :cond_0

    const/16 v0, 0x400

    new-array v0, v0, [B

    .line 363
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    goto :goto_1

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    array-length v0, v0

    if-ne v1, v0, :cond_1

    .line 365
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    .line 367
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lcom/google/android/exoplayer2/upstream/DataSource;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    iget v2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleSize:I

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleData:[B

    array-length v3, v3

    iget v4, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->sampleSize:I

    sub-int/2addr v3, v4

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/upstream/DataSource;->read([BII)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 370
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lcom/google/android/exoplayer2/upstream/DataSource;

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Util;->closeQuietly(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaPeriod$SourceLoadable;->dataSource:Lcom/google/android/exoplayer2/upstream/DataSource;

    invoke-static {v1}, Lcom/google/android/exoplayer2/util/Util;->closeQuietly(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method
