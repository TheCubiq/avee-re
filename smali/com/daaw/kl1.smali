.class public final Lcom/daaw/kl1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/kl1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/cg;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/kl1;
    .locals 1

    invoke-static {}, Lcom/daaw/kl1$a;->a()Lcom/daaw/kl1;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lcom/daaw/cg;
    .locals 2

    invoke-static {}, Lcom/daaw/il1;->b()Lcom/daaw/cg;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lcom/daaw/qy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cg;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/daaw/cg;
    .locals 1

    invoke-static {}, Lcom/daaw/kl1;->c()Lcom/daaw/cg;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kl1;->b()Lcom/daaw/cg;

    move-result-object v0

    return-object v0
.end method
