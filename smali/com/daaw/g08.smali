.class public final Lcom/daaw/g08;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(IILcom/daaw/f08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/tz7;->c(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/g08;->a:Ljava/util/List;

    invoke-static {p2}, Lcom/daaw/tz7;->c(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/g08;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/m08;)Lcom/daaw/g08;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g08;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b(Lcom/daaw/m08;)Lcom/daaw/g08;
    .locals 1

    iget-object v0, p0, Lcom/daaw/g08;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final c()Lcom/daaw/k08;
    .locals 4

    new-instance v0, Lcom/daaw/k08;

    iget-object v1, p0, Lcom/daaw/g08;->a:Ljava/util/List;

    iget-object v2, p0, Lcom/daaw/g08;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/k08;-><init>(Ljava/util/List;Ljava/util/List;Lcom/daaw/f08;)V

    return-object v0
.end method
