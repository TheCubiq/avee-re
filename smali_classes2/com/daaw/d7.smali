.class public final Lcom/daaw/d7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "NO_DECISION"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/d7;->a:Ljava/lang/Object;

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "RETRY_ATOMIC"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/d7;->b:Ljava/lang/Object;

    return-void
.end method
