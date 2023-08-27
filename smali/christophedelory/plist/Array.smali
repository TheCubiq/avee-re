.class public Lchristophedelory/plist/Array;
.super Lchristophedelory/plist/PlistObject;
.source "Array.java"


# instance fields
.field private final _objects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/plist/PlistObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lchristophedelory/plist/PlistObject;-><init>()V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/plist/Array;->_objects:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addPlistObject(Lchristophedelory/plist/PlistObject;)V
    .locals 1

    .line 69
    instance-of v0, p1, Lchristophedelory/plist/Key;

    if-nez v0, :cond_0

    .line 74
    invoke-virtual {p1, p0}, Lchristophedelory/plist/PlistObject;->setParent(Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lchristophedelory/plist/Array;->_objects:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No dictionary key allowed in an array"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getPlistObjects()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/plist/PlistObject;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lchristophedelory/plist/Array;->_objects:Ljava/util/List;

    return-object v0
.end method
