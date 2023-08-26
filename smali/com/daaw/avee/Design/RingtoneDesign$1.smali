.class Lcom/daaw/avee/Design/RingtoneDesign$1;
.super Ljava/lang/Object;
.source "RingtoneDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/RingtoneDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/ContextData;",
        "Ljava/util/Collection<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/RingtoneDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/RingtoneDesign;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/daaw/avee/Design/RingtoneDesign$1;->this$0:Lcom/daaw/avee/Design/RingtoneDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/util/Collection<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/avee/AppPermissions;->is_WRITE_SETTINGS_PermissionGranted(Landroid/content/Context;Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 33
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f10014d

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 34
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void

    .line 39
    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    .line 40
    :cond_1
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    if-nez p2, :cond_2

    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataDetailsBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;

    move-result-object p2

    .line 46
    iget-object v0, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->filePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_3

    .line 47
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f10014e

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 48
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void

    .line 52
    :cond_3
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->data:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object v0, v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->filePath:Ljava/lang/String;

    iget-object v1, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->artistName:Ljava/lang/String;

    iget-object v2, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->trackName:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$DataDetails;->mimeType:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2, p2}, Lcom/daaw/avee/comp/Ringtone/RingtoneUtils;->setRingtone(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/RingtoneDesign$1;->invoke(Lcom/daaw/avee/ContextData;Ljava/util/Collection;)V

    return-void
.end method
