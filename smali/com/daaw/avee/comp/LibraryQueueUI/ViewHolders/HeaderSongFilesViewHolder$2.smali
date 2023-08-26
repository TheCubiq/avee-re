.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder$2;
.super Ljava/lang/Object;
.source "HeaderSongFilesViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder;

.field final synthetic val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder$2;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongFilesViewHolder$2;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V

    return-void
.end method
