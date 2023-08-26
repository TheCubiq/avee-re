.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;
.super Ljava/lang/Object;
.source "ContainerFile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ThisItemIdentifier"
.end annotation


# instance fields
.field public item:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

.field public itemPosition:I


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;I)V
    .locals 0

    .line 709
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 710
    iput p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->itemPosition:I

    .line 711
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 725
    instance-of v0, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->itemPosition:I

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;

    iget p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->itemPosition:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 715
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 720
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$ThisItemIdentifier;->itemPosition:I

    return v0
.end method
