.class public Lcom/daaw/l30$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/l30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/l30;


# direct methods
.method public constructor <init>(Lcom/daaw/l30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/l30$b;->p:Lcom/daaw/l30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l30$b;->p:Lcom/daaw/l30;

    invoke-virtual {v0}, Lcom/daaw/l30;->e()V

    return-void
.end method
