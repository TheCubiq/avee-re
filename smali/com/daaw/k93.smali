.class public final synthetic Lcom/daaw/k93;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/l93;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l93;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k93;->p:Lcom/daaw/l93;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/k93;->p:Lcom/daaw/l93;

    invoke-static {v0}, Lcom/daaw/l93;->c(Lcom/daaw/l93;)V

    return-void
.end method
