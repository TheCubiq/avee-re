.class public final synthetic Lcom/daaw/y02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/at0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/at0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y02;->p:Lcom/daaw/at0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y02;->p:Lcom/daaw/at0;

    invoke-virtual {v0}, Lcom/daaw/at0;->c()V

    return-void
.end method
