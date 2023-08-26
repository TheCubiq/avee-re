.class Lchristophedelory/playlist/Playlist$Normalization;
.super Lchristophedelory/playlist/BasePlaylistVisitor;
.source "Playlist.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lchristophedelory/playlist/Playlist;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Normalization"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Lchristophedelory/playlist/BasePlaylistVisitor;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lchristophedelory/playlist/Playlist$1;)V
    .locals 0

    .line 93
    invoke-direct {p0}, Lchristophedelory/playlist/Playlist$Normalization;-><init>()V

    return-void
.end method

.method private endVisitTimeContainer(Lchristophedelory/playlist/AbstractTimeContainer;)V
    .locals 6

    .line 153
    invoke-virtual {p1}, Lchristophedelory/playlist/AbstractTimeContainer;->getParent()Lchristophedelory/playlist/AbstractTimeContainer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 158
    invoke-virtual {p1}, Lchristophedelory/playlist/AbstractTimeContainer;->getComponentsNumber()I

    move-result v1

    if-nez v1, :cond_0

    .line 163
    invoke-static {}, Lchristophedelory/playlist/Playlist;->access$100()Lorg/myapache/commons/logging/Log;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Removing empty time container "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/myapache/commons/logging/Log;->info(Ljava/lang/Object;)V

    .line 164
    invoke-virtual {v0, p1}, Lchristophedelory/playlist/AbstractTimeContainer;->removeComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)Z

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 170
    invoke-virtual {p1}, Lchristophedelory/playlist/AbstractTimeContainer;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v1

    .line 171
    invoke-static {}, Lchristophedelory/playlist/Playlist;->access$100()Lorg/myapache/commons/logging/Log;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Replacing time container "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " with its single child component "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    aget-object v5, v1, v4

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/myapache/commons/logging/Log;->info(Ljava/lang/Object;)V

    .line 172
    aget-object v2, v1, v4

    aget-object v3, v1, v4

    invoke-virtual {v3}, Lchristophedelory/playlist/AbstractPlaylistComponent;->getRepeatCount()I

    move-result v3

    invoke-virtual {p1}, Lchristophedelory/playlist/AbstractTimeContainer;->getRepeatCount()I

    move-result v5

    mul-int v3, v3, v5

    invoke-virtual {v2, v3}, Lchristophedelory/playlist/AbstractPlaylistComponent;->setRepeatCount(I)V

    .line 173
    aget-object v2, v1, v4

    invoke-virtual {p1, v2}, Lchristophedelory/playlist/AbstractTimeContainer;->removeComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)Z

    .line 174
    invoke-virtual {v0, p1}, Lchristophedelory/playlist/AbstractTimeContainer;->removeComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)Z

    .line 176
    aget-object p1, v1, v4

    invoke-virtual {v0, p1}, Lchristophedelory/playlist/AbstractTimeContainer;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private mergeConsecutiveIdenticalMedia(Lchristophedelory/playlist/Sequence;)V
    .locals 10

    .line 190
    invoke-virtual {p1}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    const/4 v1, 0x0

    .line 192
    :goto_0
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_7

    .line 194
    aget-object v2, v0, v1

    instance-of v2, v2, Lchristophedelory/playlist/Media;

    if-eqz v2, :cond_6

    .line 196
    aget-object v2, v0, v1

    check-cast v2, Lchristophedelory/playlist/Media;

    add-int/lit8 v3, v1, 0x1

    move v5, v1

    move v4, v3

    .line 199
    :goto_1
    array-length v6, v0

    if-ge v4, v6, :cond_4

    .line 202
    aget-object v6, v0, v4

    instance-of v6, v6, Lchristophedelory/playlist/Media;

    if-nez v6, :cond_0

    goto :goto_2

    .line 207
    :cond_0
    aget-object v6, v0, v4

    check-cast v6, Lchristophedelory/playlist/Media;

    .line 210
    invoke-virtual {v6}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v6}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v7

    invoke-virtual {v2}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v8

    invoke-virtual {v7, v8}, Lmychristophedelory/content/Content;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_2

    .line 216
    :cond_1
    invoke-virtual {v6}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v7

    if-nez v7, :cond_2

    invoke-virtual {v2}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v7

    if-nez v7, :cond_4

    .line 217
    :cond_2
    invoke-virtual {v6}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2}, Lchristophedelory/playlist/Media;->getDuration()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v4, 0x1

    move v9, v5

    move v5, v4

    move v4, v9

    goto :goto_1

    :cond_4
    :goto_2
    if-le v5, v1, :cond_6

    .line 228
    new-instance v2, Lchristophedelory/playlist/Sequence;

    invoke-direct {v2}, Lchristophedelory/playlist/Sequence;-><init>()V

    add-int/lit8 v4, v5, 0x1

    sub-int/2addr v4, v1

    .line 229
    invoke-virtual {v2, v4}, Lchristophedelory/playlist/Sequence;->setRepeatCount(I)V

    .line 230
    invoke-static {}, Lchristophedelory/playlist/Playlist;->access$100()Lorg/myapache/commons/logging/Log;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Merging "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " identical media in a new sequence"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Lorg/myapache/commons/logging/Log;->info(Ljava/lang/Object;)V

    .line 231
    invoke-virtual {p1, v1, v2}, Lchristophedelory/playlist/Sequence;->addComponent(ILchristophedelory/playlist/AbstractPlaylistComponent;)V

    :goto_3
    if-gt v1, v5, :cond_5

    .line 235
    invoke-virtual {p1, v3}, Lchristophedelory/playlist/Sequence;->removeComponent(I)Lchristophedelory/playlist/AbstractPlaylistComponent;

    .line 236
    aget-object v4, v0, v1

    invoke-virtual {v2, v4}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    move v1, v5

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method private mergeConsecutiveSequences(Lchristophedelory/playlist/Sequence;)V
    .locals 8

    .line 254
    invoke-virtual {p1}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    .line 257
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-lez v1, :cond_2

    add-int/lit8 v2, v1, -0x1

    .line 259
    aget-object v3, v0, v2

    instance-of v3, v3, Lchristophedelory/playlist/Sequence;

    if-eqz v3, :cond_1

    aget-object v3, v0, v1

    instance-of v3, v3, Lchristophedelory/playlist/Sequence;

    if-eqz v3, :cond_1

    .line 261
    aget-object v2, v0, v2

    check-cast v2, Lchristophedelory/playlist/Sequence;

    .line 262
    aget-object v3, v0, v1

    check-cast v3, Lchristophedelory/playlist/Sequence;

    .line 264
    invoke-virtual {v2}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v4

    invoke-virtual {v3}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v5

    if-ne v4, v5, :cond_1

    .line 267
    invoke-static {}, Lchristophedelory/playlist/Playlist;->access$100()Lorg/myapache/commons/logging/Log;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Merging sequence "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " in sequence "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lorg/myapache/commons/logging/Log;->info(Ljava/lang/Object;)V

    .line 268
    invoke-virtual {v3}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v4

    .line 270
    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 272
    invoke-virtual {v2, v7}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 276
    :cond_0
    invoke-virtual {p1, v3}, Lchristophedelory/playlist/Sequence;->removeComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)Z

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public endVisitMedia(Lchristophedelory/playlist/Media;)V
    .locals 3

    .line 99
    invoke-virtual {p1}, Lchristophedelory/playlist/Media;->getSource()Lmychristophedelory/content/Content;

    move-result-object v0

    if-nez v0, :cond_0

    .line 101
    invoke-static {}, Lchristophedelory/playlist/Playlist;->access$100()Lorg/myapache/commons/logging/Log;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Removing media with no source: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/myapache/commons/logging/Log;->info(Ljava/lang/Object;)V

    .line 102
    invoke-virtual {p1}, Lchristophedelory/playlist/Media;->getParent()Lchristophedelory/playlist/AbstractTimeContainer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lchristophedelory/playlist/AbstractTimeContainer;->removeComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)Z

    :cond_0
    return-void
