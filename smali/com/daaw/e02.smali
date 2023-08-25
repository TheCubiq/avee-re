.class public final Lcom/daaw/e02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/i02;


# direct methods
.method public constructor <init>(Lcom/daaw/i02;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e02;->p:Lcom/daaw/i02;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/e02;->p:Lcom/daaw/i02;

    invoke-static {v0}, Lcom/daaw/i02;->w(Lcom/daaw/i02;)V

    return-void
.end method
