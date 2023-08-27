.class public Lchristophedelory/plist/PlistObject;
.super Ljava/lang/Object;
.source "PlistObject.java"


# instance fields
.field private transient _parent:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lchristophedelory/plist/PlistObject;->_parent:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getParent()Ljava/lang/Object;
    .locals 1

    .line 57
    iget-object v0, p0, Lchristophedelory/plist/PlistObject;->_parent:Ljava/lang/Object;

    return-object v0
.end method

.method setParent(Ljava/lang/Object;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lchristophedelory/plist/PlistObject;->_parent:Ljava/lang/Object;

    return-void
.end method
