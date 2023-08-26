.class public Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;
.super Landroid/app/DialogFragment;
.source "CreatePlaylistDialog.java"


# static fields
.field private static final arg1:Ljava/lang/String; = "arg1"

.field private static final arg2:Ljava/lang/String; = "arg2"

.field private static final arg3:Ljava/lang/String; = "arg3"

.field private static final arg4:Ljava/lang/String; = "arg4"

.field public static onSubmitCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/String;",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onSubmitCreateStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent5<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->onSubmitCreatePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 33
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->onSubmitCreateStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent5;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static createAndShowCreatePlaylistDialog(Lcom/daaw/avee/ContextData;[JLjava/util/List;)Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/ContextData;",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;"
        }
    .end annotation

    .line 41
    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->newInstance([JLjava/util/List;)Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;

    move-result-object p1

    const-string p2, "CreatePlaylistDialog"

    .line 42
    invoke-static {p1, p2, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object p1
.end method

.method private static newInstance([JLjava/util/List;)Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;-><init>()V

    .line 48
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "arg1"

    const/4 v3, 0x0

    .line 49
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "arg2"

    const/4 v3, 0x0

    .line 50
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    check-cast p1, Ljava/util/ArrayList;

    const-string v2, "arg3"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string p1, "arg4"

    .line 52
    invoke-virtual {v1, p1, p0}, Landroid/os/Bundle;->putLongArray(Ljava/lang/String;[J)V

    .line 53
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 12

    .line 59
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "arg1"

    .line 61
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "arg2"

    .line 62
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "arg3"

    .line 63
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    const-string v2, "arg4"

    .line 64
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getLongArray(Ljava/lang/String;)[J

    move-result-object v7

    .line 66
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {p1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 68
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0c003e

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 69
    invoke-virtual {p1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v3, 0x7f0900cc

    .line 71
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/widget/EditText;

    if-nez v1, :cond_0

    const v1, 0x7f100041

    .line 73
    invoke-virtual {v5, v1}, Landroid/widget/EditText;->setText(I)V

    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v5, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const v1, 0x7f0901dd

    .line 77
    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/Spinner;

    .line 79
    sget-object v1, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->playlistFilesTypes:[Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    array-length v1, v1

    const/4 v3, 0x1

    add-int/2addr v1, v3

    new-array v1, v1, [Ljava/lang/String;

    .line 80
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v9, 0x7f100115

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    aput-object v4, v1, v9

    const/4 v4, 0x0

    .line 81
    :goto_1
    sget-object v10, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->playlistFilesTypes:[Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    array-length v10, v10

    if-ge v4, v10, :cond_1

    add-int/lit8 v10, v4, 0x1

    .line 82
    sget-object v11, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->playlistFilesTypes:[Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    aget-object v4, v11, v4

    iget-object v4, v4, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;->name:Ljava/lang/String;

    aput-object v4, v1, v10

    move v4, v10

    goto :goto_1

    .line 84
    :cond_1
    new-instance v4, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->getActivity()Landroid/app/Activity;

    move-result-object v10

    const v11, 0x1090008

    invoke-direct {v4, v10, v11, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 86
    invoke-virtual {v6, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const v1, 0x7f090242

    .line 89
    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-nez v7, :cond_2

    if-nez v8, :cond_2

    const/16 v2, 0x8

    .line 91
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 93
    :cond_2
    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v7, :cond_3

    .line 94
    array-length v2, v7

    goto :goto_2

    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 95
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v10, 0x7f0e000a

    new-array v3, v3, [Ljava/lang/Object;

    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v3, v9

    .line 95
    invoke-virtual {v4, v10, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 97
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    if-nez v0, :cond_4

    const v0, 0x7f100042

    .line 101
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f100048

    .line 103
    new-instance v1, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;

    move-object v3, v1

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$1;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;Landroid/widget/EditText;Landroid/widget/Spinner;[JLjava/util/ArrayList;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_4
    const v0, 0x7f100044

    .line 124
    new-instance v1, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog$2;-><init>(Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 130
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
