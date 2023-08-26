.class public Lchristophedelory/plist/String;
.super Lchristophedelory/plist/PlistText;
.source "String.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Lchristophedelory/plist/PlistText;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lchristophedelory/plist/PlistText;-><init>()V

    .line 52
    invoke-virtual {p0, p1}, Lchristophedelory/plist/String;->setValue(Ljava/lang/String;)V

    return-void
.end method
