.class public Lcom/daaw/rs1$a$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rs1$a;->g(Landroid/view/Surface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/view/Surface;

.field public final synthetic q:Lcom/daaw/rs1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/rs1$a;Landroid/view/Surface;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rs1$a$f;->q:Lcom/daaw/rs1$a;

    iput-object p2, p0, Lcom/daaw/rs1$a$f;->p:Landroid/view/Surface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rs1$a$f;->q:Lcom/daaw/rs1$a;

    invoke-static {v0}, Lcom/daaw/rs1$a;->a(Lcom/daaw/rs1$a;)Lcom/daaw/rs1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/rs1$a$f;->p:Landroid/view/Surface;

    invoke-interface {v0, v1}, Lcom/daaw/rs1;->i(Landroid/view/Surface;)V

    return-void
.end method
