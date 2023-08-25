.class public final Lcom/daaw/ry;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g00;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ry$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g00<",
        "Lcom/daaw/my;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/ry;
    .locals 1

    invoke-static {}, Lcom/daaw/ry$a;->a()Lcom/daaw/ry;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lcom/daaw/my;
    .locals 2

    invoke-static {}, Lcom/daaw/ny;->d()Lcom/daaw/my;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lcom/daaw/qy0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/my;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/daaw/my;
    .locals 1

    invoke-static {}, Lcom/daaw/ry;->c()Lcom/daaw/my;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ry;->b()Lcom/daaw/my;

    move-result-object v0

    return-object v0
.end method
