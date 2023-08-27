.class public Lchristophedelory/atom/URIContainer;
.super Lchristophedelory/atom/Common;
.source "URIContainer.java"


# instance fields
.field private _uri:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lchristophedelory/atom/Common;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lchristophedelory/atom/URIContainer;->_uri:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getURIString()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lchristophedelory/atom/URIContainer;->_uri:Ljava/lang/String;

    return-object v0
.end method

.method public setURIString(Ljava/lang/String;)V
    .locals 0

    .line 64
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/URIContainer;->_uri:Ljava/lang/String;

    return-void
.end method
