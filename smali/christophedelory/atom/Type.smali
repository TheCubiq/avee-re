.class public Lchristophedelory/atom/Type;
.super Lchristophedelory/atom/Common;
.source "Type.java"


# instance fields
.field private _type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lchristophedelory/atom/Common;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lchristophedelory/atom/Type;->_type:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lchristophedelory/atom/Type;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 64
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/Type;->_type:Ljava/lang/String;

    return-void
.end method
