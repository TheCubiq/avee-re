.class public Lchristophedelory/plist/Dict;
.super Lchristophedelory/plist/PlistObject;
.source "Dict.java"


# instance fields
.field private final _objects:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Lchristophedelory/plist/Key;",
            "Lchristophedelory/plist/PlistObject;",
            ">;"
        }
    .end annotation
.end field

.field private transient _tmpKey:Lchristophedelory/plist/Key;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lchristophedelory/plist/PlistObject;-><init>()V

    .line 43
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lchristophedelory/plist/Dict;->_tmpKey:Lchristophedelory/plist/Key;

    return-void
.end method


# virtual methods
.method public addKeyOrObject(Lchristophedelory/plist/PlistObject;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 140
    invoke-virtual {p1, p0}, Lchristophedelory/plist/PlistObject;->setParent(Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lchristophedelory/plist/Dict;->_tmpKey:Lchristophedelory/plist/Key;

    if-nez v0, :cond_1

    .line 144
    instance-of v0, p1, Lchristophedelory/plist/Key;

    if-eqz v0, :cond_0

    .line 149
    check-cast p1, Lchristophedelory/plist/Key;

    iput-object p1, p0, Lchristophedelory/plist/Dict;->_tmpKey:Lchristophedelory/plist/Key;

    goto :goto_0

    .line 146
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A key is expected here"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 153
    :cond_1
    instance-of v1, p1, Lchristophedelory/plist/Key;

    if-nez v1, :cond_2

    .line 158
    invoke-virtual {p0, v0, p1}, Lchristophedelory/plist/Dict;->put(Lchristophedelory/plist/Key;Lchristophedelory/plist/PlistObject;)Lchristophedelory/plist/PlistObject;

    const/4 p1, 0x0

    .line 159
    iput-object p1, p0, Lchristophedelory/plist/Dict;->_tmpKey:Lchristophedelory/plist/Key;

    :goto_0
    return-void

    .line 155
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A key is unexpected here"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public findObjectByKey(Ljava/lang/String;)Lchristophedelory/plist/PlistObject;
    .locals 1

    .line 171
    new-instance v0, Lchristophedelory/plist/Key;

    invoke-direct {v0, p1}, Lchristophedelory/plist/Key;-><init>(Ljava/lang/String;)V

    .line 173
    iget-object p1, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    invoke-virtual {p1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lchristophedelory/plist/PlistObject;

    return-object p1
.end method

.method public getDictionary()Ljava/util/Hashtable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Hashtable<",
            "Lchristophedelory/plist/Key;",
            "Lchristophedelory/plist/PlistObject;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    return-object v0
.end method

.method public getKeysAndObjects()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/plist/PlistObject;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    iget-object v1, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    .line 115
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 117
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lchristophedelory/plist/Key;

    .line 118
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v3, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    invoke-virtual {v3, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public put(Lchristophedelory/plist/Key;Lchristophedelory/plist/PlistObject;)Lchristophedelory/plist/PlistObject;
    .locals 1

    .line 71
    iget-object v0, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lchristophedelory/plist/PlistObject;

    return-object p1
.end method

.method public put(Ljava/lang/String;Lchristophedelory/plist/PlistObject;)Lchristophedelory/plist/PlistObject;
    .locals 1

    .line 86
    new-instance v0, Lchristophedelory/plist/Key;

    invoke-direct {v0, p1}, Lchristophedelory/plist/Key;-><init>(Ljava/lang/String;)V

    .line 88
    iget-object p1, p0, Lchristophedelory/plist/Dict;->_objects:Ljava/util/Hashtable;

    invoke-virtual {p1, v0, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lchristophedelory/plist/PlistObject;

    return-object p1
.end method
