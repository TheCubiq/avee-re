.class Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;
.super Ljava/lang/Object;
.source "DownloadManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;

.field final synthetic val$finalError:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;Ljava/lang/Throwable;)V
    .locals 0

    .line 842
    iput-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;->this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;

    iput-object p2, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;->val$finalError:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 845
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;->this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;

    iget-object v1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;->val$finalError:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;->val$finalError:Ljava/lang/Throwable;

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->access$2500(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;IILjava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;->this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;

    const/4 v1, 0x6

    const/4 v2, 0x3

    .line 849
    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->access$2100(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;II)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$2;->this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 850
    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->access$2100(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;II)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 853
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_2
    :goto_1
    return-void
.end method
