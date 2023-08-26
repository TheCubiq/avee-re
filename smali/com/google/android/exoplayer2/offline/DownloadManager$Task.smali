.class final Lcom/google/android/exoplayer2/offline/DownloadManager$Task;
.super Ljava/lang/Object;
.source "DownloadManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/offline/DownloadManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Task"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/offline/DownloadManager$Task$InternalState;
    }
.end annotation


# static fields
.field public static final STATE_QUEUED_CANCELING:I = 0x5

.field public static final STATE_STARTED_CANCELING:I = 0x6

.field public static final STATE_STARTED_STOPPING:I = 0x7


# instance fields
.field private final action:Lcom/google/android/exoplayer2/offline/DownloadAction;

.field private volatile currentState:I

.field private final downloadManager:Lcom/google/android/exoplayer2/offline/DownloadManager;

.field private volatile downloader:Lcom/google/android/exoplayer2/offline/Downloader;

.field private error:Ljava/lang/Throwable;

.field private final id:I

.field private final minRetryCount:I

.field private thread:Ljava/lang/Thread;


# direct methods
.method private constructor <init>(ILcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/DownloadAction;I)V
    .locals 0

    .line 660
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 661
    iput p1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->id:I

    .line 662
    iput-object p2, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloadManager:Lcom/google/android/exoplayer2/offline/DownloadManager;

    .line 663
    iput-object p3, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->action:Lcom/google/android/exoplayer2/offline/DownloadAction;

    const/4 p1, 0x0

    .line 664
    iput p1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    .line 665
    iput p4, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->minRetryCount:I

    return-void
.end method

