.class public final Lcom/daaw/lo2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/mo2;


# direct methods
.method public constructor <init>(Lcom/daaw/mo2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lo2;->p:Lcom/daaw/mo2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lo2;->p:Lcom/daaw/mo2;

    invoke-static {v0}, Lcom/daaw/mo2;->b(Lcom/daaw/mo2;)V

    return-void
.end method
