.class public final Lcom/daaw/dc7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j87;


# instance fields
.field public final a:Lcom/daaw/s97;

.field public final b:Lcom/daaw/ph7;

.field public final c:Lcom/daaw/ph7;


# direct methods
.method public constructor <init>(Lcom/daaw/s97;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dc7;->a:Lcom/daaw/s97;

    invoke-virtual {p1}, Lcom/daaw/s97;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/pe7;->a()Lcom/daaw/pe7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/pe7;->b()Lcom/daaw/qh7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/me7;->a(Lcom/daaw/s97;)Lcom/daaw/vh7;

    move-result-object p1

    const-string v1, "daead"

    const-string v2, "encrypt"

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/qh7;->a(Lcom/daaw/vh7;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ph7;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/dc7;->b:Lcom/daaw/ph7;

    const-string v2, "decrypt"

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/qh7;->a(Lcom/daaw/vh7;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/ph7;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/daaw/dc7;->c:Lcom/daaw/ph7;

    return-void

    :cond_0
    sget-object p1, Lcom/daaw/me7;->a:Lcom/daaw/ph7;

    iput-object p1, p0, Lcom/daaw/dc7;->b:Lcom/daaw/ph7;

    goto :goto_0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 3

    const/4 v0, 0x2

    :try_start_0
    new-array v0, v0, [[B

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/dc7;->a:Lcom/daaw/s97;

    invoke-virtual {v2}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/o97;->f()[B

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/daaw/dc7;->a:Lcom/daaw/s97;

    invoke-virtual {v2}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/o97;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/j87;

    invoke-interface {v2, p1, p2}, Lcom/daaw/j87;->a([B[B)[B

    move-result-object p2

    aput-object p2, v0, v1

    invoke-static {v0}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/dc7;->a:Lcom/daaw/s97;

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
.end method
