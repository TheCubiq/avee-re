.class public Lchristophedelory/atom/Link;
.super Lchristophedelory/atom/Type;
.source "Link.java"


# instance fields
.field private _href:Ljava/lang/String;

.field private _hreflang:Ljava/lang/String;

.field private _length:Ljava/lang/Long;

.field private _rel:Ljava/lang/String;

.field private _title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lchristophedelory/atom/Type;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lchristophedelory/atom/Link;->_href:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Lchristophedelory/atom/Link;->_rel:Ljava/lang/String;

    .line 55
    iput-object v0, p0, Lchristophedelory/atom/Link;->_hreflang:Ljava/lang/String;

    .line 60
    iput-object v0, p0, Lchristophedelory/atom/Link;->_title:Ljava/lang/String;

    .line 65
    iput-object v0, p0, Lchristophedelory/atom/Link;->_length:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public getHref()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lchristophedelory/atom/Link;->_href:Ljava/lang/String;

    return-object v0
.end method

.method public getHrefLang()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lchristophedelory/atom/Link;->_hreflang:Ljava/lang/String;

    return-object v0
.end method

.method public getLength()Ljava/lang/Long;
    .locals 1

    .line 204
    iget-object v0, p0, Lchristophedelory/atom/Link;->_length:Ljava/lang/Long;

    return-object v0
.end method

.method public getRel()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lchristophedelory/atom/Link;->_rel:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lchristophedelory/atom/Link;->_title:Ljava/lang/String;

    return-object v0
.end method

.method public setHref(Ljava/lang/String;)V
    .locals 0

    .line 93
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Link;->_href:Ljava/lang/String;

    return-void
.end method

.method public setHrefLang(Ljava/lang/String;)V
    .locals 0

    .line 162
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Link;->_hreflang:Ljava/lang/String;

    return-void
.end method

.method public setLength(Ljava/lang/Long;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lchristophedelory/atom/Link;->_length:Ljava/lang/Long;

    return-void
.end method

.method public setRel(Ljava/lang/String;)V
    .locals 0

    .line 135
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Link;->_rel:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 188
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Link;->_title:Ljava/lang/String;

    return-void
.end method
