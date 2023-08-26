.class Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;
.super Ljava/lang/Object;
.source "ContainerShoutcastGenresPri.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;",
        "Lcom/daaw/avee/Common/StatusMsg;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;

.field final synthetic val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->this$0:Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;

    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/daaw/avee/Common/Tuple2;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_2

    .line 258
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 260
    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/Common/StatusMsg;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/StatusMsg;->hasCriticalError()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 261
    iget-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/avee/Common/StatusMsg;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/StatusMsg;->getFullMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->updateStatusInfo(Ljava/lang/String;)V

    goto :goto_0

    .line 263
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->updateStatusInfo(Ljava/lang/String;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    .line 265
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->updateStatusInfo(Ljava/lang/String;)V

    :goto_1
    if-nez p2, :cond_3

    .line 268
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 269
    :cond_3
    iget-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->this$0:Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;

    iput-object p2, p1, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary;->content:Ljava/util/List;

    .line 270
    iget-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->RefreshContent()Z

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 235
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcastGenresPri$ContentAccessorGenresPrimary$1;->onResult(Lcom/daaw/avee/Common/Tuple2;Z)V

    return-void
.end method
