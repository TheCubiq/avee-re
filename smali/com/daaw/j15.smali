.class public final Lcom/daaw/j15;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cm4;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/Map;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/u35;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/daaw/m08;Lcom/daaw/u35;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j15;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/daaw/j15;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/daaw/j15;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/daaw/j15;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/j15;->e:Lcom/daaw/u35;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Lcom/daaw/qq5;
    .locals 2

    iget-object v0, p0, Lcom/daaw/j15;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qq5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_4

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    return-object v1

    :cond_1
    iget-object p1, p0, Lcom/daaw/j15;->c:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/tt5;

    if-eqz p1, :cond_2

    new-instance v1, Lcom/daaw/rq5;

    sget-object p2, Lcom/daaw/em4;->a:Lcom/daaw/em4;

    invoke-direct {v1, p1, p2}, Lcom/daaw/rq5;-><init>(Lcom/daaw/qq5;Lcom/daaw/ey6;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/j15;->b:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qq5;

    if-nez p1, :cond_3

    :goto_0
    return-object v1

    :cond_3
    invoke-static {p1}, Lcom/daaw/gm4;->a(Lcom/daaw/qq5;)Lcom/daaw/qq5;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object v0, p0, Lcom/daaw/j15;->e:Lcom/daaw/u35;

    invoke-virtual {v0}, Lcom/daaw/u35;->e()Lcom/daaw/je3;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/daaw/j15;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cm4;

    invoke-interface {v0, p1, p2}, Lcom/daaw/cm4;->a(ILjava/lang/String;)Lcom/daaw/qq5;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, Lcom/daaw/gm4;->a(Lcom/daaw/qq5;)Lcom/daaw/qq5;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_1
    return-object v1
.end method
