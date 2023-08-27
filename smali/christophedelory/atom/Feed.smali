.class public Lchristophedelory/atom/Feed;
.super Lchristophedelory/atom/Source;
.source "Feed.java"


# instance fields
.field private final _entries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/atom/Entry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lchristophedelory/atom/Source;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Feed;->_entries:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addEntry(Lchristophedelory/atom/Entry;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 123
    iget-object v0, p0, Lchristophedelory/atom/Feed;->_entries:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no entry"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/atom/Entry;",
            ">;"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lchristophedelory/atom/Feed;->_entries:Ljava/util/List;

    return-object v0
.end method

.method public setId(Lchristophedelory/atom/URIContainer;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 58
    invoke-super {p0, p1}, Lchristophedelory/atom/Source;->setId(Lchristophedelory/atom/URIContainer;)V

    return-void

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no id"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setTitle(Lchristophedelory/atom/TextContainer;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 73
    invoke-super {p0, p1}, Lchristophedelory/atom/Source;->setTitle(Lchristophedelory/atom/TextContainer;)V

    return-void

    .line 70
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no title"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setUpdated(Ljava/util/Date;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 88
    invoke-super {p0, p1}, Lchristophedelory/atom/Source;->setUpdated(Ljava/util/Date;)V

    return-void

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no updated date"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
