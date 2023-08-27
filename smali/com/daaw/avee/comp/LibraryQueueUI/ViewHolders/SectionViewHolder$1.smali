.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$1;
.super Ljava/lang/Object;
.source "SectionViewHolder.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 37
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$1;->onResult(Ljava/lang/String;Z)V

    return-void
.end method

.method public onResult(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p2, :cond_0

    return-void

    .line 41
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;

    invoke-static {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/SectionViewHolder;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
