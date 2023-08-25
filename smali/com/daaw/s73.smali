.class public final Lcom/daaw/s73;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/xb;
    .locals 7

    sget-object p1, Lcom/daaw/uz2;->j:Lcom/daaw/xb;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "BillingClient"

    if-nez p0, :cond_0

    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v0

    const-string p2, "%s got null owned items list"

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {v2, p0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-static {p0, v2}, Lcom/daaw/yx2;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v3

    invoke-static {p0, v2}, Lcom/daaw/yx2;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    invoke-virtual {v5, v4}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v5}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v4

    if-eqz v3, :cond_1

    const/4 p0, 0x2

    new-array p0, p0, [Ljava/lang/Object;

    aput-object p2, p0, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p0, v1

    const-string p1, "%s failed. Response code: %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    :cond_1
    const-string v3, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {p0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    const-string v4, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    const-string v5, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {p0, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {p0, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez v3, :cond_3

    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v0

    const-string p2, "Bundle returned from %s contains null SKUs list."

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    if-nez v4, :cond_4

    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v0

    const-string p2, "Bundle returned from %s contains null purchases list."

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_4
    if-nez p0, :cond_5

    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v0

    const-string p2, "Bundle returned from %s contains null signatures list."

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_5
    sget-object p0, Lcom/daaw/uz2;->l:Lcom/daaw/xb;

    return-object p0

    :cond_6
    :goto_1
    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v0

    const-string p2, "Bundle returned from %s doesn\'t contain required fields."

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0
.end method
