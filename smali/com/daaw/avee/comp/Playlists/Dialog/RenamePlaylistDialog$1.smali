.class Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog$1;
.super Ljava/lang/Object;
.source "RenamePlaylistDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;

.field final synthetic val$editTxtPlaylistName:Landroid/widget/EditText;

.field final synthetic val$playlistId:J


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;Landroid/widget/EditText;J)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog$1;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog$1;->val$editTxtPlaylistName:Landroid/widget/EditText;

    iput-wide p3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog$1;->val$playlistId:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 68
    sget-object p1, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;->onSubmitRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog$1;->val$editTxtPlaylistName:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-wide v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog$1;->val$playlistId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog$1;->val$editTxtPlaylistName:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
