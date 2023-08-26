.class Lcom/google/android/exoplayer2/offline/DownloadManager$Task$1;
.super Ljava/lang/Object;
.source "DownloadManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->cancel()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;)V
    .locals 0

    .line 762
    iput-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$1;->this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 765
    iget-object v0, p0, Lcom/google/android/exoplayer2/offline/DownloadManager$Task$1;->this$0:Lcom/google/android/exoplayer2/offline/DownloadManager$Task;

    const/4 v1, 0x5

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/offline/DownloadManager$Task;->access$2100(Lcom/google/android/exoplayer2/offline/DownloadManager$Task;II)Z

    return-void
.end method
