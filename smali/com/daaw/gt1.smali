.class public Lcom/daaw/gt1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Landroid/view/ViewGroup;ILcom/daaw/wc0;)Lcom/daaw/eb;
    .locals 0

    packed-switch p2, :pswitch_data_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "viewType: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/q6;->k(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    new-instance p2, Lcom/daaw/c30;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/c30;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V

    return-object p2

    :pswitch_1
    new-instance p2, Lcom/daaw/c30;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/c30;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V

    return-object p2

    :pswitch_2
    new-instance p2, Lcom/daaw/ja0;

    invoke-direct {p2, p0, p1}, Lcom/daaw/ja0;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_3
    new-instance p2, Lcom/daaw/d30;

    invoke-direct {p2, p0, p1}, Lcom/daaw/d30;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_4
    new-instance p2, Lcom/daaw/ba1;

    invoke-direct {p2, p0, p1}, Lcom/daaw/ba1;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_5
    new-instance p2, Lcom/daaw/ea0;

    invoke-direct {p2, p0, p1}, Lcom/daaw/ea0;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_6
    new-instance p2, Lcom/daaw/qa0;

    invoke-direct {p2, p0, p1}, Lcom/daaw/qa0;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_7
    new-instance p2, Lcom/daaw/e90;

    invoke-direct {p2, p0, p1}, Lcom/daaw/e90;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_8
    new-instance p2, Lcom/daaw/y80;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/y80;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/wc0;)V

    return-object p2

    :pswitch_9
    new-instance p2, Lcom/daaw/x80;

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/x80;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/wc0;)V

    return-object p2

    :pswitch_a
    new-instance p2, Lcom/daaw/k90;

    invoke-direct {p2, p0, p1}, Lcom/daaw/k90;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_b
    new-instance p2, Lcom/daaw/c90;

    invoke-direct {p2, p0, p1}, Lcom/daaw/c90;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_c
    new-instance p2, Lcom/daaw/w90;

    invoke-direct {p2, p0, p1}, Lcom/daaw/w90;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_d
    new-instance p2, Lcom/daaw/f90;

    invoke-direct {p2, p0, p1}, Lcom/daaw/f90;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_e
    new-instance p2, Lcom/daaw/g90;

    invoke-direct {p2, p0, p1}, Lcom/daaw/g90;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object p2

    :pswitch_f
    new-instance p2, Lcom/daaw/c30;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p1, p3}, Lcom/daaw/c30;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;I)V

    return-object p2

    :pswitch_10
    new-instance p0, Lcom/daaw/uk;

    invoke-direct {p0, p1}, Lcom/daaw/uk;-><init>(Landroid/view/ViewGroup;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
