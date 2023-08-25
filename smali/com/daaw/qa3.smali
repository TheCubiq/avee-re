.class public final Lcom/daaw/qa3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "gads:device_info_caching_expiry_ms:expiry"

    const-wide/32 v1, 0x493e0

    invoke-static {v0, v1, v2}, Lcom/daaw/ma3;->b(Ljava/lang/String;J)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/qa3;->a:Lcom/daaw/ma3;

    return-void
.end method
