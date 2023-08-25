.class public final Lcom/daaw/kt2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:[J


# instance fields
.field public final a:[B

.field public b:I

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/kt2;->d:[J

    return-void

    :array_0
    .array-data 8
        0x80
        0x40
        0x20
        0x10
        0x8
        0x4
        0x2
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/daaw/kt2;->a:[B

    return-void
.end method

.method public static b(I)I
    .locals 6

    const/4 v0, 0x0

    :cond_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    sget-object v1, Lcom/daaw/kt2;->d:[J

    aget-wide v2, v1, v0

    int-to-long v4, p0

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public static c([BIZ)J
    .locals 8

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/daaw/kt2;->d:[J

    add-int/lit8 v4, p1, -0x1

    aget-wide v4, p2, v4

    const-wide/16 v6, -0x1

    xor-long/2addr v4, v6

    and-long/2addr v0, v4

    :cond_0
    const/4 p2, 0x1

    :goto_0
    if-ge p2, p1, :cond_1

    const/16 v4, 0x8

    shl-long/2addr v0, v4

    aget-byte v4, p0, p2

    int-to-long v4, v4

    and-long/2addr v4, v2

    or-long/2addr v0, v4

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-wide v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/kt2;->c:I

    return v0
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/kt2;->b:I

    iput v0, p0, Lcom/daaw/kt2;->c:I

    return-void
.end method

.method public final e(Lcom/daaw/ms2;ZZI)J
    .locals 4

    iget v0, p0, Lcom/daaw/kt2;->b:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/kt2;->a:[B

    invoke-virtual {p1, v0, v3, v2, p2}, Lcom/daaw/ms2;->h([BIIZ)Z

    move-result p2

    if-nez p2, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/kt2;->a:[B

    aget-byte p2, p2, v3

    and-int/lit16 p2, p2, 0xff

    invoke-static {p2}, Lcom/daaw/kt2;->b(I)I

    move-result p2

    iput p2, p0, Lcom/daaw/kt2;->c:I

    if-eq p2, v1, :cond_1

    iput v2, p0, Lcom/daaw/kt2;->b:I

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No valid varint length mask found"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget p2, p0, Lcom/daaw/kt2;->c:I

    if-le p2, p4, :cond_3

    iput v3, p0, Lcom/daaw/kt2;->b:I

    const-wide/16 p1, -0x2

    return-wide p1

    :cond_3
    if-eq p2, v2, :cond_4

    iget-object p4, p0, Lcom/daaw/kt2;->a:[B

    add-int/2addr p2, v1

    invoke-virtual {p1, p4, v2, p2, v3}, Lcom/daaw/ms2;->h([BIIZ)Z

    :cond_4
    iput v3, p0, Lcom/daaw/kt2;->b:I

    iget-object p1, p0, Lcom/daaw/kt2;->a:[B

    iget p2, p0, Lcom/daaw/kt2;->c:I

    invoke-static {p1, p2, p3}, Lcom/daaw/kt2;->c([BIZ)J

    move-result-wide p1

    return-wide p1
.end method
