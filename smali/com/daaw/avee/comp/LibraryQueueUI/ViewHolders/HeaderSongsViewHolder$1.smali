.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$1;
.super Ljava/lang/Object;
.source "HeaderSongsViewHolder.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;)V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;->onShowAlbumArtInsteadChanged(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 66
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$1;->invoke(Ljava/lang/Boolean;)V

    return-void
.end method
