.class public Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;
.super Landroid/app/DialogFragment;
.source "ScanPlaylistFilesDialog.java"


# static fields
.field private static final arg1:Ljava/lang/String; = "arg1"

.field private static internalOnPlaylistScanStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestPlaylistScanStatus:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static onStopPlaylistScan:Lcom/daaw/avee/Common/Events/WeakEvent;


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private txtInfo:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onRequestPlaylistScanStatus:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 31
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onStopPlaylistScan:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 36
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->internalOnPlaylistScanStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    .line 35
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->listenerRefHolder:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->updateScanStatus(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V

    return-void
.end method

.method public static createAndShowScanPlaylistFilesDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;
    .locals 2

    .line 44
    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;-><init>()V

    const-string v1, "ScanPlaylistFilesDialog"

    .line 45
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object v0
.end method

.method private static newInstance(I)Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;
    .locals 3

    .line 50
    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;-><init>()V

    .line 51
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "arg1"

    .line 52
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 53
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static updatePlaylistScanStatus(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V
    .locals 1

    .line 40
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->internalOnPlaylistScanStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method private updateScanStatus(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V
    .locals 1

    .line 115
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 117
    :cond_0
    iget-boolean v0, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->active:Z

    if-eqz v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->txtInfo:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;->text:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 120
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->txtInfo:Landroid/widget/TextView;

    const-string v0, ".."

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    invoke-static {p0}, Lcom/daaw/avee/Common/UtilsUI;->dismissSafe(Landroid/app/DialogFragment;)V

    :goto_0
    return-void
.end method


# virtual methods
.method isViewCreated()Z
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->txtInfo:Landroid/widget/TextView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 94
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 96
    sget-object p1, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->internalOnPlaylistScanStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$2;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 66
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 68
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c0063

    invoke-static {v0, v2, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f090242

    .line 71
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->txtInfo:Landroid/widget/TextView;

    const v0, 0x7f100057

    .line 73
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 75
    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog$1;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;)V

    const v2, 0x7f100044

    invoke-virtual {p1, v2, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 83
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->onRequestPlaylistScanStatus:Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    if-eqz v0, :cond_0

    .line 85
    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->updateScanStatus(Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;)V

    .line 88
    :cond_0
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 107
    sget-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->internalOnPlaylistScanStatusUpdated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v1, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->unSubscribeWeak(Ljava/util/List;)V

    .line 108
    iget-object v0, p0, Lcom/daaw/avee/comp/Playlists/Dialog/ScanPlaylistFilesDialog;->listenerRefHolder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 110
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    return-void
.end method
