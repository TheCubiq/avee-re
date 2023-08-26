.class public Lchristophedelory/playlist/mpcpl/Resource;
.super Ljava/lang/Object;
.source "Resource.java"


# instance fields
.field private _filename:Ljava/lang/String;

.field private _subtitle:Ljava/lang/String;

.field private _type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lchristophedelory/playlist/mpcpl/Resource;->_filename:Ljava/lang/String;

    const-string v1, "0"

    .line 43
    iput-object v1, p0, Lchristophedelory/playlist/mpcpl/Resource;->_type:Ljava/lang/String;

    .line 48
    iput-object v0, p0, Lchristophedelory/playlist/mpcpl/Resource;->_subtitle:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getFilename()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lchristophedelory/playlist/mpcpl/Resource;->_filename:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lchristophedelory/playlist/mpcpl/Resource;->_subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lchristophedelory/playlist/mpcpl/Resource;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public setFilename(Ljava/lang/String;)V
    .locals 0

    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/mpcpl/Resource;->_filename:Ljava/lang/String;

    return-void
.end method

.method public setSubtitle(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lchristophedelory/playlist/mpcpl/Resource;->_subtitle:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 90
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/mpcpl/Resource;->_type:Ljava/lang/String;

    return-void
.end method
