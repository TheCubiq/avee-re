.class public final Lcom/daaw/xb2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sd2;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xb2;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(ILcom/daaw/rd2;)Lcom/daaw/ud2;
    .locals 2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_a

    const/4 v0, 0x3

    if-eq p1, v0, :cond_9

    const/4 v0, 0x4

    if-eq p1, v0, :cond_9

    const/16 v0, 0x15

    if-eq p1, v0, :cond_8

    const/16 v0, 0x1b

    const/4 v1, 0x0

    if-eq p1, v0, :cond_7

    const/16 v0, 0x24

    if-eq p1, v0, :cond_6

    const/16 v0, 0x59

    if-eq p1, v0, :cond_5

    const/16 v0, 0x8a

    if-eq p1, v0, :cond_4

    const/16 v0, 0xac

    if-eq p1, v0, :cond_3

    const/16 v0, 0x101

    if-eq p1, v0, :cond_2

    const/16 v0, 0x80

    if-eq p1, v0, :cond_a

    const/16 v0, 0x81

    if-eq p1, v0, :cond_1

    const/16 v0, 0x86

    if-eq p1, v0, :cond_0

    const/16 v0, 0x87

    if-eq p1, v0, :cond_1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/nc2;

    iget-object p2, p2, Lcom/daaw/rd2;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/nc2;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :pswitch_1
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/fc2;

    invoke-virtual {p0, p2}, Lcom/daaw/xb2;->c(Lcom/daaw/rd2;)Lcom/daaw/wd2;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/daaw/fc2;-><init>(Lcom/daaw/wd2;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/rb2;

    iget-object p2, p2, Lcom/daaw/rd2;->b:Ljava/lang/String;

    invoke-direct {v0, v1, p2}, Lcom/daaw/rb2;-><init>(ZLjava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/hd2;

    new-instance p2, Lcom/daaw/qc2;

    const-string v0, "application/x-scte35"

    invoke-direct {p2, v0}, Lcom/daaw/qc2;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/daaw/hd2;-><init>(Lcom/daaw/gd2;)V

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/lb2;

    iget-object p2, p2, Lcom/daaw/rd2;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/lb2;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/hd2;

    new-instance p2, Lcom/daaw/qc2;

    const-string v0, "application/vnd.dvb.ait"

    invoke-direct {p2, v0}, Lcom/daaw/qc2;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/daaw/hd2;-><init>(Lcom/daaw/gd2;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/ob2;

    iget-object p2, p2, Lcom/daaw/rd2;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/ob2;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/yb2;

    iget-object p2, p2, Lcom/daaw/rd2;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/yb2;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/zb2;

    iget-object p2, p2, Lcom/daaw/rd2;->c:Ljava/util/List;

    invoke-direct {v0, p2}, Lcom/daaw/zb2;-><init>(Ljava/util/List;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_6
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/lc2;

    invoke-virtual {p0, p2}, Lcom/daaw/xb2;->b(Lcom/daaw/rd2;)Lcom/daaw/id2;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/daaw/lc2;-><init>(Lcom/daaw/id2;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_7
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/jc2;

    invoke-virtual {p0, p2}, Lcom/daaw/xb2;->b(Lcom/daaw/rd2;)Lcom/daaw/id2;

    move-result-object p2

    invoke-direct {v0, p2, v1, v1}, Lcom/daaw/jc2;-><init>(Lcom/daaw/id2;ZZ)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_8
    new-instance p1, Lcom/daaw/rc2;

    new-instance p2, Lcom/daaw/mc2;

    invoke-direct {p2}, Lcom/daaw/mc2;-><init>()V

    invoke-direct {p1, p2}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_9
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/oc2;

    iget-object p2, p2, Lcom/daaw/rd2;->b:Ljava/lang/String;

    invoke-direct {v0, p2}, Lcom/daaw/oc2;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    :cond_a
    new-instance p1, Lcom/daaw/rc2;

    new-instance v0, Lcom/daaw/cc2;

    invoke-virtual {p0, p2}, Lcom/daaw/xb2;->c(Lcom/daaw/rd2;)Lcom/daaw/wd2;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/daaw/cc2;-><init>(Lcom/daaw/wd2;)V

    invoke-direct {p1, v0}, Lcom/daaw/rc2;-><init>(Lcom/daaw/ac2;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lcom/daaw/rd2;)Lcom/daaw/id2;
    .locals 1

    new-instance v0, Lcom/daaw/id2;

    invoke-virtual {p0, p1}, Lcom/daaw/xb2;->d(Lcom/daaw/rd2;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/id2;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final c(Lcom/daaw/rd2;)Lcom/daaw/wd2;
    .locals 1

    new-instance v0, Lcom/daaw/wd2;

    invoke-virtual {p0, p1}, Lcom/daaw/xb2;->d(Lcom/daaw/rd2;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/wd2;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final d(Lcom/daaw/rd2;)Ljava/util/List;
    .locals 11

    new-instance v0, Lcom/daaw/ik5;

    iget-object p1, p1, Lcom/daaw/rd2;->d:[B

    invoke-direct {v0, p1}, Lcom/daaw/ik5;-><init>([B)V

    iget-object p1, p0, Lcom/daaw/xb2;->a:Ljava/util/List;

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/ik5;->i()I

    move-result v1

    if-lez v1, :cond_5

    invoke-virtual {v0}, Lcom/daaw/ik5;->s()I

    move-result v1

    invoke-virtual {v0}, Lcom/daaw/ik5;->s()I

    move-result v2

    invoke-virtual {v0}, Lcom/daaw/ik5;->k()I

    move-result v3

    add-int/2addr v3, v2

    const/16 v2, 0x86

    if-ne v1, v2, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/ik5;->s()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_4

    const/4 v5, 0x3

    sget-object v6, Lcom/daaw/cy6;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v5, v6}, Lcom/daaw/ik5;->F(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/daaw/ik5;->s()I

    move-result v6

    and-int/lit16 v7, v6, 0x80

    const/4 v8, 0x1

    if-eqz v7, :cond_0

    const/4 v7, 0x1

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_1

    and-int/lit8 v6, v6, 0x3f

    const-string v9, "application/cea-708"

    goto :goto_3

    :cond_1
    const-string v9, "application/cea-608"

    const/4 v6, 0x1

    :goto_3
    invoke-virtual {v0}, Lcom/daaw/ik5;->s()I

    move-result v10

    int-to-byte v10, v10

    invoke-virtual {v0, v8}, Lcom/daaw/ik5;->g(I)V

    if-eqz v7, :cond_3

    sget v7, Lcom/daaw/ar4;->c:I

    and-int/lit8 v7, v10, 0x40

    if-eqz v7, :cond_2

    new-array v7, v8, [B

    aput-byte v8, v7, v2

    goto :goto_4

    :cond_2
    new-array v7, v8, [B

    aput-byte v2, v7, v2

    :goto_4
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_5

    :cond_3
    const/4 v7, 0x0

    :goto_5
    new-instance v8, Lcom/daaw/b72;

    invoke-direct {v8}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v8, v9}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v8, v5}, Lcom/daaw/b72;->k(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v8, v6}, Lcom/daaw/b72;->c0(I)Lcom/daaw/b72;

    invoke-virtual {v8, v7}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v8}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v3}, Lcom/daaw/ik5;->f(I)V

    goto/16 :goto_0

    :cond_5
    return-object p1
.end method
