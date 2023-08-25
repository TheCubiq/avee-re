.class public abstract Lcom/daaw/ib;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lcom/daaw/ib;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/gl0;",
            ">;)",
            "Lcom/daaw/ib;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/c8;

    invoke-direct {v0, p0}, Lcom/daaw/c8;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Lcom/daaw/hp;
    .locals 2

    new-instance v0, Lcom/daaw/zh0;

    invoke-direct {v0}, Lcom/daaw/zh0;-><init>()V

    sget-object v1, Lcom/daaw/t7;->a:Lcom/daaw/dj;

    invoke-virtual {v0, v1}, Lcom/daaw/zh0;->j(Lcom/daaw/dj;)Lcom/daaw/zh0;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/zh0;->k(Z)Lcom/daaw/zh0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/zh0;->i()Lcom/daaw/hp;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/gl0;",
            ">;"
        }
    .end annotation
.end method
