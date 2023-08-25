.class public Lcom/daaw/oz$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ne0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/oz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/daaw/oz;


# direct methods
.method public constructor <init>(Lcom/daaw/oz;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/oz$a;->a:Z

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->E(Lcom/daaw/oz;)Lcom/daaw/mz;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->E(Lcom/daaw/oz;)Lcom/daaw/mz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/b;->h(I)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/e$b;->b()V

    iget-object v0, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->A(Lcom/daaw/oz;)Lcom/daaw/wz;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/wz;->c()V

    :cond_0
    return-void
.end method

.method public c(Ljava/nio/ByteBuffer;JIIIIJ)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/oz$a;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/oz$a;->a:Z

    iput-boolean v1, v0, Lcom/daaw/pz;->a:Z

    iget-object v0, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object v0

    iput-object p1, v0, Lcom/daaw/pz;->b:Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p1

    iput-wide p2, p1, Lcom/daaw/pz;->c:J

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p1

    iput p4, p1, Lcom/daaw/pz;->d:I

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p1

    iput p5, p1, Lcom/daaw/pz;->e:I

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p1

    iput p6, p1, Lcom/daaw/pz;->f:I

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p1

    iput p7, p1, Lcom/daaw/pz;->g:I

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p1

    iput-wide p8, p1, Lcom/daaw/pz;->h:J

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->z(Lcom/daaw/oz;)Lcom/daaw/avee/comp/playback/e$b;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p2}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/playback/e$b;->k(Lcom/daaw/pz;)V

    iget-object p1, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->D(Lcom/daaw/oz;)Lcom/daaw/pz;

    move-result-object p1

    const/4 p2, 0x0

    iput-object p2, p1, Lcom/daaw/pz;->b:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public d(I)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/oz$a;->b:Lcom/daaw/oz;

    invoke-virtual {v0}, Lcom/daaw/oz;->O()Lcom/daaw/oz$d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {v0}, Lcom/daaw/oz$d;->a(Lcom/daaw/oz$d;)I

    move-result v0

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/oz$a;->a:Z

    return-void
.end method
