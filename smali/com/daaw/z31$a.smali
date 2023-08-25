.class public Lcom/daaw/z31$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sg0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/z31;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/z31;


# direct methods
.method public constructor <init>(Lcom/daaw/z31;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z31$a;->a:Lcom/daaw/z31;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bq0;Lcom/daaw/de0;)Lcom/daaw/bs1;
    .locals 7

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->v:Lcom/daaw/zw1;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/zw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/bs1;

    return-object p1
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/daaw/af0;Lcom/daaw/h2;)V
    .locals 0

    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h(Lcom/daaw/vk1;ZLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public i()Lcom/daaw/om1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j(I)Lcom/daaw/avee/comp/playback/a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z31$a;->a:Lcom/daaw/z31;

    invoke-static {v0, p1}, Lcom/daaw/z31;->k(Lcom/daaw/z31;I)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method

.method public k()Lcom/daaw/i2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
