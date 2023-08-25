.class public abstract Lcom/daaw/cl0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/cl0$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/cl0$a;
    .locals 1

    new-instance v0, Lcom/daaw/h9$b;

    invoke-direct {v0}, Lcom/daaw/h9$b;-><init>()V

    return-object v0
.end method

.method public static i(Ljava/lang/String;)Lcom/daaw/cl0$a;
    .locals 1

    invoke-static {}, Lcom/daaw/cl0;->a()Lcom/daaw/cl0$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/cl0$a;->g(Ljava/lang/String;)Lcom/daaw/cl0$a;

    move-result-object p0

    return-object p0
.end method

.method public static j([B)Lcom/daaw/cl0$a;
    .locals 1

    invoke-static {}, Lcom/daaw/cl0;->a()Lcom/daaw/cl0$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/cl0$a;->f([B)Lcom/daaw/cl0$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Ljava/lang/Integer;
.end method

.method public abstract c()J
.end method

.method public abstract d()J
.end method

.method public abstract e()Lcom/daaw/ls0;
.end method

.method public abstract f()[B
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()J
.end method
