.class public final Lcom/daaw/ko3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/bl3;

.field public static volatile b:Lcom/daaw/bl3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/hn3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/hn3;-><init>(Lcom/daaw/em3;)V

    sput-object v0, Lcom/daaw/ko3;->a:Lcom/daaw/bl3;

    sput-object v0, Lcom/daaw/ko3;->b:Lcom/daaw/bl3;

    return-void
.end method

.method public static a()Lcom/daaw/bl3;
    .locals 1

    sget-object v0, Lcom/daaw/ko3;->b:Lcom/daaw/bl3;

    return-object v0
.end method
