.class public Lcom/daaw/no$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->n(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V
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

.field public final synthetic c:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;Landroid/widget/CheckBox;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$a;->a:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/no$a;->c:Landroid/widget/CheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/no$a;->a:Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/no$a;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result p1

    iget-object v0, p0, Lcom/daaw/no$a;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    return-void
.end method
