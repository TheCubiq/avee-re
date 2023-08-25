.class public final Lcom/daaw/zc7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field public static final g:[B


# instance fields
.field public final a:Lcom/daaw/yc7;

.field public final b:Ljava/math/BigInteger;

.field public final c:[B

.field public final d:[B

.field public final e:[B

.field public f:Ljava/math/BigInteger;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/daaw/zc7;->g:[B

    return-void
.end method

.method public constructor <init>([B[B[BLjava/math/BigInteger;Lcom/daaw/yc7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zc7;->e:[B

    iput-object p2, p0, Lcom/daaw/zc7;->c:[B

    iput-object p3, p0, Lcom/daaw/zc7;->d:[B

    sget-object p1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    iput-object p1, p0, Lcom/daaw/zc7;->f:Ljava/math/BigInteger;

    iput-object p4, p0, Lcom/daaw/zc7;->b:Ljava/math/BigInteger;

    iput-object p5, p0, Lcom/daaw/zc7;->a:Lcom/daaw/yc7;

    return-void
.end method

.method public static c([B[BLcom/daaw/cd7;Lcom/daaw/xc7;Lcom/daaw/yc7;[B)Lcom/daaw/zc7;
    .locals 16

    move-object/from16 v6, p3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/cd7;->zzb()[B

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/xc7;->c()[B

    move-result-object v1

    invoke-interface/range {p4 .. p4}, Lcom/daaw/yc7;->zzb()[B

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/daaw/ld7;->b([B[B[B)[B

    move-result-object v7

    sget-object v0, Lcom/daaw/ld7;->l:[B

    sget-object v1, Lcom/daaw/zc7;->g:[B

    const-string v2, "psk_id_hash"

    invoke-virtual {v6, v0, v1, v2, v7}, Lcom/daaw/xc7;->e([B[BLjava/lang/String;[B)[B

    move-result-object v2

    const-string v3, "info_hash"

    move-object/from16 v4, p5

    invoke-virtual {v6, v0, v4, v3, v7}, Lcom/daaw/xc7;->e([B[BLjava/lang/String;[B)[B

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [[B

    sget-object v4, Lcom/daaw/ld7;->a:[B

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v0, v3, v2

    invoke-static {v3}, Lcom/daaw/qo7;->b([[B)[B

    move-result-object v8

    const-string v0, "secret"

    move-object/from16 v2, p1

    invoke-virtual {v6, v2, v1, v0, v7}, Lcom/daaw/xc7;->e([B[BLjava/lang/String;[B)[B

    move-result-object v9

    invoke-interface/range {p4 .. p4}, Lcom/daaw/yc7;->zza()I

    move-result v5

    const-string v3, "key"

    move-object/from16 v0, p3

    move-object v1, v9

    move-object v2, v8

    move-object v4, v7

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/xc7;->d([B[BLjava/lang/String;[BI)[B

    move-result-object v12

    const-string v3, "base_nonce"

    const/16 v5, 0xc

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/xc7;->d([B[BLjava/lang/String;[BI)[B

    move-result-object v13

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    const/16 v1, 0x60

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v14

    new-instance v0, Lcom/daaw/zc7;

    move-object v10, v0

    move-object/from16 v11, p0

    move-object/from16 v15, p4

    invoke-direct/range {v10 .. v15}, Lcom/daaw/zc7;-><init>([B[B[BLjava/math/BigInteger;Lcom/daaw/yc7;)V

    return-object v0
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/zc7;->e:[B

    return-object v0
.end method

.method public final b([B[B)[B
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/zc7;->d()[B

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/zc7;->a:Lcom/daaw/yc7;

    iget-object v2, p0, Lcom/daaw/zc7;->c:[B

    invoke-interface {v1, v2, v0, p1, p2}, Lcom/daaw/yc7;->a([B[B[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized d()[B
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zc7;->d:[B

    iget-object v1, p0, Lcom/daaw/zc7;->f:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    array-length v2, v1

    const/16 v3, 0xc

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v4, 0xd

    if-gt v2, v4, :cond_4

    const/4 v5, 0x0

    if-ne v2, v4, :cond_2

    aget-byte v2, v1, v5

    if-nez v2, :cond_1

    const/4 v2, 0x1

    invoke-static {v1, v2, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "integer too large"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-array v3, v3, [B

    rsub-int/lit8 v4, v2, 0xc

    invoke-static {v1, v5, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v3

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/qo7;->c([B[B)[B

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/zc7;->f:Ljava/math/BigInteger;

    iget-object v2, p0, Lcom/daaw/zc7;->b:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-gez v1, :cond_3

    iget-object v1, p0, Lcom/daaw/zc7;->f:Ljava/math/BigInteger;

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/zc7;->f:Ljava/math/BigInteger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_3
    :try_start_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "message limit reached"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "integer too large"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
