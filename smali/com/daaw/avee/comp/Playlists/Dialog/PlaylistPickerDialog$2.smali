.class Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;
.super Ljava/lang/Object;
.source "PlaylistPickerDialog.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


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

.field final synthetic val$checkBoxOverwrite:Landroid/widget/CheckBox;

.field final synthetic val$checkBoxRelative:Landroid/widget/CheckBox;

.field final synthetic val$playlistIdhashAndPath:Lcom/daaw/avee/Common/MultiList;

.field final synthetic val$showOptions:Z


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;ZLandroid/widget/CheckBox;Landroid/widget/CheckBox;Lcom/daaw/avee/Common/MultiList;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    iput-boolean p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$showOptions:Z

    iput-object p3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$checkBoxOverwrite:Landroid/widget/CheckBox;

    iput-object p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$checkBoxRelative:Landroid/widget/CheckBox;

    iput-object p5, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$playlistIdhashAndPath:Lcom/daaw/avee/Common/MultiList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic lambda$onItemClick$0$PlaylistPickerDialog$2(Lcom/daaw/avee/Common/Tuple2;ZZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 6

    .line 210
    iget-object p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    invoke-static {p4}, Lcom/daaw/avee/Common/UtilsUI;->dismissSafe(Landroid/app/DialogFragment;)V

    .line 211
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onLibraryQueueUI_SubmitSongSendToStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    iget-object v2, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v3, p6

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 200
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$showOptions:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$checkBoxOverwrite:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 201
    :goto_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$checkBoxRelative:Landroid/widget/CheckBox;

    invoke-virtual {p2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p2

    if-ltz p3, :cond_1

    .line 205
    iget-object p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$playlistIdhashAndPath:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p4}, Lcom/daaw/avee/Common/MultiList;->size()I

    move-result p4

    if-ge p3, p4, :cond_1

    .line 206
    iget-object p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->val$playlistIdhashAndPath:Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p4, p3}, Lcom/daaw/avee/Common/MultiList;->get(I)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p3

    .line 209
    iget-object p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    new-instance p5, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;

    invoke-direct {p5, p0, p3, p1, p2}, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$2$NutoTgXyi056TIzxL0EyhgR_VMo;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$2;Lcom/daaw/avee/Common/Tuple2;ZZ)V

    invoke-static {p4, p5}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->access$000(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;Lcom/daaw/avee/Common/Action3;)V

    :cond_1
    return-void
.end method
