.class public final Lcom/daaw/f02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:I

.field public final synthetic q:Lcom/daaw/i02;


# direct methods
.method public constructor <init>(Lcom/daaw/i02;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f02;->q:Lcom/daaw/i02;

    iput p2, p0, Lcom/daaw/f02;->p:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/f02;->q:Lcom/daaw/i02;

    iget v1, p0, Lcom/daaw/f02;->p:I

    invoke-static {v0, v1}, Lcom/daaw/i02;->x(Lcom/daaw/i02;I)V

    return-void
.end method
