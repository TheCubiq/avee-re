.class public Lcom/daaw/oo$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/oo;->K(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:[Z

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Lcom/daaw/un;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/daaw/dm0;

.field public final synthetic g:I

.field public final synthetic h:Lcom/daaw/ho;

.field public final synthetic i:Lcom/daaw/e0;

.field public final synthetic j:[Landroid/widget/SeekBar;

.field public final synthetic k:Lcom/daaw/w40;


# direct methods
.method public constructor <init>([ZFFLcom/daaw/un;Ljava/lang/String;Lcom/daaw/dm0;ILcom/daaw/ho;Lcom/daaw/e0;[Landroid/widget/SeekBar;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oo$d;->a:[Z

    iput p2, p0, Lcom/daaw/oo$d;->b:F

    iput p3, p0, Lcom/daaw/oo$d;->c:F

    iput-object p4, p0, Lcom/daaw/oo$d;->d:Lcom/daaw/un;

    iput-object p5, p0, Lcom/daaw/oo$d;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/oo$d;->f:Lcom/daaw/dm0;

    iput p7, p0, Lcom/daaw/oo$d;->g:I

    iput-object p8, p0, Lcom/daaw/oo$d;->h:Lcom/daaw/ho;

    iput-object p9, p0, Lcom/daaw/oo$d;->i:Lcom/daaw/e0;

    iput-object p10, p0, Lcom/daaw/oo$d;->j:[Landroid/widget/SeekBar;

    iput-object p11, p0, Lcom/daaw/oo$d;->k:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/oo$d;->a:[Z

    const/4 v0, 0x0

    aget-boolean p1, p1, v0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    if-eqz p3, :cond_2

    int-to-float p1, p2

    iget p2, p0, Lcom/daaw/oo$d;->b:F

    mul-float p1, p1, p2

    iget p2, p0, Lcom/daaw/oo$d;->c:F

    add-float/2addr p1, p2

    iget-object p2, p0, Lcom/daaw/oo$d;->d:Lcom/daaw/un;

    iget-object p3, p0, Lcom/daaw/oo$d;->e:Ljava/lang/String;

    new-instance v0, Lcom/daaw/dm0;

    iget-object v1, p0, Lcom/daaw/oo$d;->f:Lcom/daaw/dm0;

    invoke-direct {v0, v1}, Lcom/daaw/dm0;-><init>(Lcom/daaw/dm0;)V

    invoke-virtual {p2, p3, v0}, Lcom/daaw/un;->s(Ljava/lang/String;Lcom/daaw/dm0;)Lcom/daaw/dm0;

    move-result-object p2

    iget p3, p0, Lcom/daaw/oo$d;->g:I

    invoke-virtual {p2}, Lcom/daaw/dm0;->h()I

    move-result v0

    if-lt p3, v0, :cond_1

    return-void

    :cond_1
    iget p3, p0, Lcom/daaw/oo$d;->g:I

    invoke-virtual {p2, p3}, Lcom/daaw/dm0;->g(I)Lcom/daaw/xn0;

    move-result-object p3

    iget v0, p0, Lcom/daaw/oo$d;->g:I

    new-instance v1, Lcom/daaw/xn0;

    invoke-virtual {p3}, Lcom/daaw/xn0;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/daaw/xn0;->g()Lcom/daaw/bs1;

    move-result-object p3

    iget p3, p3, Lcom/daaw/bs1;->b:F

    invoke-direct {v1, v2, p1, p3}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {p2, v0, v1}, Lcom/daaw/dm0;->k(ILcom/daaw/xn0;)V

    iget-object p1, p0, Lcom/daaw/oo$d;->d:Lcom/daaw/un;

    iget-object p3, p0, Lcom/daaw/oo$d;->e:Ljava/lang/String;

    invoke-virtual {p1, p3, p2}, Lcom/daaw/un;->a0(Ljava/lang/String;Lcom/daaw/dm0;)V

    iget-object p1, p0, Lcom/daaw/oo$d;->h:Lcom/daaw/ho;

    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/oo$d;->i:Lcom/daaw/e0;

    iget-object p2, p0, Lcom/daaw/oo$d;->j:[Landroid/widget/SeekBar;

    iget p3, p0, Lcom/daaw/oo$d;->g:I

    aget-object p2, p2, p3

    invoke-interface {p1, p2}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/oo$d;->k:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_2

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
