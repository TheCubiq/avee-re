.class public Lchristophedelory/atom/Person;
.super Lchristophedelory/atom/Common;
.source "Person.java"


# instance fields
.field private _email:Ljava/lang/String;

.field private _name:Ljava/lang/String;

.field private _uri:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lchristophedelory/atom/Common;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lchristophedelory/atom/Person;->_name:Ljava/lang/String;

    .line 45
    iput-object v0, p0, Lchristophedelory/atom/Person;->_uri:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Lchristophedelory/atom/Person;->_email:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lchristophedelory/atom/Person;->_email:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lchristophedelory/atom/Person;->_name:Ljava/lang/String;

    return-object v0
.end method

.method public getURIString()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lchristophedelory/atom/Person;->_uri:Ljava/lang/String;

    return-object v0
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 131
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Person;->_email:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Person;->_name:Ljava/lang/String;

    return-void
.end method

.method public setURIString(Ljava/lang/String;)V
    .locals 0

    .line 104
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Person;->_uri:Ljava/lang/String;

    return-void
.end method
