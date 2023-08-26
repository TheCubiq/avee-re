.class public Lchristophedelory/atom/Source;
.super Lchristophedelory/atom/Common;
.source "Source.java"


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

.field private final _contributors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/atom/Person;",
            ">;"
        }
    .end annotation
.end field

.field private _generator:Lchristophedelory/atom/Generator;

.field private _icon:Lchristophedelory/atom/URIContainer;

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

.field private _logo:Lchristophedelory/atom/URIContainer;

.field private _rights:Lchristophedelory/atom/TextContainer;

.field private _subtitle:Lchristophedelory/atom/TextContainer;

.field private _title:Lchristophedelory/atom/TextContainer;

.field private _updated:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Lchristophedelory/atom/Common;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Source;->_authors:Ljava/util/List;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Source;->_categories:Ljava/util/List;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/atom/Source;->_contributors:Ljava/util/List;

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lchristophedelory/atom/Source;->_generator:Lchristophedelory/atom/Generator;

    .line 63
    iput-object v0, p0, Lchristophedelory/atom/Source;->_icon:Lchristophedelory/atom/URIContainer;

    .line 68
    iput-object v0, p0, Lchristophedelory/atom/Source;->_id:Lchristophedelory/atom/URIContainer;

    .line 73
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/atom/Source;->_links:Ljava/util/List;

    .line 78
    iput-object v0, p0, Lchristophedelory/atom/Source;->_logo:Lchristophedelory/atom/URIContainer;

    .line 83
    iput-object v0, p0, Lchristophedelory/atom/Source;->_rights:Lchristophedelory/atom/TextContainer;

    .line 88
    iput-object v0, p0, Lchristophedelory/atom/Source;->_subtitle:Lchristophedelory/atom/TextContainer;

    .line 93
    iput-object v0, p0, Lchristophedelory/atom/Source;->_title:Lchristophedelory/atom/TextContainer;

    .line 98
    iput-object v0, p0, Lchristophedelory/atom/Source;->_updated:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public addAuthor(Lchristophedelory/atom/Person;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 132
    iget-object v0, p0, Lchristophedelory/atom/Source;->_authors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 129
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no author"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addCategory(Lchristophedelory/atom/Category;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 167
    iget-object v0, p0, Lchristophedelory/atom/Source;->_categories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 164
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no category"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addContributor(Lchristophedelory/atom/Person;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 202
    iget-object v0, p0, Lchristophedelory/atom/Source;->_contributors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 199
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no contributor"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addLink(Lchristophedelory/atom/Link;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 316
    iget-object v0, p0, Lchristophedelory/atom/Source;->_links:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 313
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

    .line 116
    iget-object v0, p0, Lchristophedelory/atom/Source;->_authors:Ljava/util/List;

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

    .line 151
    iget-object v0, p0, Lchristophedelory/atom/Source;->_categories:Ljava/util/List;

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

    .line 186
    iget-object v0, p0, Lchristophedelory/atom/Source;->_contributors:Ljava/util/List;

    return-object v0
.end method

.method public getGenerator()Lchristophedelory/atom/Generator;
    .locals 1

    .line 218
    iget-object v0, p0, Lchristophedelory/atom/Source;->_generator:Lchristophedelory/atom/Generator;

    return-object v0
.end method

.method public getIcon()Lchristophedelory/atom/URIContainer;
    .locals 1

    .line 245
    iget-object v0, p0, Lchristophedelory/atom/Source;->_icon:Lchristophedelory/atom/URIContainer;

    return-object v0
.end method

.method public getId()Lchristophedelory/atom/URIContainer;
    .locals 1

    .line 271
    iget-object v0, p0, Lchristophedelory/atom/Source;->_id:Lchristophedelory/atom/URIContainer;

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

    .line 300
    iget-object v0, p0, Lchristophedelory/atom/Source;->_links:Ljava/util/List;

    return-object v0
.end method

.method public getLogo()Lchristophedelory/atom/URIContainer;
    .locals 1

    .line 333
    iget-object v0, p0, Lchristophedelory/atom/Source;->_logo:Lchristophedelory/atom/URIContainer;

    return-object v0
.end method

.method public getRights()Lchristophedelory/atom/TextContainer;
    .locals 1

    .line 360
    iget-object v0, p0, Lchristophedelory/atom/Source;->_rights:Lchristophedelory/atom/TextContainer;

    return-object v0
.end method

.method public getSubtitle()Lchristophedelory/atom/TextContainer;
    .locals 1

    .line 386
    iget-object v0, p0, Lchristophedelory/atom/Source;->_subtitle:Lchristophedelory/atom/TextContainer;

    return-object v0
.end method

.method public getTitle()Lchristophedelory/atom/TextContainer;
    .locals 1

    .line 412
    iget-object v0, p0, Lchristophedelory/atom/Source;->_title:Lchristophedelory/atom/TextContainer;

    return-object v0
.end method

.method public getUpdated()Ljava/util/Date;
    .locals 1

    .line 439
    iget-object v0, p0, Lchristophedelory/atom/Source;->_updated:Ljava/util/Date;

    return-object v0
.end method

.method public setGenerator(Lchristophedelory/atom/Generator;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lchristophedelory/atom/Source;->_generator:Lchristophedelory/atom/Generator;

    return-void
.end method

.method public setIcon(Lchristophedelory/atom/URIContainer;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lchristophedelory/atom/Source;->_icon:Lchristophedelory/atom/URIContainer;

    return-void
.end method

.method public setId(Lchristophedelory/atom/URIContainer;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lchristophedelory/atom/Source;->_id:Lchristophedelory/atom/URIContainer;

    return-void
.end method

.method public setLogo(Lchristophedelory/atom/URIContainer;)V
    .locals 0

    .line 343
    iput-object p1, p0, Lchristophedelory/atom/Source;->_logo:Lchristophedelory/atom/URIContainer;

    return-void
.end method

.method public setRights(Lchristophedelory/atom/TextContainer;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lchristophedelory/atom/Source;->_rights:Lchristophedelory/atom/TextContainer;

    return-void
.end method

.method public setSubtitle(Lchristophedelory/atom/TextContainer;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lchristophedelory/atom/Source;->_subtitle:Lchristophedelory/atom/TextContainer;

    return-void
.end method

.method public setTitle(Lchristophedelory/atom/TextContainer;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lchristophedelory/atom/Source;->_title:Lchristophedelory/atom/TextContainer;

    return-void
.end method

.method public setUpdated(Ljava/util/Date;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lchristophedelory/atom/Source;->_updated:Ljava/util/Date;

    return-void
.end method
