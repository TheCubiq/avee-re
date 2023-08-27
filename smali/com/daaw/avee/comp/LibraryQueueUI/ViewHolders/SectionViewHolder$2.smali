.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;
.super Ljava/lang/Object;
.source "SectionViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;

.field final synthetic val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 51
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSectionOpened()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->setSectionOpenedState(Z)V

    .line 52
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$2;->val$containerData:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSectionOpened()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->updateButtonState(Z)V

    return-void
.end method
