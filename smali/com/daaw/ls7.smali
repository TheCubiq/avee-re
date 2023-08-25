.class public abstract Lcom/daaw/ls7;
.super Lcom/daaw/hq7;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/daaw/ls7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/daaw/fs7<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/daaw/hq7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static final zzb:Ljava/util/Map;


# instance fields
.field public zzc:Lcom/daaw/uv7;

.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/daaw/ls7;->zzb:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/hq7;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/ls7;->zzd:I

    invoke-static {}, Lcom/daaw/uv7;->c()Lcom/daaw/uv7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    return-void
.end method

.method public static C(Ljava/lang/Class;Lcom/daaw/ls7;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/ls7;->B()V

    sget-object v0, Lcom/daaw/ls7;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static J(Lcom/daaw/ls7;)Lcom/daaw/ls7;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ls7;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/sv7;

    invoke-direct {v0, p0}, Lcom/daaw/sv7;-><init>(Lcom/daaw/xt7;)V

    invoke-virtual {v0}, Lcom/daaw/sv7;->a()Lcom/daaw/xs7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static K(Lcom/daaw/ls7;[BIILcom/daaw/vr7;)Lcom/daaw/ls7;
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/ls7;->n()Lcom/daaw/ls7;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object p2

    new-instance v5, Lcom/daaw/kq7;

    invoke-direct {v5, p4}, Lcom/daaw/kq7;-><init>(Lcom/daaw/vr7;)V

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, Lcom/daaw/cv7;->g(Ljava/lang/Object;[BIILcom/daaw/kq7;)V

    invoke-interface {p2, p0}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/daaw/sv7; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/daaw/xs7;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/daaw/xs7;

    throw p0

    :cond_0
    new-instance p2, Lcom/daaw/xs7;

    invoke-direct {p2, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p2

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/sv7;->a()Lcom/daaw/xs7;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1

    :catch_3
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/xs7;->l()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lcom/daaw/xs7;

    invoke-direct {p2, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_1
    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1
.end method

.method public static m(Ljava/lang/Class;)Lcom/daaw/ls7;
    .locals 4

    sget-object v0, Lcom/daaw/ls7;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ls7;

    if-nez v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ls7;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v1, :cond_2

    invoke-static {p0}, Lcom/daaw/gw7;->o(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ls7;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ls7;

    if-eqz v1, :cond_1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v1
.end method

.method public static o(Lcom/daaw/ls7;Lcom/daaw/yq7;)Lcom/daaw/ls7;
    .locals 3

    sget-object v0, Lcom/daaw/vr7;->c:Lcom/daaw/vr7;

    invoke-virtual {p1}, Lcom/daaw/yq7;->v()Lcom/daaw/jr7;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/ls7;->n()Lcom/daaw/ls7;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v1

    invoke-static {p1}, Lcom/daaw/kr7;->A(Lcom/daaw/jr7;)Lcom/daaw/kr7;

    move-result-object v2

    invoke-interface {v1, p0, v2, v0}, Lcom/daaw/cv7;->h(Ljava/lang/Object;Lcom/daaw/iu7;Lcom/daaw/vr7;)V

    invoke-interface {v1, p0}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/daaw/sv7; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p1, v0}, Lcom/daaw/jr7;->B(I)V
    :try_end_1
    .catch Lcom/daaw/xs7; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {p0}, Lcom/daaw/ls7;->J(Lcom/daaw/ls7;)Lcom/daaw/ls7;

    invoke-static {p0}, Lcom/daaw/ls7;->J(Lcom/daaw/ls7;)Lcom/daaw/ls7;

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/daaw/xs7;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/daaw/xs7;

    throw p0

    :cond_0
    throw p0

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lcom/daaw/xs7;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/daaw/xs7;

    throw p0

    :cond_1
    new-instance v0, Lcom/daaw/xs7;

    invoke-direct {v0, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    invoke-virtual {v0, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw v0

    :catch_3
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/sv7;->a()Lcom/daaw/xs7;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1

    :catch_4
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/xs7;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/daaw/xs7;

    invoke-direct {v0, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    move-object p1, v0

    :cond_2
    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1
.end method

.method public static p(Lcom/daaw/ls7;[B)Lcom/daaw/ls7;
    .locals 3

    array-length v0, p1

    sget-object v1, Lcom/daaw/vr7;->c:Lcom/daaw/vr7;

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/daaw/ls7;->K(Lcom/daaw/ls7;[BIILcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/ls7;->J(Lcom/daaw/ls7;)Lcom/daaw/ls7;

    return-object p0
.end method

.method public static q(Lcom/daaw/ls7;Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/ls7;
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/yq7;->v()Lcom/daaw/jr7;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/ls7;->n()Lcom/daaw/ls7;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/kr7;->A(Lcom/daaw/jr7;)Lcom/daaw/kr7;

    move-result-object v1

    invoke-interface {v0, p0, v1, p2}, Lcom/daaw/cv7;->h(Ljava/lang/Object;Lcom/daaw/iu7;Lcom/daaw/vr7;)V

    invoke-interface {v0, p0}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/daaw/sv7; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 p2, 0x0

    :try_start_1
    invoke-virtual {p1, p2}, Lcom/daaw/jr7;->B(I)V
    :try_end_1
    .catch Lcom/daaw/xs7; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {p0}, Lcom/daaw/ls7;->J(Lcom/daaw/ls7;)Lcom/daaw/ls7;

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/daaw/xs7;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/daaw/xs7;

    throw p0

    :cond_0
    throw p0

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/daaw/xs7;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/daaw/xs7;

    throw p0

    :cond_1
    new-instance p2, Lcom/daaw/xs7;

    invoke-direct {p2, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p2

    :catch_3
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/sv7;->a()Lcom/daaw/xs7;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1

    :catch_4
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/xs7;->l()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/daaw/xs7;

    invoke-direct {p2, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1
.end method

.method public static r(Lcom/daaw/ls7;Ljava/io/InputStream;Lcom/daaw/vr7;)Lcom/daaw/ls7;
    .locals 2

    const/16 v0, 0x1000

    invoke-static {p1, v0}, Lcom/daaw/jr7;->g(Ljava/io/InputStream;I)Lcom/daaw/jr7;

    move-result-object p1

    invoke-virtual {p0}, Lcom/daaw/ls7;->n()Lcom/daaw/ls7;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/kr7;->A(Lcom/daaw/jr7;)Lcom/daaw/kr7;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lcom/daaw/cv7;->h(Ljava/lang/Object;Lcom/daaw/iu7;Lcom/daaw/vr7;)V

    invoke-interface {v0, p0}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/daaw/sv7; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p0}, Lcom/daaw/ls7;->J(Lcom/daaw/ls7;)Lcom/daaw/ls7;

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/daaw/xs7;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/daaw/xs7;

    throw p0

    :cond_0
    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/daaw/xs7;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/daaw/xs7;

    throw p0

    :cond_1
    new-instance p2, Lcom/daaw/xs7;

    invoke-direct {p2, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p2

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/sv7;->a()Lcom/daaw/xs7;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1

    :catch_3
    move-exception p1

    invoke-virtual {p1}, Lcom/daaw/xs7;->l()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/daaw/xs7;

    invoke-direct {p2, p1}, Lcom/daaw/xs7;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Lcom/daaw/xs7;->h(Lcom/daaw/xt7;)Lcom/daaw/xs7;

    throw p1
.end method

.method public static s(Lcom/daaw/ls7;[BLcom/daaw/vr7;)Lcom/daaw/ls7;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, p2}, Lcom/daaw/ls7;->K(Lcom/daaw/ls7;[BIILcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/ls7;->J(Lcom/daaw/ls7;)Lcom/daaw/ls7;

    return-object p0
.end method

.method public static t()Lcom/daaw/qs7;
    .locals 1

    invoke-static {}, Lcom/daaw/ms7;->f()Lcom/daaw/ms7;

    move-result-object v0

    return-object v0
.end method

.method public static u(Lcom/daaw/qs7;)Lcom/daaw/qs7;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v0, v0

    :goto_0
    invoke-interface {p0, v0}, Lcom/daaw/qs7;->c(I)Lcom/daaw/qs7;

    move-result-object p0

    return-object p0
.end method

.method public static v()Lcom/daaw/ts7;
    .locals 1

    invoke-static {}, Lcom/daaw/mt7;->f()Lcom/daaw/mt7;

    move-result-object v0

    return-object v0
.end method

.method public static w()Lcom/daaw/us7;
    .locals 1

    invoke-static {}, Lcom/daaw/gu7;->e()Lcom/daaw/gu7;

    move-result-object v0

    return-object v0
.end method

.method public static x(Lcom/daaw/us7;)Lcom/daaw/us7;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v0, v0

    :goto_0
    invoke-interface {p0, v0}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object p0

    return-object p0
.end method

.method public static varargs y(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/daaw/hu7;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/hu7;-><init>(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 2

    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/ls7;->B()V

    return-void
.end method

.method public final B()V
    .locals 2

    iget v0, p0, Lcom/daaw/ls7;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/ls7;->zzd:I

    return-void
.end method

.method public final D(I)V
    .locals 1

    iget p1, p0, Lcom/daaw/ls7;->zzd:I

    const/high16 v0, -0x80000000

    and-int/2addr p1, v0

    const v0, 0x7fffffff

    or-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/ls7;->zzd:I

    return-void
.end method

.method public final E()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    if-ne v2, v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v2

    invoke-interface {v2, p0}, Lcom/daaw/cv7;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eq v0, v2, :cond_2

    move-object v0, v1

    goto :goto_1

    :cond_2
    move-object v0, p0

    :goto_1
    const/4 v3, 0x2

    invoke-virtual {p0, v3, v0, v1}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method

.method final F()Z
    .locals 2

    iget v0, p0, Lcom/daaw/ls7;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()I
    .locals 2

    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/daaw/cv7;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final H()Lcom/daaw/fs7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fs7;

    return-object v0
.end method

.method public abstract I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final synthetic b()Lcom/daaw/wt7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fs7;

    return-object v0
.end method

.method public final synthetic c()Lcom/daaw/xt7;
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ls7;

    return-object v0
.end method

.method public final e(Lcom/daaw/qr7;)V
    .locals 2

    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/rr7;->l(Lcom/daaw/qr7;)Lcom/daaw/rr7;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/daaw/cv7;->f(Ljava/lang/Object;Lcom/daaw/rr7;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    check-cast p1, Lcom/daaw/ls7;

    invoke-interface {v0, p0, p1}, Lcom/daaw/cv7;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Lcom/daaw/cv7;)I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ls7;->F()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/ls7;->j(Lcom/daaw/cv7;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcom/daaw/ls7;->zzd:I

    const v2, 0x7fffffff

    and-int/2addr v0, v2

    if-eq v0, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/ls7;->j(Lcom/daaw/cv7;)I

    move-result p1

    if-ltz p1, :cond_3

    iget v0, p0, Lcom/daaw/ls7;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    or-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/ls7;->zzd:I

    return p1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ls7;->F()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/daaw/hq7;->zza:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ls7;->G()I

    move-result v0

    iput v0, p0, Lcom/daaw/hq7;->zza:I

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ls7;->G()I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/ls7;->F()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v2}, Lcom/daaw/ls7;->j(Lcom/daaw/cv7;)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    iget v0, p0, Lcom/daaw/ls7;->zzd:I

    const v3, 0x7fffffff

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2}, Lcom/daaw/ls7;->j(Lcom/daaw/cv7;)I

    move-result v0

    if-ltz v0, :cond_3

    iget v1, p0, Lcom/daaw/ls7;->zzd:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/ls7;->zzd:I

    :goto_0
    return v0

    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final j(Lcom/daaw/cv7;)I
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/daaw/cv7;->zza(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1, p0}, Lcom/daaw/cv7;->zza(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final k()Lcom/daaw/fs7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/fs7;

    invoke-virtual {v0, p0}, Lcom/daaw/fs7;->k(Lcom/daaw/ls7;)Lcom/daaw/fs7;

    return-object v0
.end method

.method public final n()Lcom/daaw/ls7;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/daaw/ls7;->I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ls7;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/daaw/zt7;->a(Lcom/daaw/xt7;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
