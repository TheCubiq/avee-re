.class Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;
.super Ljava/lang/Object;
.source "CreatePlaylistDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;

.field final synthetic val$addSongsNativePL:[J

.field final synthetic val$editTxtPlaylistName:Landroid/widget/EditText;

.field final synthetic val$songDataSourcePL:Ljava/util/ArrayList;

.field final synthetic val$spinnerType:Landroid/widget/Spinner;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;Landroid/widget/EditText;Landroid/widget/Spinner;[JLjava/util/ArrayList;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$editTxtPlaylistName:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$spinnerType:Landroid/widget/Spinner;

    iput-object p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$addSongsNativePL:[J

    iput-object p5, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$songDataSourcePL:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .line 107
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$editTxtPlaylistName:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 109
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$spinnerType:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result p1

    if-ltz p1, :cond_1

    .line 111
    sget-object p2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->playlistFilesTypes:[Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    array-length p2, p2

    const/4 v0, 0x1

    add-int/2addr p2, v0

    if-ge p1, p2, :cond_1

    if-nez p1, :cond_0

    .line 113
    sget-object p1, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->onSubmitCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$addSongsNativePL:[J

    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$songDataSourcePL:Ljava/util/ArrayList;

    invoke-virtual {p1, v2, p2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 115
    :cond_0
    sget-object p2, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->playlistFilesTypes:[Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    sub-int/2addr p1, v0

    aget-object v3, p2, p1

    .line 116
    sget-object p1, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->onSubmitCreateStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    const/4 v1, 0x0

    iget-object v4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;->val$songDataSourcePL:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
