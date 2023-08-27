.class Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;
.super Ljava/lang/Object;
.source "PlaylistPickerDialog.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/Song/PlaylistSong$OnDataReadyListener;


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

.field final synthetic val$loadedCount:[I

.field final synthetic val$songPaths:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;[ILjava/util/ArrayList;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;->val$loadedCount:[I

    iput-object p3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;->val$songPaths:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataReady(Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 259
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;->val$loadedCount:[I

    const/4 p2, 0x0

    aget p3, p1, p2

    add-int/lit8 p3, p3, 0x1

    aput p3, p1, p2

    .line 261
    aget p1, p1, p2

    iget-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;->val$songPaths:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lt p1, p2, :cond_0

    .line 263
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$5;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    iget-object p2, p1, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songs:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->access$100(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method
