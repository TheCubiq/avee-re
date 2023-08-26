.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$2;
.super Ljava/lang/Object;
.source "HeaderSongsViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;

.field final synthetic val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$2;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$2;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V

    return-void
.end method
