.class public final synthetic Lcom/daaw/nv1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ho;

.field public final synthetic q:Lcom/daaw/vn;

.field public final synthetic r:Z

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ho;Lcom/daaw/vn;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nv1;->p:Lcom/daaw/ho;

    iput-object p2, p0, Lcom/daaw/nv1;->q:Lcom/daaw/vn;

    iput-boolean p3, p0, Lcom/daaw/nv1;->r:Z

    iput p4, p0, Lcom/daaw/nv1;->s:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/nv1;->p:Lcom/daaw/ho;

    iget-object v1, p0, Lcom/daaw/nv1;->q:Lcom/daaw/vn;

    iget-boolean v2, p0, Lcom/daaw/nv1;->r:Z

    iget v3, p0, Lcom/daaw/nv1;->s:I

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/pv1;->c(Lcom/daaw/ho;Lcom/daaw/vn;ZI)V

    return-void
.end method
