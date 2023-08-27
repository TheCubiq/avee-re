.class public Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;
.super Landroid/app/DialogFragment;
.source "SongDetailsDialog.java"


# static fields
.field private static final arg1:Ljava/lang/String; = "arg1"

.field private static final arg2:Ljava/lang/String; = "arg2"

.field private static final arg3:Ljava/lang/String; = "arg3"

.field private static final arg4:Ljava/lang/String; = "arg4"

.field private static final arg5:Ljava/lang/String; = "arg5"

.field private static final arg6:Ljava/lang/String; = "arg6"

.field private static final argSrc:Ljava/lang/String; = "argSrc"

.field private static final argSrcFile:Ljava/lang/String; = "argSrcFile"

.field public static onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 98
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static createAndShowDialog(Lcom/daaw/avee/ContextData;Landroid/content/Context;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;
    .locals 0

    .line 45
    invoke-static {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->newInstance(Landroid/content/Context;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;

    move-result-object p1

    const-string p2, "SongDetailsDialog"

    .line 46
    invoke-static {p1, p2, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object p1
.end method

.method private static emptyStrIfZero(I)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-lez p0, :cond_0

    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private static newInstance(Landroid/content/Context;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;
    .locals 7

    .line 51
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;-><init>()V

    .line 53
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-virtual {p1, p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataDetailsBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;

    move-result-object p0

    .line 57
    iget v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackNum:I

    invoke-static {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->emptyStrIfZero(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    iget v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->cdNum:I

    invoke-static {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->emptyStrIfZero(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->artistName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->albumArtist:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    iget v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->year:I

    invoke-static {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->emptyStrIfZero(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->composer:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    iget v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->bitRate:I

    const-string v3, ""

    if-lez v2, :cond_0

    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->bitRate:I

    div-int/lit16 v4, v4, 0x3e8

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "kbps"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    :goto_0
    iget v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->width:I

    if-lez v2, :cond_1

    iget v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->height:I

    if-lez v2, :cond_1

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->width:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->height:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    :goto_1
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath0Str()Ljava/lang/String;

    move-result-object v2

    .line 82
    iget-object v3, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath1Str()Ljava/lang/String;

    move-result-object v3

    .line 84
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 85
    iget-boolean v5, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->isStream:Z

    const-string v6, "arg1"

    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 86
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getConstrucPath()Ljava/lang/String;

    move-result-object p1

    const-string v5, "argSrc"

    invoke-virtual {v4, v5, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->filePath:Ljava/lang/String;

    const-string v5, "argSrcFile"

    invoke-virtual {v4, v5, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "arg2"

    .line 88
    invoke-virtual {v4, p1, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string p1, "arg3"

    .line 89
    invoke-virtual {v4, p1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "arg4"

    .line 90
    invoke-virtual {v4, p1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "arg5"

    invoke-virtual {v4, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtGenerateStr()Ljava/lang/String;

    move-result-object p0

    const-string p1, "arg6"

    invoke-virtual {v4, p1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 20

    .line 107
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "arg1"

    .line 108
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v1, "argSrc"

    .line 109
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "argSrcFile"

    .line 110
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "arg2"

    .line 111
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    const-string v4, "arg3"

    .line 112
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "arg4"

    .line 113
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "arg5"

    .line 114
    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    const-string v7, "arg6"

    .line 115
    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->getActivity()Landroid/app/Activity;

    move-result-object v8

    invoke-direct {v7, v8}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 119
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->getActivity()Landroid/app/Activity;

    move-result-object v8

    const v9, 0x7f0c0065

    const/4 v10, 0x0

    invoke-static {v8, v9, v10}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 120
    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const/4 v9, 0x2

    new-array v10, v9, [Landroid/widget/TextView;

    const v11, 0x7f090223

    .line 125
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    const/4 v12, 0x0

    aput-object v11, v10, v12

    .line 126
    aget-object v11, v10, v12

    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f090199

    const/16 v11, 0x8

    const/4 v13, 0x1

    if-eqz v2, :cond_0

    .line 127
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v14

    if-lez v14, :cond_0

    .line 128
    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f090224

    .line 129
    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    aput-object v1, v10, v13

    .line 130
    aget-object v1, v10, v13

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const/16 v1, 0xa

    new-array v2, v1, [Landroid/widget/TableRow;

    new-array v1, v1, [Landroid/widget/TextView;

    const v10, 0x7f09019a

    .line 138
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    aput-object v10, v2, v12

    const v10, 0x7f09019d

    .line 139
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    aput-object v10, v2, v13

    const v10, 0x7f09019f

    .line 140
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    aput-object v10, v2, v9

    const v10, 0x7f0901a0

    .line 141
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    const/4 v14, 0x3

    aput-object v10, v2, v14

    const v10, 0x7f0901a1

    .line 142
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    const/4 v15, 0x4

    aput-object v10, v2, v15

    const v10, 0x7f0901a2

    .line 143
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    const/16 v16, 0x5

    aput-object v10, v2, v16

    const v10, 0x7f0901a3

    .line 144
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    const/16 v17, 0x6

    aput-object v10, v2, v17

    const v10, 0x7f0901a4

    .line 145
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    const/16 v18, 0x7

    aput-object v10, v2, v18

    const v10, 0x7f0901a5

    .line 146
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    aput-object v10, v2, v11

    const v10, 0x7f09019b

    .line 147
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TableRow;

    const/16 v19, 0x9

    aput-object v10, v2, v19

    const v10, 0x7f090225

    .line 149
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    aput-object v10, v1, v12

    const v10, 0x7f090227

    .line 150
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    aput-object v10, v1, v13

    const v10, 0x7f090228

    .line 151
    invoke-virtual {v8, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    aput-object v10, v1, v9

    const v9, 0x7f090229

    .line 152
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    aput-object v9, v1, v14

    const v9, 0x7f09022a

    .line 153
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    aput-object v9, v1, v15

    const v9, 0x7f09022b

    .line 154
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    aput-object v9, v1, v16

    const v9, 0x7f09022c

    .line 155
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    aput-object v9, v1, v17

    const v9, 0x7f09022d

    .line 156
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    aput-object v9, v1, v18

    const v9, 0x7f09022e

    .line 157
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    aput-object v9, v1, v11

    const v9, 0x7f090226

    .line 158
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    aput-object v9, v1, v19

    if-eqz v3, :cond_3

    const/4 v9, 0x0

    .line 161
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v9, v10, :cond_3

    .line 162
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_2

    .line 165
    :cond_1
    aget-object v10, v2, v9

    invoke-virtual {v10, v12}, Landroid/widget/TableRow;->setVisibility(I)V

    .line 166
    aget-object v10, v1, v9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/CharSequence;

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 163
    :cond_2
    :goto_2
    aget-object v10, v2, v9

    invoke-virtual {v10, v11}, Landroid/widget/TableRow;->setVisibility(I)V

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    const v1, 0x7f09011f

    .line 172
    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 174
    sget-object v2, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v3, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    invoke-direct {v3, v6, v4, v5, v0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v0, v4}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x7f100047

    .line 176
    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;)V

    invoke-virtual {v7, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 181
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method
