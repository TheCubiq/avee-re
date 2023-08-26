.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;
.super Ljava/lang/Object;
.source "SearchFilter.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
        ">;>;"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/String;Lcom/daaw/avee/Common/Tuple2;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)Z"
        }
    .end annotation

    .line 33
    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;->context:Landroid/content/Context;

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getDataBlocking(Landroid/content/Context;)Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 36
    iget-object v0, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 37
    :cond_0
    iget-object p2, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    .line 13
    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;->compare(Ljava/lang/String;Lcom/daaw/avee/Common/Tuple2;)Z

    move-result p1

    return p1
.end method

.method public preProcessItem(Lcom/daaw/avee/Common/Tuple2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Common/IItemIdentifier;",
            ">;)V"
        }
    .end annotation

    .line 28
    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->getData()Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    return-void
.end method

.method public bridge synthetic preProcessItem(Ljava/lang/Object;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilter;->preProcessItem(Lcom/daaw/avee/Common/Tuple2;)V

    return-void
.end method

.method public preProcessQuery(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
