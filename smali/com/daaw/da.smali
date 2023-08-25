.class public abstract Lcom/daaw/da;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/da$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/da;
    .locals 4

    new-instance v0, Lcom/daaw/b8;

    sget-object v1, Lcom/daaw/da$a;->r:Lcom/daaw/da$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/b8;-><init>(Lcom/daaw/da$a;J)V

    return-object v0
.end method

.method public static d()Lcom/daaw/da;
    .locals 4

    new-instance v0, Lcom/daaw/b8;

    sget-object v1, Lcom/daaw/da$a;->s:Lcom/daaw/da$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/b8;-><init>(Lcom/daaw/da$a;J)V

    return-object v0
.end method

.method public static e(J)Lcom/daaw/da;
    .locals 2

    new-instance v0, Lcom/daaw/b8;

    sget-object v1, Lcom/daaw/da$a;->p:Lcom/daaw/da$a;

    invoke-direct {v0, v1, p0, p1}, Lcom/daaw/b8;-><init>(Lcom/daaw/da$a;J)V

    return-object v0
.end method

.method public static f()Lcom/daaw/da;
    .locals 4

    new-instance v0, Lcom/daaw/b8;

    sget-object v1, Lcom/daaw/da$a;->q:Lcom/daaw/da$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/b8;-><init>(Lcom/daaw/da$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lcom/daaw/da$a;
.end method
