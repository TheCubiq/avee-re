.class public Lchristophedelory/atom/Entry;
.super Lchristophedelory/atom/Common;
.source "Entry.java"


# instance fields
.field private final _authors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/atom/Person;",
            ">;"
        }
    .end annotation
.end field

.field private final _categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/atom/Category;",
            ">;"
        }
    .end annotation
.end field

.field private final _contents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/atom/Content;",
            ">;"
        }
    .end annotation
.end field

.field private final _contributors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/atom/Person;",
            ">;"
        }
    .end annotation
.end field

.field private _id:Lchristophedelory/atom/URIContainer;

.field private final _links:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/atom/Link;",
            ">;"
        }
    .end annotation
.end field

.field private _published:Ljava/util/Date;

.field private _rights:Lchristophedelory/atom/TextContainer;

.field private _source:Lchristophedelory/atom/Source;

.field private _summary:Lchristophedelory/atom/TextContainer;

.field private _title:Lchristophedelory/atom/TextContainer;

.field private _updated:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Lchristophedelory/atom/Common;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Entry;->_authors:Ljava/util/List;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Entry;->_categories:Ljava/util/List;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Entry;->_contents:Ljava/util/List;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Entry;->_contributors:Ljava/util/List;

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lchristophedelory/atom/Entry;->_id:Lchristophedelory/atom/URIContainer;

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/atom/Entry;->_links:Ljava/util/List;

    .line 74
    iput-object v0, p0, Lchristophedelory/atom/Entry;->_published:Ljava/util/Date;

    .line 79
    iput-object v0, p0, Lchristophedelory/atom/Entry;->_rights:Lchristophedelory/atom/TextContainer;

    .line 84
    iput-object v0, p0, Lchristophedelory/atom/Entry;->_source:Lchristophedelory/atom/Source;

    .line 89
    iput-object v0, p0, Lchristophedelory/atom/Entry;->_summary:Lchristophedelory/atom/TextContainer;

    .line 94
    iput-object v0, p0, Lchristophedelory/atom/Entry;->_title:Lchristophedelory/atom/TextContainer;

    .line 99
    iput-object v0, p0, Lchristophedelory/atom/Entry;->_updated:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public addAuthor(Lchristophedelory/atom/Person;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 133
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_authors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 130
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no author"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addCategory(Lchristophedelory/atom/Category;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 168
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_categories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 165
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no category"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addContent(Lchristophedelory/atom/Content;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 203
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_contents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 200
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no content"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addContributor(Lchristophedelory/atom/Person;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 238
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_contributors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 235
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no contributor"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addLink(Lchristophedelory/atom/Link;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 305
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_links:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 302
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no link"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAuthors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/atom/Person;",
            ">;"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_authors:Ljava/util/List;

    return-object v0
.end method

.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/atom/Category;",
            ">;"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_categories:Ljava/util/List;

    return-object v0
.end method

.method public getContents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/atom/Content;",
            ">;"
        }
    .end annotation

    .line 187
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_contents:Ljava/util/List;

    return-object v0
.end method

.method public getContributors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/atom/Person;",
            ">;"
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_contributors:Ljava/util/List;

    return-object v0
.end method

.method public getId()Lchristophedelory/atom/URIContainer;
    .locals 1

    .line 254
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_id:Lchristophedelory/atom/URIContainer;

    return-object v0
.end method

.method public getLinks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/atom/Link;",
            ">;"
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_links:Ljava/util/List;

    return-object v0
.end method

.method public getPublished()Ljava/util/Date;
    .locals 1

    .line 322
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_published:Ljava/util/Date;

    return-object v0
.end method

.method public getRights()Lchristophedelory/atom/TextContainer;
    .locals 1

    .line 349
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_rights:Lchristophedelory/atom/TextContainer;

    return-object v0
.end method

.method public getSource()Lchristophedelory/atom/Source;
    .locals 1

    .line 377
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_source:Lchristophedelory/atom/Source;

    return-object v0
.end method

.method public getSummary()Lchristophedelory/atom/TextContainer;
    .locals 1

    .line 404
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_summary:Lchristophedelory/atom/TextContainer;

    return-object v0
.end method

.method public getTitle()Lchristophedelory/atom/TextContainer;
    .locals 1

    .line 431
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_title:Lchristophedelory/atom/TextContainer;

    return-object v0
.end method

.method public getUpdated()Ljava/util/Date;
    .locals 1

    .line 465
    iget-object v0, p0, Lchristophedelory/atom/Entry;->_updated:Ljava/util/Date;

    return-object v0
.end method

.method public setId(Lchristophedelory/atom/URIContainer;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 270
    iput-object p1, p0, Lchristophedelory/atom/Entry;->_id:Lchristophedelory/atom/URIContainer;

    return-void

    .line 267
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no id"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPublished(Ljava/util/Date;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lchristophedelory/atom/Entry;->_published:Ljava/util/Date;

    return-void
.end method

.method public setRights(Lchristophedelory/atom/TextContainer;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lchristophedelory/atom/Entry;->_rights:Lchristophedelory/atom/TextContainer;

    return-void
.end method

.method public setSource(Lchristophedelory/atom/Source;)V
    .locals 0

    .line 387
    iput-object p1, p0, Lchristophedelory/atom/Entry;->_source:Lchristophedelory/atom/Source;

    return-void
.end method

.method public setSummary(Lchristophedelory/atom/TextContainer;)V
    .locals 0

    .line 414
    iput-object p1, p0, Lchristophedelory/atom/Entry;->_summary:Lchristophedelory/atom/TextContainer;

    return-void
.end method

.method public setTitle(Lchristophedelory/atom/TextContainer;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 447
    iput-object p1, p0, Lchristophedelory/atom/Entry;->_title:Lchristophedelory/atom/TextContainer;

    return-void

    .line 444
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no title"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setUpdated(Ljava/util/Date;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 481
    iput-object p1, p0, Lchristophedelory/atom/Entry;->_updated:Ljava/util/Date;

    return-void

    .line 478
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no updated date"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
