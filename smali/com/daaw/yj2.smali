.class public final Lcom/daaw/yj2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Z

.field public static b:Ljava/security/MessageDigest;

.field public static final c:Ljava/lang/Object;

.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/yj2;->c:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/yj2;->d:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sput-object v0, Lcom/daaw/yj2;->e:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method public static a(Lcom/daaw/fj2;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/hq7;->a()[B

    move-result-object p0

    sget-object v0, Lcom/daaw/g93;->N2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    sget-object v0, Lcom/daaw/ym2;->a:Lcom/daaw/l87;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array p1, v1, [B

    :goto_0
    sget-object v0, Lcom/daaw/ym2;->a:Lcom/daaw/l87;

    invoke-interface {v0, p0, p1}, Lcom/daaw/l87;->a([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/daaw/sj2;->L()Lcom/daaw/rj2;

    move-result-object p1

    invoke-static {p0}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/daaw/rj2;->s(Lcom/daaw/yq7;)Lcom/daaw/rj2;

    const/4 p0, 0x3

    invoke-virtual {p1, p0}, Lcom/daaw/rj2;->u(I)Lcom/daaw/rj2;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    :goto_1
    check-cast p0, Lcom/daaw/sj2;

    invoke-virtual {p0}, Lcom/daaw/hq7;->a()[B

    move-result-object p0

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0}, Ljava/security/GeneralSecurityException;-><init>()V

    throw p0

    :cond_2
    const/16 v0, 0xff

    invoke-static {p0, v0}, Lcom/daaw/yj2;->b([BI)Ljava/util/Vector;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Lcom/daaw/sj2;->L()Lcom/daaw/rj2;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_4

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [B

    invoke-static {v6, p1, v1}, Lcom/daaw/yj2;->g([BLjava/lang/String;Z)[B

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/daaw/rj2;->s(Lcom/daaw/yq7;)Lcom/daaw/rj2;

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    invoke-static {p0}, Lcom/daaw/yj2;->e([B)[B

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/yq7;->F([B)Lcom/daaw/yq7;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/daaw/rj2;->t(Lcom/daaw/yq7;)Lcom/daaw/rj2;

    invoke-virtual {v3}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    goto :goto_1

    :cond_5
    :goto_3
    const/16 p0, 0x1000

    invoke-static {p0}, Lcom/daaw/yj2;->f(I)Lcom/daaw/fj2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/hq7;->a()[B

    move-result-object p0

    invoke-static {p0, p1, v2}, Lcom/daaw/yj2;->g([BLjava/lang/String;Z)[B

    move-result-object p0

    :goto_4
    invoke-static {p0, v2}, Lcom/daaw/uj2;->a([BZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b([BI)Ljava/util/Vector;
    .locals 7

    const/4 p1, 0x0

    if-eqz p0, :cond_3

    array-length v0, p0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit16 v0, v0, 0xfe

    const/16 v1, 0xff

    div-int/2addr v0, v1

    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    mul-int/lit16 v4, v3, 0xff

    :try_start_0
    array-length v5, p0

    sub-int v6, v5, v4

    if-le v6, v1, :cond_1

    add-int/lit16 v5, v4, 0xff

    :cond_1
    invoke-static {p0, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    return-object p1

    :cond_2
    return-object v2

    :cond_3
    :goto_1
    return-object p1
.end method

.method public static bridge synthetic c(Ljava/security/MessageDigest;)V
    .locals 0

    sput-object p0, Lcom/daaw/yj2;->b:Ljava/security/MessageDigest;

    return-void
.end method

.method public static d()V
    .locals 4

    sget-object v0, Lcom/daaw/yj2;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/daaw/yj2;->a:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    sput-boolean v1, Lcom/daaw/yj2;->a:Z

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/daaw/xj2;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/daaw/xj2;-><init>(Lcom/daaw/wj2;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static e([B)[B
    .locals 6

    sget-object v0, Lcom/daaw/yj2;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/daaw/yj2;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    :try_start_1
    sget-object v2, Lcom/daaw/yj2;->e:Ljava/util/concurrent/CountDownLatch;

    const-wide/16 v3, 0x2

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_2
    sget-object v2, Lcom/daaw/yj2;->b:Ljava/security/MessageDigest;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->update([B)V

    sget-object p0, Lcom/daaw/yj2;->b:Ljava/security/MessageDigest;

    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    monitor-exit v0

    return-object p0

    :cond_2
    new-instance p0, Ljava/security/NoSuchAlgorithmException;

    const-string v1, "Cannot compute hash"

    invoke-direct {p0, v1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static f(I)Lcom/daaw/fj2;
    .locals 2

    invoke-static {}, Lcom/daaw/fj2;->l0()Lcom/daaw/hi2;

    move-result-object p0

    const-wide/16 v0, 0x1000

    invoke-virtual {p0, v0, v1}, Lcom/daaw/hi2;->v(J)Lcom/daaw/hi2;

    invoke-virtual {p0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/fj2;

    return-object p0
.end method

.method public static g([BLjava/lang/String;Z)[B
    .locals 5

    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/16 v1, 0xff

    goto :goto_0

    :cond_0
    const/16 v1, 0xef

    :goto_0
    array-length v2, p0

    if-le v2, v1, :cond_1

    const/16 p0, 0x1000

    invoke-static {p0}, Lcom/daaw/yj2;->f(I)Lcom/daaw/fj2;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/hq7;->a()[B

    move-result-object p0

    :cond_1
    array-length v2, p0

    if-ge v2, v1, :cond_2

    sub-int v3, v1, v2

    new-array v3, v3, [B

    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v4, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    add-int/2addr v1, v0

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    int-to-byte v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    goto :goto_1

    :cond_2
    add-int/2addr v1, v0

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    int-to-byte v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    :goto_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    const/16 v0, 0x100

    if-eqz p2, :cond_3

    invoke-static {p0}, Lcom/daaw/yj2;->e([B)[B

    move-result-object p2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    :cond_3
    new-array p2, v0, [B

    new-instance v0, Lcom/daaw/dl2;

    invoke-direct {v0}, Lcom/daaw/dl2;-><init>()V

    iget-object v0, v0, Lcom/daaw/dl2;->G2:[Lcom/daaw/zj2;

    array-length v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2
    const/16 v3, 0xc

    if-ge v2, v3, :cond_4

    aget-object v3, v0, v2

    invoke-interface {v3, p0, p2}, Lcom/daaw/zj2;->a([B[B)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v0, 0x20

    if-le p0, v0, :cond_5

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_5
    const-string p0, "UTF-8"

    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    new-instance p1, Lcom/daaw/fq7;

    invoke-direct {p1, p0}, Lcom/daaw/fq7;-><init>([B)V

    invoke-virtual {p1, p2}, Lcom/daaw/fq7;->a([B)V

    :cond_6
    return-object p2
.end method
