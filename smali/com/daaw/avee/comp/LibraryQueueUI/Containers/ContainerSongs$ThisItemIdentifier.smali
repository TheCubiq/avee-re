.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;
.super Ljava/lang/Object;
.source "ContainerSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ThisItemIdentifier"
.end annotation


# instance fields
.field public itemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

.field public final itemPosition:I

.field public final song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Lcom/daaw/avee/comp/Common/IItemIdentifier;I)V
    .locals 0

    .line 512
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 513
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 514
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemIdent:Lcom/daaw/avee/comp/Common/IItemIdentifier;

    .line 515
    iput p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 525
    instance-of v0, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;

    iget p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 520
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerSongs$ThisItemIdentifier;->itemPosition:I

    return v0
.end method
