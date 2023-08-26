.class Lcom/daaw/avee/comp/IceCast/ContentAccessor$3;
.super Ljava/lang/Object;
.source "ContentAccessorOld.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/IceCast/ContentAccessor;->refreshEntries()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "Lcom/daaw/avee/Common/MultiList<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/IceCast/StationEntry;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/ContentAccessor;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/ContentAccessor;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor$3;->this$0:Lcom/daaw/avee/comp/IceCast/ContentAccessor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/daaw/avee/Common/MultiList;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 105
    new-instance p1, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {p1}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    .line 107
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor$3;->this$0:Lcom/daaw/avee/comp/IceCast/ContentAccessor;

    iput-object p1, p2, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->content:Lcom/daaw/avee/Common/MultiList;

    .line 108
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor$3;->this$0:Lcom/daaw/avee/comp/IceCast/ContentAccessor;

    iget-object p1, p1, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->RefreshContent()Z

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 100
    check-cast p1, Lcom/daaw/avee/Common/MultiList;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/IceCast/ContentAccessor$3;->onResult(Lcom/daaw/avee/Common/MultiList;Z)V

    return-void
.end method
