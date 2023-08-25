.class public final Lcom/daaw/n20;
.super Lcom/daaw/rg1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/n20$a;
    }
.end annotation


# instance fields
.field public n:Lcom/daaw/o20;

.field public o:Lcom/daaw/n20$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/rg1;-><init>()V

    return-void
.end method

.method public static synthetic l(Lcom/daaw/n20;)Lcom/daaw/o20;
    .locals 0

    iget-object p0, p0, Lcom/daaw/n20;->n:Lcom/daaw/o20;

    return-object p0
.end method

.method public static n([B)Z
    .locals 2

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    const/4 v1, -0x1

    if-ne p0, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static o(Lcom/daaw/rv0;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/rv0;->a()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v0

    const-wide/32 v2, 0x464c4143

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public e(Lcom/daaw/rv0;)J
    .locals 2

    iget-object v0, p1, Lcom/daaw/rv0;->a:[B

    invoke-static {v0}, Lcom/daaw/n20;->n([B)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/n20;->m(Lcom/daaw/rv0;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public h(Lcom/daaw/rv0;JLcom/daaw/rg1$b;)Z
    .locals 11

    iget-object v0, p1, Lcom/daaw/rv0;->a:[B

    iget-object v1, p0, Lcom/daaw/n20;->n:Lcom/daaw/o20;

    if-nez v1, :cond_0

    new-instance p2, Lcom/daaw/o20;

    const/16 p3, 0x11

    invoke-direct {p2, v0, p3}, Lcom/daaw/o20;-><init>([BI)V

    iput-object p2, p0, Lcom/daaw/n20;->n:Lcom/daaw/o20;

    const/16 p2, 0x9

    invoke-virtual {p1}, Lcom/daaw/rv0;->d()I

    move-result p1

    invoke-static {v0, p2, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    const/4 p2, 0x4

    const/16 p3, -0x80

    aput-byte p3, p1, p2

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    iget-object p1, p0, Lcom/daaw/n20;->n:Lcom/daaw/o20;

    invoke-virtual {p1}, Lcom/daaw/o20;->a()I

    move-result v4

    iget-object p1, p0, Lcom/daaw/n20;->n:Lcom/daaw/o20;

    iget v5, p1, Lcom/daaw/o20;->f:I

    iget v6, p1, Lcom/daaw/o20;->e:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v1, "audio/flac"

    invoke-static/range {v0 .. v10}, Lcom/google/android/exoplayer2/Format;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object p1

    iput-object p1, p4, Lcom/daaw/rg1$b;->a:Lcom/google/android/exoplayer2/Format;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    aget-byte v2, v0, v1

    and-int/lit8 v2, v2, 0x7f

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    new-instance p2, Lcom/daaw/n20$a;

    invoke-direct {p2, p0}, Lcom/daaw/n20$a;-><init>(Lcom/daaw/n20;)V

    iput-object p2, p0, Lcom/daaw/n20;->o:Lcom/daaw/n20$a;

    invoke-virtual {p2, p1}, Lcom/daaw/n20$a;->f(Lcom/daaw/rv0;)V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/daaw/n20;->n([B)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/n20;->o:Lcom/daaw/n20$a;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2, p3}, Lcom/daaw/n20$a;->i(J)V

    iget-object p1, p0, Lcom/daaw/n20;->o:Lcom/daaw/n20$a;

    iput-object p1, p4, Lcom/daaw/rg1$b;->b:Lcom/daaw/ut0;

    :cond_2
    return v1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public j(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/rg1;->j(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/n20;->n:Lcom/daaw/o20;

    iput-object p1, p0, Lcom/daaw/n20;->o:Lcom/daaw/n20$a;

    :cond_0
    return-void
.end method

.method public final m(Lcom/daaw/rv0;)I
    .locals 3

    iget-object v0, p1, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x4

    shr-int/2addr v0, v2

    packed-switch v0, :pswitch_data_0

    const/4 p1, -0x1

    return p1

    :pswitch_0
    const/16 p1, 0x100

    add-int/lit8 v0, v0, -0x8

    :goto_0
    shl-int/2addr p1, v0

    return p1

    :pswitch_1
    invoke-virtual {p1, v2}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p1}, Lcom/daaw/rv0;->E()J

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/rv0;->x()I

    move-result v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/rv0;->D()I

    move-result v0

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/daaw/rv0;->J(I)V

    add-int/lit8 v0, v0, 0x1

    return v0

    :pswitch_2
    const/16 p1, 0x240

    sub-int/2addr v0, v1

    goto :goto_0

    :pswitch_3
    const/16 p1, 0xc0

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
