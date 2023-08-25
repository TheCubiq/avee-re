.class public final synthetic Lcom/daaw/x55;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/y55;

.field public final synthetic b:D

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y55;DZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x55;->a:Lcom/daaw/y55;

    iput-wide p2, p0, Lcom/daaw/x55;->b:D

    iput-boolean p4, p0, Lcom/daaw/x55;->c:Z

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/x55;->a:Lcom/daaw/y55;

    iget-wide v1, p0, Lcom/daaw/x55;->b:D

    iget-boolean v3, p0, Lcom/daaw/x55;->c:Z

    check-cast p1, Lcom/daaw/mf2;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/y55;->a(DZLcom/daaw/mf2;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
