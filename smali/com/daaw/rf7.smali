.class public final Lcom/daaw/rf7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/eg7;

.field public b:Lcom/daaw/eq7;

.field public c:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qf7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    iput-object p1, p0, Lcom/daaw/rf7;->b:Lcom/daaw/eq7;

    iput-object p1, p0, Lcom/daaw/rf7;->c:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/eq7;)Lcom/daaw/rf7;
    .locals 0

    iput-object p1, p0, Lcom/daaw/rf7;->b:Lcom/daaw/eq7;

    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)Lcom/daaw/rf7;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/daaw/rf7;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public final c(Lcom/daaw/eg7;)Lcom/daaw/rf7;
    .locals 0

    iput-object p1, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    return-object p0
.end method

.method public final d()Lcom/daaw/tf7;
    .locals 7

    iget-object v0, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/daaw/rf7;->b:Lcom/daaw/eq7;

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Lcom/daaw/eg7;->a()I

    move-result v2

    invoke-virtual {v1}, Lcom/daaw/eq7;->a()I

    move-result v1

    if-ne v2, v1, :cond_8

    invoke-virtual {v0}, Lcom/daaw/eg7;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/rf7;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with format with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    invoke-virtual {v0}, Lcom/daaw/eg7;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/rf7;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with format without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    invoke-virtual {v0}, Lcom/daaw/eg7;->c()Lcom/daaw/cg7;

    move-result-object v0

    sget-object v1, Lcom/daaw/cg7;->e:Lcom/daaw/cg7;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_4

    new-array v0, v2, [B

    invoke-static {v0}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object v0

    :goto_2
    move-object v4, v0

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    invoke-virtual {v0}, Lcom/daaw/eg7;->c()Lcom/daaw/cg7;

    move-result-object v0

    sget-object v1, Lcom/daaw/cg7;->d:Lcom/daaw/cg7;

    const/4 v3, 0x5

    if-eq v0, v1, :cond_7

    iget-object v0, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    invoke-virtual {v0}, Lcom/daaw/eg7;->c()Lcom/daaw/cg7;

    move-result-object v0

    sget-object v1, Lcom/daaw/cg7;->c:Lcom/daaw/cg7;

    if-ne v0, v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    invoke-virtual {v0}, Lcom/daaw/eg7;->c()Lcom/daaw/cg7;

    move-result-object v0

    sget-object v1, Lcom/daaw/cg7;->b:Lcom/daaw/cg7;

    if-ne v0, v1, :cond_6

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/rf7;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object v0

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    invoke-virtual {v1}, Lcom/daaw/eg7;->c()Lcom/daaw/cg7;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unknown AesCmacParametersParameters.Variant: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/rf7;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/dq7;->b([B)Lcom/daaw/dq7;

    move-result-object v0

    goto :goto_2

    :goto_4
    new-instance v0, Lcom/daaw/tf7;

    iget-object v2, p0, Lcom/daaw/rf7;->a:Lcom/daaw/eg7;

    iget-object v3, p0, Lcom/daaw/rf7;->b:Lcom/daaw/eq7;

    iget-object v5, p0, Lcom/daaw/rf7;->c:Ljava/lang/Integer;

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/tf7;-><init>(Lcom/daaw/eg7;Lcom/daaw/eq7;Lcom/daaw/dq7;Ljava/lang/Integer;Lcom/daaw/sf7;)V

    return-object v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method
