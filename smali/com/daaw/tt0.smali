.class public final Lcom/daaw/tt0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final l:I


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:I

.field public h:I

.field public i:I

.field public final j:[I

.field public final k:Lcom/daaw/rv0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "OggS"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/tt0;->l:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xff

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/daaw/tt0;->j:[I

    new-instance v1, Lcom/daaw/rv0;

    invoke-direct {v1, v0}, Lcom/daaw/rv0;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/a00;Z)Z
    .locals 8

    iget-object v0, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->F()V

    invoke-virtual {p0}, Lcom/daaw/tt0;->b()V

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v4, -0x1

    cmp-long v6, v0, v4

    if-eqz v6, :cond_1

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/daaw/a00;->e()J

    move-result-wide v4

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x1b

    cmp-long v6, v0, v4

    if-ltz v6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/16 v1, 0x1b

    invoke-interface {p1, v0, v3, v1, v2}, Lcom/daaw/a00;->d([BIIZ)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->z()J

    move-result-wide v4

    sget v0, Lcom/daaw/tt0;->l:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    if-eqz p2, :cond_3

    return v3

    :cond_3
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "expected OggS capture pattern at begin of page"

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object v0, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->x()I

    move-result v0

    iput v0, p0, Lcom/daaw/tt0;->a:I

    if-eqz v0, :cond_6

    if-eqz p2, :cond_5

    return v3

    :cond_5
    new-instance p1, Lcom/daaw/tv0;

    const-string p2, "unsupported bit stream revision"

    invoke-direct {p1, p2}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->x()I

    move-result p2

    iput p2, p0, Lcom/daaw/tt0;->b:I

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->m()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/tt0;->c:J

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->n()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/tt0;->d:J

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->n()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/tt0;->e:J

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->n()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/daaw/tt0;->f:J

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->x()I

    move-result p2

    iput p2, p0, Lcom/daaw/tt0;->g:I

    add-int/2addr p2, v1

    iput p2, p0, Lcom/daaw/tt0;->h:I

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->F()V

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    iget-object p2, p2, Lcom/daaw/rv0;->a:[B

    iget v0, p0, Lcom/daaw/tt0;->g:I

    invoke-interface {p1, p2, v3, v0}, Lcom/daaw/a00;->k([BII)V

    :goto_2
    iget p1, p0, Lcom/daaw/tt0;->g:I

    if-ge v3, p1, :cond_7

    iget-object p1, p0, Lcom/daaw/tt0;->j:[I

    iget-object p2, p0, Lcom/daaw/tt0;->k:Lcom/daaw/rv0;

    invoke-virtual {p2}, Lcom/daaw/rv0;->x()I

    move-result p2

    aput p2, p1, v3

    iget p1, p0, Lcom/daaw/tt0;->i:I

    iget-object p2, p0, Lcom/daaw/tt0;->j:[I

    aget p2, p2, v3

    add-int/2addr p1, p2

    iput p1, p0, Lcom/daaw/tt0;->i:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    return v2

    :cond_8
    :goto_3
    if-eqz p2, :cond_9

    return v3

    :cond_9
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method

.method public b()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/tt0;->a:I

    iput v0, p0, Lcom/daaw/tt0;->b:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/tt0;->c:J

    iput-wide v1, p0, Lcom/daaw/tt0;->d:J

    iput-wide v1, p0, Lcom/daaw/tt0;->e:J

    iput-wide v1, p0, Lcom/daaw/tt0;->f:J

    iput v0, p0, Lcom/daaw/tt0;->g:I

    iput v0, p0, Lcom/daaw/tt0;->h:I

    iput v0, p0, Lcom/daaw/tt0;->i:I

    return-void
.end method
