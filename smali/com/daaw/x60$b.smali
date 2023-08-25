.class public Lcom/daaw/x60$b;
.super Lcom/daaw/ld1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/x60;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ld1<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final s:Landroid/os/Handler;

.field public final t:I

.field public final u:J

.field public v:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/os/Handler;IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ld1;-><init>()V

    iput-object p1, p0, Lcom/daaw/x60$b;->s:Landroid/os/Handler;

    iput p2, p0, Lcom/daaw/x60$b;->t:I

    iput-wide p3, p0, Lcom/daaw/x60$b;->u:J

    return-void
.end method

.method public static synthetic l(Lcom/daaw/x60$b;)I
    .locals 0

    iget p0, p0, Lcom/daaw/x60$b;->t:I

    return p0
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;Lcom/daaw/f70;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/x60$b;->n(Landroid/graphics/Bitmap;Lcom/daaw/f70;)V

    return-void
.end method

.method public m()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/x60$b;->v:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public n(Landroid/graphics/Bitmap;Lcom/daaw/f70;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/f70<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/x60$b;->v:Landroid/graphics/Bitmap;

    iget-object p1, p0, Lcom/daaw/x60$b;->s:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/x60$b;->s:Landroid/os/Handler;

    iget-wide v0, p0, Lcom/daaw/x60$b;->u:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    return-void
.end method
