.class final Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$2;
.super Ljava/lang/Object;
.source "FileSortingUtils.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)I
    .locals 0

    .line 24
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 21
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    check-cast p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/FileSortingUtils$2;->compare(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)I

    move-result p1

    return p1
.end method
