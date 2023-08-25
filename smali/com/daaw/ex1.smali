.class public final Lcom/daaw/ex1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zz;


# static fields
.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/ol1;

.field public final c:Lcom/daaw/rv0;

.field public d:Lcom/daaw/d00;

.field public e:[B

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "LOCAL:([^,]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/daaw/ex1;->g:Ljava/util/regex/Pattern;

    const-string v0, "MPEGTS:(\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/daaw/ex1;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/daaw/ol1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/ex1;->b:Lcom/daaw/ol1;

    new-instance p1, Lcom/daaw/rv0;

    invoke-direct {p1}, Lcom/daaw/rv0;-><init>()V

    iput-object p1, p0, Lcom/daaw/ex1;->c:Lcom/daaw/rv0;

    const/16 p1, 0x400

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/daaw/ex1;->e:[B

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final b(J)Lcom/daaw/sm1;
    .locals 10

    iget-object v0, p0, Lcom/daaw/ex1;->d:Lcom/daaw/d00;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Lcom/daaw/d00;->a(II)Lcom/daaw/sm1;

    move-result-object v0

    iget-object v6, p0, Lcom/daaw/ex1;->a:Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "text/vtt"

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-wide v8, p1

    invoke-static/range {v1 .. v9}, Lcom/google/android/exoplayer2/Format;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;J)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/sm1;->d(Lcom/google/android/exoplayer2/Format;)V

    iget-object p1, p0, Lcom/daaw/ex1;->d:Lcom/daaw/d00;

    invoke-interface {p1}, Lcom/daaw/d00;->n()V

    return-object v0
.end method

.method public c(Lcom/daaw/a00;)Z
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public d(Lcom/daaw/a00;Lcom/daaw/iy0;)I
    .locals 4

    invoke-interface {p1}, Lcom/daaw/a00;->h()J

    move-result-wide v0

    long-to-int p2, v0

    iget v0, p0, Lcom/daaw/ex1;->f:I

    iget-object v1, p0, Lcom/daaw/ex1;->e:[B

    array-length v2, v1

    const/4 v3, -0x1

    if-ne v0, v2, :cond_1

    if-eq p2, v3, :cond_0

    move v0, p2

    goto :goto_0

    :cond_0
    array-length v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ex1;->e:[B

    :cond_1
    iget-object v0, p0, Lcom/daaw/ex1;->e:[B

    iget v1, p0, Lcom/daaw/ex1;->f:I

    array-length v2, v0

    sub-int/2addr v2, v1

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/a00;->b([BII)I

    move-result p1

    if-eq p1, v3, :cond_3

    iget v0, p0, Lcom/daaw/ex1;->f:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/ex1;->f:I

    if-eq p2, v3, :cond_2

    if-eq v0, p2, :cond_3

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/ex1;->e()V

    return v3
.end method

.method public final e()V
    .locals 12

    new-instance v0, Lcom/daaw/rv0;

    iget-object v1, p0, Lcom/daaw/ex1;->e:[B

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>([B)V

    :try_start_0
    invoke-static {v0}, Lcom/daaw/fx1;->d(Lcom/daaw/rv0;)V
    :try_end_0
    .catch Lcom/daaw/vh1; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, 0x0

    move-wide v3, v1

    move-wide v5, v3

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/daaw/rv0;->k()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_3

    const-string v8, "X-TIMESTAMP-MAP"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    sget-object v3, Lcom/daaw/ex1;->g:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Lcom/daaw/ex1;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v3, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/fx1;->c(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/daaw/ol1;->f(J)J

    move-result-wide v3

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/tv0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lcom/daaw/tv0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v0}, Lcom/daaw/fx1;->a(Lcom/daaw/rv0;)Ljava/util/regex/Matcher;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {p0, v1, v2}, Lcom/daaw/ex1;->b(J)Lcom/daaw/sm1;

    return-void

    :cond_4
    invoke-virtual {v0, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/fx1;->c(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/ex1;->b:Lcom/daaw/ol1;

    add-long/2addr v3, v0

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Lcom/daaw/ol1;->i(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/daaw/ol1;->b(J)J

    move-result-wide v6

    sub-long v0, v6, v0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/ex1;->b(J)Lcom/daaw/sm1;

    move-result-object v5

    iget-object v0, p0, Lcom/daaw/ex1;->c:Lcom/daaw/rv0;

    iget-object v1, p0, Lcom/daaw/ex1;->e:[B

    iget v2, p0, Lcom/daaw/ex1;->f:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rv0;->H([BI)V

    iget-object v0, p0, Lcom/daaw/ex1;->c:Lcom/daaw/rv0;

    iget v1, p0, Lcom/daaw/ex1;->f:I

    invoke-interface {v5, v0, v1}, Lcom/daaw/sm1;->c(Lcom/daaw/rv0;I)V

    const/4 v8, 0x1

    iget v9, p0, Lcom/daaw/ex1;->f:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-interface/range {v5 .. v11}, Lcom/daaw/sm1;->a(JIIILcom/daaw/sm1$a;)V

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/daaw/tv0;

    invoke-direct {v1, v0}, Lcom/daaw/tv0;-><init>(Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public f(JJ)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public i(Lcom/daaw/d00;)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/ex1;->d:Lcom/daaw/d00;

    new-instance v0, Lcom/daaw/da1$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/daaw/da1$b;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/daaw/d00;->d(Lcom/daaw/da1;)V

    return-void
.end method
