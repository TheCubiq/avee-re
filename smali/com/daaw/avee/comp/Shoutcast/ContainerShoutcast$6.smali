.class final Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$6;
.super Ljava/lang/Object;
.source "ContainerShoutcast.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->getViewStatic(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Ljava/lang/Object;Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;Lcom/daaw/avee/comp/Common/IItemIdentifier;IILcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action1<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 389
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 389
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$6;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    return-void
.end method
