.class public final Lcom/daaw/db7;
.super Lcom/daaw/de7;
.source ""


# instance fields
.field public final synthetic b:Lcom/daaw/eb7;


# direct methods
.method public constructor <init>(Lcom/daaw/eb7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/db7;->b:Lcom/daaw/eb7;

    invoke-direct {p0, p2}, Lcom/daaw/de7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/xt7;)Lcom/daaw/xt7;
    .locals 1

    check-cast p1, Lcom/daaw/xn7;

    invoke-static {}, Lcom/daaw/rn7;->M()Lcom/daaw/qn7;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/qn7;->s(Lcom/daaw/xn7;)Lcom/daaw/qn7;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/daaw/qn7;->t(I)Lcom/daaw/qn7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/rn7;

    return-object p1
.end method

.method public final synthetic b(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 1

    invoke-static {}, Lcom/daaw/vr7;->a()Lcom/daaw/vr7;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/daaw/xn7;->O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/xn7;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(Lcom/daaw/xt7;)V
    .locals 1

    check-cast p1, Lcom/daaw/xn7;

    invoke-virtual {p1}, Lcom/daaw/xn7;->P()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/xn7;->Q()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid key format: missing KEK URI or DEK template"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
