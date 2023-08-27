.class Lcom/daaw/avee/Design/PlaylistsDesign$3;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaylistsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$3;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 5

    .line 74
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 77
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$3;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$200(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;

    move-result-object v1

    iput-object p1, v1, Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;->contextData:Lcom/daaw/avee/ContextData;

    .line 80
    new-instance v1, Ljava/io/File;

    const-string v2, "/storage/"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/daaw/avee/Design/PlaylistsDesign$SearchFilter;

    invoke-direct {v2}, Lcom/daaw/avee/Design/PlaylistsDesign$SearchFilter;-><init>()V

    new-instance v3, Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/daaw/avee/Design/PlaylistsDesign$3;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    .line 83
    invoke-static {v4}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$200(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$ScanResultReceiver;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 80
    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->createScanPlaylistFilesTask(Landroid/content/Context;Ljava/io/File;Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask$FilterComparable;Ljava/lang/ref/WeakReference;)Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;

    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$3;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$100(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->setTask(Landroid/os/AsyncTask;I)V

    .line 87
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Playlists/ScanPlaylistFilesTask;->start()V

    .line 90
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 92
    invoke-static {p1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->createAndShowScanPlaylistFilesDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 70
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/PlaylistsDesign$3;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
