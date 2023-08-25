.class public abstract Lcom/daaw/qr7;
.super Lcom/daaw/nq7;
.source ""


# static fields
.field public static final b:Ljava/util/logging/Logger;

.field public static final c:Z


# instance fields
.field public a:Lcom/daaw/rr7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/daaw/qr7;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/daaw/qr7;->b:Ljava/util/logging/Logger;

    invoke-static {}, Lcom/daaw/gw7;->a()Z

    move-result v0

    sput-boolean v0, Lcom/daaw/qr7;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nq7;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pr7;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/nq7;-><init>()V

    return-void
.end method

.method public static E(Lcom/daaw/yq7;)I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yq7;->o()I

    move-result p0

    invoke-static {p0}, Lcom/daaw/qr7;->f(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static F(ILcom/daaw/xt7;Lcom/daaw/cv7;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Lcom/daaw/qr7;->f(I)I

    move-result p0

    add-int/2addr p0, p0

    check-cast p1, Lcom/daaw/hq7;

    invoke-virtual {p1, p2}, Lcom/daaw/hq7;->f(Lcom/daaw/cv7;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static G(I)I
    .locals 0

    if-ltz p0, :cond_0

    invoke-static {p0}, Lcom/daaw/qr7;->f(I)I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static H(Lcom/daaw/at7;)I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/at7;->a()I

    move-result p0

    invoke-static {p0}, Lcom/daaw/qr7;->f(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static b(Lcom/daaw/xt7;Lcom/daaw/cv7;)I
    .locals 0

    check-cast p0, Lcom/daaw/hq7;

    invoke-virtual {p0, p1}, Lcom/daaw/hq7;->f(Lcom/daaw/cv7;)I

    move-result p0

    invoke-static {p0}, Lcom/daaw/qr7;->f(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static c(I)I
    .locals 1

    const/16 v0, 0x1000

    if-le p0, v0, :cond_0

    return v0

    :cond_0
    return p0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Lcom/daaw/lw7;->e(Ljava/lang/CharSequence;)I

    move-result p0
    :try_end_0
    .catch Lcom/daaw/kw7; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lcom/daaw/vs7;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lcom/daaw/qr7;->f(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static e(I)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Lcom/daaw/qr7;->f(I)I

    move-result p0

    return p0
.end method

.method public static f(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static g(J)I
    .locals 7

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    :cond_0
    cmp-long v0, p0, v3

    if-gez v0, :cond_1

    const/16 p0, 0xa

    return p0

    :cond_1
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    const/16 v0, 0x1c

    ushr-long/2addr p0, v0

    const/4 v0, 0x6

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const-wide/32 v5, -0x200000

    and-long/2addr v5, p0

    cmp-long v1, v5, v3

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, 0x2

    const/16 v1, 0xe

    ushr-long/2addr p0, v1

    :cond_3
    const-wide/16 v5, -0x4000

    and-long/2addr p0, v5

    cmp-long v1, p0, v3

    if-eqz v1, :cond_4

    add-int/2addr v0, v2

    :cond_4
    return v0
.end method

.method public static h([B)Lcom/daaw/qr7;
    .locals 3

    array-length v0, p0

    new-instance v1, Lcom/daaw/mr7;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Lcom/daaw/mr7;-><init>([BII)V

    return-object v1
.end method

.method public static i(Ljava/io/OutputStream;I)Lcom/daaw/qr7;
    .locals 1

    new-instance v0, Lcom/daaw/or7;

    invoke-direct {v0, p0, p1}, Lcom/daaw/or7;-><init>(Ljava/io/OutputStream;I)V

    return-object v0
.end method

.method public static bridge synthetic l()Z
    .locals 1

    sget-boolean v0, Lcom/daaw/qr7;->c:Z

    return v0
.end method


# virtual methods
.method public abstract A(II)V
.end method

.method public abstract B(I)V
.end method

.method public abstract C(IJ)V
.end method

.method public abstract D(J)V
.end method

.method public abstract a([BII)V
.end method

.method public final j()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/qr7;->q()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k(Ljava/lang/String;Lcom/daaw/kw7;)V
    .locals 6

    sget-object v0, Lcom/daaw/qr7;->b:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "com.google.protobuf.CodedOutputStream"

    const-string v3, "inefficientWriteStringNoTag"

    const-string v4, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Lcom/daaw/vs7;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lcom/daaw/qr7;->B(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/qr7;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/daaw/nr7;

    invoke-direct {p2, p1}, Lcom/daaw/nr7;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract m()V
.end method

.method public abstract n(B)V
.end method

.method public abstract o(IZ)V
.end method

.method public abstract p(ILcom/daaw/yq7;)V
.end method

.method public abstract q()I
.end method

.method public abstract r(II)V
.end method

.method public abstract s(I)V
.end method

.method public abstract t(IJ)V
.end method

.method public abstract u(J)V
.end method

.method public abstract v(II)V
.end method

.method public abstract w(I)V
.end method

.method public abstract x(ILcom/daaw/xt7;Lcom/daaw/cv7;)V
.end method

.method public abstract y(ILjava/lang/String;)V
.end method

.method public abstract z(II)V
.end method
