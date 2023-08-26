.class Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$4;
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

    .line 239
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$4;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 241
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$4;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->songDataSourceLoadingIsCanceled:Z

    return-void
.end method
