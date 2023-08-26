.class public Lchristophedelory/rss/TextInput;
.super Ljava/lang/Object;
.source "TextInput.java"


# instance fields
.field private _description:Ljava/lang/String;

.field private _link:Ljava/net/URI;

.field private _name:Ljava/lang/String;

.field private _title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lchristophedelory/rss/TextInput;->_title:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Lchristophedelory/rss/TextInput;->_description:Ljava/lang/String;

    .line 55
    iput-object v0, p0, Lchristophedelory/rss/TextInput;->_name:Ljava/lang/String;

    .line 60
    iput-object v0, p0, Lchristophedelory/rss/TextInput;->_link:Ljava/net/URI;

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lchristophedelory/rss/TextInput;->_description:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/net/URI;
    .locals 1

    .line 206
    iget-object v0, p0, Lchristophedelory/rss/TextInput;->_link:Ljava/net/URI;

    return-object v0
.end method

.method public getLinkString()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lchristophedelory/rss/TextInput;->_link:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lchristophedelory/rss/TextInput;->_name:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lchristophedelory/rss/TextInput;->_title:Ljava/lang/String;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 116
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/TextInput;->_description:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/net/URI;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 194
    iput-object p1, p0, Lchristophedelory/rss/TextInput;->_link:Ljava/net/URI;

    return-void

    .line 191
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "No link"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLinkString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 177
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/TextInput;->_link:Ljava/net/URI;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 127
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/TextInput;->_name:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 70
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/TextInput;->_title:Ljava/lang/String;

    return-void
.end method
