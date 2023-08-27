.class public Lchristophedelory/plist/Plist;
.super Ljava/lang/Object;
.source "Plist.java"


# instance fields
.field private _object:Lchristophedelory/plist/PlistObject;

.field private _version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "1.0"

    .line 38
    iput-object v0, p0, Lchristophedelory/plist/Plist;->_version:Ljava/lang/String;

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lchristophedelory/plist/Plist;->_object:Lchristophedelory/plist/PlistObject;

    return-void
.end method


# virtual methods
.method public getPlistObject()Lchristophedelory/plist/PlistObject;
    .locals 1

    .line 88
    iget-object v0, p0, Lchristophedelory/plist/Plist;->_object:Lchristophedelory/plist/PlistObject;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lchristophedelory/plist/Plist;->_version:Ljava/lang/String;

    return-object v0
.end method

.method public setPlistObject(Lchristophedelory/plist/PlistObject;)V
    .locals 1

    .line 99
    instance-of v0, p1, Lchristophedelory/plist/Key;

    if-nez v0, :cond_0

    .line 104
    invoke-virtual {p1, p0}, Lchristophedelory/plist/PlistObject;->setParent(Ljava/lang/Object;)V

    .line 105
    iput-object p1, p0, Lchristophedelory/plist/Plist;->_object:Lchristophedelory/plist/PlistObject;

    return-void

    .line 101
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No dictionary key allowed in a plist"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/plist/Plist;->_version:Ljava/lang/String;

    return-void
.end method
