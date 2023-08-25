.class public Lcom/daaw/bf0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "Transparency"

    const-string v1, "TransparencyAndBlacks"

    const-string v2, "TransparencyAndWhites"

    const-string v3, "InvertedTransparency"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/bf0;->a:[Ljava/lang/String;

    return-void
.end method
