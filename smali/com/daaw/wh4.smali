.class public final Lcom/daaw/wh4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/on6;

.field public final b:Lcom/daaw/kd5;

.field public final c:Lcom/daaw/fi6;


# direct methods
.method public constructor <init>(Lcom/daaw/kd5;Lcom/daaw/fi6;Lcom/daaw/on6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/daaw/wh4;->a:Lcom/daaw/on6;

    iput-object p1, p0, Lcom/daaw/wh4;->b:Lcom/daaw/kd5;

    iput-object p2, p0, Lcom/daaw/wh4;->c:Lcom/daaw/fi6;

    return-void
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    add-int/lit8 p0, p0, -0x1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const-string p0, "u"

    return-object p0

    :cond_0
    const-string p0, "ac"

    return-object p0

    :cond_1
    const-string p0, "cb"

    return-object p0

    :cond_2
    const-string p0, "cc"

    return-object p0

    :cond_3
    const-string p0, "bb"

    return-object p0

    :cond_4
    const-string p0, "h"

    return-object p0
.end method


# virtual methods
.method public final a(JI)V
    .locals 7

    sget-object v0, Lcom/daaw/g93;->K7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "acr"

    const-string v2, "app_open_ad"

    const-string v3, "ad_format"

    const-string v4, "show_time"

    const-string v5, "ad_closed"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/wh4;->a:Lcom/daaw/on6;

    invoke-static {v5}, Lcom/daaw/nn6;->b(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v5

    iget-object v6, p0, Lcom/daaw/wh4;->c:Lcom/daaw/fi6;

    iget-object v6, v6, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v6, v6, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v5, v6}, Lcom/daaw/nn6;->g(Lcom/daaw/wh6;)Lcom/daaw/nn6;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, v4, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5, v3, v2}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-static {p3}, Lcom/daaw/wh4;->b(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, v1, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-interface {v0, v5}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/wh4;->b:Lcom/daaw/kd5;

    invoke-virtual {v0}, Lcom/daaw/kd5;->a()Lcom/daaw/jd5;

    move-result-object v0

    iget-object v6, p0, Lcom/daaw/wh4;->c:Lcom/daaw/fi6;

    iget-object v6, v6, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v6, v6, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v0, v6}, Lcom/daaw/jd5;->e(Lcom/daaw/wh6;)Lcom/daaw/jd5;

    const-string v6, "action"

    invoke-virtual {v0, v6, v5}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v4, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-virtual {v0, v3, v2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-static {p3}, Lcom/daaw/wh4;->b(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-virtual {v0}, Lcom/daaw/jd5;->g()V

    return-void
.end method
