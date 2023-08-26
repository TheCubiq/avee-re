.class final Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;
.super Ljava/lang/Object;
.source "DownloadService.java"

# interfaces
.implements Lcom/google/android/exoplayer2/offline/DownloadManager$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/offline/DownloadService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "DownloadManagerListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/exoplayer2/offline/DownloadService;


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/offline/DownloadService;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;->this$0:Lcom/google/android/exoplayer2/offline/DownloadService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/offline/DownloadService;Lcom/google/android/exoplayer2/offline/DownloadService$1;)V
    .locals 0

    .line 366
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;-><init>(Lcom/google/android/exoplayer2/offline/DownloadService;)V

    return-void
.end method


# virtual methods
.method public final onIdle(Lcom/google/android/exoplayer2/offline/DownloadManager;)V
    .locals 0

    .line 384
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;->this$0:Lcom/google/android/exoplayer2/offline/DownloadService;

    invoke-static {p1}, Lcom/google/android/exoplayer2/offline/DownloadService;->access$400(Lcom/google/android/exoplayer2/offline/DownloadService;)V

    return-void
.end method

.method public onInitialized(Lcom/google/android/exoplayer2/offline/DownloadManager;)V
    .locals 0

    .line 369
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;->this$0:Lcom/google/android/exoplayer2/offline/DownloadService;

    invoke-static {p1}, Lcom/google/android/exoplayer2/offline/DownloadService;->access$200(Lcom/google/android/exoplayer2/offline/DownloadService;)V

    return-void
.end method

.method public onTaskStateChanged(Lcom/google/android/exoplayer2/offline/DownloadManager;Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;)V
    .locals 0

    .line 374
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;->this$0:Lcom/google/android/exoplayer2/offline/DownloadService;

    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/offline/DownloadService;->onTaskStateChanged(Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;)V

    .line 375
    iget p1, p2, Lcom/google/android/exoplayer2/offline/DownloadManager$TaskState;->state:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 376
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;->this$0:Lcom/google/android/exoplayer2/offline/DownloadService;

    invoke-static {p1}, Lcom/google/android/exoplayer2/offline/DownloadService;->access$300(Lcom/google/android/exoplayer2/offline/DownloadService;)Lcom/google/android/exoplayer2/offline/DownloadService$ForegroundNotificationUpdater;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/offline/DownloadService$ForegroundNotificationUpdater;->startPeriodicUpdates()V

    goto :goto_0

    .line 378
    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadService$DownloadManagerListener;->this$0:Lcom/google/android/exoplayer2/offline/DownloadService;

    invoke-static {p1}, Lcom/google/android/exoplayer2/offline/DownloadService;->access$300(Lcom/google/android/exoplayer2/offline/DownloadService;)Lcom/google/android/exoplayer2/offline/DownloadService$ForegroundNotificationUpdater;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/offline/DownloadService$ForegroundNotificationUpdater;->update()V

    :goto_0
    return-void
.end method
