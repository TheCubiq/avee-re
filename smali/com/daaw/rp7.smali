.class public final Lcom/daaw/rp7;
.super Ljava/lang/ThreadLocal;
.source ""


# instance fields
.field public final synthetic a:Lcom/daaw/sp7;


# direct methods
.method public constructor <init>(Lcom/daaw/sp7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rp7;->a:Lcom/daaw/sp7;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljavax/crypto/Mac;
    .locals 2

    :try_start_0
    sget-object v0, Lcom/daaw/ep7;->f:Lcom/daaw/ep7;

    iget-object v1, p0, Lcom/daaw/rp7;->a:Lcom/daaw/sp7;

    invoke-static {v1}, Lcom/daaw/sp7;->b(Lcom/daaw/sp7;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ep7;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;

    iget-object v1, p0, Lcom/daaw/rp7;->a:Lcom/daaw/sp7;

    invoke-static {v1}, Lcom/daaw/sp7;->c(Lcom/daaw/sp7;)Ljava/security/Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rp7;->a()Ljavax/crypto/Mac;

    move-result-object v0

    return-object v0
.end method
