.class Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"

# interfaces
.implements Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$IResultReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Design/PlaylistsDesign;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ScanResultReceiver"
.end annotation


# instance fields
.field contextData:Lcom/daaw/avee/ContextData;

.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 380
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 382
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->contextData:Lcom/daaw/avee/ContextData;

    return-void
.end method


# virtual methods
.method public onFinished(Landroid/os/AsyncTask;ZLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/AsyncTask;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 397
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$100(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->compareTask(Landroid/os/AsyncTask;I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 399
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    iput-boolean v1, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->active:Z

    .line 400
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    const-string v0, "Finished"

    iput-object v0, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->text:Ljava/lang/String;

    .line 402
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->updatePlaylistScanStatus(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    .line 405
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->contextData:Lcom/daaw/avee/ContextData;

    if-eqz p1, :cond_1

    .line 406
    iget-object p2, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p2, p1, p3}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$700(Lcom/daaw/avee/Design/PlaylistsDesign;Lcom/daaw/avee/ContextData;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public onItem(Landroid/os/AsyncTask;Ljava/lang/String;)V
    .locals 1

    .line 412
    iget-object p2, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p2}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$100(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->compareTask(Landroid/os/AsyncTask;I)Z

    return-void
.end method

.method public onStarted(Landroid/os/AsyncTask;)V
    .locals 2

    .line 386
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$100(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->compareTask(Landroid/os/AsyncTask;I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 388
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->active:Z

    .line 389
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    const-string v0, "Starting"

    iput-object v0, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->text:Ljava/lang/String;

    .line 391
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->updatePlaylistScanStatus(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V

    return-void
.end method

.method public onStatusUpdate(Landroid/os/AsyncTask;Ljava/lang/String;)V
    .locals 2

    .line 417
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$100(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->compareTask(Landroid/os/AsyncTask;I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 419
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->active:Z

    .line 420
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    iput-object p2, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->text:Ljava/lang/String;

    .line 422
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->updatePlaylistScanStatus(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V

    return-void
.end method
