.class public final synthetic Lcom/daaw/h28;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/f53;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f53;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h28;->a:Lcom/daaw/f53;

    iput p2, p0, Lcom/daaw/h28;->b:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h28;->a:Lcom/daaw/f53;

    iget v1, p0, Lcom/daaw/h28;->b:I

    check-cast p1, Lcom/daaw/mv3;

    sget v2, Lcom/daaw/j58;->j0:I

    invoke-interface {p1, v0, v1}, Lcom/daaw/mv3;->B(Lcom/daaw/f53;I)V

    return-void
.end method
