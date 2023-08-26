.class Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;
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

.field final synthetic val$playlistNativeIds:Ljava/util/List;

.field final synthetic val$showOptions:Z


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;ZLandroid/widget/CheckBox;Ljava/util/List;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    iput-boolean p2, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->val$showOptions:Z

    iput-object p3, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->val$checkBoxOverwrite:Landroid/widget/CheckBox;

    iput-object p4, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->val$playlistNativeIds:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic lambda$onItemClick$0$PlaylistPickerDialog$1(Landroid/app/Activity;JZ[JLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 6

    .line 189
    iget-object p7, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    invoke-static {p7}, Lcom/daaw/avee/Common/UtilsUI;->dismissSafe(Landroid/app/DialogFragment;)V

    .line 190
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->onLibraryQueueUI_SubmitSongSendToPlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v1, p1

    move-object v3, p5

    move-object v4, p6

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 179
    iget-boolean p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->val$showOptions:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->val$checkBoxOverwrite:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ltz p3, :cond_1

    .line 182
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->val$playlistNativeIds:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p3, p1, :cond_1

    .line 183
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->val$playlistNativeIds:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 187
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 188
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;->this$0:Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    new-instance p2, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Playlists/Dialog/-$$Lambda$PlaylistPickerDialog$1$gSSomOHuX95R0mkbBYKroJzOdGo;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog$1;Landroid/app/Activity;JZ)V

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->access$000(Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;Lcom/daaw/avee/Common/Action3;)V

    :cond_1
    return-void
.end method
