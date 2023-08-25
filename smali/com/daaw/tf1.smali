.class public Lcom/daaw/tf1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lcom/daaw/lo1;Lcom/daaw/lo1;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/tf1;->f(Lcom/daaw/lo1;Lcom/daaw/lo1;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/daaw/lo1;Lcom/daaw/lo1;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/tf1;->e(Lcom/daaw/lo1;Lcom/daaw/lo1;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/daaw/lo1;Lcom/daaw/lo1;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/tf1;->g(Lcom/daaw/lo1;Lcom/daaw/lo1;)I

    move-result p0

    return p0
.end method

.method public static d(Lcom/daaw/ie1$h;I)Ljava/util/Comparator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/daaw/pf1;",
            ">(",
            "Lcom/daaw/ie1$h;",
            "I)",
            "Ljava/util/Comparator<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "TT;>;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Lcom/daaw/ie1$h;->a:I

    const/16 v2, 0x8

    if-eq v1, v2, :cond_1

    move p1, v1

    :cond_1
    if-eqz p1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v0, Lcom/daaw/sf1;->p:Lcom/daaw/sf1;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/daaw/qf1;->p:Lcom/daaw/qf1;

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/daaw/rf1;->p:Lcom/daaw/rf1;

    :goto_0
    :pswitch_1
    if-eqz v0, :cond_4

    iget-boolean p0, p0, Lcom/daaw/ie1$h;->b:Z

    if-eqz p0, :cond_4

    invoke-static {v0}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic e(Lcom/daaw/lo1;Lcom/daaw/lo1;)I
    .locals 0

    iget-object p0, p0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p0, Lcom/daaw/pf1;

    iget-object p0, p0, Lcom/daaw/pf1;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/pf1;

    iget-object p1, p1, Lcom/daaw/pf1;->a:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Lcom/daaw/lo1;Lcom/daaw/lo1;)I
    .locals 0

    iget-object p0, p0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p0, Lcom/daaw/pf1;

    iget-object p0, p0, Lcom/daaw/pf1;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/pf1;

    iget-object p1, p1, Lcom/daaw/pf1;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lcom/daaw/lo1;Lcom/daaw/lo1;)I
    .locals 2

    iget-object p0, p0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p0, Lcom/daaw/pf1;

    iget p0, p0, Lcom/daaw/pf1;->c:I

    int-to-long v0, p0

    iget-object p0, p1, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p0, Lcom/daaw/pf1;

    iget p0, p0, Lcom/daaw/pf1;->c:I

    int-to-long p0, p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Long;->compare(JJ)I

    move-result p0

    return p0
.end method
