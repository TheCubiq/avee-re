.class public Lchristophedelory/plist/Integer;
.super Lchristophedelory/plist/PlistText;
.source "Integer.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lchristophedelory/plist/PlistText;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lchristophedelory/plist/PlistText;-><init>()V

    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lchristophedelory/plist/Integer;->setValue(Ljava/lang/String;)V

    return-void
.end method
