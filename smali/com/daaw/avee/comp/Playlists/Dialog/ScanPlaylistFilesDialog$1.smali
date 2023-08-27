.class Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$1;
.super Ljava/lang/Object;
.source "ScanPlaylistFilesDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$1;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 78
    sget-object p1, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onStopPlaylistScan:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method
