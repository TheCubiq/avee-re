.class Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$1;
.super Ljava/lang/Object;
.source "Fragment1.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
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
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Lcom/daaw/avee/Common/MultiList;
    .locals 1
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

    .line 99
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestQueueList:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Common/MultiList;

    invoke-direct {v0}, Lcom/daaw/avee/Common/MultiList;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/MultiList;

    return-object p1
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 96
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1$1;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Lcom/daaw/avee/Common/MultiList;

    move-result-object p1

    return-object p1
.end method
