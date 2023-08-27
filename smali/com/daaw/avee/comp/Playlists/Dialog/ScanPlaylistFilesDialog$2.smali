.class Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$2;
.super Ljava/lang/Object;
.source "ScanPlaylistFilesDialog.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$2;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$2;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->access$000(Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 96
    check-cast p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$2;->invoke(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V

    return-void
.end method
