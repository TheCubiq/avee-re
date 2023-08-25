.class public abstract Lcom/daaw/nv8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final p:I

.field public final q:Lcom/daaw/r84;

.field public final r:I

.field public final s:Lcom/daaw/f92;


# direct methods
.method public constructor <init>(ILcom/daaw/r84;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/nv8;->p:I

    iput-object p2, p0, Lcom/daaw/nv8;->q:Lcom/daaw/r84;

    iput p3, p0, Lcom/daaw/nv8;->r:I

    invoke-virtual {p2, p3}, Lcom/daaw/r84;->b(I)Lcom/daaw/f92;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/nv8;->s:Lcom/daaw/f92;

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b(Lcom/daaw/nv8;)Z
.end method
