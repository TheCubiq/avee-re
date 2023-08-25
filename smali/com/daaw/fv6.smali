.class public final Lcom/daaw/fv6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/zu6;

.field public static volatile b:Lcom/daaw/zu6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/bv6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/bv6;-><init>(Lcom/daaw/av6;)V

    sput-object v0, Lcom/daaw/fv6;->a:Lcom/daaw/zu6;

    sput-object v0, Lcom/daaw/fv6;->b:Lcom/daaw/zu6;

    return-void
.end method

.method public static a()Lcom/daaw/zu6;
    .locals 1

    sget-object v0, Lcom/daaw/fv6;->b:Lcom/daaw/zu6;

    return-object v0
.end method