.end method

.method public endVisitParallel(Lchristophedelory/playlist/Parallel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 109
    invoke-direct {p0, p1}, Lchristophedelory/playlist/Playlist$Normalization;->endVisitTimeContainer(Lchristophedelory/playlist/AbstractTimeContainer;)V

    return-void
.end method

.method public endVisitSequence(Lchristophedelory/playlist/Sequence;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 115
    invoke-direct {p0, p1}, Lchristophedelory/playlist/Playlist$Normalization;->endVisitTimeContainer(Lchristophedelory/playlist/AbstractTimeContainer;)V

    .line 120
    invoke-virtual {p1}, Lchristophedelory/playlist/Sequence;->getParent()Lchristophedelory/playlist/AbstractTimeContainer;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lchristophedelory/playlist/Sequence;->getComponentsNumber()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 122
    invoke-virtual {p1}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    const/4 v1, 0x0

    .line 124
    aget-object v2, v0, v1

    instance-of v2, v2, Lchristophedelory/playlist/Sequence;

    if-eqz v2, :cond_0

    .line 126
    aget-object v0, v0, v1

    check-cast v0, Lchristophedelory/playlist/Sequence;

    .line 128
    invoke-static {}, Lchristophedelory/playlist/Playlist;->access$100()Lorg/myapache/commons/logging/Log;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Merging root sequence "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " with its single child sequence "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/myapache/commons/logging/Log;->info(Ljava/lang/Object;)V

    .line 129
    invoke-virtual {p1}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v2

    invoke-virtual {v0}, Lchristophedelory/playlist/Sequence;->getRepeatCount()I

    move-result v3

    mul-int v2, v2, v3

    invoke-virtual {p1, v2}, Lchristophedelory/playlist/Sequence;->setRepeatCount(I)V

    .line 130
    invoke-virtual {v0}, Lchristophedelory/playlist/Sequence;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v2

    .line 131
    invoke-virtual {p1, v0}, Lchristophedelory/playlist/Sequence;->removeComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)Z

    .line 133
    array-length v0, v2

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v3, v2, v1

    .line 135
    invoke-virtual {p1, v3}, Lchristophedelory/playlist/Sequence;->addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 140
    :cond_0
    invoke-direct {p0, p1}, Lchristophedelory/playlist/Playlist$Normalization;->mergeConsecutiveIdenticalMedia(Lchristophedelory/playlist/Sequence;)V

    .line 141
    invoke-direct {p0, p1}, Lchristophedelory/playlist/Playlist$Normalization;->mergeConsecutiveSequences(Lchristophedelory/playlist/Sequence;)V

    return-void
.end method
