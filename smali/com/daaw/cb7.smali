.class public final Lcom/daaw/cb7;
.super Lcom/daaw/cf7;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/cf7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/daaw/rn7;

    invoke-virtual {p1}, Lcom/daaw/rn7;->P()Lcom/daaw/xn7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xn7;->P()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/f97;->a(Ljava/lang/String;)Lcom/daaw/e97;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/e97;->zzb()Lcom/daaw/a87;

    move-result-object v0

    new-instance v1, Lcom/daaw/bb7;

    invoke-virtual {p1}, Lcom/daaw/rn7;->P()Lcom/daaw/xn7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xn7;->L()Lcom/daaw/vm7;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/daaw/bb7;-><init>(Lcom/daaw/vm7;Lcom/daaw/a87;)V

    return-object v1
.end method
