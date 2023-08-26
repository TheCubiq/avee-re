.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$1;
.super Ljava/lang/Object;
.source "ContentItemViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

.field final synthetic val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$1;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 169
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$1;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;

    iget v1, v1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemPosition:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->onListViewClick(ILandroid/content/Context;)Z

    return-void
.end method
