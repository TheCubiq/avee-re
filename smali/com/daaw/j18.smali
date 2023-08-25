.class public final synthetic Lcom/daaw/j18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/j18;->a:I

    iput p2, p0, Lcom/daaw/j18;->b:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/daaw/j18;->a:I

    iget v1, p0, Lcom/daaw/j18;->b:I

    check-cast p1, Lcom/daaw/mv3;

    sget v2, Lcom/daaw/j58;->j0:I

    invoke-interface {p1, v0, v1}, Lcom/daaw/mv3;->v(II)V

    return-void
.end method
