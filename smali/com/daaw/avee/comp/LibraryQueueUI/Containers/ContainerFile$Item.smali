.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;
.super Ljava/lang/Object;
.source "ContainerFile.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Item"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;",
        ">;"
    }
.end annotation


# instance fields
.field private final countOrSize:J

.field private index:I

.field private final isDir:Z

.field private final lastModified:J

.field private final name:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private final song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;


# direct methods
.method public constructor <init>(ZLjava/lang/String;JLjava/lang/String;J)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-wide v6, p6

    .line 739
    invoke-direct/range {v0 .. v8}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;-><init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;JLjava/lang/String;JLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
    .locals 1

    .line 742
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 730
    iput v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->index:I

    .line 743
    iput-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->isDir:Z

    .line 744
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->name:Ljava/lang/String;

    .line 745
    iput-wide p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->countOrSize:J

    .line 746
    iput-object p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->path:Ljava/lang/String;

    .line 747
    iput-wide p6, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->lastModified:J

    .line 749
    iput-object p8, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-void
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)I
    .locals 0

    .line 729
    iget p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->index:I

    return p0
.end method

.method static synthetic access$802(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;I)I
    .locals 0

    .line 729
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->index:I

    return p1
.end method


# virtual methods
.method public compareTo(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)I
    .locals 1

    .line 785
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->name:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 786
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 788
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 729
    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->compareTo(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;)I

    move-result p1

    return p1
.end method

.method public getCountOrSize()J
    .locals 2

    .line 769
    iget-wide v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->countOrSize:J

    return-wide v0
.end method

.method public getIndex()I
    .locals 1

    .line 757
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->index:I

    return v0
.end method

.method public getLastModified()J
    .locals 2

    .line 777
    iget-wide v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->lastModified:J

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 765
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 773
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getSong()Lcom/daaw/avee/comp/playback/Song/PlaylistSong;
    .locals 1

    .line 781
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->song:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-object v0
.end method

.method public isDirectory()Z
    .locals 1

    .line 761
    iget-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->isDir:Z

    return v0
.end method

.method public setIndex(I)V
    .locals 0

    .line 753
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$Item;->index:I

    return-void
.end method
