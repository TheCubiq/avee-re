.class public Lcom/daaw/wv1$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wv1;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wv1;


# direct methods
.method public constructor <init>(Lcom/daaw/wv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wv1$g;->p:Lcom/daaw/wv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/wv1$g;->p:Lcom/daaw/wv1;

    invoke-static {v0}, Lcom/daaw/wv1;->a(Lcom/daaw/wv1;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x384

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    sget-object v0, Lcom/daaw/ko0;->Z:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/al;

    invoke-direct {v1, p1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method
