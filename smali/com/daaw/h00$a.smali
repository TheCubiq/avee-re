.class public Lcom/daaw/h00$a;
.super Lcom/daaw/jn1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/h00;->n0(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/daaw/h00;


# direct methods
.method public constructor <init>(Lcom/daaw/h00;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h00$a;->b:Lcom/daaw/h00;

    iput-object p2, p0, Lcom/daaw/h00$a;->a:Landroid/view/View;

    invoke-direct {p0}, Lcom/daaw/jn1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h00$a;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/daaw/gu1;->g(Landroid/view/View;F)V

    iget-object v0, p0, Lcom/daaw/h00$a;->a:Landroid/view/View;

    invoke-static {v0}, Lcom/daaw/gu1;->a(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    return-void
.end method
