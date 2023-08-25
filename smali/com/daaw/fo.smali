.class public final synthetic Lcom/daaw/fo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/go;

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/go;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fo;->p:Lcom/daaw/go;

    iput-object p2, p0, Lcom/daaw/fo;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fo;->p:Lcom/daaw/go;

    iget-object v1, p0, Lcom/daaw/fo;->q:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/daaw/go;->a(Lcom/daaw/go;Ljava/lang/Runnable;)V

    return-void
.end method
