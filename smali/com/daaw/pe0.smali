.class public Lcom/daaw/pe0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lcom/daaw/oe0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/oe0<",
            "Lcom/daaw/lo1<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/pf1;",
            ">;",
            "Lcom/daaw/er0<",
            "Lcom/daaw/tx0;",
            "Lcom/daaw/pf1;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/oe0;

    new-instance v1, Lcom/daaw/pe0$a;

    invoke-direct {v1}, Lcom/daaw/pe0$a;-><init>()V

    new-instance v2, Lcom/daaw/er0$a;

    invoke-direct {v2}, Lcom/daaw/er0$a;-><init>()V

    const-string v3, "https://dir.xiph.org/yp.xml"

    const-string v4, "xiph_org_yp"

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/daaw/oe0;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/gz1$a;Lcom/daaw/w40;)V

    return-object v0
.end method
