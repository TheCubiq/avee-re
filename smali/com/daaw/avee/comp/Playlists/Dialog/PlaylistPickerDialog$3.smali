.class Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;
.super Ljava/lang/Object;
.source "PlaylistPickerDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$onClick$0(Landroid/app/Activity;[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    .line 234
    sget-object p3, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onActionCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v0, Lcom/daaw/avee/ContextData;

    invoke-direct {v0, p0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p3, p1, p2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 223
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    iget-boolean p1, p1, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceForPlaylistIsLoaded:Z

    if-nez p1, :cond_0

    .line 225
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceLoadingIsCanceled:Z

    return-void

    .line 232
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object p1

    .line 233
    iget-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$3;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$3$M1D7EZWfqN2O-QHKghj4xY_hl6Y;

    invoke-direct {v0, p1}, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$3$M1D7EZWfqN2O-QHKghj4xY_hl6Y;-><init>(Landroid/app/Activity;)V

    invoke-static {p2, v0}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->access$000(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;Lcom/daaw/avee/Common/Action3;)V

    return-void
.end method
