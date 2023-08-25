.class public Lcom/daaw/kn1$a$a;
.super Lcom/daaw/jn1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/kn1$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/g6;

.field public final synthetic b:Lcom/daaw/kn1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/kn1$a;Lcom/daaw/g6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kn1$a$a;->b:Lcom/daaw/kn1$a;

    iput-object p2, p0, Lcom/daaw/kn1$a$a;->a:Lcom/daaw/g6;

    invoke-direct {p0}, Lcom/daaw/jn1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/kn1$a$a;->a:Lcom/daaw/g6;

    iget-object v1, p0, Lcom/daaw/kn1$a$a;->b:Lcom/daaw/kn1$a;

    iget-object v1, v1, Lcom/daaw/kn1$a;->q:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    return-void
.end method
