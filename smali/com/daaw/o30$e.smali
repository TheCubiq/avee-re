.class public Lcom/daaw/o30$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/o30;->m(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/o30;


# direct methods
.method public constructor <init>(Lcom/daaw/o30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o30$e;->p:Lcom/daaw/o30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/o30$e;->p:Lcom/daaw/o30;

    invoke-static {v0}, Lcom/daaw/o30;->b(Lcom/daaw/o30;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/o30$e;->p:Lcom/daaw/o30;

    invoke-static {v0}, Lcom/daaw/o30;->c(Lcom/daaw/o30;)Landroid/view/SurfaceView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/o30$e;->p:Lcom/daaw/o30;

    invoke-static {v0}, Lcom/daaw/o30;->c(Lcom/daaw/o30;)Landroid/view/SurfaceView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    sget-object v1, Lcom/daaw/o30;->C:Lcom/daaw/qw1;

    invoke-virtual {v1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
