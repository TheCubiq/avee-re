.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ChildContentAccessor;
.super Ljava/lang/Object;
.source "ContainerAlbums.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ChildContentAccessor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
        "Lcom/daaw/avee/Common/MultiList<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        ">;>;"
    }
.end annotation


# instance fields
.field private albumId:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ChildContentAccessor;->albumId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Lcom/daaw/avee/Common/MultiList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;",
            ")",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;"
        }
    .end annotation

    .line 58
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ChildContentAccessor;->albumId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums;->access$000(Landroid/content/Context;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 59
    invoke-static {p1, v2}, Lcom/daaw/avee/Common/MultiList;->fromList1FillWith2(Ljava/util/List;Ljava/lang/Object;)Lcom/daaw/avee/Common/MultiList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 47
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerAlbums$ChildContentAccessor;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Lcom/daaw/avee/Common/MultiList;

    move-result-object p1

    return-object p1
.end method
