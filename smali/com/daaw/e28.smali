.class public final synthetic Lcom/daaw/e28;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/daaw/nx3;

.field public final synthetic c:Lcom/daaw/nx3;


# direct methods
.method public synthetic constructor <init>(ILcom/daaw/nx3;Lcom/daaw/nx3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/e28;->a:I

    iput-object p2, p0, Lcom/daaw/e28;->b:Lcom/daaw/nx3;

    iput-object p3, p0, Lcom/daaw/e28;->c:Lcom/daaw/nx3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lcom/daaw/e28;->a:I

    iget-object v1, p0, Lcom/daaw/e28;->b:Lcom/daaw/nx3;

    iget-object v2, p0, Lcom/daaw/e28;->c:Lcom/daaw/nx3;

    check-cast p1, Lcom/daaw/mv3;

    sget v3, Lcom/daaw/j58;->j0:I

    invoke-interface {p1, v1, v2, v0}, Lcom/daaw/mv3;->D(Lcom/daaw/nx3;Lcom/daaw/nx3;I)V

    return-void
.end method
