.class public final Lcom/daaw/si3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vi3;


# direct methods
.method public constructor <init>(Lcom/daaw/vi3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/si3;->p:Lcom/daaw/vi3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/si3;->p:Lcom/daaw/vi3;

    invoke-static {v0}, Lcom/daaw/vi3;->b(Lcom/daaw/vi3;)V

    return-void
.end method
