.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;
.super Ljava/lang/Object;
.source "ContainerFolders.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ThisItemIdentifier"
.end annotation


# instance fields
.field final id:Ljava/lang/String;

.field final path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->id:Ljava/lang/String;

    .line 196
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->path:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 206
    instance-of v0, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->id:Ljava/lang/String;

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;

    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->id:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFolders$ThisItemIdentifier;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
