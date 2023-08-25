.class public Lcom/daaw/no$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->q(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/e0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/daaw/un;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Landroid/view/View;

.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:[Landroid/widget/SeekBar;

.field public final synthetic k:[Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;ILandroid/widget/TextView;Landroid/view/View;Landroid/view/View;IZ[Landroid/widget/SeekBar;[Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$c;->b:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$c;->c:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/no$c;->d:I

    iput-object p4, p0, Lcom/daaw/no$c;->e:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/no$c;->f:Landroid/view/View;

    iput-object p6, p0, Lcom/daaw/no$c;->g:Landroid/view/View;

    iput p7, p0, Lcom/daaw/no$c;->h:I

    iput-boolean p8, p0, Lcom/daaw/no$c;->i:Z

    iput-object p9, p0, Lcom/daaw/no$c;->j:[Landroid/widget/SeekBar;

    iput-object p10, p0, Lcom/daaw/no$c;->k:[Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/no$c;->a:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/no$c;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/no$c;->a:Z

    iget-object v0, p0, Lcom/daaw/no$c;->b:Lcom/daaw/un;

    iget-object v1, p0, Lcom/daaw/no$c;->c:Ljava/lang/String;

    iget v2, p0, Lcom/daaw/no$c;->d:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    iget-object v1, p0, Lcom/daaw/no$c;->e:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/daaw/no$c;->f:Landroid/view/View;

    iget-object v2, p0, Lcom/daaw/no$c;->g:Landroid/view/View;

    iget v4, p0, Lcom/daaw/no$c;->h:I

    iget v5, p0, Lcom/daaw/no$c;->d:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    sub-int v5, v0, v5

    int-to-float v5, v5

    invoke-static {v1, v2, v4, v5}, Lcom/daaw/nd1;->a(Landroid/view/View;Landroid/view/View;FF)V

    iget-boolean v1, p0, Lcom/daaw/no$c;->i:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/no$c;->j:[Landroid/widget/SeekBar;

    aget-object v1, v1, v2

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/no$c;->j:[Landroid/widget/SeekBar;

    aget-object v1, v1, v2

    iget v4, p0, Lcom/daaw/no$c;->d:I

    sub-int v4, v0, v4

    invoke-virtual {v1, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_1
    iget-object v1, p0, Lcom/daaw/no$c;->k:[Landroid/widget/EditText;

    aget-object v1, v1, v2

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/no$c;->k:[Landroid/widget/EditText;

    aget-object p1, p1, v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iput-boolean v2, p0, Lcom/daaw/no$c;->a:Z

    return-void
.end method
