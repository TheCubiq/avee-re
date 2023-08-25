.class public final synthetic Lcom/daaw/up1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/eq1;

.field public final synthetic q:Lcom/daaw/sn1;

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/eq1;Lcom/daaw/sn1;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/up1;->p:Lcom/daaw/eq1;

    iput-object p2, p0, Lcom/daaw/up1;->q:Lcom/daaw/sn1;

    iput p3, p0, Lcom/daaw/up1;->r:I

    iput-object p4, p0, Lcom/daaw/up1;->s:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/up1;->p:Lcom/daaw/eq1;

    iget-object v1, p0, Lcom/daaw/up1;->q:Lcom/daaw/sn1;

    iget v2, p0, Lcom/daaw/up1;->r:I

    iget-object v3, p0, Lcom/daaw/up1;->s:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/eq1;->a(Lcom/daaw/eq1;Lcom/daaw/sn1;ILjava/lang/Runnable;)V

    return-void
.end method
