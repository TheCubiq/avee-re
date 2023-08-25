.class public Lcom/daaw/no$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/no;->n(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;ZLcom/daaw/w40;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/un;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/daaw/w40;


# direct methods
.method public constructor <init>(Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/w40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/no$b;->a:Lcom/daaw/un;

    iput-object p2, p0, Lcom/daaw/no$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/no$b;->c:Lcom/daaw/w40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/no$b;->a:Lcom/daaw/un;

    iget-object v0, p0, Lcom/daaw/no$b;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lcom/daaw/un;->M(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ho;->u()V

    iget-object p1, p0, Lcom/daaw/no$b;->c:Lcom/daaw/w40;

    invoke-interface {p1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e0;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lcom/daaw/e0;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
