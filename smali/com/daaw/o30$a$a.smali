.class public Lcom/daaw/o30$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/o30$a;->onLayoutChange(Landroid/view/View;IIIIIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Lcom/daaw/o30$a;


# direct methods
.method public constructor <init>(Lcom/daaw/o30$a;II)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o30$a$a;->r:Lcom/daaw/o30$a;

    iput p2, p0, Lcom/daaw/o30$a$a;->p:I

    iput p3, p0, Lcom/daaw/o30$a$a;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/o30$a$a;->r:Lcom/daaw/o30$a;

    iget-object v0, v0, Lcom/daaw/o30$a;->a:Lcom/daaw/o30;

    iget v1, p0, Lcom/daaw/o30$a$a;->p:I

    int-to-float v1, v1

    iget v2, p0, Lcom/daaw/o30$a$a;->q:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/o30;->o(FF)V

    return-void
.end method
