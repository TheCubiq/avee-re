.class public final Lcom/daaw/hy;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/pi1;

.field public static final b:Lcom/daaw/pi1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/hy;->a:Lcom/daaw/pi1;

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/hy;->b:Lcom/daaw/pi1;

    return-void
.end method

.method public static final synthetic a()Lcom/daaw/pi1;
    .locals 1

    sget-object v0, Lcom/daaw/hy;->b:Lcom/daaw/pi1;

    return-object v0
.end method

.method public static final synthetic b()Lcom/daaw/pi1;
    .locals 1

    sget-object v0, Lcom/daaw/hy;->a:Lcom/daaw/pi1;

    return-object v0
.end method
