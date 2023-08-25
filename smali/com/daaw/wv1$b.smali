.class public Lcom/daaw/wv1$b;
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

    iput-object p1, p0, Lcom/daaw/wv1$b;->p:Lcom/daaw/wv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    sget-object p1, Lcom/daaw/ko0;->Y:Lcom/daaw/pw1;

    invoke-virtual {p1}, Lcom/daaw/pw1;->a()V

    iget-object p1, p0, Lcom/daaw/wv1$b;->p:Lcom/daaw/wv1;

    invoke-static {p1}, Lcom/daaw/wv1;->a(Lcom/daaw/wv1;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x0

    const-wide/16 v1, 0x384

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
