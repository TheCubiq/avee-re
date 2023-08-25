.class public final synthetic Lcom/daaw/j48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/j48;->a:I

    iput-boolean p2, p0, Lcom/daaw/j48;->b:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/daaw/j48;->a:I

    iget-boolean v1, p0, Lcom/daaw/j48;->b:Z

    check-cast p1, Lcom/daaw/mv3;

    invoke-interface {p1, v0, v1}, Lcom/daaw/mv3;->Q(IZ)V

    return-void
.end method
