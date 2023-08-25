.class public final Lcom/daaw/tw5;
.super Lcom/daaw/gj4;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/vw5;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/uh6;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1, p4, p5}, Lcom/daaw/gj4;-><init>(Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/uh6;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/Set;)Lcom/daaw/as4;
    .locals 1

    new-instance p1, Lcom/daaw/as4;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/as4;-><init>(Ljava/util/Set;)V

    return-object p1
.end method
