.class public final synthetic Lcom/daaw/t45;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/x45;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/x45;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/t45;->a:Lcom/daaw/x45;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/t45;->a:Lcom/daaw/x45;

    move-object v1, p1

    check-cast v1, Lcom/daaw/a74;

    invoke-interface {v1}, Lcom/daaw/a74;->zzP()Lcom/daaw/t84;

    move-result-object p1

    new-instance v2, Lcom/daaw/w45;

    invoke-direct {v2, v0, p2}, Lcom/daaw/w45;-><init>(Lcom/daaw/x45;Ljava/util/Map;)V

    invoke-interface {p1, v2}, Lcom/daaw/t84;->E(Lcom/daaw/o84;)V

    const-string p1, "overlayHtml"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    const-string p1, "baseUrl"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "text/html"

    const-string p2, "UTF-8"

    invoke-interface {v1, v3, p1, p2}, Lcom/daaw/a74;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v6, 0x0

    const-string v4, "text/html"

    const-string v5, "UTF-8"

    invoke-interface/range {v1 .. v6}, Lcom/daaw/a74;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
