.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$9;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LibraryQueueUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Lcom/daaw/avee/ContextData;",
        "Ljava/lang/Integer;",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$9;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;Landroid/view/View;)V
    .locals 4

    .line 215
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 218
    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    .line 220
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v2, 0x78

    const-string v3, ""

    if-eq p2, v2, :cond_3

    const/16 v2, 0x7d

    if-eq p2, v2, :cond_2

    const/16 p3, 0x456

    if-eq p2, p3, :cond_1

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 261
    :pswitch_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_showAlbumArtInstead:I

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->toggleBool(I)V

    goto :goto_0

    .line 257
    :pswitch_1
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_followCurrentState:I

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->toggleBool(I)V

    goto :goto_0

    .line 253
    :pswitch_2
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$9;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$100(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    goto :goto_0

    .line 243
    :pswitch_3
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 245
    invoke-virtual {p2}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getQueue()Lcom/daaw/avee/Common/MultiList;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/Common/MultiList;->unmodifiableList1()Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x1

    .line 247
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;->createAndShowPlaylistPickerDialog(Lcom/daaw/avee/ContextData;Ljava/util/List;Ljava/lang/Boolean;)Lcom/daaw/avee/comp/Playlists/Dialog/PlaylistPickerDialog;

    goto :goto_0

    .line 229
    :pswitch_4
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f1000a5

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 230
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    if-eqz v1, :cond_4

    .line 224
    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->createAndShowDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;

    goto :goto_0

    .line 236
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 238
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 p3, 0x0

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0, v0, p3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->open(Ljava/util/List;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_4

    .line 267
    invoke-static {p1, p3, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->createAndShowDialog(Lcom/daaw/avee/ContextData;Landroid/view/View;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;

    goto :goto_0

    :cond_3
    const p2, 0x7f100038

    const-string p3, "libraryAddFolder"

    .line 272
    invoke-static {p1, p3, p2, v3}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->createAndShowDialog(Lcom/daaw/avee/ContextData;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    :cond_4
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6e
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 211
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$9;->invoke(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;Landroid/view/View;)V

    return-void
.end method
