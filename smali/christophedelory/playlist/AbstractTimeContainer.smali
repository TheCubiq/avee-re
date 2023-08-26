.class public abstract Lchristophedelory/playlist/AbstractTimeContainer;
.super Lchristophedelory/playlist/AbstractPlaylistComponent;
.source "AbstractTimeContainer.java"


# instance fields
.field private final _components:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/playlist/AbstractPlaylistComponent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lchristophedelory/playlist/AbstractPlaylistComponent;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 137
    invoke-virtual {p0}, Lchristophedelory/playlist/AbstractTimeContainer;->getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;

    move-result-object v0

    .line 139
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 141
    invoke-virtual {v3, p1}, Lchristophedelory/playlist/AbstractPlaylistComponent;->acceptDown(Lchristophedelory/playlist/PlaylistVisitor;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public addComponent(ILchristophedelory/playlist/AbstractPlaylistComponent;)V
    .locals 1

    .line 84
    invoke-virtual {p2, p0}, Lchristophedelory/playlist/AbstractPlaylistComponent;->setParent(Lchristophedelory/playlist/AbstractTimeContainer;)V

    .line 85
    iget-object v0, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public addComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)V
    .locals 1

    .line 67
    invoke-virtual {p1, p0}, Lchristophedelory/playlist/AbstractPlaylistComponent;->setParent(Lchristophedelory/playlist/AbstractTimeContainer;)V

    .line 68
    iget-object v0, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getComponents()[Lchristophedelory/playlist/AbstractPlaylistComponent;
    .locals 2

    .line 51
    iget-object v0, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lchristophedelory/playlist/AbstractPlaylistComponent;

    .line 52
    iget-object v1, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object v0
.end method

.method public getComponentsNumber()I
    .locals 1

    .line 130
    iget-object v0, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public removeComponent(I)Lchristophedelory/playlist/AbstractPlaylistComponent;
    .locals 1

    .line 117
    iget-object v0, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lchristophedelory/playlist/AbstractPlaylistComponent;

    const/4 v0, 0x0

    .line 118
    invoke-virtual {p1, v0}, Lchristophedelory/playlist/AbstractPlaylistComponent;->setParent(Lchristophedelory/playlist/AbstractTimeContainer;)V

    return-object p1
.end method

.method public removeComponent(Lchristophedelory/playlist/AbstractPlaylistComponent;)Z
    .locals 1

    const/4 v0, 0x0

    .line 100
    invoke-virtual {p1, v0}, Lchristophedelory/playlist/AbstractPlaylistComponent;->setParent(Lchristophedelory/playlist/AbstractTimeContainer;)V

    .line 102
    iget-object v0, p0, Lchristophedelory/playlist/AbstractTimeContainer;->_components:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
