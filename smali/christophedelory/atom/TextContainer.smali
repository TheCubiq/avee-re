.class public Lchristophedelory/atom/TextContainer;
.super Lchristophedelory/atom/Type;
.source "TextContainer.java"


# instance fields
.field private _text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lchristophedelory/atom/Type;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lchristophedelory/atom/TextContainer;->_text:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getText()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lchristophedelory/atom/TextContainer;->_text:Ljava/lang/String;

    return-object v0
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/atom/TextContainer;->_text:Ljava/lang/String;

    return-void
.end method
