.class public final Lcom/daaw/lc7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k87;


# instance fields
.field public final a:Lcom/daaw/s97;

.field public final b:Lcom/daaw/ph7;


# direct methods
.method public constructor <init>(Lcom/daaw/s97;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lc7;->a:Lcom/daaw/s97;

    invoke-virtual {p1}, Lcom/daaw/s97;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/pe7;->a()Lcom/daaw/pe7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pe7;->b()Lcom/daaw/qh7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/me7;->a(Lcom/daaw/s97;)Lcom/daaw/vh7;

    move-result-object p1

    const-string v1, "hybrid_decrypt"

    const-string v2, "decrypt"

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/qh7;->a(Lcom/daaw/vh7;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ph7;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/daaw/lc7;->b:Lcom/daaw/ph7;

    return-void

    :cond_0
    sget-object p1, Lcom/daaw/me7;->a:Lcom/daaw/ph7;

    goto :goto_0
.end method
