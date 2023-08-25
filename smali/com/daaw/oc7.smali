.class public final Lcom/daaw/oc7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/l87;


# instance fields
.field public final a:Lcom/daaw/s97;

.field public final b:Lcom/daaw/ph7;


# direct methods
.method public constructor <init>(Lcom/daaw/s97;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oc7;->a:Lcom/daaw/s97;

    invoke-virtual {p1}, Lcom/daaw/s97;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/pe7;->a()Lcom/daaw/pe7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pe7;->b()Lcom/daaw/qh7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/me7;->a(Lcom/daaw/s97;)Lcom/daaw/vh7;

    move-result-object p1

    const-string v1, "hybrid_encrypt"

    const-string v2, "encrypt"

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/qh7;->a(Lcom/daaw/vh7;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ph7;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/daaw/oc7;->b:Lcom/daaw/ph7;

    return-void

    :cond_0
    sget-object p1, Lcom/daaw/me7;->a:Lcom/daaw/ph7;

    goto :goto_0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 3

    iget-object v0, p0, Lcom/daaw/oc7;->a:Lcom/daaw/s97;

    invoke-virtual {v0}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [[B

    const/4 v2, 0x0

    invoke-virtual {v0}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/o97;->f()[B

    move-result-object v0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/daaw/oc7;->a:Lcom/daaw/s97;

    invoke-virtual {v2}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/o97;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/l87;

    invoke-interface {v2, p1, p2}, Lcom/daaw/l87;->a([B[B)[B

    move-result-object p2

    aput-object p2, v1, v0

    invoke-static {v1}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/oc7;->a:Lcom/daaw/s97;

    invoke-virtual {v0}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/o97;->a()I

    array-length p1, p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    throw p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "keyset without primary key"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
