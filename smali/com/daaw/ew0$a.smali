.class public Lcom/daaw/ew0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ew0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/pz;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ew0;


# direct methods
.method public constructor <init>(Lcom/daaw/ew0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ew0$a;->a:Lcom/daaw/ew0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/pz;)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/ew0$a;->a:Lcom/daaw/ew0;

    invoke-static {v0, p1}, Lcom/daaw/ew0;->a(Lcom/daaw/ew0;Lcom/daaw/pz;)Lcom/daaw/pz;

    iget-boolean v0, p1, Lcom/daaw/pz;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ew0$a;->a:Lcom/daaw/ew0;

    invoke-static {v0}, Lcom/daaw/ew0;->b(Lcom/daaw/ew0;)Lcom/daaw/wz;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p1, Lcom/daaw/pz;->b:Ljava/nio/ByteBuffer;

    iget-wide v3, p1, Lcom/daaw/pz;->c:J

    iget v5, p1, Lcom/daaw/pz;->d:I

    iget v6, p1, Lcom/daaw/pz;->e:I

    iget v7, p1, Lcom/daaw/pz;->f:I

    iget v8, p1, Lcom/daaw/pz;->g:I

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/wz;->d(Ljava/nio/ByteBuffer;JIIII)V

    :cond_1
    iget-object v0, p0, Lcom/daaw/ew0$a;->a:Lcom/daaw/ew0;

    invoke-static {v0}, Lcom/daaw/ew0;->c(Lcom/daaw/ew0;)Lcom/daaw/dw0;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p1, Lcom/daaw/pz;->b:Ljava/nio/ByteBuffer;

    iget-wide v3, p1, Lcom/daaw/pz;->c:J

    iget v5, p1, Lcom/daaw/pz;->d:I

    iget v6, p1, Lcom/daaw/pz;->e:I

    iget v7, p1, Lcom/daaw/pz;->f:I

    iget v8, p1, Lcom/daaw/pz;->g:I

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/dw0;->e(Ljava/nio/ByteBuffer;JIIII)V

    :cond_2
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/pz;

    invoke-virtual {p0, p1}, Lcom/daaw/ew0$a;->a(Lcom/daaw/pz;)V

    return-void
.end method
