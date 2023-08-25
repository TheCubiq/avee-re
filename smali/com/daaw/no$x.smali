.class public Lcom/daaw/no$x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->m(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
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
.field public final synthetic a:Lcom/daaw/un;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:[Ljava/lang/String;

.field public final synthetic d:Landroid/widget/TextView;

.field public final synthetic e:Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;[Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/ImageButton;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$x;->a:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$x;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/no$x;->c:[Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/no$x;->d:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/no$x;->e:Landroid/widget/ImageButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 5

    iget-object p1, p0, Lcom/daaw/no$x;->a:Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/no$x;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/no$x;->c:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/16 v4, 0x3a

    invoke-static {v2, v4, v3}, Lcom/daaw/br1;->B(Ljava/lang/String;I[Ljava/lang/String;)V

    aget-object v2, v3, v0

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    aget-object p1, v3, p1

    invoke-static {p1, v0}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result p1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_1
    const/16 v1, 0x8

    if-gtz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/no$x;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/no$x;->e:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/daaw/no$x;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/no$x;->e:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageResource(I)V

    :goto_2
    return-void
.end method