.method synthetic constructor <init>(ILcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/DownloadAction;ILcom/google/android/exoplayer2/offline/DownloadManager$1;)V
    .locals 0

    .line 612
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;-><init>(ILcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/DownloadAction;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V
    .locals 0

    .line 612
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->stop()V

    return-void
.end method

.method static synthetic access$100(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)I
    .locals 0

    .line 612
    iget p0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    return p0
.end method

.method static synthetic access$200(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)I
    .locals 0

    .line 612
    iget p0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->id:I

    return p0
.end method

.method static synthetic access$2100(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;II)Z
    .locals 0

    .line 612
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->changeStateAndNotify(II)Z

    move-result p0

    return p0
.end method

.method static synthetic access$2500(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;IILjava/lang/Throwable;)Z
    .locals 0

    .line 612
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->changeStateAndNotify(IILjava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)Lcom/google/android/exoplayer2/offline/DownloadAction;
    .locals 0

    .line 612
    iget-object p0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->action:Lcom/google/android/exoplayer2/offline/DownloadAction;

    return-object p0
.end method

.method static synthetic access$500(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)Z
    .locals 0

    .line 612
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->canStart()Z

    move-result p0

    return p0
.end method

.method static synthetic access$600(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V
    .locals 0

    .line 612
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->cancel()V

    return-void
.end method

.method static synthetic access$700(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V
    .locals 0

    .line 612
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->start()V

    return-void
.end method

.method private canStart()Z
    .locals 1

    .line 756
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private cancel()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x5

    .line 760
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->changeStateAndNotify(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 761
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloadManager:Lcom/google/android/exoplayer2/offline/DownloadManager;

    invoke-static {v0}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$1900(Lcom/google/android/exoplayer2/offline/DownloadManager;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$1;

    invoke-direct {v1, p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$1;-><init>(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x6

    .line 768
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->changeStateAndNotify(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 769
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->cancelDownload()V

    :cond_1
    :goto_0
    return-void
.end method

.method private cancelDownload()V
    .locals 1

    .line 799
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    if-eqz v0, :cond_0

    .line 800
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/offline/Downloader;->cancel()V

    .line 802
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method private changeStateAndNotify(II)Z
    .locals 1

    const/4 v0, 0x0

    .line 781
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->changeStateAndNotify(IILjava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method private changeStateAndNotify(IILjava/lang/Throwable;)Z
    .locals 2

    .line 786
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    return v1

    .line 789
    :cond_0
    iput p2, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    .line 790
    iput-object p3, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->error:Ljava/lang/Throwable;

    .line 791
    iget p1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->getExternalState()I

    move-result p2

    const/4 p3, 0x1

    if-eq p1, p2, :cond_1

    const/4 v1, 0x1

    :cond_1
    if-nez v1, :cond_2

    .line 793
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloadManager:Lcom/google/android/exoplayer2/offline/DownloadManager;

    invoke-static {p1, p0}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$2300(Lcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V

    :cond_2
    return p3
.end method

.method private getExternalState()I
    .locals 2

    .line 737
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    .line 744
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private getRetryDelayMillis(I)I
    .locals 1

    add-int/lit8 p1, p1, -0x1

    mul-int/lit16 p1, p1, 0x3e8

    const/16 v0, 0x1388

    .line 859
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method private getStateString()Ljava/lang/String;
    .locals 2

    .line 725
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    .line 732
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    invoke-static {v0}, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->getStateString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "STOPPING"

    return-object v0

    :cond_1
    const-string v0, "CANCELING"

    return-object v0
.end method

.method private start()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 749
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->changeStateAndNotify(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 750
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->thread:Ljava/lang/Thread;

    .line 751
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method private stop()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x7

    .line 774
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->changeStateAndNotify(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Stopping"

    .line 775
    invoke-static {v0, p0}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$2200(Ljava/lang/String;Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V

    .line 776
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method

.method private static toString([B)Ljava/lang/String;
    .locals 2

    .line 717
    array-length v0, p0

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    const-string p0, "<data is too long>"

    return-object p0

    .line 720
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/google/android/exoplayer2/util/Util;->fromUtf8Bytes([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getDownloadPercentage()F
    .locals 1

    .line 694
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/offline/Downloader;->getDownloadPercentage()F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0
.end method

.method public getDownloadState()Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;
    .locals 10

    .line 669
    invoke-direct {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->getExternalState()I

    move-result v3

    .line 670
    new-instance v9, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;

    iget v1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->id:I

    iget-object v2, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->action:Lcom/google/android/exoplayer2/offline/DownloadAction;

    .line 671
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->getDownloadPercentage()F

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->getDownloadedBytes()J

    move-result-wide v5

    iget-object v7, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->error:Ljava/lang/Throwable;

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;-><init>(ILcom/google/android/exoplayer2/offline/DownloadAction;IFJLjava/lang/Throwable;Lcom/google/android/exoplayer2/offline/DownloadManager$1;)V

    return-object v9
.end method

.method public getDownloadedBytes()J
    .locals 2

    .line 699
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/offline/Downloader;->getDownloadedBytes()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public isActive()Z
    .locals 3

    .line 683
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v1, 0x1

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v2, 0x7

    if-eq v0, v2, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v2, 0x6

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public isFinished()Z
    .locals 2

    .line 676
    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public run()V
    .locals 8

    const-string v0, "Task is started"

    .line 809
    invoke-static {v0, p0}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$2200(Ljava/lang/String;Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V

    .line 812
    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->action:Lcom/google/android/exoplayer2/offline/DownloadAction;

    iget-object v1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloadManager:Lcom/google/android/exoplayer2/offline/DownloadManager;

    invoke-static {v1}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$2400(Lcom/google/android/exoplayer2/offline/DownloadManager;)Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/offline/DownloadAction;->createDownloader(Lcom/google/android/exoplayer2/offline/DownloaderConstructorHelper;)Lcom/google/android/exoplayer2/offline/Downloader;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    .line 813
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->action:Lcom/google/android/exoplayer2/offline/DownloadAction;

    iget-boolean v0, v0, Lcom/google/android/exoplayer2/offline/DownloadAction;->isRemoveAction:Z

    if-eqz v0, :cond_0

    .line 814
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/offline/Downloader;->remove()V

    goto :goto_1

    :cond_0
    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 818
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_3

    .line 820
    :try_start_1
    iget-object v4, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    invoke-interface {v4}, Lcom/google/android/exoplayer2/offline/Downloader;->download()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 823
    :try_start_2
    iget-object v5, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloader:Lcom/google/android/exoplayer2/offline/Downloader;

    invoke-interface {v5}, Lcom/google/android/exoplayer2/offline/Downloader;->getDownloadedBytes()J

    move-result-wide v5

    cmp-long v7, v5, v0

    if-eqz v7, :cond_1

    .line 825
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reset error count. downloadedBytes = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$2200(Ljava/lang/String;Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V

    move-wide v0, v5

    const/4 v3, 0x0

    .line 829
    :cond_1
    iget v5, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->currentState:I

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    add-int/2addr v3, v6

    iget v5, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->minRetryCount:I

    if-gt v3, v5, :cond_2

    .line 832
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Download error. Retry "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p0}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$2200(Ljava/lang/String;Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V

    .line 833
    invoke-direct {p0, v3}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->getRetryDelayMillis(I)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    .line 830
    :cond_2
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    :goto_1
    const/4 v0, 0x0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 841
    :goto_2
    iget-object v1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->downloadManager:Lcom/google/android/exoplayer2/offline/DownloadManager;

    invoke-static {v1}, Lcom/google/android/exoplayer2/offline/DownloadManager;->access$1900(Lcom/google/android/exoplayer2/offline/DownloadManager;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;

    invoke-direct {v2, p0, v0}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;-><init>(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 705
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
